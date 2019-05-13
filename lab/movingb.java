import java.awt.*;
import java.applet.*;
//<applet code=movingb width=100 height=100></applet>
public class movingb extends applet implements runnable
{
string s="moving banner";
thread t=null;
boolean flag;
public void init()
{
setbackground(color.red);
setforeground(color.blue);
}
public void start()
{
t=new thread(this);
flag=false;
t.start();
}
public void run()
{
char ch;
for(; ;)
try
{
repaint();
thread.sleep(1000);
ch=s.charat(0);
s=s.substring(1,s.length());
s=s+ch;
if(flag==true)
break;
}
catch(interruptedexception ie)
{
}
}
public void stop()
{
flag=true;
t=null;
}
public void paint(graphics g)
{
g.drawstring(s,200,200);
}
}