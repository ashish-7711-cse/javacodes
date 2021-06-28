//sub class in same package
package mypkg;
import java.io.*;
import mypkg.Util.*;
import mypkg.EStudent;
public class NewEStudent extends EStudent implements Serializable
{
    double mrk;
    boolean state;
    public NewEStudent()
    {
        super();
        mrk=0.0;
        state=true;
    }
    public double getMarks(){ return mrk;}
    public boolean getState(){ return state;}
    public String toString()
    {
        String s = super.toString()+"\nMakrks:"+mrk+"\nState:"+state;
        return s;
    }
    public void display()
    {
        Util.oMessage(toString());
    }
    public void delRecord()
    {
        state= false;
    }
    public void setData(int n)
    {
        super.setData(n);
        mrk=Util.dInput("Marks:");
        state =true;
    }
}