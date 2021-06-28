//program to demonstrate
import java.util.*;   //package
import mypkg.Util;     //class


class UseUtil
{
	public static void main(String[]args)
	{
		int no=Util.iInput("Roll No");
		double mrk=Util.dInput("Marks:");
		String result="Roll No:"+no+"\nMarks:"+mrk;
		Util.oMessage(result);
	}
}