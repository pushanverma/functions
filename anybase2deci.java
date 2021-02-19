import java.util.*;

public class anybase2deci {
    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n,b;
        System.out.println("Enter base of no.=");
        b=scn.nextInt();
        System.out.println("Enter any no.= ");
        n=scn.nextInt();
        int rv =0;
        int p=1;
        while(n>0)
        {
            int dig =n%10; //extracting the last digit 
            n=n/10;
            
            rv+=dig*p;
            p=p*b;

        }
        System.out.println(rv);

    }
}
