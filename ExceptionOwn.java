import java.util.Scanner;
class InvalidAgeException extends Exception
{
    public String toString()
    {
        return "Exception: UNDERAGE";
    }
}
class ExceptionOwn
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        try
        {
            System.out.println("Enter age");
            int n=sc.nextInt();
            if(n<18)
            {
                throw new InvalidAgeException(); 
            }
            else
            System.out.println("okay");
        }

        catch(InvalidAgeException e)
        {
            System.out.println(e);
        }
    }
}