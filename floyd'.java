//Write a Java program to display the numbers in the following format 
// a. using nested for loop  b. using for-each loop.
// 1
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5

import java.util.Scanner;
class display
{
    public static void main(String args[])
    { 
        int n,i,j;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number of levels:");
        n=sc.nextInt();
        for(i=1;i<=n;i++) //for rows
        {
            for(j=1;j<=i;j++) //for columns
            {
                System.out.print(i+ " ");
            }
            System.out.println(" ");
        }

    }
}