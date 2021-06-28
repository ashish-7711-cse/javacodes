import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
	<APPLET code="Iamge2" width=400 height=400>
	</APPLET>
*/
public class Image2 extends Applet
{
	Image img;
	public void init()
	{
		img =getImage(getCodeBase(),"Fish.jpeg");
		flg=0;
		addMouseListener(new MouseAdpter(){
		public void mouseCliked(MouseEvent e){
		if(flg==0)
		{ x= e.getX(); y = e.getY(); w=50;h=50;
 		flg=1;}
		else{
			w = e.getX()-x;
			h=e.getY()-y;
			draw();
			flg=0;
		}
		}
		});
	}
	void draw();
	{
		Graphics g= getGraphics();
		g.drawImage(img,x,y,w,h,this);
	}
	public void paint(Graphics g)
	{
		
	}
}