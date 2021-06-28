//program to creat file by writing primitive types
import java.io.*;
import mypkg.Util;
class RPData
{
	public static void main(String[]args)
	{
		int no=0;
		double mrk=0.0;
		String nm ="";
		DataInputStream dis = null;
		FileInputStream fis = null;
		try{
			fis = new FileInputStream("stu.dat");
			dis = new DataInputStream(fis);
		}	
		catch(Exception e)
		{}
		while(true)
		{
		try{
			no=dis.readInt();
			nm=dis.readUTF();
			mrk=dis.readDouble();
		}
		catch(Exception e){
			break;}
		String s = "Roll No:"+no+"\nName:"+nm+"\nMarks:"+mrk;
		Util.oMessage(s);
		}
		try{
			fis.close();
			dis.close();
		}
		catch(Exception e){}
	}
}	