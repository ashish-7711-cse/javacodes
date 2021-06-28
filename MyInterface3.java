import javax.swing.*;
interface IDataIO
{
    void set(int pos,int d);
    int get(int pos);
}
interface ISize
{
    int size =5;
}
interface IStack
{
    void push(int d);
    void pop();
    boolean stackEmpty();
    boolean stackFull();
    void stackDisplay();
    void stackMenu();
}
interface  IQueue
{
    void insert(int d);
    void remove();
    boolean queueEmpty();
    boolean queueFull();
    void queueDisplay();
    void queueMenu();
}
interface DataStructure
{
    void menu();
}
class MyArray1 implements IQueue,IDataIO,DataStructure,ISize{
    int [] arr;
    int top;
    int fr,rr;
    MyArray1()
    {
        arr= new int[size];
        top =-1;
        rr=-1;
        fr=0;
    }
    public  void set(int pos,int d)
    {
        arr[pos]=d;
    }
    public int get(int pos)
    {
        return arr[pos];
    }
    public boolean stackEmpty()
    {
        return top==-1;
    }
    public  boolean stackFull()
    {
        return top==size-1;
    }
    public void push(int d)
    {
        if(stackFull())
            JOptionPane.showMessageDialog(null,"Overflow");
        else
            set(++top,d);
    }
    public void pop()
    {
        if(stackEmpty())
            JOptionPane.showMessageDialog(null,"Undeflow");
        else
            top--;
    }
    public void stackDisplay()
    {
        if(stackEmpty())
            JOptionPane.showMessageDialog(null,"Stack is Empty");
        else
        {
            String s= "Stack Data\n";
            for(int i=top;i>=0;i--)
            {
                s= s+" "+get(i);
            }
            JOptionPane.showMessageDialog(null,s);
        }
    }
    public void insert(int d)
    {
        if(queueFull())
            JOptionPane.showMessageDialog(null,"Que Full");
        else
            arr[++rr]=d;
    }
    public void remove() {
        if (queueEmpty())
            JOptionPane.showMessageDialog(null, "Queue Empty");
        else
            fr++;
    }
    public boolean queueEmpty(){
        return(rr<fr);
    }
    public boolean queueFull()
    {
        return (rr==size-1);
    }
    public void queueDisplay(){
        if(queueEmpty())
            JOptionPane.showMessageDialog(null,"Que is Empty");
        else
        {
            String s= "Que Data";
            for(int i=fr+1;i<=rr;i++)
            {
                s = s+" "+arr[i];
            }
            JOptionPane.showMessageDialog(null,s);
        }
    }
    public void queueMenu()
    {
        String []option={"Insert","Remove","Display","Exit"};
        int opt=0,d=0;
        while(true)
        {
            opt=JOptionPane.showOptionDialog(null,"Choose one","Stack",JOptionPane.YES_OPTION,JOptionPane.PLAIN_MESSAGE,null,option,0);
            if(opt==3)
                break;
            switch (opt)
            {
                case 0:
                    try {
                        d=Integer.parseInt(JOptionPane.showInputDialog(null,"Data"));
                    }
                    catch(Exception e){}
                    insert(d);
                    break;
                case 1:
                    remove();
                    break;
                case 2:
                    queueDisplay();
                    break;
            }
        }
    }
    public void stackMenu()
    {
        String []option={"Push","POp","Display","Exit"};
        int opt=0,d=0;
        while(true)
        {
            opt=JOptionPane.showOptionDialog(null,"Choose one","Stack",JOptionPane.YES_OPTION,JOptionPane.PLAIN_MESSAGE,null,option,0);
            if(opt==3)
                break;
            switch (opt)
            {
                case 0:
                    try {
                        d=Integer.parseInt(JOptionPane.showInputDialog(null,"Data"));
                    }
                    catch(Exception e){}
                    push(d);
                    break;
                case 1:
                    pop();
                    break;
                case 2:
                    stackDisplay();
                    break;
            }
        }
    }
    public void menu()
    {
        String []main={"Stack","Queue","Exit"};
        int ot=0;
        while (true)
        {
            ot=JOptionPane.showOptionDialog(null,"Choose one","DS",JOptionPane.YES_OPTION,JOptionPane.PLAIN_MESSAGE,null,main,0);

            if(ot==2)
                break;
            switch (ot)
            {
                case 0:
                    stackMenu();
                    break;
                case 1:
                    queueMenu();
                    break;

            }
        }
    }
}
class MyInterface3
{
    public static void main(String[]args)
    {
        MyArray1 m =new MyArray1();
        m.menu();
    }
}