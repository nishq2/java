//Most programmers will tell you that one of the ways to improve your performance in competitive programming is to 
//practice a lot of problems.
//Our Chef took the above advice very seriously and decided to set a target for himself.
//Chef decides to solve at least 1010 problems every week for 4 weeks.
//Given the number of problems he actually solved in each week over 4 weeks as P1,P2,P3,P4
//output the number of weeks in which Chef met his target.
import java.util.Scanner
class coding
{
    public static void main(String args[])
    {

    
    System.out.println("enter problrm solved in W1");
    Scanner sc= new Scanner(System.in);
    int p1= sc.nextInt();
    System.out.println("enter problrm solved in W2");
    int p2= sc.nextInt();
    System.out.println("enter problrm solved in W3");
    int p3= sc.nextInt();
    System.out.println("enter problrm solved in W4");
    int p4= sc.nextInt();
    int ans=0;
    if (p1>10)
    {
        ans+=1;
    }
    else if (p2>10)
    {
        ans+=1;
    }
    else if (p3>10)
    {
        ans+=1;
    }
    else if (p4)
    {
        ans+=1;
    }
    System.out.println("target completed in weeks:"+ans);
    
}
}