import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class addAnonymous
{
    public static void main(String[] args) {
        Addition obj=new Addition();
    }
}

class Addition extends JFrame //we are already creating an obj of ActionListener so need for implements
{
    JTextField t1,t2;
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

        ActionListener a1=new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                int num= Integer.parseInt(t1.getText()); //string to int;
                int num2=Integer.parseInt(t2.getText());
                int val=num+num2;
                l.setText(val+" "); 
            }
        };

        jb.addActionListener(a1);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}