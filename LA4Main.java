import java.io.*;
import java.util.*;

interface Paintable
{
    void paint();
}
abstract class Car implements Paintable
{
    abstract void method1();
    abstract void method2();
    public void paint()
    {
        System.out.println("Pianting");
    }
}
class Toyota extends Car
{
    void method1()
    {
        System.out.println("This is Method one");
    }
    void method2()
    {
        System.out.println("This is method two");
    }
    public void paint()
    {
        System.out.println("Color of toyotais white");
    }
}
class Chavery extends Car
{
    void method1()
    {
        System.out.println("This is Method one of Chevery");
    }
    void method2()
    {
        System.out.println("This is method two chevery");
    }
    public void paint()
    {
        System.out.println("Color of chevry is white");
    }
}
class House implements Paintable
{
    public void paint()
    {
        System.out.println("Color of House white");
    }
}
public class LA4Main
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int opt;
        House h =new House();
        while(true)
        {
            System.out.println("1:Car methods\n2:House");
            opt = sc.nextInt();
            if(opt>2)
                break;
            switch(opt)
            {
                case 1:
                    while(true) {
                        System.out.println("Enter 1 for toyota 2 for Chevry");
                        ;
                        int c = sc.nextInt();
                        if (c > 2)
                            break;
                        switch (c) {
                            case 1:
                                Toyota a = new Toyota();
                                a.paint();
                                break;
                            case 2:
                                Chavery b = new Chavery();
                                b.paint();
                                break;
                        }
                    }
                    break;
                case 2:
                    h.paint();
                    break;
            }
        }
    }
}
									