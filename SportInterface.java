// Create an interface called “sports” with methods getNumberOfGoals and dispTeam.
// Create classes Hockey and football that uses the interface “sports”. Write the
// appropriate code for the methods.

import java.util.Scanner;
interface Sports
{
    static final Scanner sc=new Scanner(System.in);
    void getNumberOfGoals();
    void dispTeam();
}

class Hockey implements Sports
{
    String name;
   public
    void getNumberofGoals()
    {
        System.out.println("The number of goals are:7");
    }
    public void dispTeam()
    {
        System.out.println("Enter the team name for hockey");
        name=sc.next();
    }
}

class Football implements Sports
{
String name;

   public void getNumberofGoals()
    {
        System.out.println("The number of goals are:11");
    }
    public void dispTeam()
    {
        System.out.println("Enter the team name for Football");
        name=sc.next();
    }
}

class SportInterface
{
    public static void main(String args[])
    {
        Football f1=new Football();
        f1.dispTeam();
        f1.getNumberOfGoals();

        Hockey h1=new Hockey();
        h1.dispTeam();
        h1.getNumberOfGosls();
    }
}
