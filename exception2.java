import java.util.Scanner;
class exception2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        try
        {
        System.out.println("Enter a number");
        int n=sc.nextInt();
        if(n<0)
        {
            System.out.println(Math.sqrt(n*(-1))+"i");
        }
        else
        {
            System.out.println(Math.sqrt(n));
        }
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}