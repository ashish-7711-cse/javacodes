import java.util.*;
class Array1{
    public static void main(String[] args)
    {
        Scanner s= null;
        int []arr =new int[5];
        try
        {
            s = new Scanner(System.in);

        }
        catch(Exception e)
        {

        }
        int i=0;
        while(i<arr.length)
        {
            System.out.println("Arr["+i+"]");
            try
            {
                arr[i]= s.nextInt();
            }
            catch(Exception e)
            {
               continue;
            }
            i++;
        }
        int tot=0;
        String str= "Arrray\n";
        for(i=0;i<arr.length;i++)
        {
            str = str + " " +arr[ i ];
            tot+= arr[i];
        }
        str= str + "\nTotal:" + tot + "\nAverage:" + (tot/arr.length);
        System.out.println(str);
    }
}