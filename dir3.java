import java.io.*;
import java.util.Scanner;
class dir3
{
    public static void main(String[] args) throws IOException
     {
        File f1=new File("C:/Users/Nishka/OneDrive/Desktop/New folder/file2.txt");
        // if(f1.mkdirs())
        // {
        //     System.out.println("Created");
        // }
        // else
        // System.out.println("no");
        FileWriter fj= new FileWriter(f1);
        BufferedWriter bw= new BufferedWriter(fj);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter");
        String s1= sc.nextLine();
        bw.write(s1);
        bw.close();
        FileReader fi= new FileReader(f1);
        BufferedReader br= new BufferedReader(fi);
        String s;
        while((s=br.readLine())!=null)
        {
            System.out.println(s);
        }
    }
}