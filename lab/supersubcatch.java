import java.io.*;
import java.util.Scanner;
class supersubcatch
{
  public static void main(String args[])
  {
    try
    {
     int a=0,b;
     b=4/0;
    }
    catch(ArithmeticException e)
    {
     System.out.println("Division by zero");
    }
    catch(Exception e)
    {
     System.out.println("generic Exception");
    }
  }
}