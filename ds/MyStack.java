package ds;
import ds.IStack;
import mypkg.Util;
public class MyStack implements IStack
{
	int top;
	int []arr;
	public MyStack()
	{
		top =-1;
		arr = new int[size];
	}
	public boolean isFull()	
	{
		return (top==size-1);
	}
	public boolean isEmpty()
	{
		return (top==-1);
	}
	public void pop()	
	{
		if(isEmpty())
		{
			Util.oMessage("Ovrflow");
		}
		else	
			top--;
	}
	public void push(int d)
	{
		if(isFull())
			Util.oMessage("Overflow");
		else
			arr[++top]=d;
	}
	public String toString()
	{
		String s = "Stack";
		if(isEmpty())
		{
			s=s+"Empty";
		}
		else
		{
			for(int i=top;i>=0;i--)
				s=s+" "+arr[i];
		}
		return s;
	}
	public void stackDisplay()
	{
		Util.oMessage(toString());
	}
	public void sMenue()
	{
		String[] opt = {"Push","Pop","Dis","Exit"};
		int option = 0,d=0;
		while(true)
		{
			option=Util.oinput("Stack","Choose Option",opt);
			if(option ==3)
				break;
			switch(option)
			{
				case 0:
					d= Util.iInput("Data");
					push(d); break;
				case 1:
					pop();

					break;
				case 2:
					stackDisplay();
					break;
			}
		}
	}
}