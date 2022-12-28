import java.util.Scanner;
class calculator
{
    public static void main(String args[])
    {
        int a,b,sum,diff,pro,quo;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers");
        a= sc.nextInt();
        b= sc.nextInt();
        sum= a+b;
        System.out.println("sum is: "+sum);
        diff=a-b;
        System.out.println("difference is:"+diff);
        pro=a*b;
        System.out.println("product is:"+pro);
        quo=a/b;
        System.out.println("quotient is:"+quo);
        
    }
}