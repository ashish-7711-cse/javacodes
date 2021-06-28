//program to read object from file
import java.util.*;
import java.io.*;
import mypkg.NewEStudent;
import mypkg.Util;
class RObject
{
	public static void main(String[]args)
	{
		ObjectInputStream ois = null;
		FileInputStream fis = null;
		NewEStudent ref= null;
		int no=0;
		try{
			fis = new FileInputStream("stu2.dat");
			ois = new ObjectInputStream(fis);
		}
		catch(Exception e)
		{}
		while(true)
		{
			try{
			ref =(NewEStudent)ois.readObject();
			}
			catch(Exception e){ break;}
			ref.display();
		}
		try{
			ois.close();
			fis.close();
		}
		catch(Exception e){}
	}
}
