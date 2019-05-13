import java.io.*;
import java.util.Scanner;
class single
{
 	public static void main(String args[])
	{  
    		int ch,i,j,n,pass,t,item,f=0,c=0,pos=0,e;
   		Scanner S=new Scanner(System.in);
   		int a[]=new int[10];
do
       		{ 
		System.out.println("enter the size of an array:");
            	n=S.nextInt(); 
		System.out.println("enter the elements:");
		for(i=0;i<n;i++)
			a[i]=S.nextInt();
   	     	 
			 
 			System.out.println("MENU DRIVEN");
           		System.out.println("1.INSERTION");
           		System.out.println("2.DESCENDING ORDER");
           		System.out.println("3.ASCENDING ORDER");
			System.out.println("4.SEARCHING");
           		System.out.println("enter your choice:");
           		ch=S.nextInt();
               		switch(ch)
                   	{
                     		case 1: System.out.println("Insert & Display"); 
					System.out.println("enter the position:");
                                        pos=S.nextInt(); 
					System.out.println("enter the elements to be insert:");
					e=S.nextInt();
					for(i=n;i>=(pos-1);i--)
{
						a[i+1]=a[i];
}
					a[pos]=e;
					System.out.println("RESULT");
					for(i=0;i<(n+1);i++)
						System.out.println(a[i]+"  ");  
					break;
				case 2: System.out.println("DESCENDING");
					for(i=0;i<n;i++)
  					{
      						for(j=(i+1);j<n;j++)
    						{
        						if(a[i]<a[j])
        						{
           							t=a[i];
           							a[i]=a[j];
           							a[j]=t;
        						}
    						}
  					}
					for(i=0;i<n;i++)
						System.out.println(a[i]+"  "); 
					break;
				case 3: System.out.println("ASCENDING");
					for(i=0;i<n;i++)
  					{
      						for(j=(i+1);j<n;j++)
    						{
        						if(a[i]>a[j])
        						{
           							t=a[i];
           							a[i]=a[j];
           							a[j]=t;
        						}
    						}
  					}
					for(i=0;i<n;i++)
						System.out.print(a[i]+"  "); 
					break;
				case 4:	System.out.println("LINEAR SEARCH");
					System.out.println("enter the element to be search:");
 					item=S.nextInt(); 
 					for(i=0;i<n;i++)
 					{
     						if(item==a[i])
     						{
         						c=i;
   						}
					
 					}
				c++;
 					if(c>-1) 
					{
						System.out.println("Item is at "+c);
 					}
					else
					{
        					System.out.println("given element is not found in the array");
    					}
					break;
				default:System.out.println("INVALID");
					break;
			}
		}
		while(ch!=0);
	}
}