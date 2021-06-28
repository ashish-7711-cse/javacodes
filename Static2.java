
import java.io.*;
class Static2
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
	static void digitSum()
	{
		int tmp=no;
		int tot=0;
		while(tmp>0)
		{
			tot+=(tmp%10);
			tmp=tmp/10;
		}
		System.out.println("Digit Sum="+tot);
	}
	static void prime()
	{
		int i=2;
		while(i<no)
		{
			if(no%i==0)
			break;
			i++;
		}
		if(i==no)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}	
	static void toStringObj()
	{
		System.out.println("String"+Integer.toString(no));
	}
	static void toBinaryObj()
	{
		System.out.println("Binary="+Integer.toBinaryString(no));
	}
	static void toOctalObj()
	{
		System.out.println("Octal="+Integer.toOctalString(no));
	}
	static void toHexObj()
	{
		System.out.println("Hexa="+Integer.toHexString(no));
	}
	static void menu()
	{
		int opt=0;
		while(true)
		{
			System.out.println("Menue\n1:Enter No\n2:Table\n3:Prime\n4:Dis\n5:Sring\n6:Binary\n7:Ocatl\n8:Hex\n9:Dig Sum\0:Exit");
			try
			{
				opt =System.in.read()-48;
				System.in.skip(5);
			}
			catch(Exception e)
			{}
			if(opt==0)	
				break;
			switch(opt)
			{
				case 1:
					input();
					break;
				case 2:
					table();	
					break;
				case 3:
					prime();
					break;
				case 4:
					display();
					break;
				case 5:
					toStringObj();
					break;
				case 6:
					toBinaryObj();
					break;
				case 7:
					toOctalObj();
					break;
				case 8:
					toHexObj();
					break;
				case 9:
					digitSum();
					break;
			}
		}
	}
		
	public static void main(String[]args)
	{
		menu();
	}
}