//package com.javatpoint;  
//import java.io.FileWriter; 
import java.io.File; 
import java.io.*;
import java.util.*;
public class FileWriterExample {  
    public static void main(String args[]){    
         try{    
		 //File obj=new File("newtxt.txt");
		 //obj.createNewFile();
         //System.out.println(obj);
		 Scanner s=new Scanner(System.in);
         String p="11222";
		 int x;
		 x=Integer.parseInt(p);
		 //fw.write(x);   
          FileWriter fw=new FileWriter("text.txt");    
           fw.write(x);   
           System.out.println("Enter the name");
           String name=s.next();
            fw.write(name);	   
           fw.close();  
		   BufferedReader br = new BufferedReader(new FileReader("text.txt"));
           String line = null;
           while ((line = br.readLine()) != null) {
           System.out.println(line);
          }
		 }catch(Exception e){System.out.println(e);}    
         System.out.println("Success...");  
		 
     }    
}  