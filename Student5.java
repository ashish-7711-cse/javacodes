import java.io.*;
import javax.swing.*;
import java.util.*;
class Student5 implements Comparator<Student5>
{
    int no;
    String nm;
    double mrk;
    Student5()
    {
        no=0;
        nm=new String();
        mrk=0.0;

    }
    Student5(int a,String b, double c)
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
    public  int compare(Student5 a, Student5 b)
    {
        return (a.no-b.no);
    }
    public static void main(String[]args)
    {
        Student5 [] a= { new Student5(13,"Rajesh",6.8),new Student5(6,"Sarika",9.2),new Student5(18,"Sujata",8.4),new Student5(12,"Amit",9.2)};
        JOptionPane.showMessageDialog(null,Arrays.toString(a));
        Arrays.sort(a,new Student5());
        JOptionPane.showMessageDialog(null,Arrays.toString(a));
    }
}
