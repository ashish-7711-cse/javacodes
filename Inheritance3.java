import javax.swing.*;
class MyArray{
    final int size = 5;
    int []arr;
    MyArray()
    {
        arr= new int[size];
    }
    void set(int pos,int d)
    {
        arr[pos]=d;

    }
    int get(int pos)
    {
        return arr[pos];
    }
    public String toString()
    {
        return new String("\nData");
    }
}
class MyStack extends MyArray{
    int top;
    MyStack()
    {
        super();
        top=-1;
    }
    void push()
    {
        if(top == size-1)
            JOptionPane.showMessageDialog(null,"Overflow");
        else
        {
            int d=0;
            try{
                d=Integer.parseInt(JOptionPane.showInputDialog(null,"Data"));
            }
            catch (Exception e){}
            set(++top,d);
        }
    }
    void pop()
    {
        if(top == -1)
            JOptionPane.showMessageDialog(null,"Underflow");
        else
            top--;
    }
    public String toString()
    {
        String s="Stack";
        if(top==-1)
            s=s+" "+"is Empty";
        else{
            for(int i=top;i>=0;i--)
            {
                s=s+" "+get(i);
            }

        }
        return s;
    }
    void display()
    {
        JOptionPane.showMessageDialog(null,toString());
    }
}
class MyQueue extends MyArray{
    int rr,fr;
    MyQueue()
    {
        super();
        rr=-1;
        fr=0;
    }
    void remove()
    {
        if(rr<fr){
            JOptionPane.showMessageDialog(null,"Underflow");
        }
        else
            fr++;
    }
    public String toString()
    {
        String s= "Queue";
        if(rr<fr)
        {
            s=s+" "+"is Empty";
        }
        else
        {
            for(int i=fr;i<rr;i++)
            {
                s=s+ " "+get(i);
            }
        }
        return s;
    }
    void display()
    {
        JOptionPane.showMessageDialog(null,toString());
    }
    void insert()
    {
        if(rr==size-1)
        {
            JOptionPane.showMessageDialog(null,"Overflow");
        }
        else {
            int d = 0;
            try {
                d = Integer.parseInt(JOptionPane.showInputDialog(null, "Data"));
            } catch (Exception e) {}
            set(++rr,d);
        }
    }

}
class Inheritance3{
    public static void main(String[]args)
    {
        String[]option = { "Stack","Queue","Exit"};
        String[]soption={"Push","Pop","Display","Back"};
        String []qoption={"Insert","Remove","Diaplay","Back"};
        int opt=0;
        while(true)
        {
            opt=JOptionPane.showOptionDialog(null,"Choose one","DS",JOptionPane.YES_OPTION,JOptionPane.PLAIN_MESSAGE,null,option,0);
            if(opt==2)
                break;
            if(opt==0){
                MyStack s= new MyStack();
                while(true)
                {
                    opt=JOptionPane.showOptionDialog(null,"Choose one","DS",JOptionPane.YES_OPTION,JOptionPane.PLAIN_MESSAGE,null,soption,0);
                    if(opt==3)
                        break;
                    switch(opt)
                    {
                        case 0:
                            s.push();
                            break;
                        case 1:
                            s.pop();
                            break;
                        case 2:
                            s.display();
                            break;
                    }
                }
            }
            else {
                MyQueue q= new MyQueue();
                while(true)
                {
                    opt=JOptionPane.showOptionDialog(null,"Choose one","DS",JOptionPane.YES_OPTION,JOptionPane.PLAIN_MESSAGE,null,qoption,0);
                    if(opt==3)
                        break;
                    switch(opt)
                    {
                        case 0:
                            q.insert();
                            break;
                        case 1:
                            q.remove();
                            break;
                        case 2:
                            q.display();
                            break;
                    }
                }
            }
        }
    }
}