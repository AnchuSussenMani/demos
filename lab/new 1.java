import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.Date;

public class trainsystem
{
    
    // Create an array of 1022 seats, 720 sleeper, 192 3AC, 92 2AC, 18 1AC.
    private static int[] seats = new int[1022];
	
    public static void main(String args[]) 
    {
		
        System.out.println("Welcome to  Railway Reservation System!");
        System.out.println();

        try
         {  
             Scanner s=new Scanner(System.in);
             FileWriter fw=new FileWriter("text.txt");  
                   
                   System.out.println("enter the date for journey:");
                   String d=s.nextLine();
                   System.out.println();
				   
                   System.out.println("Enter your travel from where to where:");
                   String des=s.nextLine();              
                   System.out.println();
                   System.out.println("Content of the file :");
                   //fw.write(no);
                   fw.write(d);
	               fw.write(des);
             fw.close();  
	         BufferedReader br = new BufferedReader(new FileReader("text.txt"));
             String line = null;
             while ((line = br.readLine()) != null)
             {
                System.out.println(line);
             }
         }
        catch(Exception e)
         {
             System.out.println(e);
         }    
        System.out.println("Success...");  
		
        for (int i = 0; i < 1022; i++) 
        {
            seats[i] = 0;
        }   
        Scanner s = new Scanner(System.in);
        int choice = 1,ch,n,a;
        String d,des;
        System.out.println("No. of passengers:");
            int no=s.nextInt();            
        
        System.out.println();
        System.out.println(" Origin ~~ Destination");
        System.out.println("-----------------------");
		System.out.println("1.Allapuzha ~~ Chennai Central");
		System.out.println("2.Bhopal Jn ~~ Durg Jn");
        System.out.println("3.Thiruvananthapuram Central ~~ Palakkad Town");
        System.out.println("4.Kolllam jn ~~ Chennai Egmore");
        System.out.println("5.Chennai Central ~~ Katra");
		
        System.out.println();
        System.out.println("Corresponding Trains are.....");
        System.out.println("1.Alleppey Express");
	    System.out.println("2.Amarkantak Express");
     	System.out.println("3.Amritha Express");
		System.out.println("4.Ananthapuri Express");
		System.out.println("5.Andaman Express");
		System.out.println("6.Exit");
		System.out.println("Select your Train"); 
            n=s.nextInt();
		System.out.println();
		System.out.println("Do you want....?");
		System.out.println("1.A/C");
		System.out.println("2.Non-A/C");
		System.out.println("3.Exit");
			a=s.nextInt();
			while(a!=3)
			{
				if(a==1)
				{
					booksleeper() ;
				}
				else if(a==2)
				{
					book3AC();
			    	book2AC();
				    book1AC();
                }
				else
                {
           
                    System.out.println("Invalid choice made. Please try again!");
                    a = 3;

                }
		System.out.println();
		System.out.println("Do you want....?");
		System.out.println("1.A/C");
		System.out.println("2.Non-A/C");
		System.out.println("3.Exit");		
			}
		while(n!=6)
		{
            if (n==1 || n==2 || n==3 || n==4 || n==5)
			{
                seat();
			}
			else
			{
                System.out.println("Invalid choice made. Please try again!");
                n= 6;
			}
				
		    System.out.println();
            System.out.println("Corresponding Trains are.....");
            System.out.println("1.Alleppey Express");
			System.out.println("2.Amarkantak Express");
			System.out.println("3.Amritha Express");
			System.out.println("4.Ananthapuri Express");
			System.out.println("5.Andaman Express");
			System.out.println("6.Exit");	
            n = s.nextInt();	
		}
    }
   
      
    public static void seat()
    {
        int choice;
        Scanner s= new Scanner(System.in);
        System.out.print("Please enter 1 for Sleeper, 2 for 3AC, 3 for 2AC, 4 for 1AC or 0 to exit: ");
        choice = s.nextInt();
        while (choice != 0) 
        {
            int seatnumber = 0;
            if (choice == 1) 
            {
                seatnumber = booksleeper();
                if (seatnumber == -1) 
                {
                    seatnumber = book3AC();                
                    if (seatnumber != -1)  
                    {
                        System.out.println("Sorry, we were not able to book a sleeper. But do have an 3AC.");
                        printBoardingPass(seatnumber);
                    }
                }
                else
                {
               
                    
                    System.out.println("You are in luck, we have a sleeper class available!");
                    printBoardingPass(seatnumber);
                }
            }
            else if (choice == 2) 
            {

               
                seatnumber = book3AC();

               
                if (seatnumber == -1) 
                {
                    seatnumber = booksleeper(); 
                    if (seatnumber != -1)
                    {
                        System.out.println("Sorry, we were not able to book an 3AC.");
                        printBoardingPass(seatnumber);
                    }
                }
                else 
                {
                
                    
                    System.out.println("You are in luck, we have an 3AC  available!");
                    printBoardingPass(seatnumber);
                }
            }
            else if (choice == 3) 
            {

               
                seatnumber = book2AC();

               
                if (seatnumber == -1) 
                {
                    seatnumber = book1AC(); 
                    if (seatnumber != -1)
                    {
                        System.out.println("Sorry, we were not able to book an 2AC. But do have 1AC.");
                        printBoardingPass(seatnumber);
                    }
                }
                else 
                {
                
                    
                    System.out.println("You are in luck, we have an 2AC available!");
                    printBoardingPass(seatnumber);
                }
            }
            else if (choice == 4) 
            {

               
                seatnumber = book1AC();

               
                if (seatnumber == -1) 
                {
                    seatnumber = book2AC(); 
                    if (seatnumber != -1)
                    {
                        System.out.println("Sorry, we were not able to book an 1AC. But do have a 2AC.");
                        printBoardingPass(seatnumber);
                    }
                }
                else 
                {
                
                    
                    System.out.println("You are in luck, we have an 1AC available!");
                    printBoardingPass(seatnumber);
                }
            }
            else
            {
           
                System.out.println("Invalid choice made. Please try again!");
                choice = 0;
            }
           
           
            if (seatnumber == -1)
            {
                System.out.println("We are sorry, there are no sleeper or 3AC or 2AC or 1AC available.");
                System.out.println();
            }
            
            
            System.out.print("Please enter 1 for sleeper, 2 for 3AC, 3 for 2AC, 4 for 1AC or 0 to exit: ");
            choice = s.nextInt();
        }
    }
  
    private static int booksleeper() 
    {
        for (int i = 0; i < 720; i++)
        {
            if (seats[i] == 0) 
            {
                seats[i] = 1;
               return i + 1;
            }
        }
        return -1;
    }

    
    private static int book3AC() 
    {
        for (int i = 720; i < 912; i++)
        {
            if (seats[i] == 0)
            {
                seats[i] = 1;
                return i + 1;
            }
        }
        return -1;
    }

private static int book2AC() 
    {
        for (int i = 912; i < 1004; i++)
        {
            if (seats[i] == 0)
            {
                seats[i] = 1;
                return i + 1;
            }
        }
        return -1;
    }
private static int book1AC() 
    {
        for (int i =1004 ; i < 1; i++)
        {
            if (seats[i] == 0)
			{
                seats[i] = 1;
                return i + 1;
            }
        }
        return -1;
    }
    
    private static void printBoardingPass(int seatnumber) 
    {
        Scanner s = new Scanner(System.in);
        
           
        Date timenow = new Date();
		//x=d;
		//y=des;
        System.out.println();
		System.out.println("*********************************************************");
		System.out.println("          RAILWAY RESERVATION SYSTEM          ");
		System.out.println();
		System.out.println("      Happy Journey     ");
        System.out.println("Date: " + timenow.toString());
		String d,des;
        System.out.println("Pass for seat number: " + seatnumber);
      //System.out.println("Journey Date:"+d);
		//System.out.println(""+des);
       // d=s.nextLine();
        System.out.println("This ticket is non-refundable and non-transferable.");
        System.out.println("Please do not smoke. Enjoy your trip.");
        System.out.println();
		System.out.println("*********************************************************");
    }
}