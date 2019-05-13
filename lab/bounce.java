import java.applet.*;
import java.awt.*;
/*
<applet code="bounce" width=200 height=200>
</applet>
*/

public class bounce extends Applet implements Runnable 
{
	int x = 150, y = 50, r=20;    // position and radius of the circle
	int dx = 11, dy = 7;          // trajectory of circle
	Thread t;
	boolean stopFlag;

	public void start() 
	{
		t = new Thread(this);
		stopFlag=false; 
		t.start();
	}

	/*Draw the circle at its current position */

	public void paint(Graphics g) 
	{
		g.setColor(Color.red);
		g.fillOval(x-r, y-r, r*2, r*2);
	}


	public void run() 
	{
		while(true)
		{
			if(stopFlag)
				break;
			// Bounce if we've hit an edge.
			if ((x - r + dx < 0) || (x + r + dx > bounds().width)) dx = -dx;
			if ((y - r + dy < 0) || (y + r + dy > bounds().height)) dy = -dy;
			// Move the circle.
			x += dx;  y += dy;

			try
			{
				Thread.sleep(100);
			}catch(Exception e){};
			// Ask the browser to call our paint() method to draw the circle
			// at its new position.
			repaint();
		}
	}

	public void stop()
	{
		stopFlag=true;
		t=null;
	}
}