package portal;

import website.HomePage;
import website.Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class TasaufRegistration extends JFrame {

    private Container c;
    private JLabel labelBachelor, labelDataBase, labelDataBaseLab, labelEnglish2, labelDataStructure, labelDataStructureLab, labelMath1, labelDevice, labelDeviceLab;
    private Font f, f1 ,f2;
    private JCheckBox CdataBase,CdataBase1,CdataBase2, CdataBaseLab, CdataBaseLab1, CdataBaseLab2, Cenglish2, Cenglish21,Cenglish22, CdataStructure, CdataStructure1,CdataStructure2,
            CdataStructureLab, CdataStructureLab1, CdataStructureLab2, Cmath1,Cmath11,Cmath12, CDevice,CDevice1, CDevice2, CDeviceLab, CDeviceLab1, CDeviceLab2;

    private ButtonGroup grpDatabase, grpDatabaseLab, grpEnglish , grpDataStructure, grpDataStructureLab, grpMath, grpDevice, grpDeviceLab;

    private JButton ConfirmRegistration, GoBack;

    private ImageIcon  img,img10;

    private JButton backbutton;

    public TasaufRegistration()
    {
        initComponents();
    }
    public void initComponents()
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


        // labelDataBase
        f1  = new Font("Arial", Font.BOLD, 16);
        labelDataBase = new JLabel("Database credit 3 :");
        labelDataBase.setBounds(250, 80, 180, 40);
        labelDataBase.setFont(f1);
        c.add(labelDataBase);
        /// CdataBase
        f = new Font("Arial", Font.BOLD, 12);
        CdataBase = new JCheckBox("DS508|A|[17/40]Sunday 8.00 AM-9.30 AM Theory]");
        CdataBase.setBounds(250,130, 350, 25);
        CdataBase.setFont(f2);
        CdataBase.setBackground(Color.WHITE);
        c.add(CdataBase);

        CdataBase1 = new JCheckBox("3208|C|[15/40]Monday 8.00 AM-9.30 AM Theory]");
        CdataBase1.setBounds(250,165, 350, 25);
        CdataBase1.setFont(f2);
        CdataBase1.setBackground(Color.WHITE);
        c.add(CdataBase1);

        CdataBase2 = new JCheckBox("2208|F|[12/40]Tuesday 8.00 AM-9.30 AM Theory]");
        CdataBase2.setBounds(250,200, 350, 25);
        CdataBase2.setFont(f2);
        CdataBase2.setBackground(Color.WHITE);
        c.add(CdataBase2);

        // Button Group DataBase
        grpDatabase = new ButtonGroup();
        grpDatabase.add(CdataBase);
        grpDatabase.add(CdataBase1);
        grpDatabase.add(CdataBase2);


        //labelDataBaseLab
        labelDataBaseLab = new JLabel("Database Lab Credit 1 :");
        labelDataBaseLab.setBounds(250, 235, 180, 40);
        labelDataBaseLab.setFont(f1);
        c.add(labelDataBaseLab);

        //CdataBaseLab
        CdataBaseLab = new JCheckBox("DS608|E|[25/40]Sunday 11.00 AM-12.30 PM Lab]");
        CdataBaseLab.setBounds(250,285,350,25);
        CdataBaseLab.setFont(f2);
        CdataBaseLab.setBackground(Color.WHITE);
        c.add(CdataBaseLab);

        CdataBaseLab1 = new JCheckBox("2208|R|[30/40]Monday 11.00 AM-12.30 PM Lab]");
        CdataBaseLab1.setBounds(250,320,350,25);
        CdataBaseLab1.setFont(f2);
        CdataBaseLab1.setBackground(Color.WHITE);
        c.add(CdataBaseLab1);

        CdataBaseLab2 = new JCheckBox("3204|G|[30/40]Monday 11.00 AM-12.30 PM Lab]");
        CdataBaseLab2.setBounds(250,355,350,25);
        CdataBaseLab2.setFont(f2);
        CdataBaseLab2.setBackground(Color.WHITE);
        c.add(CdataBaseLab2);

        //Button  Group grpDatabaseLab
        grpDatabaseLab = new ButtonGroup();
        grpDatabaseLab.add(CdataBaseLab);
        grpDatabaseLab.add(CdataBaseLab1);
        grpDatabaseLab.add(CdataBaseLab2);

        //labelEnglish2
        labelEnglish2 = new  JLabel("English 2 Credit 3 :");
        labelEnglish2.setBounds(250,390,180,40);
        labelEnglish2.setFont(f1);
        c.add(labelEnglish2);

        //Cenglish2
        Cenglish2 = new JCheckBox("DS202|R|[28/40]Monday 12.30.00 PM-2.00 PM Theory]");
        Cenglish2.setBounds(250,435,350,25);
        Cenglish2.setFont(f2);
        Cenglish2.setBackground(Color.WHITE);
        c.add(Cenglish2);

        Cenglish21 = new JCheckBox("DS302|S|[33/40]Tuesday 12.30.00 PM-2.00 PM Theory]");
        Cenglish21.setBounds(250,470,350,25);
        Cenglish21.setFont(f2);
        Cenglish21.setBackground(Color.WHITE);
        c.add(Cenglish21);

        Cenglish22 = new JCheckBox("DS402|P|[35/40]Tuesday 12.30.00 PM-2.00 PM Theory]");
        Cenglish22.setBounds(250,505,350,25);
        Cenglish22.setFont(f2);
        Cenglish22.setBackground(Color.WHITE);
        c.add(Cenglish22);

        //Button Group English
        grpEnglish = new ButtonGroup();
        grpEnglish.add(Cenglish2);
        grpEnglish.add(Cenglish21);
        grpEnglish.add(Cenglish22);

        //labelDataStructure
        labelDataStructure = new JLabel("Data Structure Credit 3 :");
        labelDataStructure.setBounds(650,80, 240, 40);//+270
        labelDataStructure.setFont(f1);
        c.add(labelDataStructure);

        //CdataStructure
        CdataStructure = new JCheckBox("DS204|I|[31/40]Sunday 9.30 AM-10.30 AM Theory]");
        CdataStructure.setBounds(650,130,350,25);
        CdataStructure.setFont(f2);
        CdataStructure.setBackground(Color.WHITE);
        c.add(CdataStructure);

        CdataStructure1 = new JCheckBox("DS510|F|[23/40]Monday 9.30 AM-10.30 AM Theory]");
        CdataStructure1.setBounds(650,165,350,25);
        CdataStructure1.setFont(f2);
        CdataStructure1.setBackground(Color.WHITE);
        c.add(CdataStructure1);

        CdataStructure2 = new JCheckBox("DS202|G|[31/40]Tuesday 9.30 AM-10.30 AM Theory]");
        CdataStructure2.setBounds(650,200,350,25);
        CdataStructure2.setFont(f2);
        CdataStructure2.setBackground(Color.WHITE);
        c.add(CdataStructure2);

        // Button Group grpDataStructure
        grpDataStructure = new ButtonGroup();
        grpDataStructure.add(CdataStructure);
        grpDataStructure.add(CdataStructure1);
        grpDataStructure.add(CdataStructure2);

        //labelDataStructureLab

        labelDataStructureLab = new JLabel("Data Structure Lab Credit 1:");
        labelDataStructureLab.setBounds(650, 230, 270, 40);
        labelDataStructureLab.setFont(f1);
        c.add(labelDataStructureLab);


        //CdataStructureLab
        CdataStructureLab = new JCheckBox("DS304|I|[31/40]Tuesday 9.30 AM-10.30 AM LAB]");
        c.add(CdataStructureLab);
        CdataStructureLab.setBounds(650,280,350,25);
        CdataStructureLab.setFont(f2);
        CdataStructureLab.setBackground(Color.WHITE);

        CdataStructureLab1 = new JCheckBox("DS303|H|[31/40]Thusday 9.30 AM-10.30 AM LAB]");
        CdataStructureLab1.setBounds(650,315,350,25);
        CdataStructureLab1.setFont(f2);
        CdataStructureLab1.setBackground(Color.WHITE);
        c.add(CdataStructureLab1);

        CdataStructureLab2 = new JCheckBox("DS306|D|[31/40]Thusday 9.30 AM-10.30 AM LAB]");
        CdataStructureLab2.setBounds(650,350,350,25);
        CdataStructureLab2.setFont(f2);
        CdataStructureLab2.setBackground(Color.WHITE);
        c.add(CdataStructureLab2);

        //labelMath1

        labelMath1 = new JLabel("Math 3 Credit 3:");
        labelMath1.setBounds(650, 385, 270, 40);
        labelMath1.setFont(f1);
        c.add(labelMath1);

        //Button group Data Structure lab
        grpDataStructure = new  ButtonGroup();
        grpDataStructure.add(CdataStructureLab);
        grpDataStructure.add(CdataStructureLab1);
        grpDataStructure.add(CdataStructureLab2);

        //Cmath1
        Cmath1 = new JCheckBox("DS205|C|[31/40]Tuesday 2.00 PM-3.30 PM Theory]");
        Cmath1.setBounds(650,435, 350,25);
        Cmath1.setFont(f2);
        Cmath1.setBackground(Color.WHITE);
        c.add(Cmath1);

        Cmath11 = new JCheckBox("DS207|A|[31/40] Thusday 9.30 AM-10.30 AM Theory]");
        Cmath11.setBounds(650, 470, 350,25);
        Cmath11.setFont(f2);
        Cmath11.setBackground(Color.WHITE);
        c.add(Cmath11);

        Cmath12 = new JCheckBox("DS202|B|[31/40] Monday 9.30 AM-10.30 AM Theory]");
        Cmath12.setBounds(650,505, 350,25);
        Cmath12.setFont(f2);
        Cmath12.setBackground(Color.WHITE);
        c.add(Cmath12);

        //Button group math
        grpMath = new  ButtonGroup();
        grpMath.add(Cmath1);
        grpMath.add(Cmath11);
        grpMath.add(Cmath12);

        JButton confirm = new JButton("Confirm Registration");
        confirm.setFont(new Font("Arial" , Font.BOLD , 20));
        confirm.setForeground(Color.BLACK);
        confirm.setBackground(Color.LIGHT_GRAY);
        confirm.setBounds(460,570,300,50);
        c.add(confirm);

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

        // Confirm button Action Listener
        confirm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                StringBuilder selectedCourses = new StringBuilder("Selected Courses:\n");
                boolean atLeastOneSelected = false; // Flag to check if at least one item is selected

                // Array of checkbox groups
                JCheckBox[][] checkboxGroups = {
                        {CdataBase, CdataBase1, CdataBase2},
                        {CdataBaseLab, CdataBaseLab1, CdataBaseLab2},
                        {Cenglish2, Cenglish21, Cenglish22},
                        // Add arrays for other course categories similarly
                };

                // Iterate over each group
                for (JCheckBox[] group : checkboxGroups) {
                    // Iterate over each checkbox in the group
                    for (JCheckBox checkbox : group) {
                        // Check if the checkbox is selected
                        if (checkbox.isSelected()) {
                            // Append the selected item to the StringBuilder
                            selectedCourses.append(checkbox.getText()).append("\n");
                            atLeastOneSelected = true; // Set the flag to true if at least one item is selected
                        }
                    }
                }

                // Show the selected courses in a JOptionPane only if at least one item is selected
                if (atLeastOneSelected) {
                    JOptionPane.showMessageDialog(null , selectedCourses.toString(), "Registration Complete!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null , "Please select Courses.", "No Courses Selected", JOptionPane.WARNING_MESSAGE);
                }
            }
        });



    }

    public static void main(String[] args) {
        RegestrationCourses r = new RegestrationCourses();
        r.setVisible(true);
    }
}