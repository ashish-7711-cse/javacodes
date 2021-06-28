import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
	<APPLET code ="App2" width = 400 height= 400>
	</APPLET>
*/

public class App2 extends Applet 
{
	int x,y;
	Color cr;
	public void init()
	{
		addMouseListener(new MouseAdapter()
		{
			public void mouseCliked(MouseEvent e)
			{
				x=e.getX(); y=e.getY();
				cr = new Color((int)(Math.random()*255));
				repaint();
			}
		});
	}	
	public void paint(Graphics g)
	{
		g.setColor(cr);
		g.drawOval(x,y,20,20);
	}
}