import java.util.Scanner;
class intro {
    public static void main(String args[])
   {
    System.out.println("Hello world");
    int a=25, b=10;
    int sum= a+b;
    System.out.println(sum);
    Scanner sc= new Scanner(System.in);
    System.out.println("enter age");
    int age= sc.nextInt();
    if (age>18)
    {
        System.out.println("Adult");

    } else 
    {
        System.out.println("not an adult");
    }

   }
}