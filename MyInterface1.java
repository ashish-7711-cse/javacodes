import javax.swing.*;
interface  DataIO
{
    void setData();
    void Display();

}
class Student3 implements DataIO
{
    int no;
    String nm;
    Student3()
    {
        no=0;nm="";
    }
    Student3(int a, String b) {
        no = a;
        nm = b;
    }
    public void setData()
    {
        try
        {
            no=Integer.parseInt(JOptionPane.showInputDialog(null,"Roll No"));
        }
        catch(Exception e){}
        nm=JOptionPane.showInputDialog(null,"Name");
    }
    public String toString()
    {
        String a= "Roll NO:"+no+"\nName:"+nm;
        return a;
    }
    public void Display()
    {
        JOptionPane.showMessageDialog(null,toString());
    }
    int getNo()
    {
        return no;
    }
    String getNm()
    {
        return nm;
    }
}
class MyInterface1{
    public static void main(String[]args)
    {
        Student3 a= new Student3();
        a.setData();
        a.Display();
        System.out.println("Roll NO:"+a.getNo());
        System.out.println("Name:"+a.getNm());
        DataIO b=new Student3();
        b.setData();
        b.Display();
    }
}