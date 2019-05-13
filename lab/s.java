import java.io.*;
import java.util.Scanner;
class strpgm
{
   public static void main(String args[])
	{ 
		string str;
		int n,d=0,l=0;
		char c;
		str=args[0];
		n=str.length();
		for(i=0;i<n;i++)
 			{
				c=str.charAt(i);
				if(character.IsDigit(c))
					d=d+1;
				else if(character.IsLetter(c))
					l=l+1;
			}
		System.out.println("No.of digits:"+d);
		System.out.println("No.of letters:"+le);
	}
}
		