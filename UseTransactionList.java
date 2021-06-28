import wce.TransactionList;
import java.io.*;
class UseTransactionList implements Serializable
{
	public static void main(String[]args)
	{
		TransactionList tl = new TransactionList();
		tl.menu();
	}
}