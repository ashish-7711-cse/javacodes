import javax.swing.*;
class Student1
{
    int rno;
    String nm;
    Student1(){
        rno=0;
        nm= new String();
    }
    Student1(int a, String b){
        rno = a;
        nm = new String(b);
    }
    public String toString()
    {
        String a= "Roll no" + rno+"\nName:"+nm;
        return a;
    }
    void input()
    {
        try{
            rno= Integer.parseInt(JOptionPane.showInputDialog(null,"Roll N0"));
        }
        catch(Exception e)
        {}
        nm = JOptionPane.showInputDialog(null,"Name");
    }
    void input(int a){
        rno = a;
        nm =JOptionPane.showInputDialog(null,"Name");
    }
    void Display()
    {
        JOptionPane.showMessageDialog(null,toString());
    }
    void setNumber(int a)
    {
        rno =a;

    }
    void setName(String b)
    {
        nm=b;
    }
    int  getNumber()
    {
        return rno;
    }
    String getName(){
        return nm;
    }
    public static void main(String[] args)
    {
        Student1 a=null;  //a is reference variable of class type Student1
        a=new Student1();
        a.input();
        a.Display();
        Student1 b=a;
        b.Display();
        int no =b.getNumber();
        String nm = b.getName();
        JOptionPane.showMessageDialog(null,"Roll:"+no+"\nName:"+nm);
    }
}
