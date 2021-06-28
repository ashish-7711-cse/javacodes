import java.util.*;
import java.io.*;
class Matrix1
{
    public static void main(String[]args)
    {
        BufferedReader br =null;
        int [][]a = new int[3][];
        int i=0,j;
        while(i<3)
        {
            a[i]=new int[3];
            i++;
        }
        try
        {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        catch(Exception e)
        {

        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.println("Arr["+i+"]"+"["+j+"]");
                try
                {
                    a[i][j]= Integer.parseInt(br.readLine());
                }
                catch(Exception e)
                {

                }
            }
        }
        String str = "Matrix\n:";
        for(i=0;i<3;i++)
        {
            str = str + Arrays.toString(a[i]);
        }
        System.out.println(str);

    }
}