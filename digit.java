// this program is about counting the no. of digit which has been entered.


import java.util.*;

public class digit
{

    public static void main(String[] args)
    {
        int count=0;
        Scanner scn = new Scanner(System.in);
        System.out.println("\nEnter any no. =");
        int n =scn.nextInt();
        System.out.println("enter which no. you want to check =");
        int d=scn.nextInt();
        while(n>0)
        { 
            int rem =n %10; // to 
            n=n/10;  // to decrease the length of number 
            if(rem %d==0)
            {
                count++;
            }

        }
            System.out.println("No. of "+d+"appered is ="+count);
    }
}