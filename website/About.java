package website;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public  class About extends JFrame 
{
    public About()
    {
        init();
    }
    public void init()
    {
        // Creating frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1080, 680);
        this.setResizable(false);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        // Creating Background Image
        ImageIcon backgroundImage = new ImageIcon("Img/About.png");
        JLabel bgImage = new JLabel(backgroundImage);
        bgImage.setLayout(new BorderLayout());
        this.setContentPane(bgImage);

        // Creating Container
        Container c = this.getContentPane();
        c.setLayout(null);

        // Back to Home
        JButton backToHome = new JButton("Home");
        backToHome.setFont(new Font("Arial" , Font.BOLD , 20));
        backToHome.setBounds(20,40,140,30);
        backToHome.setBackground(Color.GRAY);
        backToHome.setForeground(Color.WHITE);
        c.add(backToHome);

        Color sm = new Color(0x97DEFA);

        // Show more 1
        JButton sm1 = new JButton("Show More");
        sm1.setFont(new Font("Arial" , Font.BOLD , 20));
        sm1.setBounds(140,260,140,50);
        sm1.setBackground(sm);
        sm1.setForeground(Color.BLACK);
        c.add(sm1);

        // Show more 4
        JButton sm4 = new JButton("Show More");
        sm4.setFont(new Font("Arial" , Font.BOLD , 20));
        sm4.setBounds(140,500,140,50);
        sm4.setBackground(sm);
        sm4.setForeground(Color.BLACK);
        c.add(sm4);


        // Show more 2
        JButton sm2 = new JButton("Show More");
        sm2.setFont(new Font("Arial" , Font.BOLD , 20));
        sm2.setBounds(460,260,140,50);
        sm2.setBackground(sm);
        sm2.setForeground(Color.BLACK);
        c.add(sm2);

        // Show more 5
        JButton sm5 = new JButton("Show More");
        sm5.setFont(new Font("Arial" , Font.BOLD , 20));
        sm5.setBounds(460,500,140,50);
        sm5.setBackground(sm);
        sm5.setForeground(Color.BLACK);
        c.add(sm5);

        // Show more 3
        JButton sm3 = new JButton("Show More");
        sm3.setFont(new Font("Arial" , Font.BOLD , 20));
        sm3.setBounds(780,260,140,50);
        sm3.setBackground(sm);
        sm3.setForeground(Color.BLACK);
        c.add(sm3);

        // Show more 6
        JButton sm6 = new JButton("Show More");
        sm6.setFont(new Font("Arial" , Font.BOLD , 20));
        sm6.setBounds(780,500,140,50);
        sm6.setBackground(sm);
        sm6.setForeground(Color.BLACK);
        c.add(sm6);


        // Back to Home button Action Listener
        backToHome.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                HomePage h2 = new HomePage();
                h2.setVisible(true);
                dispose();
            }
        });

        // sm1 button Action Listener
        sm1.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                Information h2 = new Information();
                h2.setVisible(true);
                dispose();
            }
        });

        // sm2 button Action Listener
        sm2.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                GInformation h2 = new GInformation();
                h2.setVisible(true);
                dispose();
            }
        });

        // sm3 button Action Listener
        sm3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                WhyStudy h2 = new WhyStudy();
                h2.setVisible(true);
                dispose();
            }
        });

        // sm4 button Action Listener
        sm4.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                Resources h2 = new Resources();
                h2.setVisible(true);
                dispose();
            }
        });

        // sm5 button Action Listener
        sm5.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                Career h2 = new Career();
                h2.setVisible(true);
                dispose();
            }
        });

        // sm6 button Action Listener
        sm6.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                Convocation h2 = new Convocation();
                h2.setVisible(true);
                dispose();
            }
        });

    }

    public static void main(String[] args) 
    {
        About c1 = new About();
        c1.setVisible(true);
    }
}
