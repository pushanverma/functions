import java.util.*;

public class permutation
{

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("\nEnter n and r =");
        int n=scn.nextInt();
        int r=scn.nextInt(); 

        int nfact=1;
        int nmrfact=1;

        for(int i=1;i<=n;i++)
        {
            nfact*=i;
        }

        for(int i=1;i<=(n-r);i++)
        {
            nmrfact*=i;
        }

        int npr= nfact/nmrfact;
        System.out.println(n+"P"+r+"="+npr);
    }
}