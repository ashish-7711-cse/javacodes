class Thread1
{
	public static void main(String []args)
	{
		Thread th = Thread.currentThread();
		System.out.println("main Statr");
		System.out.println("Name:"+th.getName());	
		System.out.println("Alive:"+th.isAlive());
		try{
			Thread.sleep(1000);
		}
		catch(Exception e){}
		System.out.println("Main Ends");
	}
}