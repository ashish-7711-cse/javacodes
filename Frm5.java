import java.awt.*;
import java.awt.event.*;
import mypkg.Util;
class Frm5 extends Frame implements ActionListener, FocusListener
{
	Label lno,lnm,lmrk;
	TextField tno,tnm,tmrk;
	Button bok,bex;
	int rno;
	double mrk;
	String nm;
	Frm5(String s)
	{
		super(s);
		lno = new Label("Roll No");
		lnm = new Label("Name");
		lmrk = new Label("Marks");
		tno = new TextField("0");
		tnm = new TextField("Name");
		tmrk= new TextField("0.00");
		tno.addFocusListener(this);
		tmrk.addFocusListener(this);
		bok = new Button("OK");
		bok.addActionListener(this);
		bex = new Button("Exit");
		bex.addActionListener(this);
		setLayout(new GridLayout(4,2,5,5));
		add(lno);
		add(tno);
		add(lnm);
		add(tnm);
		add(lmrk);
		add(tmrk);
		add(bok);
		add(bex);
		setSize(400,300);
		setVisible(true);
	}
	public void focusGained(FocusEvent e)
	{
		TextField t = (TextField)e.getSource();
		if(t== tno)
			bok.setEnabled(false);
	}
	public void focusLost(FocusEvent e)
	{
		TextField t = (TextField)e.getSource();
		if(t==tno)
		{
			try{
			rno = Integer.parseInt(t.getText());
			}
			catch(Exception e1)
			{
				tno.requestFocus();
				return;
			}
			if(rno<=0)
			{
				tno.requestFocus();
				return;
			}
		}
		else
		{
			try{
			mrk = Double.parseDouble(tmrk.getText());
			}
			catch(Exception e1){
			tmrk.requestFocus();
			}
			if(mrk<0.0||mrk>10.0)
			{
				tmrk.requestFocus();
				return;
			}
			bok.setEnabled(true);
			nm= tnm.getText();
		}
	}
	public void actionPerformed(ActionEvent e)
	{
		Button b = (Button)e.getSource();
		if(b==bex)
			System.exit(0);
		else
		{
			String s = "Roll No:"+tno+"\nName:"+tnm+"\nMarks:"+mrk;
			Util.oMessage(s);
		}
	}
	public static void main(String[]args)
	{
		Frm5 a= new Frm5("Student:");
	}
}

		