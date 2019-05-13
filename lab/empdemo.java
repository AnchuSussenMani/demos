import java.io.*;
import java.util.Scanner;
class emp
{
 double netsal,bs,hra,da,tax;
 String name,designation;
 void calculate()
 {
  Scanner s=new Scanner(System.in);
  System.out.println("enter name of an employee:");
  name=s.nextLine();
  System.out.println("enter designation:");
  designation=s.nextLine();
  System.out.println("enter basic salary:");
  bs=s.nextDouble();
  System.out.println("enter hra:");
  hra=s.nextDouble();
  System.out.println("enter da:");
  da=s.nextDouble();
  System.out.println("enter income tax amount:");
  tax=s.nextDouble();
  netsal=(bs+hra+da)-tax;
  System.out.println("Netsalary is "+netsal);
 }
}
class empdemo
{
 public static void main(String args[])
 {
  emp e=new emp();
  e.calculate();
 }
}