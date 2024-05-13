package website;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GInformation extends JFrame {
    public GInformation(){
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
        ImageIcon backgroundImage = new ImageIcon("Img/General Information.png");
        JLabel bgImage = new JLabel(backgroundImage);
        bgImage.setLayout(new BorderLayout());
        this.setContentPane(bgImage);

        // Creating Container
        Container c = this.getContentPane();
        c.setLayout(null);

        // Back to Home
        JButton backToHome = new JButton("About");
        backToHome.setFont(new Font("Arial" , Font.BOLD , 20));
        backToHome.setBounds(20,25,140,30);
        backToHome.setBackground(Color.GRAY);
        backToHome.setForeground(Color.WHITE);
        c.add(backToHome);


        // Back to Home button Action Listener
        backToHome.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                About h2 = new About();
                h2.setVisible(true);
                dispose();
            }
        });
    }
}
