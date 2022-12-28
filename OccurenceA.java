import java.util.Scanner;
class OccurenceA
{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.next();
        int i;
        int n=s.length();
       int Count[]=new int[256];
       for(i=0;i<n;i++)
       {
        Count[s.charAt(i)]++;
       }
       for(i=0;i<n;i++)
       {
        if(Count[i]!=0)
        {
            System.out.println((char)i+" "+Count[i]+" ");
        }
       }
    }
}