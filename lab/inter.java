import java.io.*;
import java.util.Scanner;
interface circle
{
 final static double pi=3.14;
 double compute(int r);
}
class area implements circle
{
 public double compute(int r)
 {
  return(pi*r*r);
 }
}
class circum implements circle
{
 public double compute(int r)
 {
  return(2*pi*r);
 }
}
class inter
{
  public static void main(String args[])
  {
   Scanner s=new Scanner(System.in);
   area ar=new area();
   circum c=new circum();
   circle cir;
   cir=ar;
   int r;
   system.out.println("enter the radius:");
   r=s.nextInt();
   ans=compute(r);
   System.out.println("Area of circle= "+ans);
   answer=compute(r);
   System.out.println("Area of circle= "+answer);
  }
}