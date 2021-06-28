import javax.swing.*;
abstract class Figure
{
    double a;
    double b;
    Figure()
    {
        a=0.0;
        b=0.0;
    }
    Figure(double p, double q)
    {
        a=p;
        b=q;
    }
    void area()
    {
        JOptionPane.showMessageDialog(null,"No method for Area");
    }
    public String toString()
    {
        return new String("W:"+a+"H:"+b);
    }
}
class FRectangle extends Figure
{
    FRectangle()
    {
        super();
    }
    FRectangle(double s, double t)
    {
        super(s,t);
    }
    void area()
    {
        JOptionPane.showMessageDialog(null,"Rect area :"+(a*b));
    }
}
class FTrangle extends FRectangle
{
    FTrangle()
    {
        super();
    }
    FTrangle(double s, double t)
    {
        super(s,t);
    }
    void area()
    {
        JOptionPane.showMessageDialog(null,"Trangale area :"+(a*b)/2);
    }
}
public class Abstract2 {
    public static void main(String[]args)
    {
        Figure ref =null;
        FRectangle a= new FRectangle(9.0,8.0);
        ref=a;
        ref.area();
        FTrangle b= new FTrangle(8.0,8.0);
        ref = b;
        ref.area();

    }
}