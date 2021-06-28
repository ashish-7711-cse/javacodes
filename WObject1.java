//program to write class object to the file
import java.util.*;
import java.io.*;
import mypkg.NewEStudent;
import mypkg.Util;
class WObject1
{
	public static void main(String[]args)
	{
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;
		NewEStudent ref= null;
		int no=0;
		try{
			fos = new FileOutputStream("stu2.dat");
			oos = new ObjectOutputStream(fos);
		}
		catch(Exception e)
		{}
		LinkedList<NewEStudent> ls = new LinkedList<NewEStudent>();
		
		while(true)
		{
			no = Util.iInput("Roll No:");
			if(no==0)
				break;
			ref = new NewEStudent();
			ref.setData(no);
			ls.add(ref);
		}
		try{
			oos.writeObject(ls);
			oos.close();
			fos.close();
		}
		catch(Exception e){}
	}
}
