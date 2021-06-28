// There is one diagram
// Making self editor Editor

import java.awt.*;
import java.awt.event.*;
import java.io.*;

class Editor extends Frame implements ActionListener
{
    TextArea ta;
    Button bn,bo,bs,be;
    Panel p;
    FileDialog fd;

    Editor()
    {
        super("Editor");
        ta = new TextArea("",10,70,TextArea.SCROLLBARS_BOTH);
        add(ta,BorderLayout.CENTER);
        p = new Panel();
        bn = new Button("New");
        bo = new Button("Open");
        bs = new Button("Save");
        be = new Button("Exit");

        bn.addActionListener(this);
        bo.addActionListener(this);
        bs.addActionListener(this);
        be.addActionListener(this);

        p.add(bn);
        p.add(bo);
        p.add(bs);
        p.add(be);

        add(p,BorderLayout.SOUTH);
        setSize(400,400);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        Button b = (Button)e.getSource();
        if(b==bn)
        ta.setText("");
        if(b==bo)
        open();
        if(b==bs)
        save();
        if(b==be)
        System.exit(0);
    }

    void open()
    {
        fd = new FileDialog(this,"FileDialog",FileDialog.LOAD);
        fd.setVisible(true);
        File f = new File(fd.getDirectory()+fd.getFile());
        String s = "";
        int val = 0;
        FileReader fr = null;
        try
        {
            fr = new FileReader(f);
        }
        catch(Exception e){}

        while(true)
        {
            try
            {
                val = fr.read();
            }
            catch(Exception e){}

            if(val==-1)
            break;
            
            s = s + (char)val;
        }

        try
        {
            fr.close();
        }
        catch(Exception e){}

        ta.setText(s);
    }

    void save()
    {
        fd = new FileDialog(this,"FileDialog",FileDialog.SAVE);
        fd.setVisible(true);
        File f = new File(fd.getDirectory()+fd.getFile());
        String s = ta.getText();
        FileWriter fw = null;
        try
        {
            fw = new FileWriter(f);
        }
        catch(Exception e){}
        
        int i=0,n=s.length(),val=0;
        while(i<n)
        {
            val = (int)s.charAt(i);
            try
            {
                fw.write(val);
            }
            catch(Exception e){}
            i++;
        }
        try
        {
            fw.close();
        }
        catch(Exception e){}
    }

    public static void main(String[] args) {
        Editor e = new Editor();
    }
}