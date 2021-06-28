//use of check box
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
	<APPLET code="App4" width = 700 height=700>
	</APPLET>
*/
public class App4 extends Applet implements ActionListener
{
	Button b1,b2,b3;
	Checkbox c1,c2,c3,c4;
	Label l1;
	public void init()
	{
		c1 = new Checkbox("Arts");
		c2= new Checkbox("Engineering");
		c3 = new Checkbox("Medicine");
		c4 = new Checkbox("Civil");
		b1 =new Button("Select");
		b2 = new Button("Disselect");
		b3 = new Button("Display");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		l1 = new Label("Result");
		add(c1); add(c2); add(c3);
		add(c4); add(b1); add(b2);
		add(b3); add(l1);
	}
	public void actioPerformed(ActionEvent e)
	{
		Button b = (Button)e.getSource();
		if(b == b1)
		{
			c1.setState(true);
			c2.setState(true);
			c3.setState(true);
			c4.setState(true);
		}
		if(b==b2)
		{
			c1.setState(false);
			c2.setState(false);
			c3.setState(false);
			c4.setState(false);
		}
		if(b==b3)
		{
			String s = "Output";
			if(c1.getState())
				s=s+" " +c1.getLabel();
			if(c2.getState())
				s=s+" " +c2.getLabel();
			if(c3.getState())
				s=s+" " +c3.getLabel();
			if(c4.getState())
				s=s+" " +c4.getLabel();
			l1.setText(s);
		}
	}
	public void paint(Graphics g)
	{
	}
}