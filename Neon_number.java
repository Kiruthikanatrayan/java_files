import java.util.*; 
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int temp = a;
        int n = a*a;
        int d,s=0;
        while(n>0)
        {
            d=n%10;
            s+=d;
            n/=10;
        }
        if(s==a)
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}
