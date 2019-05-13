import java.io.*;
import java.util.*;
class student
{
   String name,gd;
   String address;
   
  int age,n,i,tm=0;
   int mark[]=new int[5];
   void getdetails()
{
   Scanner s=new Scanner(System.in);
   System.out.println("Enter the name of the student");
    name=s.nextLine();
   System.out.println("Enter the age");
   age=s.nextInt();
   System.out.println("Enter the address");
   address=s.next();
   System.out.println("Enter five marks");
   for(i=0;i<5;i++)
   {
    mark[i]=s.nextInt();
     tm=tm+mark[i];
  }
 }
  void display()
{
  int p;
  System.out.println("AUTHOR:Anchu Sussen Mani");
  System.out.println(">>>>>>>>STUDENT DETAILS>>>>>>>");
  
  System.out.println("Name of the Student:"+name);
  System.out.println("AGE:"+age);
  System.out.println("\tSUB1\tSUB2\tSUB3\tSUB4\tSUB5\t");
  for(i=0;i<5;i++)
  {
  System.out.print("\t"+mark[i]);
  }
  System.out.println("");
  System.out.println("TOTAL MARK:"+tm);
    p=(tm*100)/500;
   if (p>=90)
   {
    System.out.println("Grade=");
     System.out.print("A+");
   }
   else if(p>=80 && p<90)
  {
   System.out.println("Grade=");
    System.out.print("A");
  }
   else if(p>=70 && p<80)
   {
   System.out.println("Grade=");
    System.out.print("B+");
   }
   else if(p>=60 && p<70)
   {
   System.out.println("Grade=");
    System.out.print("B");
  }
   else if(p>=50 && p<60)
  {
 System.out.println("Grade=");
   System.out.print("C+");
 }
 else
{
 System.out.println("Grade=");
  System.out.print("FAILED");
}
}
}

class mainstudent
{
  public static void main(String args[])
{
  int n,i;
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the number of students");
    n=s.nextInt();
  student std[]=new student[10];
  for(i=0;i<n;i++)
  {
   std[i]=new student();
   std[i].getdetails();
  }
  for(i=0;i<n;i++)
  {
    std[i].display();
 }
}
}
    
