//Write a Java program to find area and circumference of a rectangle
import java.util.Scanner;
class Rect
{
    public static void main(String args[])
    {
        int circ,area,l,b;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter length:");
        l=sc.nextInt();
        System.out.println("enter breadth:");
        b=sc.nextInt();
        circ=2*(l+b);
        System.out.println("circumference:"+circ);
        area=l*b;
        System.out.println("area:"+area);
    }
}