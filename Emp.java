//same as employeeLab but user defined
import java.util.Scanner;
class Emp
{
    String n;
    int sal; 
    String city;
    float da;
    float hra;
    // Emp(String name, int s, String c, float d, float h)
    // {
    //     n=name;
    //     sal=s;
    //     city=c;
    //     da=d;
    //     hra=h;
    // }
    public
    void insert() 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter name:");
        n=sc.nextLine();
        System.out.println("Enter salary:");
        sal=sc.nextInt();
        System.out.println("Enter city");
        city=sc.nextLine();
        System.out.println("Enter da and hra");
        da=sc.nextFloat();
        hra=sc.nextFloat();       
    }

    void calculate()
    {
        float total=0;
        //Total = basic+basic*da/100+basic*hra/100
        total= sal+ (sal*da)/100 + (sal*hra)/100;
        System.out.println("the total is:" +total);
    }

    void display()
    {
        System.out.println("name: "+n+" salary: "+sal+" city: "+city+"da: "+da+" hra: "+hra);
    }
}
class prg3
{

public static void main(String args[])
{
    Emp e1= new Emp();
    e1.insert();
    e1.display();
    e1.calculate();
}
}

 