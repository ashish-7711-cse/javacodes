//use of class button, use of method, set bounds to add components manualy
import java.awt.*;
import java.awt.event.*;
class Frm2 extends Frame implements ActionListener
{
	Button b1,b2;
	Frm2(String s)
	{
		super(s);
		b1= new Button("Color");
		b2= new Button("Exit");
		b1.addActionListener(this);
		b2.addActionListener(this);
		setLayout(null);                  //cancels the defafult layout manager
		b1.setBounds(50,100,100,20);      //(colum,row,width,length)
		b2.setBounds(200,100,100,20);
		add(b1);
		add(b2);
		setSize(350,220);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		Button b=(Button)e.getSource();
		if(b==b2)
			System.exit(0);
		else
		{
			int p=(int)(Math.random()*255);
			int q=(int)(Math.random()*255);
			int r=(int)(Math.random()*255);
			Color cr=new Color(p,q,r);
			setBackground(cr);
		}
	}
	public static void main(String[]args)
	{
		Frm2 a=new Frm2("Color");
	}
}
