//program to read object from file
import java.util.*;
import java.io.*;
import mypkg.NewEStudent;
import mypkg.Util;
class RObject1
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
		LinkedList<NewEStudent> ls = new LinkedList<NewEStudent>();
		
		try{
			ls=(LinkedList<NewEStudent>)ois.readObject();
		}
		catch(Exception e){}
		int i=0, n= ls.size();
		while(i<n)
		{
			ref = ls.get(i);
			ref.display();
			i++;
		}
		try{
			ois.close();
			fis.close();
		}
		catch(Exception e){}
	}
}
