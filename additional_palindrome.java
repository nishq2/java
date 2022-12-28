//palindrome
import java.util.Scanner;
class additional_palindrome
{
    public static void main(String args[])
    {
        int n,r,sum=0,temp;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a no\n");
        n=sc.nextInt();
        temp=n;
        while(n>0)
        {
            r=n%10;
            sum= (sum*10)+r;
            n=n/10;
        }
        if (temp==sum)
        {
            System.out.println("it is a palindrome");
        }
        else
        {
            System.out.println("not a palindrome");
        }
    }
}