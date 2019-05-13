import java.io.*;
class thread1 extends Thread
{
 public void run()
 {
  for(int i=1;i<5;i++)
   System.out.println("Thread1="+i);
 }
}
class thread2 extends Thread
{
 public void run()
 {
  for(int j=1;j<5;j++)
   System.out.println("Thread2="+j);
 }
}
class thread3 extends Thread
{
 public void run()
 {
  for(int k=1;k<5;k++)
   System.out.println("Thread3="+k);
 }
}
class threaddemo
{
  public static void main(String args[])
  {
   thread1 t1=new thread1();
   t1.start();
   thread2 t2=new thread2();
   t2.start();
   thread3 t3=new thread3();
   t3.start();
  }
}
   
