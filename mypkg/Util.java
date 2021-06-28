package mypkg;
import javax.swing.*;
public class Util
{
	public static int iInput(String msg)
	{
		int no=0;
		try {
		no = Integer.parseInt(JOptionPane.showInputDialog(null,msg));
		}
		catch(Exception e){}
		return no;
	}
	public static double dInput(String msg)
	{
		double no=0.0;
		try {
		no = Double.parseDouble(JOptionPane.showInputDialog(null,msg));
		}
		catch(Exception e){}
		return no;
	}
	public static void oMessage(String msg)
	{
		JOptionPane.showMessageDialog(null,msg);
	}
	public static String sinput(String msg)
	{
		String s= JOptionPane.showInputDialog(null,msg);
		return s;
	}
	public static int oinput(String title,String msg,String []option)
	{
		int opt = JOptionPane.showOptionDialog(null,msg,title,JOptionPane.YES_OPTION,JOptionPane.PLAIN_MESSAGE,null,option,0);
		return opt;
	}
}