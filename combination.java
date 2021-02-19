import java.util.*;

public class combination {

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("\nEnter n and r =");
        int n=scn.nextInt();
        int r=scn.nextInt();

        int nfact=1;
        int nmrfact=1;
        int rfact=1;

        for(int i=1;i<=n;i++)
        {
                nfact*=i;
        }

        for(int i=1;i<=n-r;i++)
        {
            nmrfact*=i;
        }

        for(int i=1;i<=r;i++)
        {
            rfact*=i;
        }

        int ncr=nfact/(rfact*nmrfact);
        System.out.println(n+"C"+r+"="+ncr);
    }
}
