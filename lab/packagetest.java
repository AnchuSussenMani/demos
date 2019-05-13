import java.io.*;
import java.util.Scanner;
import mypack.*;
class packagetest
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  item m=new item();
  customerbill cb=new customerbill();
  System.out.println("...Author:Anchu Sussen Mani...");
  m.getdata();
  
  cb.getcustomer();
  cb.display();
  m.putdata();
 }
}