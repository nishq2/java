import java.util.*;

class q1
{
    public static void main(String[] args)
    {
        
        ArrayList<String> password=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        String p;
        int i;
        int lc=0, up=0, num=0;
        System.out.println("enter passwords");

        for(int j=0;j<5;j++)
        {
            p=sc.nextLine();
            char c[]=p.toCharArray();
            for(i=0;i<c.length;i++)
            {
                if(c[i]>=65 && c[i]<=90)
                up++;

                if(c[i]>=97 && c[i]<=122)
                {
                    lc++;
                }
            
                if(((int)c[i]>=48) && ((int)c[i]<=57))
                num++;

            }

            if(up>=2 && num>=2 && lc>=1)
            {
                password.add(p);
            }

            else
            {
                password.remove(p);
            }
        }

    Collections.sort(password);
    System.out.println(password);
    Collections.reverse(password);
    System.out.println(password);
}
}