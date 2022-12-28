import java.io.*;
import java.util.Scanner;
//To count the number of characters, vowels, lines and words in a given file.
class dir6
{
    public static void main(String[] args) throws IOException
    {
        int c=0, v=0, w=1,l=1;
        File f1=new File("C:/Users/Nishka/OneDrive/Desktop/New folder/file0.txt");
        FileWriter fw=new FileWriter(f1);
        BufferedWriter bw=new BufferedWriter(fw);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter");
        String s=sc.nextLine();
        bw.write(s);
        bw.close();
        FileReader fr=new FileReader(f1);
        BufferedReader br=new BufferedReader(fr);
        while((s=br.readLine())!=null)
        {
            System.out.println(s);
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)==' ')
                {
                    w++;
                }
                
                if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
                {
                    v++;
                }
                if(s.charAt(i)!=' ')
                {
                    c++;
                }
                
                if(s.charAt(i)=='\n')
                {
                    l++;
                }
            }
        }

        System.out.println("Words "+w+" Lines "+l+"Vowels "+v+" char "+c+"Vowels "+v);
    }
}