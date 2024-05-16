package website;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import portal.*;

public class Login extends JFrame {
    String[] studentId = { "23-53347-3", "23-53193-3", "23-53354-3", "23-54025-3" };
    String[] passwordlist = { "maruf", "shawon", "anik", "tasauf" };

    public Login() {
        init();
    }

    public void init() {
        // Creating frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1080, 680);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        // Creating Background Image
        ImageIcon backgroundImage = new ImageIcon("Img/login.jpg");
        JLabel bgImage = new JLabel(backgroundImage);
        bgImage.setLayout(new BorderLayout());
        this.setContentPane(bgImage);

        // Creating Container
        Container c = this.getContentPane();
        c.setLayout(null);

        // Back to Home
        JButton backToHome = new JButton("Home");
        backToHome.setFont(new Font("Arial", Font.BOLD, 20));
        backToHome.setBounds(10, 20, 100, 30);
        backToHome.setBackground(Color.GRAY);
        backToHome.setForeground(Color.WHITE);
        c.add(backToHome);

        // Back to Home button Action Listener
        backToHome.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HomePage h2 = new HomePage();
                h2.setVisible(true);
                dispose();
            }
        });

        // Username :
        JTextField username = new JTextField("23-53193-3");
        username.setFont(new Font("Arial", Font.BOLD, 20));
        username.setBounds(400, 270, 260, 50);
        username.setHorizontalAlignment(JTextField.CENTER);
        c.add(username);

        // Password :
        JPasswordField password = new JPasswordField("shawon");
        password.setFont(new Font("Arial", Font.BOLD, 20));
        password.setBounds(400, 350, 260, 50);
        password.setHorizontalAlignment(JTextField.CENTER);
        c.add(password);

        // Clear Button
        JButton clear = new JButton("Clear");
        clear.setFont(new Font("Arial", Font.BOLD, 20));
        clear.setBounds(410, 430, 100, 40);
        clear.setBackground(Color.GRAY);
        clear.setForeground(Color.WHITE);
        c.add(clear);

        // Login Button
        JButton login = new JButton("Log In");
        login.setFont(new Font("Arial", Font.BOLD, 20));
        login.setBounds(550, 430, 100, 40);
        login.setBackground(Color.GRAY);
        login.setForeground(Color.WHITE);
        c.add(login);

        // Clear Button Action Listener
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Clear username and password fields
                username.setText("");
                password.setText("");
            }
        });

        // Log in button Action Listener
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    authenticateUser(username.getText(), new String(password.getPassword()));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "An error occurred during login: " + ex.getMessage());
                }
            }
        });
    }

    // Method to authenticate user
    private void authenticateUser(String enteredStudentId, String enteredPassword) throws Exception {
        boolean loginSuccessful = false;

        for (int i = 0; i < studentId.length; i++) {
            if (enteredStudentId.equals(studentId[i]) && enteredPassword.equals(passwordlist[i])) {
                loginSuccessful = true;
                break;
            }
        }

        if (loginSuccessful) {
            JOptionPane.showMessageDialog(null, "Log In Successful!");
            switch (enteredStudentId) {
                case "23-53347-3":
                    new RijoanHome().setVisible(true);
                    break;
                case "23-53193-3":
                    new ShawonPortalHome().setVisible(true);
                    break;
                case "23-53354-3":
                    new AnikHome().setVisible(true);
                    break;
                case "23-54025-3":
                    new TasaufHome().setVisible(true);
                    break;
                default:
                    throw new Exception("Unknown user ID.");
            }
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
        }
    }

}
