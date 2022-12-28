import java.util.Scanner;

class Game
{
    public
    void type()
    {
        System.out.println("Indoor and outdoor games");
    }
}

class cricket extends Game
{
    public 
    void type()
    {
        System.out.println("cricket-Outdoor game");
    }
}

class chess extends Game
{
    public
    void type()
    {
        System.out.println("Chess-indoor");
    }
}

class games
{
    public static void main(String args[])
    {
        Game g= new Game();
        g.type();
        Game cr=new cricket();
        cr.type();
        Game ch=new chess();
        ch.type();
    }
}
