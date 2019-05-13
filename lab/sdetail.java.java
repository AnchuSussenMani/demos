import java.io.*;
import java.util.Scanner;
class college
{
 string name;
 protected int clg_id;
 string course[]=new string[5];
 void getdataclg()
 {
   system.out.println("Enter Clgname,clgid:");
   name=s.nextLine();
   clg_id=s.nextInt();
   system.out.println("Enter 5 courses:");
   for(int i=0;i<5;i++)
   	course[i]=s.nextLine();
 }
}
class student extends college
{
 string stud_name,stud_course,grade;
 int stud_id,sum=0;
 float per;
 int marks[]=new marks[5];
 void getdatastud()
 {
   system.out.println("Enter studname,studid,studcourse:");
   stud_name=s.nextLine();
   stud_id=s.nextInt();
   stud_course=s.nextLine();
   system.out.println("Enter 5 marks:");
   for(int i=0;i<5;i++)
	marks[i]=s.nextInt();
 }
 void calculate()
 {
  system.out.println("...percentage of marks...");
  sum=marks[0];
  for(int i=0;i<5;i++)
	sum=sum+marks[i];
  per=(sum/5)*100;
  if(per>=90)
    system.out.println("Grade:A");
  else if(per>=80 &&per<90)
    system.out.println("Grade:B");
  else if (per>=70 && per<80)
    system.out.println("Grade:C");
  else if(per>=60 && per<70)
   system.out.println("Grade:D");
  else
    system.out.println("Fail");
 }
}
class sdetail
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  student stud=new student();
  system.out.println("...Author:Anchu Sussen Mani...");
  stud.getdataclg();
  stud.getdatastud();
  stud.calculate();
 }
}