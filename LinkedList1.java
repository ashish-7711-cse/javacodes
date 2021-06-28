//use of class LinkedList
import java.util.*;
import javax.swing.*;
class LinkedList1
{
    public static void main(String[]args)
    {
        LinkedList<Integer>ls=new LinkedList<Integer>();
        int no=0;
        while(true)
        {
            try
            {
                no= Integer.parseInt(JOptionPane.showInputDialog(null,"Data"));
            }
            catch(Exception e)
            {continue;}
            if(no==0)
                break;
            ls.add(no);
        }
        JOptionPane.showMessageDialog(null,ls.toString());
        int i=0,n=ls.size();
        String str = "Data\n";
        while(i<n)
        {
            try
            {
                str=str+" "+ ls.get(i);
            }
            catch(Exception e)
            {}
            i++;
        }
        JOptionPane.showMessageDialog(null,str);
                Iterator<Integer>it=ls.iterator();
        while(it.hasNext())
        {
            JOptionPane.showMessageDialog(null,"Data:"+it.next());
        }
    }
}