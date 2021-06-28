import javax.swing.*;
import java.util.*;
class Book1{
    String bnm;
    int bno;
    double bprice;
    Book1(){
        bno =0;
        bnm =new String();
        bprice = 0.0;
    }
    Book1(int a,String b, double c)
    {
        bnm= b;
        bno = a;
        bprice = c;
    }
    public String toString()
    {
        String a= "Book no:"+bno+"Book Name:"+bnm+"Book Price"+bprice;
        return a;
    }
    int getNumber()
    {
        return bno;
    }
    String getName()
    {
        return bnm;
    }    void Display()
    {
        JOptionPane.showMessageDialog(null,toString());
    }

    void setPrice(double d)
    {
        bprice=d;
    }
    void setName(String a)
    {
        bnm=a;
    }
    void input(int a)
    {
        bno=a;
        bnm=JOptionPane.showInputDialog(null,"Book Name");
        try{
            bprice = Double.parseDouble(JOptionPane.showInputDialog(null,"Book Price"));
        }
        catch(Exception e)
        {}
    }
    void input()
    {
        try{
            bno =Integer.parseInt(JOptionPane.showInputDialog(null,"Book Id"));
        }
        catch (Exception e){}
        input(bno);
    }
    public static void main(String [] args)
    {
        Book1[] a = new Book1[5];
        int i=0,n=a.length;
        while(i<n)
        {
            a[i]=new Book1();
            a[i].input();
            i++;
        }
        JOptionPane.showMessageDialog(null,Arrays.toString(a));
    }
}