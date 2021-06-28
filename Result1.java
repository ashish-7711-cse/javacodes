import javax.swing.*;
import java.util.*;
class Result1{
    int rno;
    int []mrk;
    Result1()
    {
        rno =0;
        mrk = new int[5];
    }
    public String toString()
    {
        String a= "Result\nRoll No:"+rno+"\nMarks"+Arrays.toString(mrk);
        return a;
    }
    int getNumber()
    {
        return rno;
    }
    int total()
    {
        int tot=mrk[0],i=1;
        while(i<mrk.length)
            tot+=mrk[i];
        return tot;
    }

    void input(int a)
    {
        rno =a;
        int i=0;
        while(i<5)
        {
            try{
                mrk[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Marks"));
            }
            catch(Exception e)
            {mrk[i]=0;}
            i++;
        }
    }
    void input()
    {
        try{
            rno= Integer.parseInt(JOptionPane.showInputDialog(null,"Roll N0"));
        }
        catch(Exception e)
        {}
        input(rno);
    }
    double avg()
    {
        return total()/5.0;
    }
    void Display()
    {
        JOptionPane.showMessageDialog(null, toString());  // JOptionPane.showMessageDialog(null, ""+this);
    }
    public static void main(String[]args)
    {
        Result1 r=null;
        r=new Result1();
        r.input();
        String a= r.toString()+"\nTotal"+r.total()+"\nAVG:"+r.avg();
        JOptionPane.showMessageDialog(null,a);
    }
}