package website;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage extends JFrame{
    public HomePage(){
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
        ImageIcon backgroundImage = new ImageIcon("Img/Home.png");
        JLabel bgImage = new JLabel(backgroundImage);
        bgImage.setLayout(new BorderLayout());
        this.setContentPane(bgImage);

        // Creating Container
        Container c = this.getContentPane();
        c.setLayout(null);

        // Creating Navigation Bar
        Color colorNav = new Color(3, 78, 161);
        Font navberFont = new Font("Arial" , Font.BOLD , 20);
        
        // Home
        JButton home = new JButton("Home");
        home.setFont(navberFont);
        home.setBounds(50,48,100,30);
        home.setBackground(colorNav);
        home.setForeground(Color.WHITE);
        c.add(home);

        // About
        JButton about = new JButton("About");
        about.setFont(navberFont);
        about.setBounds(180,48,100,30);
        about.setBackground(colorNav);
        about.setForeground(Color.WHITE);
        c.add(about);

        // Admission
        JButton admission = new JButton("Admission");
        admission.setFont(navberFont);
        admission.setBounds(310,48,140,30);
        admission.setBackground(colorNav);
        admission.setForeground(Color.WHITE);
        c.add(admission);

        // Academics
        JButton academics = new JButton("Academics");
        academics.setFont(navberFont);
        academics.setBounds(610,48,140,30);
        academics.setBackground(colorNav);
        academics.setForeground(Color.WHITE);
        c.add(academics);

        // Log In
        JButton login = new JButton("Log In");
        login.setFont(navberFont);
        login.setBounds(780,48,110,30);
        login.setBackground(colorNav);
        login.setForeground(Color.WHITE);
        c.add(login);

        // Contact
        JButton contact = new JButton("Contact");
        contact.setFont(navberFont);
        contact.setBounds(920,48,110,30);
        contact.setBackground(colorNav);
        contact.setForeground(Color.WHITE);
        c.add(contact);

        // Home Button Action Listener
         home.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            HomePage h1 = new HomePage();
            h1.setVisible(true);
            dispose();
        }
        });
        
        // About Button Action Listener





        // Admission Button Action Listener
         admission.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            Admission a1 = new Admission();
            a1.setVisible(true);
            dispose();
        }
        });
        // Log In Button Action Listener
         login.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            Login l1 = new Login();
            l1.setVisible(true);
            dispose();
        }
        });
    }
}