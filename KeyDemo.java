import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import color;
/*
	<Applet code ="KeyDemo"  width=400 height=400>
	</Applet>
*/
class KeyDemo exends Applet implements KeyListener
{
	Font obj;
	int style,size;
	Color fcr,bcr;
	String str;
	public void init()
	{
		size =10;
		style =1;
		str = "";
		addKeyListener(this);
		fcr = new Color(0,0,0);
		bcr= new Color(255,255,255);
	}
	public void paint(Graphics g)
	{
		obj = new Font("Arial",style,size);
		g.setFont(obj);
		g.setColor(fcr);
		setBackground()
		g.drawString(str,50,50)
	}
	public void keyTyped(KeyEvent e)
	{
		str = str+e.getKeyChar()
	}
	public void keyReleased(){}
	public void keyPressed(KeyEvent e)
	{
		if(e.getKeyCode()==KeyEvent.VK_F1)
		{
			if(++size>72)
				size=72;
		}
		if(e.getKeyCode()==KeyEvent.VK_F2)
		{
			if(--size<6)
			size = 6;
		}
		if(e.getKeyCode()==KeyEvent.VK_F3)
			style = (++style%3);
		if(e.getKeyCode() = KeyEvent.VK_F4)
		{
			int a=(int)(Math.random()*255);
			int b=(int)(Math.random()*255);
			int c=(int)(Math.random()*255);
			fcr = new Color(a,b,c);
		}
		if(e.getKeyCode()=KeyEvent.VK.F5)
		{	
			int a=(int)(Math.random()*255);
			int b=(int)(Math.random()*255);
			int c=(int)(Math.random()*255);
			bcr = new Color(a,b,c);
		}
		repaint();
	}	
}
}