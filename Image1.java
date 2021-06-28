import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
	<APPLET code="Iamge1" width=400 height=400>
	</APPLET>
*/
public class Image1 extends Applet
{
	Image img;
	public void init()
	{
		img =getImage(getCodeBase(),"Fish.jpeg");
	}
	public void paint(Graphics g)
	{
		g.drawImage(img,20,20,this);
	}
}