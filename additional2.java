import java.util.Scanner;
class additional2
{
    public static void main(String args[])
    {
    int a,b,c,d;
    Scanner sc= new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    d= (a>b)?(a>c?a:c):(b>c?b:c);
    System.out.println("The largest no is:" +d);
}
}