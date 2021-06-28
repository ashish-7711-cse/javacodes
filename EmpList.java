import javax.swing.*;
import java.util.*;
class Employee
{
    int eno;
    String enm;
    int esalary;
    boolean estate;
    Employee()
    {
        eno =0;
        enm ="";
        esalary =0;
        estate = true;
    }
    public String toString()
    {
        String a="\nEmployee no"+eno+"\nEmployee name:"+enm+"\nEmployee Salary"+esalary+"\nEmployee state"+estate;
        return a;
    }
    boolean getState()
    {
        return  estate;
    }
    int getNumber()
    {
        return eno;
    }
    int getEsalary()
    {
        return  esalary;
    }
    String getName()
    {
        return enm;
    }
    void setEsalary(int amt)
    {
        esalary=amt;
    }
    void deletRecord()
    {
        estate =false;
    }
    void display()
    {
        JOptionPane.showMessageDialog(null,toString());
    }
    void setData(int no) {
        eno = no;
        enm = JOptionPane.showInputDialog(null, "Employee name");
        try
        {
            esalary =Integer.parseInt(JOptionPane.showInputDialog(null,"Employee salary"));
        }
        catch(Exception e){}
        estate =true;
    }
}
public class EmpList
{
    LinkedList<Employee>ls;
    Employee ref;
    EmpList()
    {
        ref =null;
        ls =new LinkedList<Employee>();
    }
    boolean search(int no)
    {
        int i=0,n=ls.size();
        while(i<n)
        {
            ref =ls.get(i);
            if(ref.getNumber()==no)
            {
                break;
            }
            i++;
        }
        if(i==n)
        {
            ref = null;
            return false;
        }
        else
            return true;
    }
    void add()
    {
        int no=0;
        try {
            no =Integer.parseInt(JOptionPane.showInputDialog(null,"Employee No:"));
        }
        catch(Exception e)
        {
            return ;
        }
        boolean result = search(no);
        if(result==true){
            JOptionPane.showMessageDialog(null,"Record Exits");
            return;
        }
        ref =new Employee();
        ref.setData(no);
        ls.add(ref);
    }
    void mod()
    {
        int no=0;
        try {
            no =Integer.parseInt(JOptionPane.showInputDialog(null,"Employee No:"));
        }
        catch(Exception e)
        {
            return ;
        }
        boolean result = search(no);
        if(result==false || ref.getState()==false){
            JOptionPane.showMessageDialog(null,"Record Not Exits");
            return;
        }
        ref.setData(no);
    }
    void del()
    {
        int no=0;
        try {
            no =Integer.parseInt(JOptionPane.showInputDialog(null,"Employee No:"));
        }
        catch(Exception e)
        {
            return ;
        }
        boolean result = search(no);
        if(result==false || ref.getState()==false){
            JOptionPane.showMessageDialog(null,"Record Not Exits");
            return;
        }
        ref.deletRecord();
    }
    //function to dispaly employee record
    void display()
    {
        int i=0,n=ls.size();
        while(i<n)
        {
            ref=ls.get(i);
            ref.display();
            i++;
        }

    }
    void menu()
    {
        String [] option ={"Add","Mod","Del","Search","Dispaly","Exit"};
        int opt=0,no=0;
        while(true)
        {
            JOptionPane.showOptionDialog(null,"Choose Option","Employee List",JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE,null,option,0);
            if(opt==5)
                break;
            switch (opt)
            {
                case 0:
                    add();
                    break;
                case 1:
                    mod();
                    break;
                case 2:
                    del();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    try
                    {
                        no = Integer.parseInt(JOptionPane.showInputDialog(null,"No"));

                    }
                    catch(Exception e)
                    {}
                    boolean res =search(no);
                    if(res== false)
                        JOptionPane.showMessageDialog(null,"Record Exist");
                    else
                        ref.display();
            }
        }
    }
    public static void main(String[]args)
    {
        EmpList e= new EmpList();
        e.menu();
    }
}