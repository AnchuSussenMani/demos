import java.io.*;
import java.util.Scanner;
class abc
{
 public static void main(String args[])
  {
    try
      {
       System.out.println("Before Call");
       subabc();
      }
    catch(ArithmeticException e)
      {
       System.out.println("Inside Main Class");
      }
    finally
      {
       System.out.println("Inside Finally Class");
      }
  }
 public static void subabc()
 {
  try
    {
     int i=1,j=0,r;
     System.out.println("Before Division");
     r=i/j;
     System.out.println("After Division");
    }
  catch(ArithmeticException e)
    {
     System.out.println(" "+e);
     throw e;
    }
  finally
    {
     System.out.println("Inside Finally Main Class");
    }
 }
}