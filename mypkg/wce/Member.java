package wce;
import mypkg.Util;
import mypkg.DataIO;
import java.io.*;
public class Member implements DataIO, Serializable
{
	int mno;
	String mnm;
	int fees;
	boolean state;
	public Member()
	{
		mno = 0;
		mnm = "";
		fees = 0;
		state = true;
	}
	public void setData(int no)
	{
		mno = no;
		mnm = Util.sinput("Member name");
		fees = Util.iInput("Fees");
		state = true;
	}
	public String toString()
	{
		String s = "\nMember no : " + mno + "\nMember name : " + mnm + "\nFees : " + fees + "\nState : " + state;
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
	{
		state = false;
	}
	public void changeState()
	{
		if(state==false)
			state=true;
		else
			state=false;
	}
	public int getMemberNo()
	{
		return mno;
	}
	public String getMemberName()
	{
		return mnm;
	}
	public int getFees()
	{
		return fees;
	}
}