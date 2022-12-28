class Box
{
    double height;
    double width;
    double depth;
}
class BoxDemo

{
    public static void main(Stringg args[])
    {
        Box mybox= new Box();
        double vol;
        mybox.width= 10;
        mybox.height=15;
        mybox.depth=5;
        vol= mybox.width*mybox.height*mybox.depth;
        System.out.println(+vol);
    }
}