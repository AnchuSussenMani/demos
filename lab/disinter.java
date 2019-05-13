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
class disinter
{
  public static void main(String args[])
  {
   Scanner s=new Scanner(System.in);
   area ar=new area();
   circum c=new circum();
   circle cir;
   cir=ar;
   System.out.println("Area of circle= "+cir.compute(3));
   cir=c;
   System.out.println("Circumference of circle= "+cir.compute(3));
 }
}