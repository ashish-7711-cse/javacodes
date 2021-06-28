class Shared1
{
	void table(int no)
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
class Thread6 extends Thread
{
	Shared1 obj; int n;
	Thread6(Shared1 a, int n)
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
class Thread6App
{
	public static void main(String []args)
	{
		System.out.println("Main Stsrt");
		Shared1 a = new Shared1();
		Thread6 b = new Thread6(a,6);
		Thread6 c = new Thread6(a,9);
		try{
			b.join();
			c.join();
		}
		catch(Exception e){}
		System.out.println("END");
	}
}