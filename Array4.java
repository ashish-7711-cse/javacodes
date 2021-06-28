import java.util.*;
class Array4
{
    public static void main(String[] args)
    {
        Scanner s= null;
        try {
            s =  new Scanner(System.in);
        }
        catch (Exception e){

        }
        int [] x = new int[10];
        int i=0,sv=0;
        while(i<x.length)
        {
            System.out.println("Data["+i+"]");
            try
            {
                x[i]=s.nextInt();
            }
            catch(Exception e)
            {
                continue;
            }
            i++;
        }
        Arrays.sort(x);
        System.out.println("Enter Value To search");
        try
        {
            sv=s.nextInt();
        }
        catch(Exception e)
        {
            return;
        }
        int pos =Arrays.binarySearch(x,sv);
        if(pos==-1)
            System.out.println("Not Found");
        else
            System.out.println("Found At Position "+pos);
    }
}