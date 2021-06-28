//use of scroll bar
import java.awt.*;
import java.awt.event.*;
class UseScrollbar extends Frame implements FocusListener,AdjustmentListener
{
	Label lg,lb,lr,lclr;
	Panel pg,pb,pclr,pr;
	TextField tr,tg,tb;
	Scrollbar sr,sg,sb;
	int r,g,b;
	Color cr,cg,cb,cclr;
	UseScrollbar()
	{
		super("ScrollBars");
		lr = new Label("R");
		lb = new Label("B");
		lg = new Label("G");
		lclr = new Label("Color");
		pr = new Panel();
		pg = new Panel();
		pb = new Panel();
		pclr = new Panel();
		tr = new TextField(4);
		tg = new TextField(4);
		tb = new TextField(4);
		tr.addFocusListener(this);
		tg.addFocusListener(this);
		tb.addFocusListener(this);
		sr= new Scrollbar(Scrollbar.VERTICAL,0,10,0,255);
		sg = new Scrollbar(Scrollbar.VERTICAL,0,10,0,255);
		sb = new Scrollbar(Scrollbar.VERTICAL,0,10,0,255);
		sr.addAdjustmentListener(this);
		sg.addAdjustmentListener(this);
		sb.addAdjustmentListener(this);
		r=0;
		g=0;
		b=0;
		cr = new Color(r,0,0);
		cg = new Color(0,g,0);
		cb = new Color(0,0,b);
		cclr = new Color(r,g,b);
		pr.setBackground(cr);
		pg.setBackground(cg);
		pb.setBackground(cb);
		pclr.setBackground(cclr);


		setLayout(null);
		addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
		});
		lr.setBounds(50,50,50,20);       //col row width height 
		pr.setBounds(50,90,50,20);
		sr.setBounds(50,130,50,100);
		tr.setBounds(50,250,50,20);

		lg.setBounds(110,50,50,20);       //col row width height 
		pg.setBounds(110,90,50,20);
		sg.setBounds(110,130,50,100);
		tg.setBounds(110,250,50,20);

		lb.setBounds(170,50,50,20);       //col row width height 
		pb.setBounds(170,90,50,20);
		sb.setBounds(170,130,50,100);
		tb.setBounds(170,250,50,20);
		lclr.setBounds(230,50,50,20);
		pclr.setBounds(230,90,100,180);

		add(lr);
		add(lg);
		add(lb);
		add(lclr);
		add(pr);
		add(pg);
		add(pb);
		add(pclr);
		add(sr);
		add(sg);
		add(sb);
		add(tr);
		add(tg);
		add(tb);
		setSize(380,320);
		setVisible(true);
	}
	public void focusGained(FocusEvent e)
	{
	}
	public void adjustmentValueChanged(AdjustmentEvent e)
	{
		r= sr.getValue();
		g=sg.getValue();
		b= sb.getValue();
		tr.setText(""+r);
		tg.setText(""+g);
		tb.setText(""+b);	
		cr = new Color(r,0,0);
		cg = new Color(0,g,0);
		cb = new Color(0,0,b);
		cclr = new Color(r,g,b);
		pr.setBackground(cr);
		pg.setBackground(cg);
		pb.setBackground(cb);
		pclr.setBackground(cclr);
	}
	public void focusLost(FocusEvent e)
	{
		TextField t = (TextField)e.getSource();
		int val = 0;
		try{
			val = Integer.parseInt(t.getText());
		}
		catch(Exception e1){
			val = 255;
		}
		if(val<0||val>255)
		{
			t.requestFocus();
			return;		
		}
		t.setText(""+val);
		if(t==tr)
			r= val;
		if(t==tg)
			g=val;
		if(t==tb)
			b=val;
		sr.setValue(r);
		sg.setValue(g);
		sb.setValue(b);
		cr = new Color(r,0,0);
		cg = new Color(0,g,0);
		cb = new Color(0,0,b);
		cclr = new Color(r,g,b);
		pr.setBackground(cr);
		pg.setBackground(cg);
		pb.setBackground(cb);
		pclr.setBackground(cclr);
	}
	public static void main(String[]args)
	{
		UseScrollbar s= new UseScrollbar();
	}
}
	