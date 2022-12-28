import java.io.*;
class dir4
{
    public static void main(String[] args) throws IOException
    {
        File f1=new File("C:/Users/Nishka/OneDrive/Desktop/New folder/file0.txt");
        File f2=new File("C:/Users/Nishka/OneDrive/Desktop/New folder/file3.txt");
        FileWriter fw= new FileWriter(f1);
        BufferedWriter bw=new BufferedWriter(fw);
        String s="Hello owdjs";
        bw.write(s);
        bw.close();
        FileReader fr=new FileReader(f1);
        BufferedReader br=new BufferedReader(fr);
        FileWriter fw2=new FileWriter(f2);
        BufferedWriter bw2=new BufferedWriter(fw2);

        //String s;
        while((s=br.readLine())!=null)
        {
            bw2.write(s);
            bw2.flush();
            System.out.println(s);
        }
        bw2.close();
    }
}