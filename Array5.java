import java.util.*;
import java.io.*;
class ArrayOpr
{
	static BufferedReader br;
	static int[] x;
	static
	{
		x=new int[5];
		try
		{
			br=new BufferedReader(new InputStreamReader(System.in));
		}
		catch(Exception e)
		{}
	}
	static String arrayToString()
	{	
		return "Data :"+Arrays.toString(x);
	}
	static int total()
	{
		int tot=x[0],i=1;
		while(i<x.length)
		tot+=x[i++];
		return tot;
	}
	static int average()
	{
		return total()/x.length;
	}
	static void sort()
	{
		Arrays.sort(x);
	}
	static int findMax()
	{
		int max=x[0],i=1;
		while(i<x.length)
		{
			if(x[i]>max)
				max=x[i];
			i++;
		}
		return max;
	}
	static int findMin()
	{
		int min=x[0],i=1;
		while(i<x.length)
		{
			if(x[i]<min)
				min=x[i];
			i++;
		}
		return min;
	}
	static boolean search(int sv)
	{
		sort();
		return (Arrays.binarySearch(x,sv)>=0);
	}
	static void input()
	{
		int i=0;
		while(i<x.length)
		{
			System.out.println("x["+i+"]");
			try
			{
				x[i]=Integer.parseInt(br.readLine());
			}
			catch(Exception e)
			{continue;}
			i++;
		}
	}
}

public class Array5
{
	public static void main(String[]args)
	{
		int choice=0;
		while(true)
		{
			System.out.println("Menue\n1:Input\n2:Dis\n3:Total\n4:Average\n5:Max\n6:Min\n7:Sort\n8:Search\n9:Exit\n");
			try
			{
				choice=System.in.read()-48;
				System.in.skip(5);
			}
			catch(Exception e)
			{}
			if(choice==1)
				break;
			switch(choice)
			{
				case 1:
					ArrayOpr.input();
					break;
				case 2:
					System.out.println(ArrayOpr.arrayToString());
					break;
				case 3:
					System.out.println("Total:"+ArrayOpr.total());
					break;
				case 4:
					System.out.println(ArrayOpr.average());
					break;
				case 5:
					System.out.println("maximum:"+ArrayOpr.findMax());
					break;
				case 6:
					System.out.println(ArrayOpr.findMin());
					break;
				case 7:
					System.out.println("Average"+ArrayOpr.average());
					break;
				case 8:
					int sv=0;
					try
					{
						System.out.println("Search Value");
						sv=Integer.parseInt(ArrayOpr.br.readLine());
					}
					catch(Exception e)
					{}
					if(ArrayOpr.search(sv)==false)
						System.out.println("Not found");
					System.out.println("Found");
					break;
			}
		}
	}
}