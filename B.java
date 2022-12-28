import java.util.Scanner;
class A {
    int a;
    String b;
    public
    A(int a, String b)
    {
     this.a=a;
     this.b=b;  
     System.out.println("value of a"+a+" b:"+b); 
    }

    A(A obj)
    {
        a=obj.a;
        b=obj.b;
        System.out.println("value of a"+a+" b:"+b);
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
