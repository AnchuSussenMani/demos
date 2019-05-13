import java.io.*;
import java.util.Scanner;
import java.lang.*;
class strpgm
{
   public static void main(String args[])
	{ 
		String str;
		int n,d=0,l=0;
		char c;
		str=args[0];
		n=str.length();
		for(i=0;i<n;i++)
 			{
				c=str.charAt(i);
				if(Character.isDigit(c))
				{
					d=d+1;
				}
				else if(Character.isLetter(c))
				{
					l=l+1;
				}
			}
		System.out.println("No.of digits: "+d);
		System.out.println("No.of letters: "+l);
	}
}
		