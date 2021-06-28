//file creation using character stream
import java.io.*;
class WCS
{
	public static void main(String[]args)throws Exception
	{
		int val =0;
		FileWriter fw =new FileWriter("abc.txt");
		while(true)
		{
			System.out.println("\nCharacter : ");
			val = System.in.read();
			System.in.skip(5);
			if((char)val=='*')
				break;
			fw.write(val);
		}
		fw.close();
	}
}
