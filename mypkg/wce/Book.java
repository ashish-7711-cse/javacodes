package wce;
import mypkg.Util;
import mypkg.DataIO;
import java.io.*;
public class Book implements DataIO, Serializable
{
	int bno;
	String bnm;
	boolean state;
	public Book()
	{
		bno = 0;
		bnm = "";
		state = true;
	}
	public void setData(int no)
	{
		bno = no;
		bnm = Util.sinput("Book name");
		state = true;
	}
	public String toString()
	{
		String s = "\nBook no : " + bno + "\nBook name : " + bnm + "\nState : " + state;
		return s;
	}
	public void display()
	{
		Util.oMessage(toString());
	}
	public boolean getState()
	{
		return state;
	}
	public void changeState()
	{
		if(state==false)
			state=true;
		else
			state=false;
	}
	public void delState()
	{
		state = false;
	}
	public int getBookNo()
	{
		return bno;
	}
	public String getBookName()
	{
		return bnm;
	}
}