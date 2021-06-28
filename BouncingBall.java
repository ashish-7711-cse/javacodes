import java.awt.*;
import java.awt.event.*;

class Ball extends Thread 
{
    static int xsize = 10;
    static int ysize = 10;
    int x, y, dx, dy;
    Color cr;
    Panel obj;
    Ball(Panel obj)
    {
        super();
        this.obj = obj;
        x = 0;
        y = 0;
        dx = 2;
        dy = 2;
        cr = new Color((int)(Math.random() * 255),(int)(Math.random() * 255),(int)(Math.random() * 255) );
        start();
    }
    public void run()
    {
        while(true)
        {
            move();
            try
            {
                Thread.sleep(30);
            }
            catch(Exception e){}
        }
    }
    public void move()
    {
        Graphics g = obj.getGraphics();
        Dimension d = obj.getSize();
        g.setColor(Color.WHITE);
        g.fillOval(x, y, xsize, ysize);
        x += dx;
        y += dy;
        g.setColor(cr);
        g.fillOval(x, y, xsize, ysize);
        if(x<0)
        {
            x = 0;
            dx = (-dx);
        }
        if(y<0)
        {
            y = 0;
            dy = (-dy);
        }
        if(x+xsize > d.width)
        {
            x = d.width - xsize;
            dx = -dx;
        }
        if(y+ysize > d.height)
        {
            y = d.height - ysize;
            dy = -dy;
        }
    }
}

public class BouncingBall extends Frame implements ActionListener
{
    Button bn, be;
    Panel pc, ps;
    public BouncingBall()
    {
        super("Bouncing ball");
        bn = new Button("Object");
        be = new Button("Exit");
        bn.addActionListener(this);
        be.addActionListener(this);
        pc = new Panel();
        ps = new Panel();
        ps.add(bn);
        ps.add(be);
        add(ps, "South");
        add(pc, "Center");
        setSize(400, 300);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        Button b = (Button)e.getSource();
        if(b==bn)
        {
            Ball bal = new Ball(pc);
        }
        else
            System.exit(0);
    }
    public static void main(String[] args) 
    {
        BouncingBall a = new BouncingBall();    
    }
}