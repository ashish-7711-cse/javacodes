//program to draw rectangle uying two point method
//use of addaptor classes
import java.awt.*;
import java.awt.event.*;

public class Frm9 extends Frame {
    int flg;
    int x,y,w,h;
    Frm9(String s)
    {
        super(s);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        addMouseListener(new MouseAdapter()
        {
            public void mouseClicked( MouseEvent e)
            {
                if(flg==0)
                {    x = e.getX(); 
                    y = e.getY();
                    flg = 1;
                }
                else     
                {
                    w = e.getX()-x;
                    h = e.getY()-y;
                    repaint();
                    flg = 0;
                }               
            }
        });
        flg = 0;
        w = 0;
        h = 0;
        setSize(500,500);
        setVisible(true);
    }
    public void paint(Graphics g)
    {
        Color cr = new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
        if(flg==0)
        {
            g.setColor(cr);
            g.drawRect(x, y, w, h);
        }
    }
    public static void main(String[] args)
    {
        Frm9 a = new Frm9("Adapter class");
    }
}