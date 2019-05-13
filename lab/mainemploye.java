import java.io.*;
import java.util.Scanner;
class empdetails
{
 int id,age;
 String name,adres,design;
 float sal;
 empdetails()
 {
                Scanner s=new Scanner(System.in);
   		System.out.println("Enter name:");
   		name=s.nextLine();
   		System.out.println("Enter empid:");
   		id=s.nextInt();
                System.out.println("Enter empage:");
   		age=s.nextInt();
                System.out.println("Enter address:");
   		adres=s.next();
                System.out.println("Enter designation:");
   		design=s.next();
                System.out.println("Enter salary:");
   		sal=s.nextFloat();
 }
 void display()
 {
  System.out.println("AUTHOR:ANCHU SUSSEN MANI");
  System.out.println(">>>>>>>>EMPLOYEE DETAILS>>>>>>>");
  
  System.out.println("Name of the Employee:"+name);
  System.out.println("Age:"+age);
  System.out.println("ID:"+id);
  System.out.println("Address:"+adres);
  System.out.println("Designation:"+design);
  System.out.println("Salary:"+sal);
 }
}
class mainemploye
 {
  public static void main(String args[])
  {
  int n,i;
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the number of employees");
    n=s.nextInt();
  empdetails emp[]=new empdetails[5];
  for(i=0;i<n;i++)
  
   emp[i]=new empdetails();
    for(i=0;i<n;i++)
   emp[i].display();
}
}