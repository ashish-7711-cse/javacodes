import java.awt.*;
import java.util.*;
import java.io.*;
class ArrayOfString1
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
                k[i]=k[i].toLowerCase();
            }
            catch(Exception e)
            {

            }
            i++;
        }
        Arrays.sort(k);

        System.out.println("City Name to search\n");
        String cnm="";
        try
        {
            cnm=br.readLine();

        }
        catch(Exception e)
        {

        }
        int pos=Arrays.binarySearch(k,cnm);
        if(pos<0)
        {
            System.out.println("Not Found");
        }
        else
        {
            System.out.println("Found");

        }

    }
}