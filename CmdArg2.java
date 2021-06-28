class CmdArg2
{
    public static void main(String[] args)
    {
        int i=0, n=args.length;
        if(n==0)
        {
            System.out.println("Invalid");
            return;
        }
        System.out.println("Data:");
        while(i<n)
        {
            System.out.println(args[i]);
            i++;
        }
    }
}