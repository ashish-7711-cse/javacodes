//implementation of quik sort using thread
import javax.swing.*;
import java.util.*;
class QuickSort implements Runnable
{
	static int []arr;
	int l,r;
	QuickSort()
	{
		arr = new int[10];
		l=0;
		r=9;
	}
	QuickSort(int l,int r)
	{
		this.l= l;
		this.r = r;
	}
	void input()
	{
		int i=0;
		while(i<10)
		{
			try{
			arr[i]= Integer.parseInt(JOptionPain.showInputDialog(null,"Data["+i+"]"));
			}
			catch(Exception e){ continue; }
			i++;
		}
	} 
	void display(int flg)
	{
		String str =  "Data";
		if(flg == 0)
		{
			str = str+"Before";
		}
		else
			str=  str+"After";
		str = str + "Sorting";
		for(int i=0;i<10;i++)
		{
			str = str + "  " + arr[i];
		}
		JOptionPain.showMessageDialog(null,str);
	}
	void pivot()
	{
		if(arr[l]>arr[r])
		{
			int tmp = arr[l];
			arr[l] = arr[r];
			arr[r] = tmp;	
		}	
	}
	synchronized int partition()
	{
		pivot();
		int i=l, j = r+1, k =arr[l];
		do{
			do{
				++i;	
			}while(arr[i]<k);
			do{
				--j;
			}while(arr[j]>k);
			if(i<j)
			{
				int tmp = arr[i];
				arr[i]=  arr[j];
				arr[j]= tmp;
			}
		}while(i<j);
		int tmp = arr[l];
		arr[l] = arr[j];
		arr[j] = tmp;
		return j;
	}
	synchronized void quick()
	{
		int k=0;
		if(l<r)
		{
			k = partition();
			Thread t1 = new Thread(new QuickSort(l,k-1));
			t1.start();
			try{
			t1.join();
			}
			catch(Exception e){}
			Thread t2 = new Thread(new QuickSort(k+1,r));
			try{
				t2.start();
			}
			catch(Exception e){}
		}
	}
	public void run()
	{
		quick();
	}
	public static void main(String []args)
	{
		QuickSort a= new QuickSort();
		a.input();
		a.display(0);
		Thread th = new Thread(a);
		th.start();
		try{
			th.join();
		}
		catch(Exception e){}
		a.display(1);
	}
}