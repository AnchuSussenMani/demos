import java.io.*;
import java.util.*;
class student
{
   String name;
  int m1,m2,m3,s;
   void getdetails()
  {
    DataInputStream dis=new DataInputStream(System.in);
    System.out.println("Enter the name of the student");
     name=dis.readLine();
    System.out.println("Enter three marks");
     m1=dis.readInt();   
     m2=dis.readInt();
     m3=dis.readInt();
   
  }
  void display()
 {
   s=m1+m2+m3;
   System.out.println("AUTHOR:Anchu Sussen Mani");
   System.out.println(">>>>>>>>STUDENT DETAILS>>>>>>>"); 
   System.out.println("Name of the Student:"+name); 
   System.out.println("Subject1:"+m1);
   System.out.println("Subject2:"+m2);
   System.out.println("Subject3:"+m3);
   System.out.println("");
   System.out.println("TOTAL MARK:"+s);
 }
}

class studs
{
  public static void main(String args[]) throws IOException
  {
   student st=new student();
   DataInputStream dis=new DataInputStream(System.in);
   st.getdetails();
   st.display();
  }
}

    
