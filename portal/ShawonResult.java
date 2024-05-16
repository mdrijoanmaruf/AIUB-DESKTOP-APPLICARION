package portal;

import website.Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShawonResult extends JFrame {
    ShawonResult() {
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
        ImageIcon backgroundImage = new ImageIcon("Img/Result.png");
        JLabel bgImage = new JLabel(backgroundImage);
        bgImage.setLayout(new BorderLayout());
        this.setContentPane(bgImage);

        // Creating Container
        Container c = this.getContentPane();
        c.setLayout(null);

        // Creating Navigation side bar
        // Home
        Font buttonFont = new Font("Arial", Font.BOLD, 14);
        JButton home = new JButton("Home");
        home.setFont(buttonFont);
        home.setBounds(80, 123, 140, 25);
        home.setBackground(Color.GRAY);
        home.setForeground(Color.WHITE);
        c.add(home);

        // Profile
        JButton profile = new JButton("Profile");
        profile.setFont(buttonFont);
        profile.setBounds(80, 171, 140, 25);
        profile.setBackground(Color.GRAY);
        profile.setForeground(Color.WHITE);
        c.add(profile);

        // Courses
        JButton courses = new JButton("Course List");
        courses.setFont(buttonFont);
        courses.setBounds(80, 223, 140, 25);
        courses.setBackground(Color.GRAY);
        courses.setForeground(Color.WHITE);
        c.add(courses);

        // Result
        JButton result = new JButton("Result");
        result.setFont(buttonFont);
        result.setBounds(80, 273, 140, 25);
        result.setBackground(Color.GRAY);
        result.setForeground(Color.WHITE);
        c.add(result);

        // Registration
        JButton registration = new JButton("Registration");
        registration.setFont(buttonFont);
        registration.setBounds(80, 324, 140, 25);
        registration.setBackground(Color.GRAY);
        registration.setForeground(Color.WHITE);
        c.add(registration);

        // Log Out
        JButton logOut = new JButton("Log Out");
        logOut.setFont(buttonFont);
        logOut.setBounds(80, 375, 140, 25);
        logOut.setBackground(Color.GRAY);
        logOut.setForeground(Color.WHITE);
        c.add(logOut);

        // Home Button Action Listener
        home.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ShawonPortalHome shawonHome = new ShawonPortalHome();
                shawonHome.setVisible(true);
                dispose();
            }
        });

        // Profile Button Action Listener
        profile.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ShawonPortal shawonHome = new ShawonPortal();
                shawonHome.setVisible(true);
                dispose();
            }
        });

        // Courses Button Action Listener
        courses.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Courses c1 = new Courses();
                c1.setVisible(true);
                dispose();
            }
        });

        // Result Button Action Listener
        result.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ShawonResult cr1 = new ShawonResult();
                cr1.setVisible(true);
                dispose();
            }
        });

        // Registration Button Action Listener
        registration.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                RegestrationCourses r1 = new RegestrationCourses();
                r1.setVisible(true);
                dispose();
            }
        });

        // LogOut Button Action Listener
        logOut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(null, "Do you want to Log Out?", "Confirmation", JOptionPane.YES_NO_OPTION);

                if (result == JOptionPane.YES_OPTION) {
                    Login l1 = new Login();
                    l1.setVisible(true);
                    dispose();
                }
            }
        });

        // Creating JLabel for courses
        JLabel courseDropDownTitle = new JLabel("Courses :");
        courseDropDownTitle.setBounds(250, 80, 100, 50);
        courseDropDownTitle.setFont(new Font("Arial", Font.BOLD, 20));
        c.add(courseDropDownTitle);

        // Courses Dropdown
        String[] coursesArray = {"Introduction to Programming", "Introduction to Programming Lab",
                "Physics 1", "Physics 1 Lab", "Math 1"};
        JComboBox<String> courseDropdown = new JComboBox<>(coursesArray);
        courseDropdown.setFont(new Font("Arial", Font.PLAIN, 18));
        courseDropdown.setBounds(350, 95, 300, 25);
        c.add(courseDropdown);

        // Courses Dropdown
        String[] coursesArray1 = {"Discrete Mathematics", "Physics 2",
                "OOP1", "English 2", "Math 2"};
        JComboBox<String> courseDropdown1 = new JComboBox<>(coursesArray1);
        courseDropdown1.setFont(new Font("Arial", Font.PLAIN, 18));
        courseDropdown1.setBounds(350, 95, 300, 25);
        c.add(courseDropdown);

        // Creating JLabel for semester
        JLabel semesterDropDownTitle = new JLabel("Semester :");
        semesterDropDownTitle.setBounds(700, 80, 110, 50);
        semesterDropDownTitle.setFont(new Font("Arial", Font.BOLD, 20));
        c.add(semesterDropDownTitle);

        String[] semesterArray = {"Fall 23-24", "Spring 23-24"};
        JComboBox<String> semesterDropdown = new JComboBox<>(semesterArray);
        semesterDropdown.setFont(new Font("Arial", Font.PLAIN, 18));
        semesterDropdown.setBounds(830, 95, 140, 25);
        c.add(semesterDropdown);

        // Create a JLabel for the initial image (IP.png)
        ImageIcon initialImageIcon = new ImageIcon("Img/IP.png");
        JLabel courseImageLabel = new JLabel(initialImageIcon);
        courseImageLabel.setBounds(260, 170, initialImageIcon.getIconWidth(), initialImageIcon.getIconHeight());
        c.add(courseImageLabel);

        // Action Listener for the Semester Dropdown
        semesterDropdown.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedSemester = (String) semesterDropdown.getSelectedItem();
                if (selectedSemester.equals("Fall 23-24")) {
                    courseDropdown.setModel(new DefaultComboBoxModel<>(coursesArray));
                    String imagePath = "Img/IP.png";
                    ImageIcon courseImage = new ImageIcon(imagePath);
                    courseImageLabel.setIcon(courseImage);
                } else if (selectedSemester.equals("Spring 23-24")) {
                    courseDropdown.setModel(new DefaultComboBoxModel<>(coursesArray1));
                    String imagePath = "Img/DM.png";
                    ImageIcon courseImage = new ImageIcon(imagePath);
                    courseImageLabel.setIcon(courseImage);
                }
            }
        });


        // Action Listener for the Course Dropdown
        courseDropdown.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedCourse = (String) courseDropdown.getSelectedItem();
                String imagePath = "Img/";

                // Determine the image path based on the selected course
                switch (selectedCourse) {
                    case "Introduction to Programming":
                        imagePath += "IP.png";
                        break;
                    case "Math 1":
                        imagePath += "Math1.png";
                        break;
                    case "Introduction to Programming Lab":
                        imagePath += "IP_Lab.png";
                        break;
                    case "Physics 1":
                        imagePath += "Physics1.png";
                        break;
                    case "Physics 1 Lab":
                        imagePath += "Physics1_lab.png";
                        break;
                    case "Discrete Mathematics":
                        imagePath += "DM.png";
                        break;
                    case "Physics 2":
                        imagePath += "Physics2.png";
                        break;
                    case "Math 2":
                        imagePath += "math2.png";
                        break;
                    case "English 2":
                        imagePath += "English2.png";
                        break;
                    case "OOP1":
                        imagePath += "OOP1.png";
                        break;
                    default:
                        imagePath += "IP.png";
                        break;
                }

                // Update the JLabel with the selected course image
                ImageIcon courseImage = new ImageIcon(imagePath);
                courseImageLabel.setIcon(courseImage);
            }
        });
    }

    public static void main(String[] args) {
        ShawonResult sr1 = new ShawonResult();
        sr1.setVisible(true);
    }
}
