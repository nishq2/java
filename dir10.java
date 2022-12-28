import java.io.*;
import java.util.Scanner;

class FileOperation
{
    String name;
    int mark;
    int roll;

    public
    synchronized void WriteStudentDetails()
    {
        // File f1=new File("C:/Users/Nishka/OneDrive/Desktop/New folder/student.txt");
        // FileWriter fw=new FileWriter(f1);
        // BufferedWriter bw= new BufferedWriter(fw);
        Scanner sc=new Scanner(System.in);
        int i;
        //int arr[]=new int[3];
        System.out.println("Enter name");
        name=sc.nextLine();
        System.out.println("Enter roll number");
        roll=sc.nextInt();
        System.out.println("Enter OOP marks");
        mark=sc.nextInt();
    }
    
    synchronized void ReadStudentDetails()
    {
        if(mark>80)
        {
            System.out.println("Name:"+name+" roll no:"+roll+" Marks: "+mark);
        }
    }
    public String toSTring()
    {
        return "Name:"+name+" roll no:"+roll+" Marks:"+mark;
    }
}

class myThread extends Thread 
{
    public
    FileOperation f1[];
    int n;
    myThread(FileOperation f1[], int n)
    {
        this.f1=f1;
        this.n=n;
    }

    public void run()
    {
        // System.out.println("Enter no of students");
        // int n=sc.nextInt();
        int i;
        FileOperation f[]=new FileOperation[n];
        for(i=0;i<n;i++)
        {
            f[i]=new FileOperation();
            f[i].input();
        }
    }
}

class dir10
{
    public static void main(String[] args) throws Exception
    {
        File f1= new File("C:/Users/Nishka/OneDrive/Desktop/New folder/student.txt");
        FileWriter fw=new FileWriter(f1);
        BufferedWriter bw=new BufferedWriter(fw);
        FileOperation fo=new FileOperation();
        Scanner sc=new Scanner(System.in);
        //int a[]=new int[n];
        //String s
        System.out.println("Enter no of students");
        int n=sc.nextInt();
        int i;
        for(i=0;i<n;i++)
        {
            bw.write(f[i].toString());
        }
        bw.close();
        FileReader fr=new FileReader(f1);
        BufferedReader br=new BufferedReader(fr);
        // for(i=0;i<n;i++)
        // {
        if(fo.mark>80)
        {
            while((f[i]=br.readLine())!=null)
            {
                System.out.println(f[i]);
            }
        }
        myThread t1=new myThread(n);
        myThread t2=new myThread(n);
        t1.start();
        t2.start();
        }
    }
//}