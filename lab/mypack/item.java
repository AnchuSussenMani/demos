package mypack;
import java.io.*;
import java.util.Scanner;

public class item
{
  int item_id;
  float price;
  String detail;
  public void getdata()
  {
    Scanner s=new Scanner(System.in);
	System.out.println("Enter item id.:");
	item_id=s.nextInt();
    System.out.println("Enter price of the item:");
    price=s.nextFloat();
    System.out.println("Enter description:");
    detail=s.next();
  }
  public void putdata()
  {
     System.out.println("\tName of Item:"+detail);
     System.out.println("\tPrice:"+price);
  }
}