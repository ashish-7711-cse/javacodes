import java.util.*;
import javax.swing.*;
class Stack2
{
    public static void main(String[] args)
    {
        Stack<Integer>a=new Stack<Integer>();
        String[] option = {"Push", "Pop", "Display", "Exit"};
        int opt=0,d=0;
        while(true)
        {
            opt = JOptionPane.showOptionDialog(null, "Choose Option", "Stack", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option, 0);
            if(opt==3)
                break;
            switch(opt)
            {
                case 0:
                    try
                    {
                        d=Integer.parseInt(JOptionPane.showInputDialog(null,"Data"));
                    }
                    catch(Exception e)
                    {}
                    a.push(d); break;
                case 1:
                    String s="";
                    try
                    {
                        s=s+a.pop();
                    }
                    catch(Exception e)
                    {
                        s="Underflow";
                    }
                    JOptionPane.showMessageDialog(null,s); break;
                case 2:
                    JOptionPane.showMessageDialog(null,"Stack\n"+a);
            }
        }
    }
}