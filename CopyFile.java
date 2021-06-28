import java.io.*;
class CopyFile
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
		FileOutputStream fos = new FileOutputStream("pqr.dat");
		while(true)
		{
			
			val= fis.read();
			if(val==-1)
				break;
			fos.write(val);
		}
		fis.close();
		fos.close();
	}
}