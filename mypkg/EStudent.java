package mypkg;
import java.io.*;
import mypkg.Util;
public class EStudent implements Serializable
{
	int no;
	String nm;
	public EStudent()
	{
		no=0;
		nm="";
	}
	public String toString()
	{
		String s= "Roll No"+no+"\nName"+nm;
		return s;
	}
	public void display()
	{
		Util.oMessage(toString());
	}
	public int getNo()
	{
		return no;
	}
	public String getName()
	{
		return nm;
	}
	public void setData(int n)
	{
		no=n;
		nm=Util.sinput("Name");
	}
}