
package mypack;
import java.io.*;
import java.util.Scanner;

public class customerbill
{
  int customer_id,units,date;
  String name;
  public void getcustomer()
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter customer id.:");
	customer_id=s.nextInt();
	System.out.println("Enter customer name:");
    name=s.next();
    System.out.println("Enter number of units purchased:");
    units=s.nextInt();
    System.out.println("Enter date of purchase:");
    date=s.nextInt();
  }
  public void display()
 {
	  System.out.println("\t\t...CUSTOMER DETAILS...");
	  System.out.println("cust_ID:"+customer_id);
	  System.out.println("Cust_Name"+name);
          System.out.println("DOP:"+date);
          System.out.println("No.of units:"+units);
  }
}