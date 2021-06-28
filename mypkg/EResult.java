package mypkg;
import java.io.*;
import mypkg.Util;
public class EResult implements Serializable{
    int no;
    double mrk;
    public EResult()
    {
        no=0;
        mrk=0.0;
    }
    public String toString()
    {
        String s="Roll No:"+no+"Marks:"+mrk;
        return s;
    }
    public void display()
    {
        Util.oMessage(toString());
    }
    public int getNo()
    {
        return no;
    }
    public double getMarks()
    {
        return mrk;
    }
    public void setData(int n)
    {
        no=n;
        mrk=Util.dInput("Marks");
    }
}