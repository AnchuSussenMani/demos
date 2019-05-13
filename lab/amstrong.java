import java.io.*;
import java.util.Scanner;
class amstrong
{
 public static void main(String args[])
 {
  int n=152,sum=0,r,t=n;
  while(n>0)
  {
   r=n%10;
   sum=sum+(r*r*r);
   n=n/10;
  }
  if(t==sum)
   System.out.println("number is amstrong");
  else
   System.out.println("number is not an amstrong");
 }
}