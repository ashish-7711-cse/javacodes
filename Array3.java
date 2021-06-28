import java.util.*;
class Array3{
    public static void main(String[] args)
    {
        int []x=new int [10];
        Scanner s=null;
        try
        {
            s = new Scanner(System.in);

        }
        catch(Exception e)
        {

        }
        int i=0;
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
        String str= "Data\n" + Arrays.toString(x);
        System.out.println(str);
    }
}