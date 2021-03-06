//use of border layout , pannel
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.ImageIO;
class MyPanel extends Panel
{
	Image img;
	MyPanel()
	{
		super();
		img=null;
	}
	void setImage(Image i)
	{
		img = i;
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawImage(img,20,20,this);
	}
}
public class SlideShow extends Frame implements  ActionListener
{
	int index;
	MyPanel p1;
	Panel p2;
	Button bf,bp,bn,bl;
	Image [] img;
	SlideShow()
	{
		super("SlideShow");
		index = 0;
		p1= new MyPanel();
		p2= new Panel();
		bf = new Button("|<");
		bp = new Button("<<");
		bn = new Button(">>");
		bl = new Button(">|");
		bf.addActionListener(this);
		bp.addActionListener(this);
		bn.addActionListener(this);
		bl.addActionListener(this);
		p2.add(bf);
		p2.add(bp);
		p2.add(bn);
		p2.add(bl);
		img = new Image[10];
		for(int i=0;i<10;i++)
		{
			String s ="img"+i+".jpeg";
			try{
			img[i]=(Image)ImageIO.read(new File(s));
			}
			catch(Exception e){}
		}
		add(p1,BorderLayout.CENTER);
		add(p2,BorderLayout.SOUTH);
		setSize(500,500);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		Button b= (Button)e.getSource();
		if(b==bf)
			index =0;
		if(b==bl)
			index =9;
		if(b==bp)
		{
			if(--index<0)
			index=0;
		}
		if(b==bn)
		{
			if(++index>9)
				index=9;
		}
		p1.setImage(img[index]);
		
	} 
	public static void main(String [] args)
	{
		SlideShow sh = new SlideShow();
	}
}