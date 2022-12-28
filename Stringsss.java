// Write a menu driven program to do the following:
// a. To check whether a string is palindrome or not
// b. Write the string in an alphabetical order
// c. Reverse the string
// d. Concatenate the original string and the reversed string
import java.util.Scanner;
class Stringsss
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s1=sc.nextLine();
        String s2= ((new StringBuffer(s1)).reverse()).toString();
        if(s1.equals(s2))
        {
            System.out.println("Palin");
        }
        else
        System.out.println("No");

        char c[]=s1.toCharArray();
        Arrays.sort(c);
        
        System.out.println(new String(c));
    }
}