import java.util.*;
import java.io.*;
public class CodeChef{

    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int t=0;
        t=sc.nextInt();
        while(t>0)
        {
            int n=0,m=0;
            n= sc.nextInt();
            m= sc.nextInt();
            int i,j,k;
            int []arr= new int[n];
            int []brr= new int[m];
            for(i=0;i<n;i++)
            {
                int v = sc.nextInt();
                arr[i]=v;
            }
            for(i=0;i<m;i++)
            {
                int v=sc.nextInt();
                brr[i]=v;
            }

            ArrayList<Integer>s= new ArrayList<Integer>();
            for(int c=0;c<m;c++)
            {
                int ans = n;
                i=0;k=brr[c]; j=n;
                while(i<j)
                {
                    if(arr[i]==1)
                    {
                        ans = Math.min(k-i,ans);
                        i++;
                    }
                    if(arr[i]==1)
                    {
                        ans = Math.min(ans,j-k);
                        j--;
                    }

                }
                if(i==j)
                    s.add(-1);
                else
                    s.add(ans);
            }

            String solution = s.toString();
            System.out.println(solution);
            t--;
        }
    }
}