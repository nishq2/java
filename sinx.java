//sin x series
import java.util.Scanner;
class sinx
{
    public static void main(String args[])
    {
        int n,i;
        double x,sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of x:");
        x= sc.nextDouble();
        System.out.println("Enter the value for n:");
        n=sc.nextInt();
        for(i=0;i<=n;i++)
        {
            sum+=((Math.pow(-1,i)*Math.pow(x,2*i+1))/fact(2*i+1));
        }
        System.out.println("sin(x)="+sum);
        sc.close();
    }
    static double fact(int n)
    {
        double fact=1;
        int i;
        for(i=1;i<=n;i++)
        {
            fact=fact*1;
        }
        return fact;
    }
}