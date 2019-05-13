import java.io.*;
import java.util.Scanner;
class mat
{
   public static void main(String args[])
   {  
    int ch,i,j,k,m,m1,n,n1;
    Scanner S=new Scanner(System.in); 
    int a[][]=new int[10][10];
    int b[][]=new int[10][10];
    int c[][]=new int[10][10]; 
    System.out.println("enter the size of row of first matrix");
            m=S.nextInt();
    System.out.println("enter the size of column of first matrix");
            n=S.nextInt();   
    System.out.println("Enter the elements");
    for(i=0;i<m;i++)
    {
     for(j=0;j<n;j++)  
     {
      a[i][j]=S.nextInt();  
     }
    }        
    for(i=0;i<m;i++)
    {
     for(j=0;j<n;j++)  
     {
      System.out.println(a[i][j]+"  ");  
     }
    }               
           
    System.out.println("enter the size of row of second matrix");
            m1=S.nextInt();
    System.out.println("enter the size of column of second matrix");
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
                     System.out.print(b[i][j]+"  ");  
                     }
                    System.out.println("\n");
              } 
  do
{                   
           System.out.println("MENU DRIVEN");
           System.out.println("1.ADDITION");
           System.out.println("2.SUBTRACTION");
           System.out.println("3.MULTIPLICATION");
           System.out.println("enter ur choice");
           ch=S.nextInt();
               switch(ch)
                   {
                     case 1:System.out.println("Addition");
                                  for(i=0;i<m;++i)
                                   {
                                      for(j=0;j<n;++j)  
                                       {
                                        c[i][j]=a[i][j]+b[i][j];
                                        }
                                     }
                                  System.out.println("result=");
                                  for(i=0;i<m;++i)
                                   {
                                      for(j=0;j<n;++j)  
                                       {
                                          System.out.print(c[i][j]+"  ");
                                        }
                                        System.out.println("\n");
                                   }
                                  break;
                      case 2:System.out.println("Subtraction");
                                  for(i=0;i<m;++i)
                                   {
                                      for(j=0;j<n;++j)  
                                       {
                                        c[i][j]=a[i][j]-b[i][j];
                                        }
                                     }
                                  System.out.println("result=");
                                  for(i=0;i<m;++i)
                                   {
                                      for(j=0;j<n;++j)  
                                       {
                                          System.out.print(c[i][j]+"  ");
                                        }
                                          System.out.println("\n");
                                   }
                                  break;
                        case 3:   System.out.println("Multiplication");
                                if(m==m1)
				{  
				for(i=0;i<m;++i)
                                   {
                                      for(j=0;j<n;++j)  
                                       {
                                          for(k=0;k<m;++k)
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
				System.out.println("Transpose");
                                    for(i=0;i<m;i++)
 					{
						for(j=0;j<m;j++)
						{
							System.out.println(" "+c[j][i]);
						}
					}
					break;
                        default: System.out.println("Invalid"); 
				break;
                }
          
}while(ch!=0);
}
}

