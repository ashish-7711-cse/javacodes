import java.awt.*;
import java.awt.event.*;
import java.util.*;

class EStudent
{
    int rno;
    String nm;
    double marks;
    EStudent(int a, String b, double c)
    {
        rno = a;
        nm = b;
        marks = c;
    }
    void setData(int a, String b, double c)
    {
        rno = a;
        nm = b;
        marks = c;
    }
    public String toString()
    {
        String s = "Roll No: "+rno+"\nName: "+nm+"\nMarks: "+marks;
        return s;
    }
}

class StuAMD extends Dialog implements ActionListener, FocusListener
{
    int no,i,n;
    String nm;
    double mrk;
    EStudent obj;
    LinkedList<EStudent> ls;
    boolean rstate;//true,false
    String action;//add,mod,del
    Label lno, lnm, lmr;
    TextField tno, tnm, tmr;
    Button bu, bb;
    StuAMD(Frame prnt,String title, boolean state, LinkedList<EStudent>ls)
    {
        super(prnt, title, state);
        this.ls = ls;
        rstate = false;
        i = 0;n = 0;
        lno = new Label("Roll No: ");
        lnm = new Label("Name: ");
        lmr = new Label("Mark: ");
        tno = new TextField(10);
        tno.addFocusListener(this);
        tnm = new TextField(15);
        tmr = new TextField(8);
        bu = new Button("Update");
        bb = new Button("Back");
        bu.addActionListener(this);
        bb.addActionListener(this);
        setLayout(new GridLayout(4,2,5,5));
        add(lno);
        add(tno);
        add(lnm);
        add(tnm);
        add(lmr);
        add(tmr);
        add(bu);
        add(bb);
        setSize(400,400);
    }
    public void focusGained(FocusEvent e)
    {

    }
    public void focusLost(FocusEvent e)
    {
        try
        {
            no = Integer.parseInt(tno.getText());
        }
        catch(Exception e1)
        {
            tno.requestFocus();
            return;
        }
        i = 0;
        n = ls.size();
        rstate = false;
        action = this.getTitle();
        while(i<n)
        {
            obj = ls.get(i);
            if(obj.rno == no)
            {
                rstate = true;
                break;
            }
            i++;
        }
        if(rstate == false)
        {
            if(action.equals("ADD")==false)
            {    tno.requestFocus(); return;    }
        }
        else
        {
            if(action.equals("ADD"))
            {
                tno.requestFocus();
                return;
            }
        }
        
    }
    public void actionPerformed(ActionEvent e)
    {
        Button b = (Button)e.getSource();
        if(b==bb)
        {
            setVisible(false);
            return;
        }
        try 
        {
            nm = tnm.getText();
            mrk = Double.parseDouble(tmr.getText()); 
        }
        catch(Exception e1)
        {
            tmr.requestFocus();
            return;
        }
        if(action.equals("ADD"))
        {
            obj = new EStudent(no, nm, mrk);
            ls.add(obj);
        }
        if(action.equals("MOD"))
        {
            obj.nm = nm;
            obj.marks = mrk;
        }
        if(action.equals("DEL"))
        {
            ls.remove(obj);
        }
        setVisible(false);
    }
}

class StuDisplay extends Dialog implements ActionListener 
{
    Button bf, bl, bn, bp;
    Panel p1, p2;
    Label lno, lnm, lmr;
    TextField tno, tnm, tmr;
    LinkedList<EStudent> ls;
    int index, n;
    StuDisplay(Frame f, String t, boolean s, LinkedList<EStudent> a)
    {
        super(f,t,s);
        ls = a;
        index = 0;
        p1 = new Panel();
        p2 = new Panel();
        lno = new Label("Roll NO");
        lnm = new Label("Name");
        lmr = new Label("Marks");
        tno = new TextField(6);
        tnm = new TextField(15);
        tmr = new TextField(6);
        p1.setLayout(new GridLayout(8,2,6,5));
        p1.add(lno);
        p1.add(tno);
        p1.add(lnm);
        p1.add(tnm);
        p1.add(lmr);
        p1.add(tmr);
        bf = new Button("|<");
        bl = new Button("<<");
        bp = new Button(">>");
        bn = new Button(">|");
        bf.addActionListener(this);
        bl.addActionListener(this);
        bp.addActionListener(this);
        bn.addActionListener(this);
        p2.add(bf);
        p2.add(bl);
        p2.add(bp);
        p2.add(bn);
        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);
        n = ls.size();
        setSize(400,400);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
                setVisible(false);
            }
        });
    }
    public void actionPerformed(ActionEvent e)
    {
        Button b = (Button)e.getSource();
        if(b==bf)
        {
            index = 0;
        }
        if(b==bl)
            index = ls.size()-1;
        if(b==bp)
        {
            if(--index <= 0)
                index = 0;
        }
        if(b==bn)
        {
            if(++index > ls.size()-1)
                index= ls.size()-1;
        }
        EStudent obj = ls.get(index);
        tno.setText(""+obj.rno);
	tno.setEditable(false);
        tnm.setText(""+obj.nm);
	tnm.setEditable(false);
        tmr.setText(""+obj.marks);

    }
}

public class StuMain1 extends Frame implements ActionListener 
{
    Button ba, bm, bd, bdisplay;
    LinkedList<EStudent> ls;
    StuAMD p;
    StuDisplay q;
    StuMain1()
    {
        super("Student");
        ls = new LinkedList<EStudent>();
        p = new StuAMD(this, "ADD", true,ls);
        q = new StuDisplay(this, "Display", true, ls);
        ba = new Button("ADD");
        bm = new Button("MOD");
        bd = new Button("DEL");
        bdisplay = new Button("Display");
        ba.addActionListener(this);
        bm.addActionListener(this);
        bd.addActionListener(this);
        bdisplay.addActionListener(this);
        ba.setBounds(50,50,100,20);
        bm.setBounds(160,50,100,20);
        bd.setBounds(50,100,100,20);
        bdisplay.setBounds(160,100,100,20);
        add(ba);
        add(bm);
        add(bd);
        add(bdisplay);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        setSize(300,300);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        if(s.equals("Display"))
            q.setVisible(true);
        else
        {
            p.setTitle(s);
            p.setVisible(true);
        }
    }
    public static void main(String[] args) {
        StuMain1 a = new StuMain1();
    }
}