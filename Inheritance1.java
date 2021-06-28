import javax.swing.*;

public class Inheritance1
{
    public static void main(String [] args)
    {
        Number1 a = new Number1();
        a.setData();
        a.display();

        Student2 b = new Student2();
        b.setData();
        b.display();

        //RunTime polymorpism
        a = b;    //-->valid becoz super class ref var can ref to obj of subclass
        a.setData();
        a.display();
        // System.out.println(a.getName());
    }
}

//Super class
class Number1
{
    int no;
    Number1()
    {
        no = 0;
    }

    Number1(int n)
    {
        no = n;
    }

    public String toString()
    {
        String a = "\n Number : "+no;
        return a;
    }

    int getNo()
    {
        return no;
    }

    void setData()
    {
        try
        {
            no = Integer.parseInt(JOptionPane.showInputDialog(null,"Number : "));
        }
        catch(Exception e){}
    }

    void setData(int n)
    {
        no = n;
    }

    void display()
    {
        JOptionPane.showMessageDialog(null, "\n Number : "+no);
    }
}

//subclass
class Student2 extends Number1
{
    String nm;
    Student2()
    {
        super();
        nm = new String();
    }

    Student2(int a,String b)
    {
        super(a);
        nm = b;
    }

    public String toString()
    {
        String a = super.toString()+"\n Name : "+nm;
        return a;
    }

    void display()
    {
        JOptionPane.showMessageDialog(null,toString());
    }

    //overriding this method
    void setData()
    {
        super.setData();
        nm = JOptionPane.showInputDialog(null,"Name : ");
    }

    void setData(int a)
    {
        super.setData(a);
        nm = JOptionPane.showInputDialog(null,"Name : ");
    }

    String getName()
    {
        return nm;
    }

}