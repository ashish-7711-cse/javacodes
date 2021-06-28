import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
	<APPLET code="App5" width = 700 height=700>
	</APPLET>
*/
public class App5 extends Applet implements ActionListener
{
	CheckboxGroup c1,c2;
	Checkbox cy1,cy2,cy3,cy4;
	Checkbox ct1, ct2,ct3,ct4;
	Panel py,pt,pb,pc;
	Button bo,bc;
	public void init()
	{
		c1 = new CheckboxGroup();
		cy1 = new Checkbox("I",c1,true);
		cy2 = new Checkbox("II",c1,false);
		cy3 = new Checkbox("III",c1,false);
		cy4 = new Checkbox("IV",c1,false);
		py = new Panel();
		py.setLayout(new GridLayout(3,2,5,5));
		py.add(cy1);
		py.add(cy2);
		py.add(cy3);
		py.add(cy4);
		c2 = new CheckboxGroup();
		ct1 = new Checkbox("IT",c2,true);
		ct2 = new Checkbox("CSE",c2,false);
		ct3 = new Checkbox("TRONICS",c2,false);
		ct4 = new Checkbox("TRICS",c2,false);
		pt = new Panel();
		pt.setLayout(new GridLayout(2,2,5,5));
		pt.add(ct1);
		pt.add(ct2);
		pt.add(ct3);
		pt.add(ct4);
		pc= new Panel();
		pc.add(py);
		pc.add(pt);
		pg= new Panel();
		pg.add(new Label("YEAR"));
		pg.add(new Label("TRADE"));
		bo = new Button("Output");
		bc  =new Lable ("Clear");
		bo.addActionListener(this);
		bc.addActionListener(this);
		pb= new PAnel();
		pb.add(bo);
		pb.add(bc);
		setLayout(new BorderLayout());
		add(pg,BorderLayout.NORTH);
		add(pc,BorderLayout.CENTER);
		add(pb,BorderLayout.SOUTH);
	}
	public void actionPerformed(ActionEvent e)
	{
		Button b = (Button)e.getSource();
		if(b==bo)
		{
			Checkbox a= c1.getSelectedCheckbox();
			String s ="Year"+a.getLabel();
			a = c2.getSelectedCheckbox();
			s = s+"\nTrade:"+a.getLabel();
			System.out.println(s);
		}
		else
		{
			c1.getSelectedCheckbox().(setState(false));
			c2.getSelectedCheckbox().(setState(false));
		}
	}
	public void paint(Graphics g)
	{
	}
}