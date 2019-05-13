import java.applet.*;
import java.awt.*;
/*<applet code="userinput" width=300 height=300>
  </applet>*/
public class userinput extends Applet
{
 TextField text1,text2,text3,text4;
 public void init()
 {
 text1=new TextField(8);
 text2=new TextField(8);
 text3=new TextField(8);
 text4=new TextField(8);
 add(text1);
 add(text2);
 add(text3);
 add(text4);
 text1.setText("id");
 text2.setText("unit1");
 text3.setText("unit2");
 text4.setText("total");
 
}
public void paint(Graphics g)
{
        int x=0,y=0,z=0,t=0;
		String s1,s2,s3,s;
		s1=text1.getText();
		x=Integer.parseInt(s1);
		s2=text2.getText();
		y=Integer.parseInt(s2);
		s3=text3.getText();
		z=Integer.parseInt(s3);
		t=y+z;
		s=String.valueOf(t);
		text4.setText(s);
}
public boolean action(Event event,Object object)
{
	repaint();
	return true;
}
}