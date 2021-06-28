import java.awt.*;

class CmdArg3
{
    public static void main(String[] args)
    {
        int i, no;
        try
        {
            no=Integer.parseInt(args[0]);
        }
        catch (Exception e)
        {
            System.out.println("Invalid Data");
            return;
        }
        for(i=2;i<no;i++){
            if(no%i==0)
                break;
        }
        if(i==no)
            System.out.println("Not Prime");
        else
            System.out.println("Prime");
    }
}