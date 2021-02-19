import java.util.*;


public class combinop {

    public static int fact(int x)
    {
        int rv=1;
        for(int i=1;i<=x;i++)
        {
            rv*=i;
        }
        return rv;
    }

    public static void display(int n,int r, int ncr)
    {
        System.out.println(n+"C"+r+"="+ncr);
    }
    public static void main(String[] args)
    {
        Scanner scn =new Scanner(System.in);
        System.out.println("\nEnter n and r =");
        int n =scn.nextInt();
        int r=scn.nextInt();

        int nfact=fact(n);
        int rfact=fact(r);
        int nmrfact=fact(n-r);

        int ncr=nfact/(rfact*nmrfact);

        display(n,r,ncr);
    }
}
