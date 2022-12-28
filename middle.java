import java.util.Scanner;
class middle
{
    public static void main(String args[])
    {
        int n,i,j,r;
        int s=0, p=0,q=0;
        Scanner sc=new Scanner(System.in);
        int a[]= new int[3];
        System.out.println("Enter a 3 digit number");
        n=sc.nextInt();
        int temp=n;
        while(n>0)
        {
            r=n%10;
            s=r;
            n=n/10;
            r=n%10;
            p=r;
            n=n/10;
            r=n%10;
            q=r;
            n=n/10;
            for(i=0;i<3;i++)
            {
                a[0]=s;
                a[1]=p;
                a[2]=q;
            }
            int b[]= new int[10];
            if(p==s+q)
            {
               
                for(i=1;i<=p;i++)
                {
                        if(p%i==0)
                        {
                            System.out.println(b[i]);
                        }
                }
            }

            else
            {
                System.out.println("The sum of the remaining two digits is: "+(s+q));
            }
        }
        sc.close();
    }
}