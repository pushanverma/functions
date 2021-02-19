import java.util.*;

// more optimised way of solving permutaion (using single function )
public class permuop {

    public static void display(int n , int r, int npr)
    {
        System.out.println(n+"P"+r+"="+npr);
    }
    
    public static int fact(int x)
    {
        int rv=1;
        for(int i=1;i<=x;i++)
        {
            rv*=i;
            
        }
        return rv;
    }
    public static void main(String[] args)
    {

        Scanner scn = new Scanner(System.in);
        System.out.println("\nEnter n and r=");
        int n=scn.nextInt();
        int r=scn.nextInt();

        int nfact =fact(n);
        int nmrfact =fact(n-r);

        int npr=nfact/nmrfact;
        display(n,r,npr);

    }
}
