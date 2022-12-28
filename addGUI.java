import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class addGUI
{
    public static void main(String[] args) {
        Addition obj=new Addition();
    }
}

class Addition extends JFrame implements ActionListener
{
    JTextField t1,t2; //since we need to implement the addition in the action method which is of class ActionListener type we increase 
    //the scope and accesisibilty by writing outside of the constructor
    JButton jb;
    JLabel l;
    public Addition()
    {
        t1=new JTextField(10);
        t2= new JTextField(10);
        jb= new JButton("=");
        l= new JLabel("Result");
        add(t1);
        add(t2);
        add(jb);
        add(l);
        jb.addActionListener(this); //but ActionListener is an interface so need to implement the original class
        //here this is an object of both super class JFrame and ActionListener
        setLayout(new GridLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae)
    {
        int num= Integer.parseInt(t1.getText()); //string to int;
        int num2=Integer.parseInt(t2.getText());
        int val=num+num2;
        l.setText(val+" "); 
    }
}