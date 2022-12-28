import java.io.*;

import javax.lang.model.util.ElementScanner14;

class directory1
{
    public static void main(String args[]) throws IOException
    {
        File f=new File("D:\\one.txt");
        if(f.createNewFile());
        {
            System.out.println("created");
        }
            //System.out.println("Exists");
        
        System.out.println(f.getAbsolutePath());
        System.out.println(f.canWrite());
        System.out.println(f.canRead());
        System.out.println(f.length());

        FileWriter fw= new FileWriter("D:\\one.txt");
        fw.write("This is some useless info. 1234");
        fw.close();
        FileReader r= new FileReader("D:\\one.txt");
        //delete file
        //File d=new File("D:\\one.txt");
        try
        {
            int i;
            while((i=r.read())!=-1)
            {
                System.out.print((char)i);
            }
        }
        catch(Exception e)
        {

        }

        finally
        {
            r.close();
        }
        if(f.delete())
        {
            System.out.println(f.getName()+" Deleted");
        }
        else
        System.out.println("no");
    }
}