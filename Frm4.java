import java.awt.*;
import java.awt.event.*;
import mypkg.Util;


class Frm4 extends Frame implements ActionListener
{
    Label lno,lnm,lmrk;
    TextField tno,tnm,tmrk;
    Button bok,bex;

    Frm4()
    {
        super("Student");
        lno = new Label("Roll no");
        lnm = new Label("Name");
        lmrk = new Label("Marks");
        tno = new TextField(10);
        tnm = new TextField(30);
        tmrk = new TextField(10);
        bok = new Button("Ok");
        bex = new Button("Exit");
        bok.addActionListener(this);
        bex.addActionListener(this);
        setLayout(new GridLayout(4,3,5,5)); //GridLayout(rows,colunms,row space,column space)
        add(lno);
        add(tno);
        add(lnm);
        add(tnm);
        add(lmrk);
        add(tmrk);
        add(bok);
        add(bex);
        setSize(400,400);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        Button b = (Button)e.getSource();
        if(b==bex)
        System.exit(0);
        else
        {
	    int no=0;
	    try{
		no = Integer.parseInt(tno.getText());
	}
	catch(Exception e1){
		tno.requestFocus();
		return ;	
	}
	if(no<=0)
	{
		tno.requestFocus();
		return;
	}
	double mrk=0;
	    try{
		mrk = Double.parseDouble(tmrk.getText());
	}
	catch(Exception e1){
		tmrk.requestFocus();
		return ;	
	}
	if(mrk<=0.0||mrk>10.0)
	{
		tmrk.requestFocus();
		return;
	}
            String s = "Roll No : "+tno.getText()+"\n Name : "+tnm.getText()+"\n Marks : "+tmrk.getText();
            Util.oMessage(s);
        }
    }

    public static void main(String [] args)
    {
        Frm4 a = new Frm4();
    }
   
}