// decimal to any base 
import java.util.*;

public class decitoanybase {
    
    public static void main(String[] args)
    {
    Scanner scn = new Scanner(System.in);
        System.out.println("Enter any decimal no.=");
        int n =scn .nextInt();
        System.out.println("In which form u have to convert \n1.Binary \n2.Octal ");
        int  f=scn.nextInt();
        while(n>0)
        {
            int rem;
            int p=0;
        if(f==1)
        {
             rem=n%2;
             rem =rem*pow(10,p);
             System.out.print(rem);
            n=n/10;
            p++;

        }
        else if(f==2)
        {
             rem=n%8;
             rem =rem*pow(10,p);
             System.out.print(rem);
            n=n/10;
            p++;
        }

        }
    }
}
