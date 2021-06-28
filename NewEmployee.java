import javax.swing.*;
import java.util.*;
interface DataIo {
    void setData(int no);
    void display();
}
class Employee implements DataIo
{
    int eno;
    String enm;
    Employee(){
        eno=0;
        enm=new String();
    }
    Employee(int no,String nm){
        eno=no;
        enm=nm;
    }
    public void setData(int n){
        eno=n;
        enm=JOptionPane.showInputDialog(null,"Name");
    }
    public String toString(){
        String a="Employee No: "+eno+"\nEmployee Name: "+enm;
        return a;
    }
    public void display(){
        JOptionPane.showMessageDialog(null,this);
    }
}
class NewEmployee extends Employee implements DataIo,Comparator<NewEmployee>,Comparable<NewEmployee>{
    int esal;
    String emobno;
    String ecity;
    NewEmployee(){
        super();
        esal=0;
        emobno=new String();
        ecity=new String();
    }
    NewEmployee(int no,String nm,int sal,String mobn,String ecity){
        super(no,nm);
        esal=sal;
        emobno=mobn;
        this.ecity=ecity;
    }
    public String toString(){
        String a=super.toString()+"\nEmployee Salary: "+esal+"\nCity: "+ecity+"\nMobile NO: "+emobno;
        return a;
    }
    public void display(){
        JOptionPane.showMessageDialog(null,this);
    }
    public void setData(int n){
        super.setData(n);
        try{
            esal=Integer.parseInt(JOptionPane.showInputDialog(null,"Salary"));
        }catch (Exception e){}
        emobno=JOptionPane.showInputDialog(null,"Mobile No:");
        ecity=JOptionPane.showInputDialog(null,"City ");
    }
    public int compareTo(NewEmployee a) {

        return eno-a.eno;
    }
    public int compare(NewEmployee a,NewEmployee b){
        return a.enm.compareTo(b.enm);
    }
    public static Comparator<NewEmployee> cityNo=new Comparator<NewEmployee> (){
        public int compare(NewEmployee a,NewEmployee b)
        {
            int res=a.ecity.compareTo(b.ecity);
            if(res==0)
                return a.eno-b.eno;
            return res;
        }
    };
    public static Comparator<NewEmployee> city=new Comparator<NewEmployee>(){
        public int compare(NewEmployee a,NewEmployee b){
            return a.ecity.compareTo(b.ecity);
        }
    };
    public static Comparator<NewEmployee> mobno=new Comparator<NewEmployee>(){
        public int compare(NewEmployee a,NewEmployee b){
            return a.emobno.compareTo(b.emobno);
        }
    };
    public static Comparator<NewEmployee> sal=new Comparator<NewEmployee>(){
        public int compare(NewEmployee a,NewEmployee b){
            return a.esal-b.esal;
        }
    };
    public static void main(String[] args){
        LinkedList<NewEmployee> ls=new LinkedList<NewEmployee>();
        NewEmployee a=null;
        int no=0;
        while(true){
            try{
                no=Integer.parseInt(JOptionPane.showInputDialog(null,"Employee No:"));
            }catch(Exception e){}
            if(no==0)
                break;
            a=new NewEmployee();
            a.setData(no);
            ls.add(a);
        }
        int n=ls.size();
        NewEmployee []arr=new NewEmployee[n];
        arr=ls.toArray(arr);
        JOptionPane.showMessageDialog(null,Arrays.toString(arr));
        Arrays.sort(arr);//No wise
        JOptionPane.showMessageDialog(null,Arrays.toString(arr));
        Arrays.sort(arr,new NewEmployee());// namewise
        JOptionPane.showMessageDialog(null,Arrays.toString(arr));
        Arrays.sort(arr,NewEmployee.city);// city
        JOptionPane.showMessageDialog(null,Arrays.toString(arr));
        Arrays.sort(arr,NewEmployee.mobno);// mob no
        JOptionPane.showMessageDialog(null,Arrays.toString(arr));
        Arrays.sort(arr,NewEmployee.sal);//salary
        JOptionPane.showMessageDialog(null,Arrays.toString(arr));
        Arrays.sort(arr,NewEmployee.cityNo);//city no
        JOptionPane.showMessageDialog(null,Arrays.toString(arr));
    }
}
