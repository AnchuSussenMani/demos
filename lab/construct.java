import java.io.*;
import java.util.Scanner;
class construct
	{
 		Scanner s=new Scanner(System.in);
                void cnstr(int x,int y)
		{
			System.out.println("\n Power of Number ");
		
		for(i=0;i<y;i++)
		{
		r=r*x;
		}
		System.out.println(+r);
               }
               number(int a,int b,int c)
		  {
 		       double d=(b*b)-(4*a*c);
			if(d==0)
			{
				r=(-b)/(2*a);
				System.out.println("\n Roots are Equal"+r);
		  	}
		  
			else if(d>0)
			{
				double s1=Math.sqrt(d);
				double r1=(-b + s1)/(2*a);
				double r2=(-b-s1)/(2*a);
				System.out.println(" Roots are real"+r1 +r2);
		        }
			else
				System.out.println(" Roots are imaginary");		
                  }
       }

	class equation
	{
		
		public static void main(String args[])
		{
		
			int choice;
			do
			{
	
			System.out.println("\n Enter your choice: 1 ,2");
			Scanner s=new Scanner(System.in);	
	c		choice=s.nextInt();
		switch(choice)
			{
				case 1: System.out.println("\n Enter the number and its power:");
				int x=s.nextInt();
				int y=s.nextInt();
				
				number e=new number(x,y);
				break;
					case 2: System.out.println("\n Enter value for a,b,c:");
					int a=s.nextInt();
					int b=s.nextInt();
					int c=s.nextInt();
				
					number ee=new number(a,b,c);
					break;			
				default :System.out.println("\n Invalid choice:"); break;
			} 

	
	}while(choice!=0);
			}

		}