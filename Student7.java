import javax.swing.*;
import java.util.*;
import java.io.*;
class Student7 implements Comparator<Student7>,Comparable<Student7>{
    int no;
    String nm;
    int mrk;
    Student7(){
        no=0;
        nm=new String();
        mrk=0;
    }
    Student7(int no,String nm,int db){
        this.no=no;
        this.nm=nm;
        mrk=db;
    }
    public String toString(){
        String a=String.format("\n%1$5d %2$-15s %3$d",no,nm,mrk);
        return a;
    }
    void display(){
        JOptionPane.showMessageDialog(null,this);
    }
    public int compareTo(Student7 a)
    {
        Integer c=no,d=a.no;
        return c.compareTo(d);
    }
    public int compare(Student7 a,Student7 b){
        if(b.mrk>a.mrk)
            return -1;
        else if(b.mrk<a.mrk)
            return 1;
        else
            return a.compareTo(b);
    }

    public static void main(String[] args){
        Student7 []a={
                new Student7(27,"Prathmesh",90),
                new Student7(10,"Ahishek",90),
                new Student7(11,"Vaishnavi",95),
                new Student7(12,"Sanmati",80),
                new Student7(13,"Kunal",95)
        };
        JOptionPane.showMessageDialog(null,a);
        Arrays.sort(a,new Student7());
        JOptionPane.showMessageDialog(null,a);
        Arrays.sort(a);
        JOptionPane.showMessageDialog(null,a);
    }
}