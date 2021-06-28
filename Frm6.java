//study of window listener
import java.awt.*;
import java.awt.event.*;
class Frm6 extends Frame implements WindowListener
{
    Frm6()
    {
        super("WindowListener");
        addWindowListener(this);
        setSize(400,400);
        setVisible(true);
    }
    public void windowOpened(WindowEvent e)
    {
        System.out.println("Opened");
    }
    public void windowClosed(WindowEvent e)
    {
        System.out.println("Closed");
    }
    public void  windowClosing(WindowEvent e)
    {
        System.out.println("Closing");
        System.exit(0);
    }
    public void windowActivated(WindowEvent e)
    {
        System.out.println("Activated");
    }
    public void windowDeactivated(WindowEvent e)
    {
        System.out.println("Deactivated");
    }
    public void windowIconified(WindowEvent e)
    {
        System.out.println("Iconified");
    }
    public void windowDeiconified(WindowEvent e)
    {
        System.out.println("Deiconified");
    }
    public static void main(String[]args)
    {

        Frm6 a = new Frm6();
    }}