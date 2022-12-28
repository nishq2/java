import java.io.*;
import java.util.Scanner;

class FileOperation extends Thread
{
    Scanner sc=new Scanner(System.in);
    int n;
    String name;
    int mark;
    int roll;
    int a;
    int b;
    
    public  FileOperation()
    {
        System.out.println("Enter name");
        name=sc.nextLine();
        System.out.println("Enter roll no");
        roll=sc.nextInt();
        //a=Integer.parseInt(roll);
        System.out.println("Enter OOP mark");
        mark=sc.nextInt();
        //b=Integer.parseInt(mark);

    }
    public String toString()
    {
        return "Name: "+name+" roll no: "+roll+" Marks: "+mark+"\n";
    }

    public void writeData(FileOperation s[]) throws Exception
    {
        int i;
        File f1= new File("C:/Users/Nishka/OneDrive/Desktop/New folder/student.txt");
        FileWriter fw=new FileWriter(f1);
        BufferedWriter bw=new BufferedWriter(fw);
        //System.out.println("Enter no of students");
        n=s.length;
    
        for(i=0;i<n;i++)
        {   
                    
            bw.write(s[i].toString());
        }
       
        
        bw.close();
    }

    public void readData() throws Exception
    {
        File f1= new File("C:/Users/Nishka/OneDrive/Desktop/New folder/student.txt");
        FileReader fr=new FileReader(f1);
        BufferedReader br=new BufferedReader(fr);
        String s;
        while((s=br.readLine())!=null){
            String s1[]=s.split(" ");            
            if((Integer.parseInt(s1[6])>80)){
                System.out.println(s);
                
            }

        }
    }
}

class myThread extends Thread 
{
    FileOperation FileObj;
    myThread(FileOperation FileObj)
    {
        this.FileObj=FileObj;
    }
    public void run() 
    {
        Scanner sc=new Scanner(System.in);
        int r;
        FileOperation s[]= new FileOperation[3];
            for(int i=0;i<s.length;i++){
                s[i]=new FileOperation();
            }
        do
        {
            System.out.println("1.To write student details\n2.To read student details\n3.To exit");
            r=sc.nextInt();
            try
            {
            switch(r)
            {
                
                case 1:
                
                FileObj.writeData(s);
                break;

                case 2:
                FileObj.readData();
                break;
                
                
                default:
                System.out.println("Exiting");
                break;
            }
        }
        catch(Exception e)
        {

        }
    }while(r!=4);
        
    }
}
class newDir10
{
    public static void main(String[] args) throws Exception
    {
        FileOperation fi=new FileOperation();
        myThread t1=new myThread(fi);
        myThread t2=new myThread(fi);
        t1.start();
        t1.join();
        t2.start();

        
        t2.join();
    }
}