//recursion java
//import java.util.Scanner;
class Rec 
{
    int a[];
    Rec(int i)
    {
        a= new int[i];
    }

    void array(int i)
    {
        if(i==0)
        {
            return;
        }

        else 
        {
            //return a[i-1];
            array(i-1);
            System.out.println("values: ["+(i+1)+"]"+a[i-1]);
        }
}
}

class Recursion
{
    public static void main(String args[])
    {
        //Scanner sc=new Scanner(System.in);
        Rec r1= new Rec(10);
        int i;
        //System.out.println("Enter size of the array");
        //n=sc.nextInt();
        
        for(i=0;i<10;i++)
        {
        //int c= r1.array(i);
        
        //System.out.println("The array is: " +c);}
        r1.a[i]=i;
        r1.array(10);
        
        //sc.close();
    }
}
}