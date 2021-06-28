//program to write class object to the file
import java.io.*;
import mypkg.NewEStudent;
import mypkg.Util;
class WObject
{
	public static void main(String[]args)
	{
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;
		NewEStudent ref= null;
		int no=0;
		try{
			fos = new FileOutputStream("stu.dat");
			oos = new ObjectOutputStream(fos);
		}
		catch(Exception e)
		{}
		while(true)
		{
			no = Util.iInput("Roll No:");
			if(no==0)
				break;
			ref = new NewEStudent();
			ref.setData(no);
			try{
			 oos.writeObject(ref);
			}
			catch(Exception e){}
		try {
  			oos.close();
			fos.close();
		}
		catch(Exception e){}
		}
	}
}
