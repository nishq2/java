//A study has shown that playing a musical instrument helps in increasing one's IQ by 7 points. 
//Chef knows he can't beat Einstein in physics, but he wants to try to beat him in an IQ competition.
//You know that Einstein had an IQ of 170, and Chef currently has an IQ of XX.
//Determine if, after learning to play how many musical instrument, Chef's IQ will become strictly greater than Einstein's.
//Print "Yes" if it is possible for Chef to beat Einstein, else print "No" (without quotes).
import java.util.Scanner
class IQ
{
    public static void main(String args[])
    {
        System.out.println("Enter IQ");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println("total instruments to learn");
        int n= sc.nextInt();
        int c=0;
        c= a+(n*7);
        if (c>170)
        {
            System.out.println("can beat Einstein");
        }
        else if (c==170)
        {
            System.out.println("equal to ein");

        }
        else 
        {
            System.out.println("cant beat ein");
        }

    }
}
