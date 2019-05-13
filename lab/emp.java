import java.io.*;
import java.util.Scanner;
class employee
{
 	String name;
 	int security;
 	void getdataemp()
 	{
   		Scanner s=new Scanner(System.in);
   		System.out.println("Enter name:");
   		name=s.nextLine();
   		System.out.println("Enter social security no.:");
   		security=s.nextInt();
 	}
}
class salary extends employee
{
 	int e;
        void get_earning()
	{
		super.getdataemp();
		Scanner s=new Scanner(System.in);
	System.out.println("\n Enter your earnings");
	e=s.nextInt();
	}
 	void display()
 	{
                System.out.println("ID: "+security);
                System.out.println("Name: "+name);
  		System.out.println("Earnings="+e);
 	}
}
class hourly extends employee 
{
 	float wage,hours;
        double e;
 	void getdatahrs()
 	{
                super.getdataemp();
   		Scanner s=new Scanner(System.in);
   		System.out.println("Enter wage:");
   		wage=s.nextFloat();
   		System.out.println("Enter hours worked:");
   		hours=s.nextInt();
 	}
 	void calculate()
	{
  		if(hours<=40)
                {
   			e=wage*hours;
                }
  		else
                {
   			e=wage*40+(hours-40)*wage*1.5;
                }
                System.out.println("ID: "+security);
                System.out.println("Name: "+name);
                System.out.println("Wage: "+wage);
                System.out.println("Hours worked: "+hours);
  		System.out.println("Earnings= " +e);
 	}
}
class commission extends employee 
{
 	int rate,e,gross;
 	void getdata()
 	{
                super.getdataemp();
  		Scanner s=new Scanner(System.in);
   		System.out.println("Enter gross sales:");
   		gross=s.nextInt();
   		System.out.println("Enter commission rate:");
   		rate=s.nextInt();
 	}
 	void calculation()
 	{
  		e=gross*rate;
                System.out.println("ID: "+security);
                System.out.println("Name: "+name);
                System.out.println("Gross: "+gross);
                System.out.println("Rate: "+rate);
 		System.out.println("Earnings="+e);
 	}
}
class baseplus extends commission
{
        int e,b_salary;
 	void gets()
 	{
   		Scanner s=new Scanner(System.in);
   		System.out.println("Enter base salary:");
   		b_salary=s.nextInt();
                
 	}
 	void puts()
 	{
  		e=(rate*gross)+b_salary;
                System.out.println("Base salary: "+b_salary);
  		System.out.println(" "+ e);
 	}
}
class emp
{
 	public static void main(String args[])
 	{
                int ch;
  		Scanner s=new Scanner(System.in);
           do
		{
	System.out.println("\n\n 1 : SALARIED EMPLOYEE \n\n 2. HOURLY EMPLOYEE \n\n 3. COMMISSION EMPLOYEE \n\n 4. BASEPLUS COMMISON EMPLOYEE\n \n\n Select Employee Type:");
	ch=s.nextInt();
	switch(ch)
	{
		case 1:salary sal=new salary();
				sal.get_earning();
				System.out.println("\n\tDisplaying SALARIED employee details\n\t\t-");
				sal.display();break;
		case 2:hourly h=new hourly();
				h.getdatahrs();System.out.println("\n\tDisplaying HOURLY employee details\n\t-");
                                h.calculate();break;
		case 3:commission com=new commission();
				com.getdata();System.out.println("\n\tDisplaying COMMISSION employee details\n\t-");
                                com.calculation();break;
		case 4:baseplus b=new baseplus();
				b.gets();System.out.println("\n\tDisplaying BASEPLUS employee details\n\t-");
				b.puts();break;
                default:System.out.println("invalid");
                
	}
		}while(ch!=0);
  		
 	}
} 