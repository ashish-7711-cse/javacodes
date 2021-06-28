import java.io.*;
class KBD2
{
    public static void main(String []args)
    {
        InputStreamReader isr = null;
        BufferedReader br = null;
        try
        {
            isr = new InputStreamReader(System.in);
            br = new BufferedReader(isr);
        }
        catch(Exception e)
        {

        }
        String str = "";
        System.out.println("Enter NO");
        try
        {
            str=br.readLine();
        }
        catch(Exception e)
        {

        }
        int no=0, i=0;
        try
        {
            no=Integer.parseInt(str);
        }
        catch(Exception e)
        {
            System.out.println("Invalid Data:");
            return;
        }
        str = "\nTable\n";
        while(i<=10)
        {
            str = str + " "+(no*i);
            i++;
        }
        System.out.println(str);
    }
}