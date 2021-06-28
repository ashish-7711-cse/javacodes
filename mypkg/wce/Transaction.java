package wce;
import java.io.*;
public class Transaction implements Serializable
{
	int mno;
	int bno;
	char type;
	public Transaction (int a,int b, char ch)
	{
		mno=a; bno=b; type =ch;
	}
	public int getMember(){return mno;}
	public int getBook(){return bno;}
	public char getType(){return type;}
}
	