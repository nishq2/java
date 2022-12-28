//runnable interface thread
class A implements Runnable
{
    public void run()
    {
        try
        {
        for(int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(1000);
        }
    }
    catch(Exception e)
    {

    }
    }
}

class myThread extends Thread
{
    public void run()
    {
        try{
            for(int i=0;i<5;i++)
            {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            }
        }
        catch(Exception e)
        {

        }
    }
}

class Runn
{
    public static void main(String args[])
    {
        A r= new A();
        Thread t1= new Thread(r);
        t1.start();
        try{
            System.out.println(t1.isAlive());
            t1.join();
        }
        catch(Exception e)
        {

        }

        myThread t2= new myThread();
        System.out.println(t2.isAlive());
        t2.start();
    }
}