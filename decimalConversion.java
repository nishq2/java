//any base to decimal
import java.util.Scanner;
class decimal
{
    public static void main(String args[])
    {
        int n,rem,sum=0,b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        n=sc.nextInt();
        System.out.println("Enter the base:");
        b=sc.nextInt();
        //p=1;
        while(n>0)
        {
            rem=n%10;
            n=n/10;
            sum=sum+rem*b;
        }
        System.out.println(sum);
        sc.close();
    }
}