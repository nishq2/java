import javax.swing.*;
//import javax.swing.JLabel;
import java.awt.*;

class FirstGUI
{
    public static void main(String[] args) {
        
        Abc obj=new Abc();
        

    }
}

class Abc extends JFrame //card layout
{
    public Abc()
    {
        setLayout(new FlowLayout()); 
        //3 types flow, grid and null
        //flow centers the texts;
        setVisible(true); //by default jframe is invisible without this nothing shown
        setSize(400, 400); //width then height
        //always better to write these within the consructor
        JLabel l= new JLabel("Hello world");
        add(l);
        JLabel l1=new JLabel("Welcome!");
        add(l1); //the last text overrides the first text to soolve this change the layout
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}