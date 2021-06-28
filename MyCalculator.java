// implementation of calculator
import java.awt.*;
import java.awt.event.*;
import java.util.*;
class MyCalculator extends Frame implements ActionListener
{
	Panel p,q;
	String s,t;
	int v1,v2,res,flg;
	Button[] btn;
	TextField t1;
	char ch,opr;
	MyCalculator()
	{
		super();
		p= new Panel();
		q= new Panel();
		q.setLayout(new GreedLayout(4,4,5,5));
		t1= new TextField(10);
		t1.setEditable(false);
		p.add(t1);
		String[]opt= new String[]{"1","2","3","+","4","5","6","-","7","8","9","*","C","0","=","/"};
		btn = new Button[16];
		for(int i=0;i<16;i++)
		{
			btn[i] = new Button(opt[i]);
			btn[i].addActionListener(this);
			q.add(btn[i]);
		}
		add(p,BorderLayout.NORTH);
		add(q,BorderLayout.CENTER);
		s= new String();
		t = new String();
		flg = 0;
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		setSize(200,300);
		setVisible(true);
	}
	void comp()
	{
		res =0 ;
		switch(ch)
		{
			case "+":
				res= v1+v2; break;
			case "-": 
				res = v1-v2; break;
			case "/":
				res = v1/v2; break;
			case "*":
				res = v1*v2; break;
		}
		t1.setText(""+res);
		v1= res;
	}
	 public void actionPerformed(ActionEvent e)
	{
		ch = (e.getActionCommand()).charAt(0);
		if(ch=='C')
		{
			s="";
			t="";
			flg=0;
			t1.setText("");
			return;
		}
		if(ch=='=')
		{
			if(flg==1)
			{
				try{
					v2= Integer.parseInt(s);
				}
				catch(Exception e1){}
				comp();
			s=""; t="";flg=0; return;
		}
		if(ch=='+'||ch=='-'||ch=='*'||ch=='/')
		{
			if(flg==0)
			{
				try{
					v1= Integer.parseInt(s);
				}
				catch(Exception e1){}
				opr = ch; flg=1;
				s="";
			}
			else
			{
				try {
				v2= Integer.parseInt(s);
				}
				catch(Exception e1){}
				comp();
				s= "";
				opr = ch;
			}
			return;
		}
		s=s+ch;
	}
	public static void main(String []args) {
        MyCalculator m = new MyCalculator();
    }
}	