
import java.io.*;
class Static1
{
	static int no;
	static BufferedReader br;
	static{
		no=0;
		try
		{
			br=new BufferedReader(new InputStreamReader(System.in));
		}
		catch(Exception e){}
	}
	static void display()
	{
		System.out.println("no"+no);
	}

	static void input()
	{
		System.out.println("No:");
		try{
			no=Integer.parseInt(br.readLine());
		}
		catch(Exception e){}
	}
	static void table()
	{
		String k ="\nTable\n";
		for(int i=0;i<=10;i++)
			k=k+" "+(no*i);
		System.out.println(k);
	}
	public static void main(String[]args)
	{
		input();
		display();
		table();
	}
}