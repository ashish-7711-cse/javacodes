import wce.WCEStudent;
import mypkg.Util;
public class UseWCEStudent
{
	public static void main(String[]args)
	{
		WCEStudent w= new WCEStudent();
		int a= Util.iInput("Enter Number");
		a.setData();
		a.display();
	}
}
		