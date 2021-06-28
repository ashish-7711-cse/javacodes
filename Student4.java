import java.io.*;
import javax.swing.*;
import java.util.*;
class Student4 implements Comparable<Student4>
{
    int no;
    String nm;
    double mrk;
    Student4()
    {
        no=0;
        nm=new String();
        mrk=0.0;

    }
    Student4(int a,String b, double c)
    {
        no=a;
        mrk = c;
        nm = b;
    }
    public String toString()
    {
        String a= String.format("\n%1$5d %2$-15s %3$.2f",no,nm,mrk);
        return a;
    }
    void display()
    {
        JOptionPane.showMessageDialog(null,toString());
    }
    public int compareTo(Student4 a)
    {
        return nm.compareTo(a.nm);
    }
    public static void main(String[]args)
    {
        Student4 [] a= { new Student4(13,"Rajesh",6.8),new Student4(6,"Sarika",9.2),new Student4(18,"Sujata",8.4),new Student4(12,"Amit",9.2)};
        JOptionPane.showMessageDialog(null,Arrays.toString(a));
        Arrays.sort(a);
        JOptionPane.showMessageDialog(null,Arrays.toString(a));
    }
}
