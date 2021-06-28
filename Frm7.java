import java.awt.*;
import java.awt.event.*;

public class Frm7 extends Frame implements WindowListener, MouseMotionListener, MouseListener{
    int x,y;
    String str;
    Frm7()
    {
        super("Mouse Listener");
        x = 60;
        y = 60;
        str = "";
        addMouseListener(this);
        addMouseMotionListener(this);
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
    public void paint(Graphics g)
    {
        g.drawString(str, x, y);
    }
    public void mouseClicked(MouseEvent e)
    {
        x = e.getX();
        y = e.getY();
        str = "Mouse clicked";
        repaint();
    }
    public void mousePressed(MouseEvent e)
    {
        x = e.getX();
        y = e.getY();
        str = "Mouse pressed";
        repaint();
    }
    public void mouseReleased(MouseEvent e)
    {
        x = e.getX();
        y = e.getY();
        str = "Mouse Released";
        repaint();
    }
    public void mouseEntered(MouseEvent e)
    {
        x = e.getX();
        y = e.getY();
        str = "Mouse Entered";
        repaint();        
    }
    public void mouseExited(MouseEvent e)
    {
        x = e.getX();
        y = e.getY();
        str = "Mouse Exited";
        repaint();  
    }
    public void mouseMoved(MouseEvent e)
    {
	x=e.getX();
	y=e.getY();
	str="Mouse Moved";
	repaint();
    }
    public void mouseDragged(MouseEvent e)
    {
	x=e.getX();
	y=e.getY();
	str="Mouse Dragged";
	repaint();
    }
    public static void main(String[]args)
    {
	Frm7 a = new Frm7();
    }
}