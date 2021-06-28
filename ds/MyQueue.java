package ds;
import ds.IQue;
import mypkg.Util;
public class MyQueue implements IQue
{
	int rr,fr;
	int []arr;
	public MyQueue()
	{
		rr=-1;
		fr=0;
		arr = new int[size];
	}
	public boolean isFull()
	{ return rr==size;}
	public boolean isEmpty()
	{ return (fr>rr);}
	public void remove()	
	{
		if(isEmpty())
		{
			Util.oMessage("Ovreflow");
		}
		else	
			fr++;
	}
	public void insert(int d)
	{
		if(isFull())
			Util.oMessage("Overflow");
		else
			arr[++rr]=d;
	}
	public String toString()
	{
		String s = "Queue";
		if(isEmpty())
		{
			s=s+"Empty";
		}
		else
		{
			for(int i=fr;i<=rr;i++)
				s=s+" "+arr[i];
		}
		return s;
	}
	public void queDisplay()
	{
		Util.oMessage(toString());
	}
	public void qMenu()
	{
		String[] opt = {"Insert","remove","Dis","Exit"};
		int option = 0,d=0;
		while(true)
		{
			option=Util.oinput("Queue","Choose Option",opt);
			if(option ==3)
				break;
			switch(option)
			{
				case 0:
					d= Util.iInput("Data");
					insert(d); break;
				case 1:
					remove();

					break;
				case 2:
					queDisplay();
					break;
			}
		}
	}
}
		