import java.util.*;

public class anybasesub {
    
public static int subtract(int b,int n1,int n2)
{

        int rv=0;
        int cf=0; // it is named carryforward but it is BORROW. 
        int p=1;

        while(n2>0)
        {
            int d1=n1%10;
            int d2=n2%10;
            n1=n1/10;
            n2=n2/10;

            int d=0;
            d2=d2+cf;

            if(d2>=d1)
            {
                cf=0;
                d=d2-d1;
            }
            else
            {
                cf=-1;
                d=d2+b-d1;
            }
            rv+=d*p;
            p=p*10;
        }
        return rv;
}
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int b,n1,n2;

        // remember n2 should be large .
        System.out.println("Enter base =");
        b=scn.nextInt();
        System.out.println("Enter Numbers =");
        n1=scn.nextInt();
        n2=scn.nextInt();

        int ans =subtract(b,n1,n2);
        System.out.println(ans);
    }
}
