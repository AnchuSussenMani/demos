import java.io.*;
import java.util.Scanner;
class matri
{
	public static void main(String args[])
 	{
                int ch,i,j,m,n,p,q,k;
  		Scanner s=new Scanner(System.in);
  		
                int a[][]=new int[10][10];
                int b[][]=new int[10][10];
                int c[][]=new int[10][10];
  		System.out.println("Name of the Author:Anchu Sussen Mani");
  		do
  		{
			System.out.println("enter the row and column of the first matrix:");
			m=s.nextInt();
			n=s.nextInt();
			System.out.println("enter the elements:");
			for(i=0;i<m;i++)
 			{
				for(j=0;j<n;j++)
                                      {
					a[i][j]=s.nextInt();
                                      }
			}
			System.out.println("enter the row and column of the second matrix:");
			p=s.nextInt();
			q=s.nextInt();
			System.out.println("enter the elements:");
			for(i=0;i<p;i++)
			{
				for(j=0;j<q;j++)
                               {	
				b[i][j]=s.nextInt();
			        }
                         }
                        System.out.println(".....Matrix Operation....");
   			System.out.println("1.Matrix Addition");
   			System.out.println("2.Matrix Subtraction");
   			System.out.println("3.Matrix Multiplication");
   			System.out.println("4.Matrix Transpose");
   			System.out.println("enter your choice");
   			ch=s.nextInt();
      			switch(ch)
   			{
    				case 1:for(i=0;i<m;i++)
 					{
						for(j=0;j<n;j++)
						{	
							c[i][j]=a[i][j]+b[i][j];
				        	}
					}
					for(i=0;i<m;i++)
 					{
						for(j=0;j<n;j++)
						{
							System.out.println(" "+c[i][j]);
						}
					}	
					break;
				case 2:for(i=0;i<m;i++)
 					{
						for(j=0;j<n;j++)									
						{
							c[i][j]=a[i][j]-b[i][j];										}
				        	}
					}
					for(i=0;i<m;i++)
 					{
						for(j=0;j<n;j++)		
						{
							System.out.println(" "+c[i][j]);	
						}
					}
					break;
				case 3:for(i=0;i<m;i++)
 					{
						for(j=0;j<n;j++)
						{
							for(k=0;k<m;k++)	
							{
								c[i][j]=c[i][j]+a[i][k]*b[k][j];
							}
						}
					}
					break;
				case 4:for(j=0;j<n;j++)
 					{
						for(i=0;i<m;i++)
						{
							System.out.println(" "+c[i][j]);
						}
					}
					break;
				default:System.out.println("Invalid Choice");
					
			}
		}while(ch!=0);
		
	}
}