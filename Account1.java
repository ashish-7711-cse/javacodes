import javax.swing.*;
import java.util.*;
class Account1
{
    int acno;
    String acnm;
    int opnbal;
    Account1()
    {
        acno=0;
        acnm="";
        opnbal=0;
    }
    public String toString()
    {
        String a= "\nAccount no"+acno+"\nName"+acnm+"\nOpening Bal:"+opnbal;
        return a;
    }
    int getNo()
    {
        return acno;
    }
    String getName()
    {
        return acnm;
    }
    int getOBalance()
    {
        return opnbal;
    }
    void setData(int no)
    {
        acno=no;
        acnm=JOptionPane.showInputDialog(null,"account name");
        try
        {
            opnbal=Integer.parseInt(JOptionPane.showInputDialog(null,"Opening balance"));
        }
        catch(Exception e)
        {}
    }
    void setData()
    {
        int a=0;
        try {
            a=Integer.parseInt(JOptionPane.showInputDialog(null,"Account no"));
        }
        catch(Exception e) {}
        setData(a);
    }
    void Display()
    {
        JOptionPane.showMessageDialog(null,toString());
    }
    void setBal(int bal){
        opnbal=bal;
    }
    void setName(String nm)
    {
        acnm=nm;
    }
    public static void main(String[]args)
    {
        LinkedList<Account1>A=new LinkedList<Account1>();
        int no=0;
        while(true)
        {
            try {
                no=Integer.parseInt(JOptionPane.showInputDialog(null,"Account no"));
            }
            catch (Exception e)
            {
                continue;
            }
            Account1 ref=new Account1();
            ref.setData(no);
            A.add(ref);
            if(JOptionPane.showConfirmDialog(null,"Continue?")==JOptionPane.NO_OPTION)
                return;
            JOptionPane.showMessageDialog(null,""+A);
            int i=0,n=A.size();
            Account1 tmp =null;
            while(i<n)
            {
                tmp = A.get(i);
                tmp.Display();
                i++;
            }
            Iterator<Account1>it= A.iterator();
            while(it.hasNext())
            {
                tmp=it.next();
                tmp.Display();
            }
            Account1[]ac = new Account1[A.size()];
            ac = A.toArray(ac);
            JOptionPane.showMessageDialog(null, Arrays.toString(ac));
        }
    }
}