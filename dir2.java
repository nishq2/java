import java.io.*;
class dir2
{
    public static void main(String args[]) throws IOException
    {
        File f1=new File("C:/Users/Nishka/OneDrive/Desktop/New folder/file.txt.txt");
        
        FileOutputStream fo= new FileOutputStream(f1,true);
    //     while(true)
    // {
        fo.write('c');
    //}
    FileInputStream fi= new FileInputStream(f1);
        int c;
        while((c=fi.read())!=-1)
        {
            System.out.print((char)c);
        }

}
}