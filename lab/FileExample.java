import java.io.*;
import java.util.*;
public class FileExample 
{  
    public static void main(String args[])
    {    
         try
         {  
             Scanner s=new Scanner(System.in);
             //String p="11222";
	     //int x;
	    // x=Integer.parseInt(p);
             FileWriter fw=new FileWriter("text.txt");    
             //fw.write(x);   
             System.out.println("Enter the name");
             String name=s.next();
             System.out.println();
             System.out.println("Content of the file :");
             fw.write(name);	   
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