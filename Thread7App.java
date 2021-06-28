class Shared2
{
	synchronized void table(int no)
	{
		int i=1;
		System.out.println("Table");
		while(i<=10)
		{
			System.out.println(" "+(no*i));
			i++;
		}	
	}
}
class Thread7 extends Thread
{
	Shared2 obj; int no;
	Thread7(Shared2 a, int n)
	{
		super();
		obj = a;
		no = n;
		start();
	}
	public void run()
	{
		obj.table(no);
	}
}
class Thread7App
{
	public static void main(String []args)
	{
		System.out.println("Main Stsrt");
		Shared2 a = new Shared2();
		Thread7 b = new Thread7(a,6);
		Thread7 c = new Thread7(a,9);
		try{
			b.join();
			c.join();
		}
		catch(Exception e){}
		System.out.println("END");
	}
}