// Write a program to store the information of employees of an organization using 
// object serialization and read the same using object de-serialization. Calculate the 
// total allowances and deductions and the net salary and display the same along 
// with writing this information again to the file
import java.io.*;
import java.util.Scanner;

class student implements Serializable
{
    String name;
    int n;
    int p; 
    char grade;
    int sum;
    public
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name, roll number");
        name=sc.nextLine();
        n=sc.nextInt();
    }
    void marks()
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[3];
        int i;
        for(i=0;i<3;i++)
        {
            System.out.println("Enter marks");
            a[i]=sc.nextInt();
        }
        for(i=0;i<3;i++)
        {
            sum+=a[i];
        }
        if((sum/3)>60)
        {
            grade='A';
        }
        else 
        {
            grade='F';
        }
        p=(sum/3);
        System.out.println(p);
    }
    void display()
    {
        System.out.println("Name "+name+" roll no: "+n+" percentage:"+p+" grade: "+grade);
    }

    public String  toString()
    {
        return "Name "+name+" roll no: "+n+" percent "+p+" grade: "+grade;
    }
}

class dir9
{
    public static void main(String[] args) throws Exception
    {

        int i;
        student s[]=new student[3];
        File f1=new File("C:/Users/Nishka/OneDrive/Desktop/New folder/file0.txt");
        FileOutputStream fo=new FileOutputStream(f1);
        ObjectOutputStream o1=new ObjectOutputStream(fo);
        for(i=0;i<3;i++)
        {
            s[i]=new student();
            s[i].input();
            s[i].marks();
            o1.writeObject(s[i]);
            //o1.writeObject(s[i]);
        }
        
        FileInputStream fi=new FileInputStream(f1);
        ObjectInputStream o2=new ObjectInputStream(fi);

        for(i=0;i<3;i++)
        {
           s[i]=(student)o2.readObject();
          // s[1]=(student)o2.readObject();
           //s[2]=(student)o2.readObject();
        }

        for(i=0;i<3;i++)
        {
            s[i].display();
        }
        File f2=new File("C:/Users/Nishka/OneDrive/Desktop/New folder/file3.txt");
        FileWriter fw1=new FileWriter(f2);
        BufferedWriter bw=new BufferedWriter(fw1);
        for(i=0;i<3;i++)
        {
            bw.write(s[i].toString());
        }
        bw.close();
    }
}