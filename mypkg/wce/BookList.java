package wce;
import mypkg.Util;
import java.util.*;
import wce.Book;
import wce.DataIO;
import java.io.*;
public class BookList implements DataIO, Serializable
{
	LinkedList<Book>bls;
	Book bref;
	public BookList()
	{
		bls = new LinkedList<Book>();
		bref = null;
	}
	public boolean search(int id)
	{
		int n= bls.size(),i=0;
		while(i<n)
		{
			bref = bls.get(i);
			if(bref.getBookNo()==id)
				break;
			i++;
		}
		if(i==n)
			bref =null;
		return (bref!=null);
	}
	public void add()
	{
		int d=0;
		d = Util.iInput("Enter Id of Book ");
		if(search(d)==true)
		{
			Util.oMessage("Book Present");
			return ;
		}
		bref = new Book();
		bref.setData(d);
		bls.add(bref);
	}
	public void mod()
	{
		int id = Util.iInput("Enter Id");
		if(search(id)==false)
		{
			Util.oMessage("Record Invalid");
			return;
		}
		bref.setData(id);
	}
	public void del()
	{
		int d= Util.iInput("Enter ID to delet");
		if(search(d)==false)
		{
			Util.oMessage("Book Does Not Exits");
			return;
		}
		if(bref.getState()==false)
		{
			Util.oMessage("Book with Member");
			return;
		}
	}
	public void display()
	{
		int n= bls.size(),i=0;
		while(i<n)
		{
			bref=bls.get(i);
			bref.display();	
			i++;
		}
		return;
	}
	public Book getBook()
	{
		return bref;
	}
	public void menu()
	{
		String []options = {"Add Book","Mod Data","Delet","Display","Search","Back"};
		while(true)
		{
			int opt = Util.oinput("Book list","Choose option",options);
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
					int id= Util.iInput("Book Id");
					if(search(id)==false)
						Util.oMessage("Invalid");
					else
						Util.oMessage("Valid Id"+bref);
			}
		}
	}
}