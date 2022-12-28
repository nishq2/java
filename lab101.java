import java.io.*;
import java.util.Scanner;
// Write a menu driven program to do the following: Write to a file, Read from the 
// file, Copy bytes from one file to another file

class dir8
{
    public
    String s;

    void read() throws IOException
    {
        File f1=new File("C:/Users/Nishka/OneDrive/Desktop/New folder/file0.txt");
        FileWriter fw=new FileWriter(f1);
        BufferedWriter bw=new BufferedWriter(fw);
        s="Hello world fuck you";
        bw.write(s);
        bw.close();
        //File f1=new File("C:/Users/Nishka/OneDrive/Desktop/New folder/file0.txt");
        FileReader fr=new FileReader(f1);
        BufferedReader br= new BufferedReader(fr);
        while((s=br.readLine())!=null)
        {
            System.out.print(s);
        }
    }

    void write() throws IOException
    {
        File f1=new File("C:/Users/Nishka/OneDrive/Desktop/New folder/file0.txt");
        FileWriter fw=new FileWriter(f1);
        BufferedWriter bw=new BufferedWriter(fw);
        s="Hello world fuck you";
        bw.write(s);
        bw.close();
    }

    void copy() throws IOException
    {
        File f1=new File("C:/Users/Nishka/OneDrive/Desktop/New folder/file0.txt");
        File f2=new File("C:/Users/Nishka/OneDrive/Desktop/New folder/file3.txt");
        FileWriter fw2=new FileWriter(f2);
        BufferedWriter bw2=new BufferedWriter(fw2);
        FileReader fr=new FileReader(f1);
        BufferedReader br= new BufferedReader(fr);
        while((s=br.readLine())!=null)
        {
            bw2.write(s);
            System.out.println(s);
        }
        bw2.close();
    }
}

class lab101
{
        public static void main(String[] args) throws IOException
    {
        int x;
        dir8 d=new dir8();
        System.out.println("1.write\n2.Read\n3.copy");
        Scanner sc=new Scanner(System.in);
        //x=sc.nextInt();
        do
        {
            System.out.println("1.write\n2.Read\n3.copy");
            x=sc.nextInt();
            switch(x)
            {
                case 1:
                d.write();
                break;

                case 2:
                d.read();
                break;

                case 3:
                d.copy();
                break;
            }
        }while(x!=4);
    }
}