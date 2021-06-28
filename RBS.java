//program to read file using bytestream classes
import java.io.*;
class RBS
{
	public static void main(String[]args) throws Exception
	{
		int val=0;
		File f =new File("abc.dat");
		if(f.exists()==false)
		{
			System.out.println("File Not Found");
			return;
		}
		FileInputStream fis = new FileInputStream(f);
		while(true)
		{
			
			val= fis.read();
			if((char)val==-1)
				break;
			System.out.println((char)val);
		}
		fis.close();
	}
}