// Imagine a company that markets both hardware and software. Create an interface that
//will be implemented by two classes hardware and software, where hardware item
// holds the category of item and its original manufacturer and software holds type of
// software and operating system under which it works. Calculate the total sales for
// hardware as well as software item recorded for last 3months 

import java.util.Scanner;
interface Company
{
    static final Scanner sc=new Scanner(System.in);
    void sales();
}

class Hardware implements Company
{
    String category;
    String mfg;
    Hardware()
    {
        System.out.println("Enter the category:");
        category=sc.next();
        System.out.println("Enter the manufacturer:");
        mfg=sc.next();
    }

    public void sales()
    {
        System.out.println("The total units sold are: 100");
    }
}

class Software implements Company
{
    String type;
    String os;
    Software()
    {
        System.out.println("Enter the type:");
        type=sc.next();
        System.out.println("Enter the operating system");
        os=sc.next();
    }

   public void sales()
    {
        System.out.println("The total units sold are: 321");
    }
}

class Market 
{
    public static void main(String args[])
    {
        Hardware m=new Hardware();
        m.sales();
        Software s=new Software();
        s.sales();
    }
}
