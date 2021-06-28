//program to draw recangle with single click with fixed width and hight in random color;
import java.awt.*;
import java.awt.event.*;
class Frm8 extends Frame implements MouseListener, WindowListener
{
	int x,y;
	int r,g,b;
	Color cr;
	Frm8(String s)
	{
		super(s);
		addMouseListener(this);	
		addWindowListener(this);
		setSize(400,400);
		setVisible(true);
	}
	public void windowOpened(WindowEvent e){}
    	public void windowActivated(WindowEvent e){}
    	public void windowDeactivated(WindowEvent e){}
    	public void windowIconified(WindowEvent e){}
    	public void windowDeiconified(WindowEvent e){}
    	public void windowClosed(WindowEvent e){}
    	public void windowClosing(WindowEvent e)
    	{
        	System.exit(0);
    	}
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mouseClicked(MouseEvent e){
		x=e.getX();
		y= e.getY();
		r= (int)(Math.random()*255);
		g= (int)(Math.random()*255);
		b= (int)(Math.random()*255);
		cr=new Color(r,g,b);
		Graphics gobj = getGraphics();
		gobj.setColor(cr);
		gobj.drawRect(x,y,10,10);
	}
	public static void main(String [] args)
	{
		Frm8 a= new Frm8("Rect");
	}
}