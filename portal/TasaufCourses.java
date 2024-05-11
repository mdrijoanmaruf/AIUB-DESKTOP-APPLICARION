package portal;

import website.HomePage;
import website.Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class TasaufCourses extends JFrame {

    private Container c;
    private JLabel label;
    private Font f;
    private JTable table;
    private JScrollPane scroll;
    private ImageIcon  img,img10;
    private JButton backbutton;
    private String [] cols = {"CSE Course Name", "EEE Couse Name", "BBA Course Name"};
    private String [][] rows = {
            {"Math 1", "Physics 1", "Accounting (ACT)"},
            {"math 2", "Physics 2", "Business Analytics (BA))"},
            {"Math 3", "Physics 1 Lab", "Business Economics (BECO)"},
            {"Math 4", "Physics 2 Lab", "Accounting"},
            {"Math 5", "CHEMISTRY", "Finance (FIN))"},
            {"Math 6", "Math 1", "Human Resource Management (HRM))"},
            {"INTRODUCTION TO PROGRAMMING", "BASIC MECHANICAL ENGINEERING","International Business (IB)"},
            {"INTRODUCTION TO PROGRAMMING Lab", "ELECTRICAL CIRCUITS -1 (DC)", "Investment Management (IM"},
            {"physic 1", "ELECTRICAL CIRCUITS -1 (DC) (LAB)", "Management (MGT)"},
            {"physic 2", "Math 2", "Marketing (MKT)"},
            {"physics 1 lab", "PRINCIPLES OF ACCOUNTING", "Management Information Systems (MIS)"},
            {"physics 2 lab", "Math 3", "Accounting (ACT"},
            {"Oop 1", "ELECTRICAL CIRCUITS 2 (AC)", ""},
            {"Oop 1 lab", "ELECTRICAL CIRCUITS-2 (AC) LAB", "Tourism and Hospitality Management (THM)"},
            {"DATA STRUCTURE", "ELECTRICAL MACHINES 1 LAB", "Financial Accounting"},
            {"DATA STRUCTURE Lab", "ELECTRONIC DEVICES", "Micro Economics"},
            {"INTRODUCTION TO DATABASE", "ELECTRONIC DEVICES LAB", "Principles of Management"},
            {"ALGORITHMS", "BANGLADESH STUDIES", "Quantitative Techniques"},
            {"THEORY OF COMPUTATION", "MODERN PHYSICS", "Macroeconomics"},
            {"DATA COMMUNICATION", "ELECTROMAGNETICS FIELDS AND WAVES", "Environmental Management"},
            {"SOFTWARE ENGINEERING", "DIGITAL LOGIC AND CIRCUITS", "Business Analytics"},
            {"BANGLADESH STUDIES", "DIGITAL LOGIC AND CIRCUITS Lab", "Accounting (ACT"},
            {"ARTIFICIAL INTELLIGENCE", "Physics 1", "Marketing Techniques"},
            {"COMPUTER NETWORKS", "DIGITAL SIGNAL PROCESSING", "Direct and Indirect Tax"},
            {"COMPUTER ORGANIZATION AND ARCHITECTURE", "Physics 1", "Banking and Insurance"},
            {"COMPUTER NETWORKS", "EEE ELECTIVE 1", "Human Resource Management"},
            {"OPERATING SYSTEM", "CAPSTONE PROJECT 1", "Financial & Management Accounting"},
            {"WEB TECHNOLOGIES", "MICROWAVE ENGINEERING", "Business Laws"},
            {"COMPILER DESIGN", "POWER SYSTEM PROTECTION", "Leadership and Ethics"},
            {"COMPUTER GRAPHICS", "NUCLEAR POWER ENGINEERING", "Strategic Management"},
            {"ENGINEERING MANAGEMENT", "NANOTECHNOLOGY FOR ENGINEERS", "Financial Management"},
            {"THESIS / PROJECT", "VLSI CIRCUIT DESIGN", "Consumer Behaviour"},
            {"Oop 1", "ELECTRICAL CIRCUITS 2 (AC)", ""},
            {"Oop 1 lab", "ELECTRICAL CIRCUITS-2 (AC) LAB", "Tourism and Hospitality Management (THM)"},
            {"DATA STRUCTURE", "ELECTRICAL MACHINES 1 LAB", "Financial Accounting"},
            {"SOFTWARE ENGINEERING", "DIGITAL LOGIC AND CIRCUITS", "Business Analytics"},
            {"BANGLADESH STUDIES", "DIGITAL LOGIC AND CIRCUITS Lab", "Accounting (ACT"},
            {"physic 1", "ELECTRICAL CIRCUITS -1 (DC) (LAB)", "Management (MGT)"},
            {"physic 2", "Math 2", "Marketing (MKT)"},
            {"physics 1 lab", "PRINCIPLES OF ACCOUNTING", "Management Information Systems (MIS)"}
    };


    public TasaufCourses()
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
        ImageIcon backgroundImage = new ImageIcon("Img/Regestration.png");
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
                TasaufHome anik = new TasaufHome();
                anik.setVisible(true);
                dispose();
            }
        });

        // Profile Button Action Listener
        profile.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                TasaufProfile rp = new TasaufProfile();
                rp.setVisible(true);
                dispose();
            }
        });

        // Courses Button Action Listener
        courses.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                TasaufCourses c1 = new TasaufCourses();
                c1.setVisible(true);
                dispose();
            }
        });

        // Result Button Action Listener
        result.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                TasaufResult cr1 = new TasaufResult();
                cr1.setVisible(true);
                dispose();
            }
        });

        // Registration Button Action Listener
        regestration.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                TasaufRegistration r1 = new TasaufRegistration();
                r1.setVisible(true);
                dispose();
            }
        });

        // LogOut Button Action Listener
        logOut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int result = JOptionPane.showConfirmDialog(null, "Do you want to Log Out?", "Confirmation", JOptionPane.YES_NO_OPTION);

                if (result == JOptionPane.YES_OPTION) {
                    Login l1 = new Login();
                    l1.setVisible(true);
                    dispose();
                }
            }
        });

        // JTable for Courses
        table = new JTable(rows,cols);
        scroll = new JScrollPane(table);
        scroll.setBounds(250,80, 800, 520);
        c.add(scroll);


    }

    public static void main(String[] args) {
        Courses c1 = new Courses();
        c1.setVisible(true);
    }

}