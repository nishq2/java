import java.io.*;

class Student implements Serializable
{
    String name;
    int n;
    // Student()
    // {
    //     name=null;
    //     n=0;
    //}
    Student(String name, int n)
    {
        this.name=name;
        this.n=n;
    }

    public void display()
        {
            System.out.println("Name "+name+" number "+n);
        }
    
}
class dir5
{
    public static void main(String[] args) throws Exception
    {
        File f1=new File("C:/Users/Nishka/OneDrive/Desktop/New folder/file0.txt");
        Student s1=new Student("hello", 57);
        Student s2=new Student("woeld", 98);
        FileOutputStream fo= new FileOutputStream(f1);
        ObjectOutputStream o1= new ObjectOutputStream(fo);
        o1.writeObject(s1);
        o1.writeObject(s2);
        FileInputStream fi=new FileInputStream(f1);
        ObjectInputStream o2=new ObjectInputStream(fi);
        Student s3=(Student)o2.readObject();
        Student s4=(Student)o2.readObject();
        s4.display();
       s3.display();
      // o1.close();
       //o2.close();
    }
}
