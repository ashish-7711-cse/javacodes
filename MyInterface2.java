import javax.swing.*;
import java.util.*;
interface DataIO
{
    void setData();
    void Display();
}
interface Compute
{
    int calculateTotal();
    int calculateAvg();
}
interface ISize
{
    int size =5;
}
interface IArray extends DataIO,Compute
{
    boolean search(int sv);
}
class ArrayImpl implements ISize,IArray
{
    int[] arr;
    ArrayImpl()
    {
        arr = new int[size];
    }
    public  String toString()
    {
        String a ="Arrays\n"+Arrays.toString(arr)+"\nTotal:"+calculateTotal()+"\nAverage:"+calculateAvg();
        return a;
    }
    public int calculateTotal()
    {
        int tot = arr[0],i=1;
        while(i<size)
            tot +=arr[i++];
        return tot;
    }
    public int calculateTotal()
    {
        return calculateTotal()/size;
    }
    public void Display()
    {
        JOptionPane.showMessageDialog(null,toString());
    }
    public void setData()
    {
        int i=0;
        while (i<5)
        {
            try{
                arr[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"data"));
            }
            catch(Exception e){}
        }
    }
    public boolean search(int sv)
    {
        int i=0;
        while(i<5)
        {
            if(arr[i]==sv)
                break;
            i++;
        }
        if(i==size)
            return false;
        else
            return true;
    }
}
class  MyInterface2
{
    public static void main(String[]srgs)
    {
        ArrayImpl obj= new ArrayImpl();
        obj.setData();
        obj.Display();
    }

}