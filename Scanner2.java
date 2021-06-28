import java.util.*;
class Scanner2
{
    public static void main(String[] args)
    {
        String str ="Java Is Truely Object Oriented Programming Language.";
        Scanner s= null;
        try
        {
            s= new Scanner(str);
        }
        catch (Exception e)
        {

        }
        while(s.hasNext())
        {
            System.out.println(s.next());
        }
    }

}