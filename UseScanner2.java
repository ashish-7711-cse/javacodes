import java.util.*;
class UseScanner2
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int no = 0;
		System.out.println("Enter no:");
		try
		{
			no = s.nextInt();
		}
		catch(Exception e)
		{}
		System.out.println("No: "+no);
	}
}