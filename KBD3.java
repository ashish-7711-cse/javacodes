import java.util.*;
import java.io.*;
class KBD3{
    public static void main(String[] args)
    {
        int arr[] = new int[10];
        BufferedReader br=null;
        try
        {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        catch(Exception e)
        {

        }
        int i=0;
        while(i<arr.length)
        {
            System.out.println("arr["+i+"]");
            try
            {
                arr[i]=Integer.parseInt(br.readLine());
            }
            catch(Exception e)
            {
                continue;
            }
            i++;
        }
        System.out.println("Array\n"+Arrays.toString(arr));
    }
}