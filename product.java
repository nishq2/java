// Write a java program, which reads an one dimensional array and display only those numbers in the array,
// which matches with the product of previous two numbers in the array.
import java.util.Scanner;
class product
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int i,n;
        int a[]=new int[20];
        
        System.out.println("Enter the size of the array");
        n=sc.nextInt();
        System.out.println("Enter the elements");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]*a[i+1]==a[i+2])
                System.out.print(a[i+2]+" ");

        }
        sc.close();

    }
}