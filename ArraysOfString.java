import java.util.*;
import java.io.*;
class ArrayOfString
{
    public static void main(String[]args)
    {
        BufferedReader br= null;
        String []k= new String[5];
        try
        {
            br= new BufferedReader(new InputStreamReader(System.in));
        }
        catch(Exception e)
        {

        }
        int i=0;
        while(i<k.length)
        {
            System.out.println("City Name:");
            try
            {
                k[i]= br.readLine();
            }
            catch(Exception e)
            {

            }
            i++;
        }
        System.out.println("City Name\n"+ Arrays.toString(k));
    }
}