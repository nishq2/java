import java.util.Scanner;
class additional1
{
    public static void main(String args[])
    {
        int a,b,c,d,e,f;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first no");
        a= sc.nextInt();
        System.out.println("Enter second no");
        b= sc.nextInt();
        c= (a<<2)+(b>>2);
        System.out.println("the value is:"+c);
        
        System.out.println("tha value is:"+(b>0));
        e=(a+b*100)/10;
        System.out.println("the value is:"+e);
        f=a&b;
        System.out.println("The value is:"+f);
        

    }
}