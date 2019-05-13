import java.applet.*;
import java.awt.*;
/*<applet code="face" width=300 height=300>
  </applet>*/
public class face extends Applet
{
 public void paint(Graphics g)
 {
 g.setColor(Color.yellow);
 g.fillOval(100,100,100,100);
 g.setColor(Color.black);
 g.fillOval(120,125,20,20);
 g.fillOval(160,125,20,20);
 g.drawLine(150,165,150,150);
 g.drawLine(130,170,170,170);
 }
}