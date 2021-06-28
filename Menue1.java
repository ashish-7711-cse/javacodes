import java.awt.*;
import java.awt.event.*;
import mypkg.Util;
class Menue1 extends Frame implements ActionListener
{
	MenuBar mb;
	Menu mf,me,mx;
	MenuItem fn,fo,fc;	
	MenuItem ec,eo,ep;
	MenuItem xy,xn;
	Menue1()
	{
		super("Menu");
		fn = new MenuItem("New");
		fo = new MenuItem("Open");
		fc = new MenuItem("Close");
		fn.addActionListener(this);
		fo.addActionListener(this);
		fc.addActionListener(this);
		mf = new Menu("File");
		mf.add(fn);
		mf.add(fo);
		mf.add(fc);
		ec = new MenuItem("Cut");
		eo = new MenuItem("Copy");
		ep = new MenuItem("Paste");
		ec.addActionListener(this);
		eo.addActionListener(this);
		ep.addActionListener(this);
		me = new Menu("Edit");
		me.add(ec);
		me.add(eo);
		me.add(ep);
		xy = new MenuItem("YES");
		xn = new MenuItem("NO");
		xy.addActionListener(this);
		xn.addActionListener(this);
		mx = new Menu("Exit");
		mx.add(xn);
		mx.add(xy);
		mb = new MenuBar();
		mb.add(mf);
		mb.add(me);
		mb.add(mx);
		setMenuBar(mb);
		setSize(400,400);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
    	{
        	MenuItem p = (MenuItem)e.getSource();
        	if(p==xy)
            		System.exit(0);
        	else
            		System.out.println(e.getActionCommand()); 
	}
	public static void main(String[]args)
	{
		Menue1	a = new Menue1();
	}
}