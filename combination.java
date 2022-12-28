//Write a program to print all combinations of four digit number. A four digit number is generated using only four digits {1,2,3,4}.
import java.util.Scanner;
class Combination
{
    public static void main(String args[])
    {
    int a=1, b=2,c=3,d=4, comb,i,j,k,l;
    char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("MENU\n 1.with repition\n 2.without repition\n");
    ch=sc.next().charAt(0);
    
    comb=(a*b*c*d)*(a*b*c*d)*(a*b*c*d)*(a*b*c*d);
    System.out.println("total combinations:"+comb);
    if (ch=='1')
    {
    for(i=1;i<5;i++)
    {
        for(j=1;j<5;j++)
        {
            for(k=1;k<5;k++)
            {
                for(l=1;l<5;l++)
                {
                    System.out.print((i*1000)+(j*100)+(k*10)+l);  
                    System.out.println(" "); 
                }
            }
        }
    }
}
    if(ch=='2')
    {
        for(i=1;i<5;i++)
        {
            for(j=1;j<5;j++)
            {
                for(k=1;k<5;k++)
                {
                    for(l=1;l<5;l++)
                    {
                        if(i==j || j==k || i==k || i==l ||j==l|| k==l)
                        {
                            continue;
                        }
                        System.out.println((i*1000)+(j*100)+(k*10)+1l);
                        System.out.println(" ");
                    }
                }
            }

        }
    }
}


}