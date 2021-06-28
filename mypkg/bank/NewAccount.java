// sub class in other package
package mypkg.bank;
import mypkg.MyAccount;
import mypkg.DataIO;
import mypkg.Util;
import java.io.*;
public class NewAccount extends MyAccount implements DataIO ,Serializable
{
    int acbal;
    boolean acstate;
    public NewAccount()
    {
        super();
        acbal=0;
        acstate=true;
    }
    public String toString()
    {
        String s= super.toString()+"\nBalance:"+acbal+"\nState:"+acstate;
        return s;
    }
    public void display()
    {
        Util.oMessage(toString());
    }
    public void setData(int no)
    {
        super.setData(no);
        acbal = Util.iInput("Opening Balance");
        acstate = true;
    }
    public int getBalance()
    {
        return acbal;
    }
    public void delRecord()
    {
        acstate =false;
    }
}