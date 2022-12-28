// 5 threads: 1-uniqueness of elements 2-rowsum 3-column sum 4-pcd 5- secondary diagonal sum
import java.util.Scanner;
class Rt extends Thread
{
    int num;
    int a[][];
    Rt(int num, int a[][])
    {
        this.num=num;
        this.a=a;
    }

    public synchronized void rowsum()
    {
        //input();
        int i,j;
        //int n,m;
        int rsum=0;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                rsum+=a[i][j];
            }
            System.out.println("Row sum "+rsum);
        }
        
    }

    public synchronized void colsum()
    {
        int i,j;
        //int n,m;
        int csum=0;
        for(j=0;j<3;j++)
        {
            for(i=0;i<3;i++)
            {
                csum+=a[i][j];
            }
            System.out.println("column sum "+csum);
        }
    }

    public synchronized void pdc()
    {
        int psum=0;
        int i,j;
        //int n,m;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if(i==j)
                psum+=a[i][j];
            }
        }
        System.out.println("Diagonal sum "+psum);
    }
    public synchronized void sdc()
    {
        int ssum=0;
        int i,j;
        //int n,m;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if(i+j==2)
                ssum+=a[i][j];
            }
        }
        System.out.println("Secondary diagonal: "+ssum);
    }
    public void run()
    {
        switch(num)
        {
            case 1:
            rowsum();
            break;

            case 2:
            colsum();
            break;

            case 3:
            pdc();
            break;

            case 4:
            sdc();
            break;

            default:
            System.out.println("Invalid");

        }
    }
}

class Magic 
{
    public static void main(String args[])
    {
        int i,j;
        int arr[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        Rt t1=new Rt(1,arr);
        t1.start();
        Rt t2=new Rt(2,arr);
        t2.start();
        Rt t3= new Rt(3,arr);
        t3.start();
        Rt t4= new Rt(4,arr);
        t4.start();
        try
        {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        }
        catch (InterruptedException e)
        {
            
        }
    }
}