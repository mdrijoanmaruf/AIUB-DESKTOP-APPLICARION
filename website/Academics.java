package website;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public  class Academics extends JFrame {
    public Academics(){
        init();
    }
    public void init(){
        // Creating frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1080, 680);
        this.setResizable(false);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        // Creating Background Image
        ImageIcon backgroundImage = new ImageIcon("Img/Academic Calendar.png");
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

        // Back to Home button Action Listener
        backToHome.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                HomePage h2 = new HomePage();
                h2.setVisible(true);
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        Academics c1 = new Academics();
        c1.setVisible(true);
    }
}