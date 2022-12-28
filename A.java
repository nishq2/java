import java.util.Scanner;
public class A {
    int a;
    String b;
    A(int a, String b)
    {
     this.a=a;
     this.b=b;   
    }

    A(A obj)
    {
        a=obj.a;
        b=obj.b;
    }
}

class B 
{
    public static void main(String args[])
    {
        System.out.println("Enter value a and string b");
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        String d=sc.next();
        A a1=new A(c,d);
        A a2=new A(a1);
        sc.close();
    }
}
