import java.io.*;
class Cons2
{
    public static void main(String[]args)
    {
        Console cons =null;
        char[]pwd = null;
        cons = System.console();
        if(cons==null)
        {
            System.out.println("Invalid Ref");
            return ;
        }
        pwd = cons.readPassword("[%s]","Enter Pasword");
        String s =new String(pwd);
        if(s.equals("123+Pa>"))
            System.out.println("Match");
        else
            System.out.println("Not Match");
    }
}