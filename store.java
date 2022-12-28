
class store
{
    String product;
    int inv;
    double price;
    public
    store(String p, int i, double pr)
    {
        product=p;
        inv=i;
        price=pr;
    }

    public static void main(String args[])
    {
        
        store lemonade= new store("lemonade", 40, 0.99);
        store cookies= new store("cookies", 52,3);
        System.out.println("our first shop sells "+lemonade.product+" at $"+lemonade.price);
        System.out.println("our second shop sells "+cookies.product+" at $"+cookies.price+" and peices left are "+cookies.inv);
    
        
    }
}