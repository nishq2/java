//decimal to any base
import java.util.Scanner;
class Base
{
    public static void main(String args[])
    {
    int n,sum=0,b,p,rem;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a no");
    n=sc.nextInt();
    System.out.println("Enter the base for conversion:");
    b=sc.nextInt();
    p=1;
    while(n>0)
    {
        rem=n%b;
        n=n/b;
        sum=sum+rem*p;
        p=p*10;

    }
    System.out.println(sum);
    sc.close();
    
    }
}