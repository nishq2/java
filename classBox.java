class Box
{
    int length, breadth, height;
    Box(int l, int b, int h)
    {
        
        length=l;
        breadth=b;
        height=h;
    }
    public
    void Evaluate(int length, int breadth, int height)
    {
        int a,vol;
        a=2*((length*breadth)+(breadth*height)+(length*height));
        vol=length*breadth*height;
        System.out.println("area:"+a);
        System.out.println("volume:"+vol);
    }
}
class classBox
{
    public static void main(String args[])
    {
        Box b1= new Box(10,20,30);
        b1.Evaluate(10,20,30);
        Box b2= new Box(3,6,9);
        b2.Evaluate(3,6,9);
        
    }   
}