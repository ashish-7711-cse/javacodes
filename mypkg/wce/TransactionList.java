package wce;
import java.util.*;
import mypkg.Util;
import java.io.*;
import wce.Transaction;
import wce.BookList;
import wce.MemberList;
import wce.Member;
import wce.Book;
public class TransactionList implements Serializable
{
	LinkedList<Transaction>tls;
	Transaction tref;
	Book bref;
	Member mref;
	BookList bls;
	MemberList mls;
	public TransactionList()
	{
		tls= new LinkedList<Transaction>();
		mls = new MemberList();
		bls = new BookList();
		bref=null;
		mref=null;
		tref=null;
	}
	public void issue()
	{
		int mid = Util.iInput("Membr ID");
		if(mls.search(mid)==false)
		{	Util.oMessage("Invalid Member id");
			return;
		}
		mref = mls.getMember();
		if(mref.getState()==true)
		{
			Util.oMessage("Book is in Exits");
			return;
		}
		int bid= Util.iInput("Book Id");
		if(bls.search(bid)==false)
		{
			Util.oMessage("Invalid Book id");
			return ;
		}
		bref = bls.getBook();
		if(bref.getState()==false)
		{
			Util.oMessage("Book Uavailable");
			return;
		}
		tref = new Transaction(mid,bid,'I');
		tls.add(tref);
		mref.changeState();
		bref.changeState();
	}
	public void receipt()
	{
		int mid = Util.iInput("Membr ID");
		if(mls.search(mid)==false)
		{	Util.oMessage("Invalid Member id");
			return;
		}
		mref = mls.getMember();
		if(mref.getState()==false)
		{
			Util.oMessage("Book is not with member");
			return;
		}
		int bid= Util.iInput("Book Id");
		if(bls.search(bid)==false)
		{
			Util.oMessage("Invalid Book id");
			return ;
		}
		bref = bls.getBook();
		if(bref.getState()==true)
		{
			Util.oMessage("INside the library");
			return;
		}
		tref = new Transaction(mid,bid,'R');
		tls.add(tref);
		mref.changeState();
		bref.changeState();
	}
	public void disIsuueBoookRecord()
	{
		for(int i=0;i<mls.getSize();i++)
		{
			for(int j=0;j<tls.size();j++)
			{
				if()
			}
		}
	}
	public void menu()
	{
		String []option = {"Member list", "Book List","issue","Receipt","exit"};
		while(true)
		{
			int opt = Util.oinput("Choose Option","Transaction Menue",option);
			if(opt==4)
				break;
			switch(opt)
			{
				case 0:
					mls.menu(); break;
				case 1:
					bls.menu();  break;
				case 2:
					issue();
					break;
				case 3:
					receipt();
					break;
			}
		}
	}
}	