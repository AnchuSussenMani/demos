import java.lang.Exception;
import java.io.*;
import java.util.Scanner;
class MyException extends Exception
{
 int income,percent;
 String name;
MyException(int per,int inc)
 {
  percent=per;
  income=inc;
 }
}
class scholarship
{
 public static void main(String args[])
 {
    Scanner s=new Scanner(System.in);
	int income,percent;
    String name;
    System.out.println("Enter the name of the student:");
    name=s.nextLine();
    System.out.println("Enter annual income:");
    income=s.nextInt();	
	System.out.println("Enter the percentage:");
    percent=s.nextInt();
	try
	{
	 if(percent>90&&income<50000)
	  throw new MyException(percent,income);
	
    else
		System.out.println("NO SCHOLARSHIP");
	}
	catch(MyException e)
	{
		System.out.println(" "+e);
	
		
	 System.out.println("STUDENT GOT SCHOLARSHIP");
	 System.out.println("Name:"+name+"\tIncome:"+income+"\tPercent:"+percent+"%"); 
	}
	
 }
}