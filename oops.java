
class rt extends Thread
{
    String name;
    rt(String name)
    {
        this.name=name;
    }

    public void run()
    {
        try{
        for(int i=0;i<5;i++)
        {
            System.out.println(name);
        }
        Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {

        }
    }
}

class oops 
{
    public static void main(String args[])
    {
        rt t1= new rt("MIT");
        t1.start();
        rt t2= new rt("ICT");
        t2.start();
        Thread t=Thread.currentThread();
        t.setName("OOP");
        try
        {
        for (int i=0;i<5;i++)
        {
            System.out.println(t.getName());
            Thread.sleep(1000);
        }
    }
    catch(InterruptedException e)
    {
        
    }
    }
}