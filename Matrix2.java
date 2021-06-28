import java.util.*;
import java.io.*;
class Matrix2
{
	public static void main(String []args)
	{
		BufferedReader br=null;
		int[][]a =new int[3][];
		int i=0,j=0;
		for(i=0;i<3;i++)
			a[i]=new int[3];
		try
		{
			br=new BufferedReader(new InputStreamReader(System.in));
		}
		catch(Exception e){}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				try
				{
					a[i][j]= Integer.parseInt(br.readLine());	
				}
				catch(Exception e){
					a[i][j]=0;
				}
			}
		}
		String s="Matrix\n";
		for(i=0;i<3;i++)
		{
			s=s+Arrays.toString(a[i])+"\n";
		}
		System.out.println(s);
		int tmp;
		for(i=0;i<3;i++)
		{
			for(j=0;j<i;j++)
			{
				tmp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=tmp;
			}
		}
		s="Matrix\n";
		for(i=0;i<3;i++)
			s=s+Arrays.toString(a[i])+"\n";
		System.out.println(s);
	}
}