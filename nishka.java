//Sum=1 + (1/2)2 + (1/3)3 +…
import java.util.Scanner;
class nishka
{
    public static void main(String args[])
    {
        int n,i;
        double sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n:");
        n=sc.nextInt();
        for(i=0;i<=n;i++)
        {
            sum+=(1+Math.pow((1/n),n));
        }
        System.out.println("sum="+sum);
        sc.close();
    }
}