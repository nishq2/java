//Random access file
import java.io.*;
import java.util.Scanner;
class Random
{
    int id;
    String name;
    float sal;
    BufferedReader br;
    RandomAccessFile raf;
    Random()
    {
        try {
            br=new BufferedReader (new InputStreamReader(System.in));
            raf=new RandomAccessFile("file3.txt", "rw");
    
        } catch (Exception e) 
        {

        }
    }
    public void readData()
    {
        try
        {
            System.out.println("Enter emp ID");
            id=Integer.parseInt(br.readLine().trim());
            System.out.println("Enter name");
            name=br.readLine().trim();
            System.out.println("Enter salary");
            sal=Float.parseFloat(br.readLine().trim());
        }
        catch (Exception e)
        {

        }
    }

    public void writeData() 
    {
        try{
        String choice="yes";
        int size=(int)raf.length(); //gives the length of the file
        raf.seek(size); //gives the size of the name id and sal in bytes
        while(choice.equals("yes"))
        {
            readData();
            raf.writeInt(id);
            raf.writeUTF(name);
            raf.writeFloat(sal);
            System.out.println("more records? (yes/no)");
            choice=br.readLine().trim();
        }
    }
    catch(Exception e)
    {

    }
    }

    void readAll() 
    {
        try{
        raf.seek(0); //1 name, sal and id comes here then so on
        int size=(int)raf.length();
        while(raf.getFilePointer()<size)
        {
            int id=raf.readInt();
            String name=raf.readUTF();
            float sal=raf.readFloat();
            System.out.println("ID:"+id+" Name:"+name+" salary:"+sal);
        }
    }
    catch(Exception e)
    {

    }

    }
    public static void main(String[] args) throws IOException
    {
        Random r=new Random();
        r.writeData();
        r.readData();
        r.readAll();
    }
}