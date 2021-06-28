package wce;  //sub folder of mypkg
import mypkg.Util;
import mypkg.EStudent;
import java.io.*;
import mypkg.DataIO;
public class WCEStudent extends EStudent implements DataIO,Serializable
{
	String tnm;
	boolean state;
	public WCEStudent()
	{
		super();
		tnm = "";
		state= false;
	}
	public void setData(int no)
	{
		super.setData(no);
		tnm = Util.sinput("Enter Trade Name");
		state = true;
	}
	public String toString()
	{
		String s= super.toString()+"\nTrade Name"+tnm+"\nState:"+state;
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
	public void delState()
	{ state = false;}
	public String getName()
	{return tnm;}
}
	