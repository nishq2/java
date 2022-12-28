//recursion reverse a number
import java.util.Scanner;
class reverse
{
    static int sum=0;
    static void rev1(int n)
    {
        if(n==0)
        {
            return;
        }
        int rem= n%10;
        sum= sum*10+rem;
        rev1(n/10);
    }

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n=sc.nextInt();
        rev1(n);
        System.out.println(sum);
    }
}