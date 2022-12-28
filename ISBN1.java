//isbn
import java.util.Scanner;
class Digit
{
    int n;
    public
    void compute()
    {
        int temp,r,count=0;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        temp=n;
        while(temp>0)
        {
         temp=temp/10;
         count++;
        }
        if(count!=10)
        System.out.println("Number of digits should be 10");
        else
            {
                //temp=n;
                
                for(int i=1;i<=10;i++)
                {
                    r=n%10;
                    sum+=r*i;
                    n=n/10;
                }
                System.out.println("The full ISBN number is: "+sum);
                
                if(sum%11==0)
                {
                    System.out.println("The number is ISBN");
                }
                else
                System.out.println("Illegal ISBN");
            }

       }
    }


class ISBN1
{
    public static void main(String args[])
    {
        Digit d1= new Digit();
        d1.compute();

    }
}