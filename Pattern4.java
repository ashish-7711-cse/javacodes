class Pattern4
{
	public static void main(String[] args)
	{
		int i=1,j=1;
		String a="Pattern\n";
		while(i<=5)
		{
			a=a+"*";
			if(++j>i)		
			{
				a=a+"\n";
				j=1;
				i++;
			}
		}
		System.out.println(a);
		
	}
}