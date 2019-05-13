import java.io.*;
import java.util.*;
public class FilewriteExample 
{  
    public static void main(String args[])
    {    
         try
         {  
             Scanner s=new Scanner(System.in);
             FileWriter fw=new FileWriter("text.txt");   
                    System.out.println("enter the date for journey:");
                    String d=s.nextLine();
                    System.out.println("Enter your travel from where to where:");
                    String des=s.nextLine(); 
                    System.out.println();
                    System.out.println("Content of the file :");
                    fw.write(d);
                    System.out.println();
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
   }	 
}        