import java.util.Scanner;

class Account
{
    static int ac=2109;
    int temp;
    String name;
    String type;
    double bal;
    public
    Scanner sc=new Scanner(System.in);
    Account()
    {
        System.out.println("Enter name:");
        name=sc.nextLine();
        temp=++ac;
        System.out.println("The account number is: "+temp);
    }

    void deposit(int val)
    {
        bal=bal+val;
        System.out.println("The balance is: "+bal);
    }

    void withdraw(int val)
    {
        System.out.println("Enter the amount for withdrawal");
        val=sc.nextInt();
        if(val>bal){
            System.out.println("Withdrawal can't exceed the balance");
        }
        else
        bal=bal-val;
        System.out.println("The balance is: "+bal);
    }

}

class Savings extends Account
{
    public
    Savings()
    {
        super();
        System.out.println("The account selected is Savings");
        this.type="Savings";
        System.out.println("Enter the amount to be deposited");
        int val=sc.nextInt();
        deposit(val);
        interest();
    }

    void interest()
    {
        System.out.println("The balance after computing interest is:");
        bal=bal+(bal*4.7);
        System.out.println(bal);
    }
}

class Current extends Account
{
    public
    Current()
    {
        super();
        System.out.println("The account type selected is Current, minimum balance required is 5000");
        this.type="Current";
        System.out.println("Enter the amount to be deposited");
        int val=sc.nextInt();
        deposit(val);
        tax();
    }

    void tax()
    {
        if(this.bal<5000)
        {
            bal=bal-(bal*7.2);
        }
        System.out.println("Due to insufficient funds service tax was imposed as penalty, now the balance is: "+bal);
    }
}

class BankAccount{
    public static void main(String args[]){
        Savings s1=new Savings();
        s1.deposit(1000);
        s1.withdraw(200);
        s1.interest();
        
        Current c1=new Current();
        c1.deposit(10);
        c1.withdraw(9000);
        c1.tax();
        
    }
}