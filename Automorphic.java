//automorphic
import java.util.Scanner;
class Digit
{
    int n;
    public
    void compute()
    {
        Scanner sc=new Scanner(System.in);
        int r, sq=1;
        //int temp;
        System.out.println("Enter a number");
        n=sc.nextInt();
        sq=n*n;
        System.out.println("The square is: "+sq);
        //n=temp;
        if(n%10==sq%10)
            {
                System.out.println("Automorphic");
                n=n/10;
                sq=sq/10;
            }

        else
            System.out.println("Not automorphic");
    }
}

class Automorphic
{
    public static void main(String args[])
    {
        Digit d1= new Digit();
        d1.compute();
    }
}
