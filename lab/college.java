import java.io.*;
import java.util.Scanner;
class college
{
  int id;
  char clg_name,courses[];
  void getdata()
  {
   System.out.println("College Details....");
   System.out.println("enter clgid:");
   id=s.nextInt();
   System.out.println("enter clgname:");
   clg_name=s.nextLine();
   for(int i=0;i<3;i++)
    course[i]=s.nextLine();
  }
}
class student extends college
{
 protected int stud_id,stud_marks[];
 protected char stud_name,stud_course;
 void getstud()
 {
   System.out.println("Student Details....");
   System.out.println("enter id, name, course:");
   stud_id=s.nextInt();
   stud_name=s.nextLine();
   stud_course=s.nextLine();
   for(int i=0;i<5;i++)
    stud_marks[i]=s.nextLine();
 }
}
class   