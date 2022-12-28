import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class q2A
{
    public static void main(String[] args) {
        exam e1=new exam();
    }
}

class exam extends JFrame implements ActionListener
{
    JTextField t1, t2;
    JButton b1;

    exam()
    {
        t1=new JTextField("idk");
        t2=new JTextField("whatever");
        b1=new JButton("Submit");

        add(t1);
        add(t2);
        add(b1);

        //ActionListener a1=new ActionListener();

        b1.addActionListener(this);

        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae)
    {
        String s1;
        String s2;
            if ((t1.getText()==null) && (t2.getText()==null))
            
                System.out.println("Text field is empty");
    
            else
            {
                s1= t1.getText();
                s2= t2.getText();
                String s= ((new StringBuffer(s2)).reverse()).toString();
                System.out.println(s);
                String s3=s1.concat(s);
                System.out.println(s3);
            }
            
    }
}