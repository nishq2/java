//Write a Java program to print table of number entered by user .
import java.util.Scanner;
class table
{
    public static void main(String args[])
    {
        int n,i,m;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a no for multiplication table to be generated:");
        n=sc.nextInt();
        System.out.println("enter the no till where table is to be genrated:");
        m=sc.nextInt();
        for(i=1;i<=m;i++)
            //sum=n*i;
        System.out.println(n+"*"+i+"="+n*i);
        
    }
}