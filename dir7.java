import java.io.*;
import java.util.Scanner;

class dir7
{
    public static void main(String[] args) throws IOException
    {
        int count=0;
        File f1=new File("C:/Users/Nishka/OneDrive/Desktop/New folder/file0.txt");
        FileWriter fw=new FileWriter(f1);
        BufferedWriter bw=new BufferedWriter(fw);
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter string");
        String s="hello world hello i am hello why hello";
        String s2="hello";
        bw.write(s);
        // bw.write(s2);
        bw.close();
        FileReader fr=new FileReader(f1);
        BufferedReader br=new BufferedReader(fr);
        //int i;
        
        while((s=br.readLine())!=null)
        {
            String s1[]=s.split(" ");
            for(int i=0;i<s1.length;i++)
            {
                if(s1[i].equals(s2))
                {
                    count++;
                }
            }
        }
        System.out.println(count);
        }
    }
