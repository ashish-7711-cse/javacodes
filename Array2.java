import java.util.*;
class Array2{
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
        int max = arr[0],min = arr[0];
        String str= "Arrray\n";
        for(i=0;i<arr.length;i++)
        {
            str = str + " " +arr[ i ];
            if(arr[i]<min)
                min=arr[i];
            else {
                if (arr[i] > max)
                    max = arr[i];
            }
        }
        str = str + "\nMax:" + max + "\nMin:" + min;
        System.out.println(str);
    }
}