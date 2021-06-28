package mypkg;
import mypkg.DataIO;
import mypkg.Util;
import java.io.*;
public class MyAccount implements Serializable, DataIO
{
    int acno;
    String acnm;
    public MyAccount()
    {
        acno =0;
        acnm ="";
    }
    public String toString()
    {
        String a ="Account no:"+acno+"\nName:"+acnm;
        return a;
    }
    public void display()
    {
        Util.oMessage(toString());
    }
    public void setData(int no)
    {
        acno = no;
        acnm = Util.sinput("A/c Name");
    }
    public int getNo()
    {
        return acno;
    }
    public String getName()
    {
        return acnm;
    }
}