import java.io.*;
import java.util.Scanner;
class matrix
	{
   	public static void main(String args[])
	{  
    	int ch,i,j,k,m,m1,n,n1;
   	Scanner S=new Scanner(System.in); 
   	int a[][]=new int[10][10];
   	int b[][]=new int[10][10];
   	int c[][]=new int[10][10];  
System.out.println("enter the size of row & column of first matrix");
            m=S.nextInt();
           
            n=S.nextInt();   
           System.out.println("Enter the elements");
                        for(i=0;i<m;i++)
                          {
                            for(j=0;j<n;j++)  
                            {
                                 a[i][j]=S.nextInt();  
                             }
                         }        
                 for(i=0;i<m;++i)
                          {
                            for(j=0;j<n;++j)  
                            {
                                 System.out.println(a[i][j]+"  ");  
                             }
                                                        }               
           System.out.println("enter the size of row & column of second matrix");
            m1=S.nextInt();
                      n1=S.nextInt();   
            System.out.println("Enter the elements");
            for(i=0;i<m1;++i)
             {
               for(j=0;j<n1;++j)  
               {
                  b[i][j]=S.nextInt();   
               }
            }
          for(i=0;i<m;++i)
            {
                for(j=0;j<n;++j)  
                   {
                     System.out.println( b[i][j]+"  ");  
                     }
      	   }
	do
       	{  

           System.out.println("MENU DRIVEN PROGRAM");
           System.out.println("1.ADDITION");
           System.out.println("2.SUBTRACTION");
           System.out.println("3.MULTIPLICATION");
	   System.out.println("4.TRANSPOSE");
           System.out.println("enter ur choice");
           ch=S.nextInt();
               switch(ch)
                   {
                     case 1:
                           
				if(m==m1 && n==n1)
				{
				System.out.println("...ADDITION...");
                                  for(i=0;i<m;i++)
                                   {
                                      for(j=0;j<n;j++)  
                                       {
                                        c[i][j]=a[i][j]+b[i][j];
                                        }
                                  }
				}
                                  System.out.println("RESULT IS");
                                  for(i=0;i<m;i++)
                                   {
                                      for(j=0;j<n;j++)  
                                       {
                                          System.out.println(c[i][j]+"  ");
                                        }
                                                                           }
				
                                  break;
                      case 2:
				if(m==m1 && n==n1)
				{
				System.out.println("...SUBTRACTION...");
                                  for(i=0;i<m;i++)
                                   {
                                      for(j=0;j<n;j++)  
                                       {
                                        c[i][j]=a[i][j]-b[i][j];
                                        }
                                     }
					}
                                  System.out.println("result=");
                                  for(i=0;i<m;++i)
                                   {
                                      for(j=0;j<n;j++)  
                                       {
                                          System.out.print(c[i][j]+"  ");
                                        }
                                          System.out.println("\n");
                                   }
				
				
                                  break;
                        case 3: 

 if(m==m1 && n==n1)
				{
				 System.out.println("...MULTIPLICATION...");
                                  for(i=0;i<m;i++)
                                   {
                                      for(j=0;j<n;j++)  
                                       {
                                          for(k=0;k<m;k++)
                                          {
                                            c[i][j]=c[i][j]+a[i][k]*b[k][j];
                                           }
                                        }
                                     }
                                }
                                  System.out.print("result=");
                                  for(i=0;i<m;++i)
                                   {
                                      for(j=0;j<n;++j)  
                                       {
                                          System.out.print(c[i][j]+"  ");
                                        }
                                       System.out.println("\n");
                                   } 
				
				
			
				System.out.println("Transpose of the resultant matrix is");
				for(i=0;i<n;i++)
				{
					for(j=0;j<m;j++)

					{
					
                			System.out.print(c[j][i]+" ");
            				}
           			       System.out.println("\n ");
        			}
			     
				
				  break;
                        default: System.out.println("...INVALID..."); 
                                 break;
                }
          
}
while(ch!=0);
}
}

