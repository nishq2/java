class myThread extends Thread
{
    int a[][]={{1,2,3},{4,5,6},{7,8,9}};
    int num;
    int rsum;
    myThread(int n)
    {
        num=n;
        rsum=0;
    }

    public void run()
    {
        for(int i=0;i<3;i++)
        {
            rum+=a[num][i];
        }
    }
}

class MatrixSum
{
    public static void main(String args[])
    {
        int total=0;
        myThread t1= new myThread(0);
        t1.start();
        myThread t2= new myThread(1);
        t2.start();
        myThread t3= new myThread(2);
        t3.start();
        try
        {
            t1.join();
            t2.join();
            t3.join();
        }
        catch(Exception e)
        {

        }
        total= t1.rsum+t2.rsum+t3.rsum;
        System.out.println(total);
    }
}