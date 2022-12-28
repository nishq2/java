class myMessage1
{
    int i,j;
    public
    void showij()
    {
        System.out.println("i: "+i+" j: "+j);
    }
}

class myMessage2 extends myMessage1
{
    int k;
    public
    void showk()
    {
        System.out.println("k: "+k);
    }

    void sum()
    {
        System.out.println("sum: "+(i+j+k));
    }
}

class simpleInheritance
{
    public static void main(String args[])
    {
        myMessage2 m2=new myMessage2();
        m2.i=7;
        m2.j=8;
        m2.k=9;
        System.out.println("Contents of class: ");
        m2.showij();
        m2.showk();
        m2.sum();
    }
}