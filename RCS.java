//program to read file using character stream classes
import java.io.*;
class RCS 
{
	public static void main(String[]args)throws Exception
	{
		int val =0;
		File f= new File("abc.txt");
		if(f.exists()==false)
			return ;
		int len = (int)f.length();
		char []ca = new char[len];
		FileReader fr = new FileReader(f);
		len = fr.read(ca);
		String str = new String(ca);
		System.out.println(str);
		fr.close();
	}
}