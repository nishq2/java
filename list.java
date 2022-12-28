import java.util.*;

class list
{
    public static void main(String[] args) {
        
        ArrayList<Integer> numberz=new ArrayList<>();
        ArrayList<String> blah=new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        int n,i;
        System.out.println("Enter strings");
        
        for(i=0;i<3;i++)
        {
            String ha=sc.next();

            if(!blah.contains(ha))
            {
                blah.add(ha);
            }
        }

        Collections.sort(blah);
        System.out.println(blah);

        System.out.println("enter numz");
        for(i=0;i<5;i++)
        {
            n=sc.nextInt();

            if(!numberz.contains(n))
            {
                numberz.add(n);
            }
        }

        //Collections.sort(numberz);
        System.out.println(numberz);
    }
}