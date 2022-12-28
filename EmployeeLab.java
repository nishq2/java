// Define a class Employee with data members: employee name, city, basic salary, 
// dearness allowance (DA%) and house rent (HRA%). Define getdata(), calculate(), 
// and display() functions. Calculate method should find the total salary and display 
// method should display it. 
//  Total = basic+basic*da/100+basic*hra/100; 

class EmployeeLab
{
    String empn;
    int sal;
    String city;
    int da; 
    int hra;
    int total;
    EmployeeLab(String n, int s, String c, int d, int h)
    {
        empn=n;
        sal=s;
        city=c;
        da=d;
        hra=h;
    }

    public

    void getdata()
    {
        EmployeeLab e1= new EmployeeLab("Rahul", 20000, "Delhi", 2000, 500);
        EmployeeLab e2= new EmployeeLab("ankit", 30000,"Mumbai", 3000, 1000);

    }

    void calculate()
    {
        //Total = basic+basic*da/100+basic*hra/100;
        int total=0;
        total= sal+ (sal*da)/100+ (sal*hra)/100;
        System.out.println(total);

    }

    void display()
    {
       
        System.out.println(" "+sal);
    }

    public static void main(String args[])
    {
        EmployeeLab e1= new EmployeeLab("Rahul", 20000, "Delhi", 2000, 500);
        EmployeeLab e2= new EmployeeLab("ankit", 30000,"Mumbai", 3000, 1000);

        e1.calculate();
        e1.display();
        e2.calculate();
        e2.display();
    }
}