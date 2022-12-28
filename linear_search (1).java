//Write a java program to search for a value in a 1 dimensional array using for each loop construct.
import java.util.Scanner;
class linear_search
{
    public static void main(String args[])
    {
        int ele,i,n,flag=0;
        int a[]= new int[100];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        n=sc.nextInt();
        
        System.out.println("enter elements");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("enter element to be searched");
        ele=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if (a[i]==ele)
            {
                flag=1;
                System.out.print("element found at:"+(i+1));
            }
            
        }
        
    }
} 