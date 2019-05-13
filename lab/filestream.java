import java.io.*;
import java.util.*;
class filestream
{
  public static void main(String args[])throws IOException
  {
    FileOutputStream fout=new FileOutputStream("test.txt");
	 DataOutputStream dout=new DataOutputStream(fout);
	 dout.writeDouble(98.6);
	 dout.writeInt(1000);
	 boolean b1=true;
	 dout.writeBoolean(b1);
	 dout.close();
	 FileInputStream fin=new FileInputStream("test.dat");
	 DataInputStream din=new DataInputStream(fin);
	 double d=din.readDouble();
	 int n=din.readInt();
	 boolean b=din.readBoolean();
	 System.out.println(" "+d+"\t"+n+"\t"+b);
	 din.close();
  }
}