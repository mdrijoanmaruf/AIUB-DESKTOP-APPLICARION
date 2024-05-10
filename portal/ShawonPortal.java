package portal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShawonPortal extends JFrame {

    public ShawonPortal() {
        init();
    }

    public void init() {
        // Creating frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1080, 680);
        this.setResizable(false);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        // Creating Background Image
        ImageIcon backgroundImage = new ImageIcon("Img/Shawon.png");
        JLabel bgImage = new JLabel(backgroundImage);
        bgImage.setLayout(new BorderLayout());
        this.setContentPane(bgImage);

        // Creating Container
        Container c = this.getContentPane();
        c.setLayout(null);

        // Creating Navigtion side bar

        // Home
        Font buttonFont = new Font("Arial", Font.BOLD , 14);
        JButton home = new JButton("Home");
        home.setFont(buttonFont);
        home.setBounds(80,123,140,25);
        home.setBackground(Color.GRAY);
        home.setForeground(Color.WHITE);
        c.add(home);

        
        // Profile
        JButton profile = new JButton("Profile");
        profile.setFont(buttonFont);
        profile.setBounds(80,171,140,25);
        profile.setBackground(Color.GRAY);
        profile.setForeground(Color.WHITE);
        c.add(profile);
        
        // Courses
        JButton courses = new JButton("Course List");
        courses.setFont(buttonFont);
        courses.setBounds(80,223,140,25);
        courses.setBackground(Color.GRAY);
        courses.setForeground(Color.WHITE);
        c.add(courses);

        
        // Result
        JButton result = new JButton("Result");
        result.setFont(buttonFont);
        result.setBounds(80,273,140,25);
        result.setBackground(Color.GRAY);
        result.setForeground(Color.WHITE);
        c.add(result);

        
        // Regestration
        JButton regestration = new JButton("Regestration");
        regestration.setFont(buttonFont);
        regestration.setBounds(80,324,140,25);
        regestration.setBackground(Color.GRAY);
        regestration.setForeground(Color.WHITE);
        c.add(regestration);

        
        // log Out
        JButton logOut = new JButton("Log Out");
        logOut.setFont(buttonFont);
        logOut.setBounds(80,375,140,25);
        logOut.setBackground(Color.GRAY);
        logOut.setForeground(Color.WHITE);
        c.add(logOut);


        // Home Button Action Listener
        home.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            ShawonPortalHome shawonHome = new ShawonPortalHome();
            shawonHome.setVisible(true);
            dispose();
        }
        });

        
        // Profile Button Action Listener
        profile.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            ShawonPortalHome shawonHome = new ShawonPortalHome();
            shawonHome.setVisible(true);
            dispose();
        }
        });

         // LogOut Button Action Listener
         logOut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                // JOptionPane.showMessageDialog(null, "Log Out Successful!", "Confirmatioin", -1);
                // dispose();
                int result = JOptionPane.showConfirmDialog(null, "Do you want to Log Out?", "Confirmation", JOptionPane.YES_NO_OPTION);
        
                if (result == JOptionPane.YES_OPTION) {
                    dispose();
                } 
            }
        });

        

        
    }
}
