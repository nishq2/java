//savings
class Savings
{
    int balance;
    Savings(int b)
    {
        balance=b;
    }

    public static void main(String args[])
    {
        Savings account= new Savings(2000);

        //check balance
        System.out.println("your balance is: "+account.balance);
        //withdraw

        int wdrw= account.balance -300;
        account.balance= wdrw;
        System.out.println("You just withdrew: "+300 +"\nyour balance is "+account.balance);

        //deposit
        int deposit= account.balance +600;
        account.balance= deposit;
        System.out.println("you just deposited "+600+" your balance is "+account.balance);
        
    }
}