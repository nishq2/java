//Write a Java programs to print factorial of a given no. 
import java.util.Scanner;
class factorial
{
    public static void main(String args[])
    {
        int n,i,fact=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a no:");
        n= sc.nextInt();
        for(i=1;i<n;i++)
            fact=fact*i;
        System.out.println(+fact);
        
    }
}