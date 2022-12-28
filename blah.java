import java.io.*;

class blah
{
    public static void main(String[] args) throws Exception 
    {
        int i;
        File f1=new File("D://w.txt");
        File f2=new File("C://Users//Nishka//OneDrive//Desktop//New folder//student.txt");
        File f3=new File("C://Users//Nishka//OneDrive//Desktop//New folder//file3.txt");

        // FileWriter fw=new FileWriter(f1);
        // BufferedWriter bw=new BufferedWriter(fw);
        String s;
        // bw.write(s);
        // bw.close();

        FileReader fr=new FileReader(f1);
        BufferedReader br=new BufferedReader(fr);
        while((s=br.readLine())!=null)
        {
            String s1[]=s.split(" ");
            //char s1[]=s2.toCharArray();
            for(i=0;i<s1.length;i++)
            {
                for(int j=0;j<s1.length;j++)
                if(s1[i].charAt(j)=='a' || s1[i].charAt(j)=='e' || s1[i].charAt(j)=='i' || s1[i].charAt(j)=='o' || s1[i].charAt(j)=='u')
                {
                    FileWriter fw2=new FileWriter(f2);
                    BufferedWriter bw2=new BufferedWriter(fw2);
                    bw2.write(s1[i]);
                    bw2.close();
                }

                else
                {
                    FileWriter fw3=new FileWriter(f3);
                    BufferedWriter bw3=new BufferedWriter(fw3);
                    bw3.write(s1[i]);
                    bw3.close();
                }
            }
        }
    }
}