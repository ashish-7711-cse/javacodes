//implimentation of stack
import com.sun.jdi.IntegerType;

import javax.swing.*;
class Stack1
{
    static int top;
    static int []arr;
    static
    {
        top=-1;
        arr=new int[5];
    }
    static boolean isEmpty()
    {
        return (top==-1);
    }
    static boolean isFull()
    {
        return (top==arr.length-1);
    }
    static void push()
    {
        if(isFull())
            JOptionPane.showMessageDialog(null,"Overflow");
        else
        {
            int d=0;
            try
            {
                d=Integer.parseInt(JOptionPane.showInputDialog(null,"Data"));
            }
            catch(Exception e)
            {}
            top++;
            arr[top]=d;
        }
    }
    static void pop()
    {
        String s="";
        if(isEmpty())
            s="Underflow";
        else
            s="Popped Element:"+arr[top--];
        JOptionPane.showMessageDialog(null,s);
    }
    static void Display()
    {
        String s="";
        if(isEmpty())
            s="Empty Stack";
        else
        {
            s="Stack Data\n";
            for(int i=top;i>=0;i--)
                s=s+" " +arr[i];
        }
        JOptionPane.showMessageDialog(null,s);
    }
    static void menu() {
        String[] option = {"Push", "Pop", "Display", "Exit"};
        int opt;
        while (true) {
            opt = JOptionPane.showOptionDialog(null, "Choose Option", "Stack", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option, 0);  //stack:title for dialog Choose option:
            if (opt == 3)
                break;
            switch (opt) {
                case 0:
                    push();
                    break;
                case 1:
                    pop();
                    break;
                case 2:
                    Display();
                    break;
            }
        }
    }
            public static void main(String[]args)
            {
                menu();
            }

}