import java.io.*;
import java.util.Scanner;
class circle
{
 public static void main(String args[])
 {
  double r;
  r=Integer.parseInt(args[0]);
  double a,c;
  a=3.14*r*r;
  System.out.println("Area is"+a);
  c=2*3.14*r;
  System.out.println("circumference is"+c);
 }
}