//Write a Java program to generate prime numbers between n and m.
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
class prime
{
    public static void main(String args[])
    {
        int n,m,i,j,flag=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter lower limit");
        n= sc.nextInt();
        System.out.println("enter upper limit");
        m=sc.nextInt();
        for(i=n;i<=m;i++)
        {
            flag=1;

            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag=0;
                    break;
                }
                
            
            else
            {
                flag=1;
            }
            
            }
            if(flag==1)
            {
                if(i!=1 || i!=0)
                {
                    System.out.println(+i);
                }
        }
        }
    }
}