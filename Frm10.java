import java.awt.*;
import java.awt.event.*;
import java.util.*;
class MyObject
{
	int x;
	int y;
	int shp;
	Color cr;
	MyObject(int a,int b,int c,Color d)
	{
		x=a;
		y=b;
		cr=d;shp= c;
	}
}
class Frm10 extends Frame implements Serializable
{
	int x,y,shp;
	Color cr;
	MyObject obj;
	LinkedList<MyObject>ls;
	Frm10(String s)
	{
		super(s);
		ls=new LinkedList<MyObject>();
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
			public void windowDeiconified(WindowEvent e)
			{
				repaint();
			}
		});
		addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				x=e.getX();
				y=e.getY();
				if(e.getButton()==MouseEvent.BUTTON1)
					shp=1;   //filled Oval
				else
					shp=2;   //string
				cr= new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
				obj = new MyObject(x,y,shp,cr);
				ls.add(obj);
				repaint();
			}
		});
		setSize(500,500);
		setVisible(true);
	}
	public void paint(Graphics g)
	{
		int i=0,n=ls.size();
		while(i<n)
		{
			obj = ls.get(i);
			g.setColor(obj.cr);
			if(obj.shp==1)
			{
				g.fillOval(obj.x,obj.y,20,20);
				
			}
			else
				g.drawString("WelCome",obj.x,obj.y);
			i++;
		}
	}
	public static void main(String  [] args)
	{
			Frm10 a =new Frm10("Draw Oval");
	}
}