//Bank
import java.util.Scanner;
class Money
{
    String name;
    int no;
    String type;
    int bal;
    static float roi= 5.1f;
    static int temp=2109;
    public
    Money(String name, String type, int bal)
    {
        this.name=name;
        this.no=++temp;
        this.type=type;
        this.bal=bal;
    }
    void deposit(int rup)
    {
        System.out.println("The new balance is:");
        bal=bal+rup;
        System.out.println(bal);
    }

    void withdraw(int rup)
    {
        System.out.println("The new balance is:");
        bal=bal-rup;
        System.out.println(bal);
    }

    void display()
    {
        System.out.println("Account holder's name: "+name+" Customer id: "+temp+" Savings type: "+type+
        " total balannce: "+bal+" Rate of interest: "+roi);

    }

}

class Banking
{
    public static void main(String args[])
    {
        int i,n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of accounts");
        n=sc.nextInt();
        Money m[]= new Money[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter account holder name");
            String name= sc.next();
            System.out.println("Enter the type of account");
            String type= sc.next();
            System.out.println("Enter balance(minimum=1000)");
            int bal=sc.nextInt();
            if(bal<1000)
            {
                System.out.println("balance should be greater than 1000");
                bal=sc.nextInt();
            }
            m[i]=new Money(name, type,bal);
            int val=0, rup=0;
            int ch;
            System.out.println("Choose the option corresponding to your wish");
            do
            {
                System.out.println("1.To Display\n2.To Deposit\n3.To withdraw\n4.To exit\n");
                ch=sc.nextInt();
                switch(ch)
                {
                    case 1:
                    m[i].display();
                    break;
                    
                    case 2:
                    System.out.println("Enter the amount to be deposited");
                    rup=sc.nextInt();
                    m[i].deposit(rup);
                    break;

                    case 3:
                    System.out.println("Enter amount to be withdrawn");
                    rup=sc.nextInt();
                    if(val>m[i].bal)
                    {
                        System.out.println("Enter a valid number");

                    }
                    else
                    m[i].withdraw(rup);
                    break;

                    default:
                    System.out.println("Invalid choice");
                    break;
                }
            }while(ch!=4);
            
        } 
    }
}