import java.awt.*;
import java.awt.event.*;
class MiniCalc extends Frame implements ActionListener,FocusListener
{
	int v1,v2,res;
	char opr;
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Panel p1,p2;
	Button ba,bs,bm,bd,bc;
	MiniCalc()
	{
		super("MiniCalculator");
		l1= new Label("Value1");
		l2= new Label("Value2");
		l3= new Label("Result");
		t1= new TextField("0");
		t2= new TextField("0");
		t3= new TextField("0");
		t3.setEditable(false);
		t1.addFocusListener(this);
		t2.addFocusListener(this);
		p1= new Panel();
		p1.setLayout(new GridLayout(3,3,6,6));
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		p1.add(l3);
		p1.add(t3);
		add(p1,BorderLayout.CENTER);
		ba= new Button("+");
		bs= new Button("-");
		bm= new Button("*");
		bd= new Button("/");
		bc= new Button("C");
		ba.addActionListener(this);
		bs.addActionListener(this);
		bm.addActionListener(this);
		bd.addActionListener(this);
		bc.addActionListener(this);
		p2=new Panel();
		p2.add(ba);
		p2.add(bs);
		p2.add(bm);
		p2.add(bd);
		p2.add(bc);
		add(p2,BorderLayout.SOUTH);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		setSize(400,400);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		Button b = (Button)e.getSource();
		if(b == bc)
		{
			t1.setText("0");
			t2.setText("0");
			t3.setText("0");
			t1.requestFocus();
		}
		else
		{
			opr = (e.getActionCommand()).charAt(0);
			comp(v1,v2,opr);
		}
	}
	public void comp(int a,int b,char opr)
	{
		int  c=0 ;
		switch(opr)
		{
			case '+':
				c= a+b; break;
			case '-':
				c= a-b; break;
			case '/':
				c= a/b; break;
			case '*':
				c= a*b; break;
		}
		t3.setText(""+c);			
	}
	public void focusGained(FocusEvent e)
	{
		TextField t=(TextField)e.getSource();
		if(t==t1)
		{
			ba.setEnabled(false);
			bs.setEnabled(false);
			bm.setEnabled(false);
			bd.setEnabled(false);
		}
	}
	public void focusLost(FocusEvent e)
	{
		TextField t=(TextField)e.getSource();
		if(t==t1)
		{
			try{
				v1 = Integer.parseInt(t1.getText());
			}
			catch(Exception e1){
				t1.setText("0");
				t1.requestFocus();
				return;
			}
		}
		else
		{
			try{
				v2=Integer.parseInt(t2.getText());
			}
			catch(Exception e2){ t2.setText("0"); t2.requestFocus(); return;}
			ba.setEnabled(true);
			bs.setEnabled(true);
			bm.setEnabled(true);
			bd.setEnabled(true);
		}
	}
	public static void main(String [] args)
	{
		MiniCalc a= new MiniCalc();
	}
}


