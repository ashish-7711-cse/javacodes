import java.awt.*;
import java.awt.event.*;
import mypkg.Util;
class StuDialog extends Dialog implements ActionListener 
{
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button bo,bb;
	int no,mrk;
	String nm;
	StuDialog(Frame prnt, String title,boolean state)
	{
		super(prnt,title,state);
		l1 = new Label("Roll No");
		l2 = new Label("Name");
		l3 = new Label("Marks");	
		t1 = new TextField(6);
		t2 = new TextField(15);
		t3 = new TextField(6);
		bo = new Button("ok");
		bb = new Button("Back");
		bo.addActionListener(this);
		bb.addActionListener(this);
		setLayout(new GridLayout(4,2,5,5));
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(bo);
		add(bb);
		setSize(200,200);
	}
	public void actionPerformed(ActionEvent e)
	{
		Button b = (Button)e.getSource();
		if(b==bb)
		{
			setVisible(false);
		}
		else 
		{
			try{
			no = Integer.parseInt(t1.getText());
			nm = t2.getText();
			mrk = Integer.parseInt(t3.getText());
			Util.oMessage("Roll No:"+no+"\nName:"+nm+"\nMarks:"+mrk);
			}
			catch(Exception e1){}
			{
				t1.requestFocus();
				return;
			}
		}
	}
}
public class StuMain extends Frame implements ActionListener
{
	Button bs,bx;
	StuDialog sd;
	StuMain()
	{
		super("Main");
		bs = new Button("Student");
		bx= new Button("Exit");
		bs.addActionListener(this);
		bx.addActionListener(this);
		setLayout(new FlowLayout());
		add(bs);
		add(bx);
		sd = new StuDialog(this,"Student",true);
		setSize(200,200);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		Button b = (Button)e.getSource();
		if(b==bs)
			sd.setVisible(true);
		else
			System.exit(0);
	}
	public static void main(String []rgs)
	{
		StuMain s = new StuMain();
	}
}
