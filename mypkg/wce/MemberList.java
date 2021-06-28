package wce;
import mypkg.Util;
import java.util.*;
import wce.Member;
import wce.DataIO;
import java.io.*;
public class MemberList implements DataIO, Serializable
{
	LinkedList<Member>mls;
	Member mref;
	public MemberList()
	{
		mls = new LinkedList<Member>();
		mref = null;
	}
	public boolean search(int id)
	{
		int n= mls.size(),i=0;
		while(i<n)
		{
			mref = mls.get(i);
			if(mref.getMemberNo()==id)
				break;
			i++;
		}
		if(i==n)
			mref =null;
		return (mref!=null);
	}
	public void add()
	{
		int d=0;
		d = Util.iInput("Enter Id ");
		if(search(d)==true)
		{
			Util.oMessage("Record Exits");
			return ;
		}
		mref = new Member();
		mref.setData(d);
		mls.add(mref);
	}
	public void mod()
	{
		int id = Util.iInput("Enter Id");
		if(search(id)==false)
		{
			Util.oMessage("Record Invalid");
			return;
		}
		mref.setData(id);
	}
	public void del()
	{
		int d= Util.iInput("Enter ID to delet");
		if(search(d)==false)
		{
			Util.oMessage("Record does Not Exits");
			return;
		}
		if(mref.getState()==true)
		{
			Util.oMessage("Book with Member");
			return;
		}
	}
	public void display()
	{
		int n= mls.size(),i=0;
		while(i<n)
		{
			mref=mls.get(i);
			mref.display();	
			i++;
		}
		return;
	}
	public Member getMember()
	{
		return mref;
	}
	public int getSize()
	{
		return mls.size();
	}
	public void menu()
	{
		String []options = {"Add Member","Mod Data","Delet","Display","Search","Back"};
		while(true)
		{
			int opt = Util.oinput("Member List","Choose Option",options);
			if(opt==5)
				break;
			switch(opt)
			{
				case 0:
					add(); break;
				case 1:
					mod(); break;
				case 2:
					del(); break;
				case 3:
					display(); break;
				case 4:
					int id= Util.iInput("Member Id");
					if(search(id)==false)
						Util.oMessage("Invalid");
					else
						Util.oMessage("Valid Id"+mref);
			}
		}
	}
}