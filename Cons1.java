import java.io.*;
class Cons1
{
    public static void main(String[]args)
    {
        Console cons =null;
        String str= "";
        cons = System.console();
        if(cons==null)
        {
            System.out.println("Invalid Ref");
            return;
        }
        System.out.println("Message:");
        str= cons.readLine();
        System.out.println("Message:"+str);
    }
}