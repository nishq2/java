import java.util.Scanner;
class leap_year
{
    public static void main(String args[])
    {
        int a,r,j,k;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a year");
        a= sc.nextInt();
        r=a%4;
        j=a%100;
        k=a%400;
        if (r==0&&k!=0&&j!=0)
        {
            System.out.println("it is a leap year");
        }
        else 
        {
            System.out.println("it is a common year");
        }
        
    }
}