// Write a Java program to count and display the number of characters, words, lines, and vowels in a String
import java.util.Scanner;
class total
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        int vowel=0, line=0, word=1;
        int i;
        for(i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            switch(c)
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                vowel++;
                break;

                case '\n':
                line++;
                break;

                case ' ':
                word++;
                break;
            }
        }
        System.out.println("v "+vowel+" line "+line+" words "+word);
    }
}