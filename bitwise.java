import java.util.Scanner;
class bitwise
{
    public static void main(String args[])
    {
        int a,pro,quo;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        a=sc.nextInt();
        quo= a>>1;
        pro=a<<1;
        System.out.println("the product is:"+pro);
        System.out.println("the quotient is:"+quo);
    }
}