import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class whateverGUI
{
    public static void main(String[] args) {
        
        Radio r=new Radio();
    }
}

class Radio extends JFrame implements ActionListener
{
    JTextField t1;
    JButton b;
    JRadioButton r1, r2;
    JLabel l;
    JCheckBox c1,c2;
    Color defaultColor;
    JToggleButton tb;
    Container c;
    public Radio()
    {
        t1= new JTextField(15);
        b=new JButton("OK");
        r1=new JRadioButton("Male");
        r2=new JRadioButton("Female");
        l=new JLabel("Hello ");
        c1=new JCheckBox("Dance");
        c2=new JCheckBox("sing");

        c=getContentPane();
        defaultColor= c.getBackground(); //gives original background color

        //content pane holds the info of the components and getcontentPane retrieves the content pane so that we can add an obj to it
        tb=new JToggleButton("button");
        tb.setBounds(200,200,100,50);
        c.add(tb);

        tb.addActionListener(this);
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        add(t1);
        add(r1);
        add(r2);
        add(b);
        add(c1);
        add(c2);
        add(l);
        //in add the sequence matters as in that order it will be executed
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // c1.addItemListener(new ItemListener ()
        //     {
        //         //is an interface 
        //         public void itemStateChanged(ItemEvent e)
        //         {
        //             System.out.println("Dancing");
        //         }
        //         //here dancing gets printed everytime c1 is selected making a checkBox list basically events
        //     });
        // //anonymous class
        // b.addActionListener(new ActionListener()
        // {
        //     public void actionPerformed(ActionEvent ae)
        //     {
        //         String name=t1.getText();
        //         if(r1.isSelected())
        //         {
        //             name= "Mr."+name;
        //         }
        //         else
        //         name= "Ms."+name;

        //         if(c1.isSelected())
        //         {
        //             name=name+ "Dancer";
        //         }

        //         if(c2.isSelected())
        //         name=name+ "Singer";
        //         //here both if because what if user selects both opt as its a checkBox
        //         l.setText(name);
        //     }
        // });

    }

    public void actionPerformed(ActionEvent ae)
    {
        if(tb.isSelected())
        {
            c.setBackground(Color.PINK);
            tb.setText("ON");
        }
        else
        {
            c.setBackground(Color.BLACK);
            tb.setText("OFF");
        }

    }
}