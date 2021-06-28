//by converting class to a thread

class MyNumber implements Runnable
{
	int no;
	MyNumber(int a)
	{
		no =a ;
	}
	public void run()
	{
		table();
	}
	void table()
	{
		int i=1;
		System.out.println("Table\n");
		while(i<=10)
		{
			System.out.println(no*i);
			i++;
		}
	}
}
public void Thread3App
{
	public static void main(String[]args)
	{
		MuNumber a= new MyNumber(15);
		Thread th = new Thread(a);
		th.start();
		System.out.println("Main Ends");
	}
}