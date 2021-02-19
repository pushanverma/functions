import java.util.*;

public class anybaseadd {

    public static int add(int b,int n1,int n2)
    {
        int rv=0; // return value 
        int cf=0;  // carry forward
        int p=1;  //power
        while(n1>0 || n2>0 || cf>0 )
        {
            int dig1=n1%10;
            int dig2=n2%10;
            n1=n1/10;
            n2=n2/10;
            int sum =dig1+dig2+cf;
            cf=sum/b;        // cf should be mentioned 1st after sum.
            sum=sum%b; 
            
            
            rv+=sum*p;
            p=p*10;
        }
        return rv;
    }
    public static void main(String[] args)
    {
        Scanner scn =new Scanner(System.in);
        int b,n1,n2;
        System.out.println("Enter base =");
        b=scn.nextInt();
        System.out.println("Enter two no.s");
        n1 =scn.nextInt();
        n2 =scn.nextInt();

        int res=add(b,n1,n2);
        System.out.println(n1+" + "+n2+" = "+res);
    }
}
