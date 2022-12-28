import java.util.Scanner;
class exception1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        try
        {
        System.out.println("Enter string");
        String s=sc.next();
        int a= Integer.parseInt(s);
        System.out.println(a);
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
    }
}