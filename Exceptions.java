import java.util.Scanner;
class Exceptions
{
   String name;
   String marks;
   String roll;
   public
   void input()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter name, roll number and marks");
       name=sc.nextLine();
       marks=sc.next();
       roll=sc.next();
       int a= Integer.parseInt(marks);
       int b=Integer.parseInt(roll);
   }
   
   void display()
   {
       System.out.println("name: "+name+" roll no:"+roll+" marks:"+marks);
   }
}

class lol
{
    public static void main(String args[])
    {
        try
        {
        Exceptions p[]=new Exceptions[3];
        for(int i=0;i<3;i++)
        {
            p[i]=new Exceptions();
            p[i].input();
        }
        for(int i=0;i<3;i++)
        {
            p[i].display();
        }
        }
        
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
    }
}