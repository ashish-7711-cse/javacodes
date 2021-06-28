class Thread4 extends Thread
{
	int no;
	String nm;
	Thread4(int n,String nm)
	{
		super(nm);
		this.nm = nm;
		no = n;
	}
	public  void run()
	{
		int i=1;
		while(i<=no)
		{
			System.out.println(nm +" "+ i);
			i++;
		}
	}
}
class Thread4App
{
	public static void main(String []args)
	{
		System.out.println("Main Method");
		Thread4 a = new Thread4(3,"A");
		Thread4 b= new Thread4(5,"B");
		Thread4 c = new Thread4(6,"c");
		a.start();
		b.start();
		c.start();
		try
		{
			a.join();
			b.join();
			c.join();
		}
		catch(Exception e){}
		System.out.println("Main Ends");
	}
}
//In the above prog we have simply initiated three new threads. We did not hold onto them any further they are running concurrently on their on.Note That The output from  threads are not speacily sequential they do not follow any specific order.. They are running indepedently and exec whenever it has a chance .
//Remember ones the threads are started we can not decide with certainly the order in which they execute statement. In the Second attempt theoutput sequence may be diffent
//Suppose in above programm if we are make run method directly then  the prog does not ipict multyprogram behaviour and run sequentialy . The reason befind is whenever run method is invoked by start method, the threads start from seperate call start. However invoking run method directly from main method causes the corresponding thread to go into the current call stack.
//Since the direct call to run method to main Does not creat a separate call ... its instruction starts sequentialy. Thus calling run method directly causes the programmme to behave k=like normal single threded program.
// join : waits for this method to die.