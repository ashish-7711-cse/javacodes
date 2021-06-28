//Que using Linked list
import java.util.*;
import javax.swing.*;
class LinkedList2
{
    static LinkedList<Integer>ls;
    static{
        ls= new LinkedList<Integer>();
    }
    static void insert()
    {
        int d=0;
        try
        {
            d=Integer.parseInt(JOptionPane.showInputDialog(null,"Data:"));
        }
        catch(Exception e){return;}
        ls.addLast(d);
    }
    static void remove()
    {
        try
        {
            ls.removeFirst();
        }
        catch(Exception e)
        { JOptionPane.showMessageDialog(null,"Underflow");	}
    }
    static void queDisplay()
    {
        String str="Queue:";
        if(ls.size()==0)
            str= str+" "+"Empty";
        else
        {
            str = str+ls;
        }
        JOptionPane.showMessageDialog(null,str);
    }
    static void queMenu()
    {
        String[] option = {"INSERT", "REMOVE", "Display", "Exit"};
        int opt=0,d=0;
        while(true)
        {
            opt = JOptionPane.showOptionDialog(null, "Choose Option", "Stack", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option, 0);
            if(opt==3)
                break;
            switch(opt)
            {
                case 0:
                    insert(); break;
                case 1:
                   remove();
                   break;
                case 2:
                    queDisplay();
            }
        }
    }
    public static void main(String[]args)
    {
        queMenu();
    }
}

