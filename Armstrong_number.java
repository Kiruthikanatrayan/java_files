import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long temp = n,d,s=0,c=0;
        
        while(n>0){
            n/=10;
            c++;
        }
        n= temp;
        while(n!=0)
        {
            d=n%10;
            s+=(int)Math.pow(d,c);
            n/=10;
        }
    
     if(s == temp)
        System.out.print("Yes");
        else
       System.out.print("No");

    }
    
}
