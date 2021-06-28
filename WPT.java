//program to creat file by writing primitive types
import java.io.*;
import mypkg.Util;
class WPT
{
	public static void main(String[]args)
	{
		int no=0;
		double mrk=0.0;
		String nm ="";
		DataOutputStream dos = null;
		FileOutputStream fos = null;
		try{
			fos = new FileOutputStream("stu.dat");
			dos = new DataOutputStream(fos);
		}	
		catch(Exception e)
		{}
		while(true)
		{
			no = Util.iInput("Roll No:");
		if(no==0)
			break;
		nm=Util.sinput("Name");
		mrk = Util.dInput("Marks");
		try{
			dos.writeInt(no);
			dos.writeUTF(nm);
			dos.writeDouble(mrk);
		}
		catch(Exception e){}
		}
		try{
			fos.close();
			dos.close();
		}
		catch(Exception e){}
	}
}	