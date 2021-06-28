import java.io.*;
import javax.swing.*;
import java.util.*;
class Student6 implements Comparable<Student6>
{
    int no;
    String nm;
    int mrk;
    Student6()
    {
        no=0;
        nm=new String();
        mrk=0;

    }
    Student6(int a,String b, int c)
    {
        no=a;
        mrk = c;
        nm = b;
    }
    public String toString()
    {
        String a= String.format("\n%1$5d %2$-15s %3$d",no,nm,mrk);
        return a;
    }
    void display()
    {
        JOptionPane.showMessageDialog(null,toString());
    }
    public int compareTo(Student6 a)
    {
        Integer c=no,d=a.no;
        return c.compareTo(d);
    }
    public static void main(String[]args)
    {
        Student6 [] a= { new Student6(13,"Rajesh",68),new Student6(6,"Sarika",99),new Student6(18,"Sujata",84),new Student6(12,"Amit",92)};
        JOptionPane.showMessageDialog(null,Arrays.toString(a));
        Arrays.sort(a);
        JOptionPane.showMessageDialog(null,Arrays.toString(a));
    }
}
