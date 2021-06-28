// Date : 04-06-2021
// Use of CardLayout
// prog 1

import java.awt.*;
import java.awt.event.*;
import mypkg.Util;

class Pan1 extends Panel implements ActionListener
{
    Label lno,lnm;
    TextField tno,tnm;
    Button bok,bcl;

    Pan1()
    {
        super();
        lno = new Label("Number");
        lnm = new Label("Name");
        tno = new TextField(10);
        tnm = new TextField(30);
        bok = new Button("Ok");
        bcl = new Button("Clear");

        bok.addActionListener(this);
        bcl.addActionListener(this);
        setLayout(new GridLayout(3,2,5,5));

        add(lno);add(tno);
        add(lnm);add(tnm);
        add(bok);add(bcl);
    }

    public void actionPerformed(ActionEvent e)
    {
        Button b = (Button)e.getSource();
        if(b==bok)
        {
            String s = "Roll No : "+tno.getText()+"\n Name : "+tnm.getText();
            Util.oMessage(s);
        }
        tnm.setText("");
        tno.setText("");
        tno.requestFocus();
    }
}

class Pan2 extends Panel implements ActionListener
{
    Label lno,leng,lmar;
    TextField tno;
    CheckboxGroup ce,cm;
    Checkbox e1,e2,e3,e4;
    Checkbox m1,m2,m3,m4;

    Button bok,bcl;

    Pan2()
    {
        super();
        setLayout(null);
        lno = new Label("Mobile Number");
        tno = new TextField(15);
        lno.setBounds(50,50,100,20);
        tno.setBounds(160,50,100,20);
        leng = new Label("English");
        leng.setBounds(50,80,100,20);

        ce = new CheckboxGroup();
        e1 = new Checkbox("IE",ce,true);
        e2 = new Checkbox("TOI",ce,true);
        e3 = new Checkbox("ET",ce,true);
        e4 = new Checkbox("HT",ce,true);

        e1.setBounds(50,110,70,20);
        e2.setBounds(130,110,70,20);
        e3.setBounds(50,140,70,20);
        e4.setBounds(130,140,70,20);

        cm = new CheckboxGroup();
        m1 = new Checkbox("Sakal",cm,true);
        m2 = new Checkbox("MT",cm,true);
        m3 = new Checkbox("LS",cm,true);
        m4 = new Checkbox("TB",cm,true);

        m1.setBounds(50,200,70,20);
        m2.setBounds(130,200,70,20);
        m3.setBounds(50,230,70,20);
        m4.setBounds(130,230,70,20);

        lmar = new Label("Marathi");
        lmar.setBounds(50,170,100,20);

        bok = new Button("Ok");
        bcl = new Button("Clear");

        bok.addActionListener(this);
        bcl.addActionListener(this);

        bok.setBounds(50,260,70,20);
        bcl.setBounds(130,260,70,20);

        add(lno);
        add(tno);
        add(leng);
        add(e1);
        add(e2);
        add(e3);
        add(e4);
        add(lmar);

        add(m1);
        add(m2);
        add(m3);
        add(m4);

        add(bok);
        add(bcl);
    }

    public void actionPerformed(ActionEvent e)
    {
        Button b = (Button)e.getSource();
        if(b==bok)
        {
            String s = "Mob No : "+tno.getText()+"\nEng Paper : "+(ce.getSelectedCheckbox()).getLabel()+"\n Mar Paper : "+(cm.getSelectedCheckbox()).getLabel();
            Util.oMessage(s);
        }
        tno.setText("");
        tno.requestFocus();
    }
}

class Pan3 extends Panel implements ActionListener
{
    Choice obj;
    Label lcity;
    Button bok;

    Pan3()
    {
        super();
        lcity = new Label("City");

        obj = new Choice();
        obj.add("Kolhapur");
        obj.add("Satara");
        obj.add("Solapur");
        obj.add("Sangli");
        obj.add("Pune");

        bok = new Button("Ok");
        bok.addActionListener(this);
        add(lcity);
        add(obj);
        add(bok);
    }

    public void actionPerformed(ActionEvent e)
    {
        String s = "City : "+obj.getSelectedItem();
        Util.oMessage(s);
    }
}


public class CardLayoutDemo extends Frame implements ActionListener
{
    Panel main;
    Pan1 p1;
    Pan2 p2;
    Pan3 p3;
    CardLayout cl;

    Button b1,b2,b3;

    CardLayoutDemo()
    {
        super("CardLayout Demo");
        b1 = new Button("Stu");
        b2 = new Button("Paper");
        b3 = new Button("City");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        p1 = new Pan1();
        p2 = new Pan2();
        p3 = new Pan3();

        cl = new CardLayout(20,20);
        main = new Panel();

        main.setLayout(cl);
        main.add(p1,"Stu");
        main.add(p2,"Paper");
        main.add(p3,"City");

        Panel tmp = new Panel();
        tmp.add(b1);
        tmp.add(b2);
        tmp.add(b3);

        add(main,BorderLayout.CENTER);
        add(tmp,BorderLayout.SOUTH);

        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(1);
            }
        });

        setSize(500,500);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        Button b = (Button)e.getSource();

        if(b==b1)
            cl.show(main, "Stu");

        if(b==b2)
            cl.show(main, "Paper");

        if(b==b3)
            cl.show(main, "City");
    }

    public static void main(String[] args)
    {
        CardLayoutDemo c = new CardLayoutDemo();
    }
}