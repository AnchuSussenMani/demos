import java.io.*;
import java.util.Scanner;
class shapes
	{
 		Scanner s=new Scanner(System.in);
		void area(int c)
		 {
  			double a1=3.14*c*c;
  			System.out.println("Area of a Circle="+a1);
 		 }

 		void area(int p,int g)
 		 {
  			int a2=p*g;
  			System.out.println("Area of a Rectangle="+a2);
 		 }

 		void volume(double h)
 		 {	
  			double v1=(4/3)*3.14*h*h*h;
  			System.out.println("Volume of a Sphere="+v1);
 		 }

 		void volume(float k)
 		 {
  			float v2=k*k*k;
  			System.out.println("Volume of a Cube="+v2);
 		 }
	}

class sdemo
	{
 		public static void main(String args[])
 			{
  				Scanner s=new Scanner(System.in);
  				shapes sh=new shapes();
  				int ch,c,p,g;
				float k;
  				double h;
  				System.out.println("Name of the Author:Anchu Sussen Mani");
  				do
  					{
						System.out.println(".....Method Overloading.....");
   						System.out.println("1.Area of a Circle");
   						System.out.println("2.Area of a Rectangle");
   						System.out.println("3.Volume of a Sphere");
   						System.out.println("4.Volume of a Cube");
   						System.out.println("enter your choice");
   						ch=s.nextInt();
      						switch(ch)
   							{
    								case 1:
									System.out.println("enter radius of a circle:");
  									c=s.nextInt();
           								sh.area(c);
           							break;
    								case 2:
									System.out.println("enter length of a rectangle:");
									p=s.nextInt();

  									System.out.println("enter breadth of a rectangle:"); 
  									
  									g=s.nextInt();
           								sh.area(p,g);
           							break;
    								case 3:
									System.out.println("enter the radius of a sphere as double value:");
 									h=s.nextDouble();
           								sh.volume(h);
           							break;
    								case 4:
									System.out.println("enter the size of a cube as float:");
									k=s.nextFloat();
          								sh.volume(k);
          							break;
    								default:
            								System.out.println("Invalid choice");
           							break;
   							}
  					}
  				while(ch!=0);
 			}
	}


