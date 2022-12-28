class why implements Runnable
{
    int a[][]={{1,2,3},{4,5,6},{7,8,9}};
    int num;
    int rsum;
    why(int num)
    {
        this.num=num;
        rsum=0;
    }

    public void run()

    {
        for(int i=0;i<3;i++)
        {
            rsum+=a[num][i];
        }
    }
}
class Matrix
{  
    public static void main(String args[])
    {
        int total=0;
        why w= new why(0);
        why w1=new why(1);
        why w2=new why(2);
        Thread t1= new Thread(w);
        t1.start();
        Thread t2= new Thread(w1);
        t2.start();
        Thread t3=new Thread(w2);
        t3.start();
        try{
            t1.join();
            t2.join();
            t3.join();
        }
        catch (InterruptedException e)
        {

        }
        total=w.rsum+w1.rsum+w2.rsum;
        System.out.println(total);
    }
}