import java.util.*;


public class deci2anybase {

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n,b;
        System.out.println("Enter no. =");
        n= scn.nextInt();
        System.out.println("Enter base =");
        b=scn.nextInt();
        int rv =0; // return value 
        int p=1;
        while(n>0)
        {
            int rem =n%b; //extracting the no.
            n=n/b;  // making the original no. smaller
            rv+=rem*p;
            p=p*10;
        }
        System.out.println(rv);
    }
}
