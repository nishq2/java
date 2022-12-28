import java.util.Scanner;

class arrayLIST
{
    public static void main(String[] args) {
        
        ArrayList<Integer> numberz=new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        int n,i;
        
        System.out.println("enter numz");
        for(i=0;i<numberz.size();i++)
        {
            n=sc.nextInt();

            if(!numberz.contains(n))
            {
                numberz.add(n);
            }
        }

        Collections.sort(numberz);
        System.out.println(numberz);
    }
}