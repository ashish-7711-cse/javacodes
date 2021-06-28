import java.awt.*;
import java.awt.event.*;
class Frm11 extends Frame
{
	int x1,y1,x2,y2,flg;
	Color cr;
	Frm11()
	{
		super("Draw Lines");
		flg=0;
		x1=0;
		y1=0;
		x2=0;
		y2=0;
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				if(flg==0)
				{
					x1=e.getX();
					y1=e.getY();
					flg=1;
				}
				
				else
				{
					x2=e.getX();
					y2=e.getY();
					draw();
					flg =0;
				}
				
			}
		});
		setSize(500,500);
		setVisible(true);
	}
	void draw()
	{
		Graphics g = getGraphics();
		cr= new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
		g.setColor(cr);
		g.drawLine(x1,y1,x2,y2);
	}
	public static void main(String[]rgs)
	{
		Frm11 a = new Frm11();
	}
}