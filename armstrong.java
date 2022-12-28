//Write a program to compute whether a no . is an Armstrong number or not.Use any of the iteration statements.
import java.util.Scanner;
class Armstrong
{
    public static void main(String args[])
    {
        int n,sum=0,temp,r;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number:");
        n= sc.nextInt();
        temp=n;
        while(n>0)
        {
            r=n%10;
            sum=sum+r*r*r;
            n=n/10;
        }
        if (sum==temp)
        {
            System.out.println("The number is an armstrong number");
        }
        else
        {
            System.out.println("not an armstrong number");
        }
    }
}