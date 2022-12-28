//no of words in a given file
import java.util.*;
import java.io.*;
class Files 
{
    public static void main(String[] args) throws Exception
    {
        File f1= new File("D:\\w.txt");
        // FileWriter fw=new FileWriter(f1);
        // BufferedWriter bw=new BufferedWriter(fw);
        // String s="blah blah blah";
        // bw.write(s);
        // bw.close();
        String s;
        FileReader fr= new FileReader(f1);
        BufferedReader br= new BufferedReader(fr);
        int count=1;
        while((s=br.readLine())!=null)
        {
            System.out.println(s);
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)==' ')
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}