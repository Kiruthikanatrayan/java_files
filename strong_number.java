import java.util.*;
public class Main
{
   public static void main(String[] args) {
   int fact,lastdig,total=0,temp;
   Scanner sc = new Scanner(System.in);
   System.out.print("\nEnter the number : " );
   int n = sc.nextInt();
   temp = n;
  while(n != 0)
{
   int i = 1;
   fact= 1;
   lastdig = n % 10;
   while(i <= lastdig)
  {
    fact = fact * i;
    i++;
  }
   total = total + fact;
   n = n / 10;
 }
if(total == temp)
System.out.println(temp + " is a strong number\n");
else
System.out.println(temp + " is not a strong number\n");
System.out.println();
}
}
