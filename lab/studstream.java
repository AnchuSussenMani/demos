import java.io.*;
class student
{
   String name;
   int m1,m2,m3,s;
   void getdetails(String name,int m1,int m2,int m3)
  {
   
   System.out.println(">>>>>>>>STUDENT DETAILS>>>>>>>"); 
   System.out.println("Name of the Student:"+name); 
   System.out.println("\t MARK1 \t MARK2 \t MARK3");
   System.out.println(m1+"\t "+m2+"\t "+m3);
  }
  void display(int m1,int m2,int m3)
 {
   s=m1+m2+m3;
   
   System.out.println("");
   System.out.println("TOTAL MARK:"+s);
 }
}

class studstream
{
  public static void main(String args[]) throws IOException
  {
   String name, m1,m2,m3;
   student st=new student();
   DataInputStream dis=new DataInputStream(System.in);
   System.out.println("AUTHOR:Anchu Sussen Mani");
   System.out.println("Enter the name of the student");
     name=dis.readLine();
    System.out.println("Enter first mark");
     m1=dis.readLine(); 
    int x=Integer.parseInt(m1);
	System.out.println("Enter second mark");
     m2=dis.readLine();
    int y=Integer.parseInt(m2);
	System.out.println("Enter third mark");
     m3=dis.readLine();
    int z=Integer.parseInt(m3);
   st.getdetails(name,x,y,z);
   st.display(x,y,z);
  }
}

    
