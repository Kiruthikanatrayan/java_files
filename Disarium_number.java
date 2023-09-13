/*A number is said to be the Disarium number when the sum of its digits raised to the power of their 
respective positions is equal to the number itself. Some of the other examples of Disarium numbers are 89, 135,
518 etc.
i/p 175 o/p yes */
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n;
        int a = (int)Math.log10(n)+1;
        int sum=0,d;
        while(n>0)
        { 
            d=n%10;
            sum+=Math.pow(d,a);
            a--;
            n/=10;

        }
        if(temp==sum)
        {
            System.out.print("Yes");
        }
        else
        System.out.print("No");
    }
}
