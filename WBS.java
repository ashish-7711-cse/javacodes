import java.io.*;
class WBS
{
	public static void main(String[]args) throws Exception
	{
		int val=0;
		FileOutputStream fos =null;
		fos = new FileOutputStream("abc.dat");
		while(true)
		{
			System.out.println("Character:");
			val= System.in.read();
			System.in.skip(5);
			if((char)val=='*')
				break;
			fos.write(val);
		}
		fos.close();
		return;
	}
}