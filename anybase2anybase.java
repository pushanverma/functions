import java.util.*;

public class anybase2anybase
{

    public static int anybase2decimal(int n ,int b)
    {
        int rv =0;
        int p=1;
        while(n>0)
        {
            int dig =n%10; // for extracting the last digit.
            n=n/10; // dividing by 10 to make it smaller
            rv+=dig*p;
            p=p*b;
        }
        return rv;
    }
    public static int decimal2anybase(int n ,int b)
    {

        int rv=0;
        int p=1;
        while(n>0)
        {
            int dig =n%b;
            n=n/b;
            rv+=dig*p;
            p=p*10;
        }
        return rv;
    }
    public static int  getvalue(int n ,int b1,int b2)
    {
        int dec=anybase2decimal(n,b1);
        int dn=decimal2anybase(dec,b2);
        return dn;
    }
    public static void main(String[] args)
    {
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter no.=");
        int n=scn.nextInt();
        System.out.println("Enter base=");
        int b1=scn.nextInt();
        System.out.println("Enter base in which u wanna convert=");
        int b2=scn.nextInt();

        int d=getvalue(n,b1,b2);
        System.out.println("No. is ->"+d);
    }
}