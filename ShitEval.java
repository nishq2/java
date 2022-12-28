import java.util.Scanner;
interface ImplString 
{
    static final Scanner sc=new Scanner(System.in);
    void secondOccur();
    void total();

}

class Second implements ImplString
{
    public void secondOccur()
    {
        Scanner sc=new Scanner(System.in);
        int count=0,i;
        System.out.println("Enter a string");
        String s=sc.nextLine();
        int l=s.length();
        System.out.println("Enter the character");
        char ch=sc.next().charAt(0);
        char c[]=s.toCharArray();
        for(i=0;i<l;i++)
        {
            if(ch==c[i]);
            {
                count++;
            }
        if(count==2)
        System.out.println("The second index occurs of char "+ch+" is "+i);
        }
    }

    public void total()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        System.out.println("Enter the substring");
        String str2=sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++)
        {
        if(str.contains(str2))
        {
            count++;
            System.out.println("The substring occurs at position: "+(i+1));
        }
        else
        {
            System.out.println("Substring doesn't exist");
        }
        }
        System.out.println(count);
    }
}

class something implements ImplString
{
    static void reverse()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s1=sc.nextLine();
        String s2=((new StringBuffer(s1)).reverse()).toString();
        System.out.println("The reversed string is: "+s2);
    }

    public void secondOccur()
    { }

    public void total()
    {

    }

}

class ShitEval 
{
    public static void main(String  args[])
    {
        Second second=new Second();
        second.secondOccur();
        second.total();
        something.reverse();
    }
}