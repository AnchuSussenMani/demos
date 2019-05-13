import java.io.*;
public class serial
{
  public static void main(String args[])throws Exception
  {
    try
    {
      Myclass obj1=new Myclass("Hello",-7,2.7);
      System.out.println("object1:"+obj1);
      FileOutputStream fos=new FileOutputStream("serial.txt");
      ObjectOutputStream oos=new ObjectOutputStream(fos);
      oos.writeObject(obj1);
      oos.flush();
      oos.close();
    }
    catch(IOException e)
    {
      System.out.println("Exception during serialization"+e);
      System.exit(0);
    }
    try
    {
      Myclass obj2;
      FileInputStream fis=new FileInputStream("serial.txt");
      ObjectInputStream ois=new ObjectInputStream(fis);
      obj2=(Myclass)ois.readObject();
      ois.close();
      System.out.println("object2:"+obj2);
    }
	catch(IOException e)
	{
	  System.out.println("Exception during deserialization"+e);
          System.exit(0);
	}
 }
}
class Myclass implements Serializable
{
 String s;
 int i;
 double d;
 public Myclass(String s,int i,double d)
 {
  this.s=s;
  this.i=i;
  this.d=d;
 }
 public String toString()
 {
  return "s="+s+";i="+i+";d="+d;
 }
}
	 
  