//user defined

import javax.swing.*;
import java.util.*;
import java.io.*;
class Account2 implements Comparable<Account2>,Comparator<Account2>
{
    int acno;
    String acnm;
    int acamt;
    boolean acstate;
    int actype;  //1:Saving 2:Recu 3:Loan 4:FD
    Account2()
    {
        acno=acamt=0;
        actype=0;
        acstate=true;
        acnm="";
    }
    Account2(int a,String b,int c,boolean d,int e)
    {
        acno=a;
        acnm=b;
        acamt=c;
        acstate=d;
        actype=e;
    }
    public String toString()
    {
        String a=String.format("\n%1$5d %2$-15s %3$6d %4$1d %5$b",acno,acnm,acamt,actype,acstate);
        return a;
    }
    void display()
    {
        JOptionPane.showMessageDialog(null,toString());
    }
    int getNo()
    {
        return acno;
    }
    boolean getstate()
    {
        return acstate;
    }
    public  int compareTo(Account2 a)
    {
        return acno-a.acno;
    }
    public int compare(Account2 a,Account2 b)
    {
        return a.acamt-b.acamt;
    }
    public static Comparator<Account2> NameComp = new Comparator<Account2>() {
        @Override
        public int compare(Account2 o1, Account2 o2) {
            return (o1.acnm).compareTo(o2.acnm);
        }
    };
    public static Comparator<Account2> TypeComp = new Comparator<Account2>() {
        @Override
        public int compare(Account2 o1, Account2 o2) {
            if(o1.actype==o2.actype)
                return (o1.acno-o2.acno);
            else
                return o1.actype-o2.actype;
        }
    };
    public static  void main(String[]args)
    {
        Account2 []a={ new Account2(13,"Amit",6000,true,1),
                        new Account2(6,"Suresh",7000,true,4),
                        new Account2(18,"Ganesh",8000,false,1),
                        new Account2(9,"Ajay",0,false,1),
                        new Account2(21,"Ramesh",10000,true,4),
        };
        JOptionPane.showMessageDialog(null,Arrays.toString(a));

        //comparable
        Arrays.sort(a);
        JOptionPane.showMessageDialog(null,Arrays.toString(a));

        //comparator
        Arrays.sort(a,new Account2());
        JOptionPane.showMessageDialog(null,Arrays.toString(a));

        //User defined
        Arrays.sort(a,Account2.NameComp);
        JOptionPane.showMessageDialog(null,Arrays.toString(a));

        Arrays.sort(a,Account2.TypeComp);
        JOptionPane.showMessageDialog(null,Arrays.toString(a));
    }
}