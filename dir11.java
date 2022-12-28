import java.io.*;
import java.util.Scanner;
// Write a program to store the information of employees of an organization using 
// object serialization and read the same using object de-serialization. Calculate the 
// total allowances and deductions and the net salary and display the same along 
// with writing this information again to the file.

class employee implements Serializable
{
    String name;
    int id;
    float sal;
    //float total;
    employee(String name, int id, float sal)
    {
        this.name=name;
        this.id=id;
        this.sal=sal;
    }
    public
    // void input()
    // {
    //     System.out.println("Enter name id and salary");
    //     name=sc.nextLine();
    //     id=sc.nextInt();
    //     sal=sc.nextFloat();
    //     total-=sal*0.6;
    //     System.out.println("Total "+total);
    // }

    void display()
    {
        System.out.println("Name:"+name+" ID:"+id+" salary:"+sal+" total:"+(sal*0.6));
    }

    public String toString()
    {
        return "Name:"+name+" ID:"+id+" salary:"+sal+" total:"+(sal*0.6);
    }
}

class dir11
{
    public static void main(String[] args) throws Exception
    {
        int i;
        employee e[]=new employee[3];
        e[0]=new employee("Rahul", 2109, 5000);
        e[1]=new employee("Ankit",2010,10000);
        e[2]=new employee("kunal",2020,15000);
        File f1=new File("C:/Users/Nishka/OneDrive/Desktop/New folder/file.txt.txt");
        employee e2[]=new employee[3];
        FileOutputStream fos=new FileOutputStream(f1);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        for(i=0;i<e.length;i++)
        {
            //e[i]=new employee();
            oos.writeObject(e[i]);
        }

        FileInputStream fis=new FileInputStream(f1);
        ObjectInputStream ois=new ObjectInputStream(fis);
        for(i=0;i<3;i++)
        {
            System.out.println(e2[i]=(employee)ois.readObject());
        }
        // for(i=0;i<3;i++)
        // {
        //     e[i].display();
        // }
    }
}