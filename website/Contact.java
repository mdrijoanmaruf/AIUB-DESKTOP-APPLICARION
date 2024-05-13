package website;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Contact extends JFrame {
    private JLabel bgImage;

    public Contact(){
        init();
    }

    public void init(){
        // Creating frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1080, 680);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        // Creating Background Image
        ImageIcon backgroundImage = new ImageIcon("Img/ContactHome.png");
        bgImage = new JLabel(backgroundImage);
        bgImage.setLayout(new BorderLayout());
        bgImage.setBounds(215, -20, 865, 680); // Set bounds for the background image
        this.add(bgImage);

        // Creating Container
        Container c = this.getContentPane();
        c.setLayout(null);

        // Back to Home
        JButton backToHome = new JButton("Home");
        backToHome.setFont(new Font("Arial" , Font.BOLD , 20));
        backToHome.setBounds(40,120,140,30);
        backToHome.setBackground(Color.GRAY);
        backToHome.setForeground(Color.WHITE);
        c.add(backToHome);

        // FST
        JButton fst = new JButton("FST");
        fst.setFont(new Font("Arial" , Font.BOLD , 20));
        fst.setBounds(40,200,140,30);
        fst.setBackground(Color.GRAY);
        fst.setForeground(Color.WHITE);
        c.add(fst);

        // FBA
        JButton fba = new JButton("FBA");
        fba.setFont(new Font("Arial" , Font.BOLD , 20));
        fba.setBounds(40,280,140,30);
        fba.setBackground(Color.GRAY);
        fba.setForeground(Color.WHITE);
        c.add(fba);

        // FASS
        JButton fass = new JButton("FASS");
        fass.setFont(new Font("Arial" , Font.BOLD , 20));
        fass.setBounds(40,360,140,30);
        fass.setBackground(Color.GRAY);
        fass.setForeground(Color.WHITE);
        c.add(fass);

        // IT
        JButton it = new JButton("IT Support");
        it.setFont(new Font("Arial" , Font.BOLD , 20));
        it.setBounds(40,440,140,30);
        it.setBackground(Color.GRAY);
        it.setForeground(Color.WHITE);
        c.add(it);

        // Back to Home button Action Listener
        backToHome.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                HomePage h1 = new HomePage();
                h1.setVisible(true);
                dispose();
            }
        });

        // Action Listeners for changing images
        fst.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                changeImage("Img/FST.png");
            }
        });

        fba.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                changeImage("Img/FBA.png");
            }
        });

        fass.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                changeImage("Img/FASS.png");
            }
        });

        it.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                changeImage("Img/IT.png");
            }
        });
    }


    // Method to change the background image
    private void changeImage(String imagePath) {
        ImageIcon newBackgroundImage = new ImageIcon(imagePath);
        bgImage.setIcon(newBackgroundImage);
    }

    public static void main(String[] args) {
        Contact c1 = new Contact();
        c1.setVisible(true);
    }
}
