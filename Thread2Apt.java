class Thread2 extends Thread
{
	int no;
	Thread2(String nm,int no)
	{
		super(nm);
		this.no =no;
		start();
	}
	public void run()
	{
		System.out.println("Table:");
		int i=1;
		while(i<=10)
		{
			String k = (Thread.currentThread()).getName()+" "+(no*i);
			System.out.println(k);
			try{
		Thread.sleep(1000);
		}
		catch(Exception e){}
			i++;
		}
	}
}
public class Thread2Apt
{
	public static void main(String[]args)
	{
		System.out.println("Thread Starts");
		Thread2 A= new Thread2("A",3);
		Thread2 B= new Thread2("b",5);
		Thread2 C= new Thread2("C",7);
		System.out.println("MainEnds");
	}
}