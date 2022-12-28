
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class calc
{
    public static void main(String[] args) {
        
        Addsub a1=new Addsub();
    }
}

class Addsub extends JFrame implements ActionListener
{
    JTextField t1,t2,t3;
    JLabel l;
    JButton b1,b2,b3,b4;

    public Addsub()
    {
        t1=new JTextField(10);
        t2=new JTextField(10);
        t3=new JTextField(5);
        b1=new JButton("Result");
        // b2=new JButton("sub");
        // b3=new JButton("division");
        // b4=new JButton("multiply");
        l=new JLabel("=");
        b1.addActionListener(this);
        // b2.addActionListener(this);
        // b3.addActionListener(this);
        // b4.addActionListener(this);
        
        add(t1);
        
        add(t3);
        add(t2);
        add(b1);
        // add(b2);
        // add(b3);
        // add(b4);
        add(l);
        //without add nothing will be visible
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(350,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent ae)
    {
        int num=Integer.parseInt(t1.getText());
        int num1=Integer.parseInt(t2.getText());
        int val=0;
        if(t3.getText().equals("+"))
        {
            val=num+num1;
        }

        else if(t3.getText().equals("-"))
        val=num-num1;

        else if(t3.getText().equals("/"))
        val=num/num1;

        else 
        val=num*num1;

        l.setText(val+" ");
    }
}

