import java.util.*;
class Shop  // shared resource.. 
{
    int contents;
    boolean available = false;  // shared resorce is first unavailable.. 
    synchronized int get() // consumer is taking value from this method.. 
    {
        while (available == false)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e){}
        }
        available = false;
        notify();
        return contents;
    }
    synchronized void put(int value) // producer is giving value through this.. 
    {
        while (available == true)
        {
            try
            {
                wait();
            }
            catch(InterruptedException e) { }
        }
        contents = value;
        available = true;
        notify();
    }
}
class Consumer extends Thread
{
    Shop Shop;
    int max;
    Consumer(Shop c,int max)
    {
        Shop = c;
        this.max=max;
    }
    public void run()
    {
        int value = 0;
        for (int i = 0; i < max; i++)
        {
            value = Shop.get();
            System.out.println("Consumed " + value);
        }
    }
}
class Producer extends Thread {
    Shop Shop;  // have the address of the shop. 
    int max;
    Producer(Shop c,int max)
    {
        Shop = c;
        this.max=max;
    }
    public void run()
    {
        for (int i = 0; i < max; i++)
        {
            Shop.put(i);
            System.out.println("Producer " + i);
            try
            {
                sleep(1000);
            }
            catch(InterruptedException e) { }
        }
    }
}
class q3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Shop c = new Shop();
        System.out.println("Enter Max Value : ");
        int max=sc.nextInt();
        Producer p1 = new Producer(c,max);
        Consumer c1 = new Consumer(c,max);
        p1.start();
        c1.start();
        int tt=max*500;
        try
        {
            Thread.sleep(tt);
        }
        catch(InterruptedException e)
        {
            System.out.println("Interrupting Main Thread");
        }
        System.out.println("Exiting Main Thread");
        sc.close();
    }
}