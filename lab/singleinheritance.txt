import java.io.*;
import java.util.Scanner;
class college
{
 String name,course;
 protected int clg_id;
 void getdataclg()
 {
	 Scanner s=new Scanner(System.in);
   System.out.println("Enter Clgname:");
   name=s.next();
   System.out.println("Enter clgid:");
   clg_id=s.nextInt();
   System.out.println("Enter the course:");
      	course=s.next();
 }
}
class student extends college
{
 String stud_name,stud_course,grade;
 int stud_id,sum=0;
 float per;
 //int[] markss;
 //markss=new markss[5];
 int markss[]=new int[5];
 void getdatastud()
 {
	 Scanner s=new Scanner(System.in);
   System.out.println("Enter studname:");
    stud_name=s.next();
   System.out.println("Enter studid");
   stud_id=s.nextInt();
   System.out.println("Enter studcourse:");
  stud_course=s.next();
   System.out.println("Enter 5 marks:");
   for(int i=0;i<5;i++)
	markss[i]=s.nextInt();
 }
 void calculate()
 {
   for(int i=0;i<5;i++)
	sum=sum+markss[i];
  System.out.println("Total="+sum);
  per=(sum*100)/500;
  System.out.println("Percentage="+per);
 }
 void display()
  {
	 System.out.println("\t\t...STUDENT DETAILS...");
	 System.out.println("RollNo:"+stud_id);
     System.out.println("\tName of Student:"+stud_name);
     System.out.println("\tCourse:"+course);
	      System.out.println("College ID:"+clg_id);
     System.out.println("College name:"+name);	
     System.out.println("\t**Marks**");	
	 System.out.println("sub1\tsub2\tsub3\tsub4\tsub5");
     for(int i=0;i<5;i++)
        		System.out.print("\t "+markss[i]); 
System.out.println(" ");
	System.out.println("Total="+sum);		
	 System.out.println("percentage:"+per);
	  if(per>=90)
    System.out.println("Grade:A");
  else if(per>=80 && per<90)
    System.out.println("Grade:B");
  else if (per>=70 && per<80)
    System.out.println("Grade:C");
  else if(per>=60 && per<70)
   System.out.println("Grade:D");
  else
    System.out.println("Fail");
  }
}
class sdetail
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  student stud=new student();
  System.out.println("...Author:Anchu Sussen Mani...");
    stud.getdataclg();
  stud.getdatastud();
  stud.calculate();
  stud.display();
 }
}