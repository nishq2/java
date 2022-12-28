import java.io.*;
import java.util.Scanner;

class files extends Thread 
{
    Scanner sc=new Scanner(System.in);
    int n;
    String word;

    void operation() 
    {
        System.out.println("Enter no");
        n=sc.nextInt();
        System.out.println("Enter word");
        word=sc.nextLine();
    }

    void writeData() throws Exception
    {
        File f1= new File("D://w.txt");
        File f2=new File("C://Users//Nishka//OneDrive//Desktop//New folder//file2.txt");

        FileWriter fw=new FileWriter(f1);
        BufferedWriter bw=new BufferedWriter(fw);
            
        bw.write(s);
        bw.nextLine();
        bw.close();
        

        FileWriter fw2=new FilwWriter(f2);
        BufferedWriter bw2= new BufferedWriter(fw2);
       
        bw2.write(n);
        bw2.nextLine();
        bw2.close();
        
    }

    void readData() throws Exception
    {
        

        FileReader fr2=new FileReader(f2);
        BufferedReader br2=new BufferedReader(fr2);
        
        while((n=br.readLine())!=-1)
        {
            System.out.println(n);
        }
    }File f1= new File("D://w.txt");
        File f2=new File("C://Users//Nishka//OneDrive//Desktop//New folder//file2.txt");

        FileReader fr=new FileReader(f1);
        BufferedReader br=new BufferedReader(fr);
        while((s=br.readLine())!=null)
        {
            System.out.println(s);
        }

    void filterData() throws Exception
    {
        File f3=new File("C://Users//Nishka//OneDrive//Desktop//New folder//file3.txt");
        FileWriter fw3=new FileWriter(f3);
        BufferedWriter bw3=new BufferedWriter(fw3);
        File f1= new File("D://w.txt");
        File f2=new File("C://Users//Nishka//OneDrive//Desktop//New folder//file2.txt");
       
        FileReader fr=new FileReader(f1);
        BufferedReader br=new BufferedReader(fr);
        while((s=br.readLine())!=null)
        {
            //System.out.println(s);
            String s1[]=s.split(" ");
            for(int i=0;i<s1.length;i++)
            {
                for(int j=s1.length-1;j>=0;j--)
                {
                    if(s[i]==s[j])
                    {
                        bw3.write(n);
                        bw3.nextLine();
                        bw3.close();
                    }
                }
            }
            
        }

        
        FileReader fr2=new FileReader(f2);
        BufferedReader br2=new BufferedReader(fr2);
        
        while((n=br.readLine())!=-1)
        {
            //System.out.println(n);
            for(int i=0;i<=n;i++)
        {
            int flag=1;

            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag=0;
                    break;
                }
                
            
            else
            {
                flag=1;
            }
            
            }
            if(flag==1)
            {
                if(i!=1 || i!=0)
                {
                    bw3.write(n);
                    bw3.nextLine();
                    bw3.close();
                }
            }
        }
        }
    }
}

class myThread extends Thread
{
    files fi=new files();
    myThread(files fi)
    {
        this.fi=fi;
    }

    public void run()
    {
        Scanner sc=new Scanner(System.in);
        int x;
        do
        {
            System.out.println("1.word\n2.Number\n3.filter");
            x=sc.nextInt();
            switch(x)
            {
                case 1:
                fi.operation();
                fi.writeData();
                break;

                case 2:
                fi.readData();
                break;

                case 3:
                fi.filterData();
                break;

            }
        }while(x!=4);
    }
}

class A3 
{
    public static void main(String[] args) throws Exception
    {
        files fi=new files();
        myThread t1=new myThread(fi);
        myThread t2=new myThread(fi);
        t1.start();
        t1.join();
        t2.start();

        
        t2.join();
    }
}