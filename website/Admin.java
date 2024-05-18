package website;

import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin extends JFrame {
    public Admin(){
        init();
    }

    public void init(){
        // Creating frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1080, 680);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        // Creating Background Image
        ImageIcon backgroundImage = new ImageIcon("Img/Admin.png");
        JLabel bgImage = new JLabel(backgroundImage);
        bgImage.setLayout(new BorderLayout());
        this.setContentPane(bgImage);

        // Creating Container
        Container c = this.getContentPane();
        c.setLayout(null);

        // Log Out
        JButton backToHome = new JButton("Log out");
        backToHome.setFont(new Font("Arial", Font.BOLD, 20));
        backToHome.setBounds(880, 575, 140, 30);
        backToHome.setBackground(Color.GRAY);
        backToHome.setForeground(Color.WHITE);
        c.add(backToHome);

        // LogOut Button Action Listener
        backToHome.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int result = JOptionPane.showConfirmDialog(null, "Do you want to Log Out?", "Confirmation", JOptionPane.YES_NO_OPTION);

                if (result == JOptionPane.YES_OPTION) {
                    Login l1 = new Login();
                    l1.setVisible(true);
                    dispose();
                }
            }
        });

        // Create JLabel for "Student List"
        JLabel studentDetailsLabel = new JLabel("Student List : ");
        studentDetailsLabel.setFont(new Font("Arial", Font.BOLD, 24));
        studentDetailsLabel.setBounds(50, 70, 250, 30);
        c.add(studentDetailsLabel);

        // Create "Check Result" button
        JButton checkResultButton = new JButton("Check Result");
        checkResultButton.setFont(new Font("Arial", Font.BOLD, 20));
        checkResultButton.setBounds(900-50, 70, 160, 30); // Adjusted position between label and table
        checkResultButton.setBackground(Color.GRAY);
        checkResultButton.setForeground(Color.WHITE);
        c.add(checkResultButton);

        // Create "Student Information" button
        JButton studentInfoButton = new JButton("Student Information");
        studentInfoButton.setFont(new Font("Arial", Font.BOLD, 20));
        studentInfoButton.setBounds(checkResultButton.getX() - 300, 70, 250, 30); // Positioned 150 pixels left of checkResultButton
        studentInfoButton.setBackground(Color.GRAY);
        studentInfoButton.setForeground(Color.WHITE);
        c.add(studentInfoButton);

        // Student data
        String[] columnNames = {"Student ID", "Student Name"};
        Object[][] data = {
                {"23-53347-3", "Md Rijoan Maruf"},
                {"23-53193-3", "Md Rashedul Islam Shawon"},
                {"23-53354-3", "Raisul Islam Anik"},
                {"23-54025-3", "Md Tasauf Islam"}
        };

        // CGPA data
        double[] cgpas = {3.55, 3.78, 3.65, 3.44};

        // Creating the table
        JTable studentTable = new JTable(data, columnNames);

        // Setting font size for the table cells
        Font tableFont = new Font("Arial", Font.PLAIN, 20);
        studentTable.setFont(tableFont);
        studentTable.setRowHeight(40); // Adjust row height to 40 pixels

        // Setting font size for the table header
        JTableHeader tableHeader = studentTable.getTableHeader();
        tableHeader.setFont(new Font("Arial", Font.BOLD, 24));

        // Calculate the preferred height based on the row count and row height
        int preferredHeight = Math.min(studentTable.getRowCount() * studentTable.getRowHeight(), 200);

        // Creating the scroll pane with calculated preferred height
        JScrollPane scrollPane = new JScrollPane(studentTable);
        scrollPane.setBounds(50, 120, 980, preferredHeight);
        c.add(scrollPane);

        // Create a JLabel after the table "Student Information"
        JLabel studentInformationLabel = new JLabel("Student Information:");
        studentInformationLabel.setFont(new Font("Arial", Font.BOLD, 20));
        studentInformationLabel.setBounds(50, 120 + preferredHeight + 20, 200, 30); // Adjust position after the table
        c.add(studentInformationLabel);

        // Create a JTextArea after the table "Student Information"
        JTextArea studentInformationTextArea = new JTextArea();
        studentInformationTextArea.setFont(new Font("Arial", Font.PLAIN, 18));
        studentInformationTextArea.setBounds(50, 150 + preferredHeight + 20, 600, 290); // Adjust position after the table
        studentInformationTextArea.setEditable(false);
        studentInformationTextArea.setLineWrap(true); // Enable line wrapping
        studentInformationTextArea.setWrapStyleWord(true); // Wrap at word boundaries
        c.add(studentInformationTextArea);

        // Student data
        Object[][] studentInfoData = {
                {"Md Rijoan Maruf", "23-53347-3", "Mr x", "Ms y", 3.55, 120, 8, "0123456789", "rijoan@gmall.com", "Male", "BSc", "Computer Science", "Road 7 , Block C , Bashundhara R/A"},
                {"Md Rashedul Islam Shawon", "23-53193-3", "Ms x", "Ms y", 3.78, 110, 7, "017987654321", "shawon@gmail.com", "Male", "BSc", "Computer Science", "J Block , Bridhara"},
                {"Raisul Islam Anik", "23-53354-3", "Mr x", "Ms y", 3.65, 130, 9, "0163456789", "anik@gmail.com", "Male", "BSc", "Computer Science", "Mirpur 2, Dhaka , Bangladesh"},
                {"Md Tasauf Islam", "23-54025-3", "Mr x", "Ms y", 3.44, 115, 8, "01987654321", "tasauf@gmail.com", "Male", "BSc", "Computer Science", "F Block , Bashundhara R/A , Dhaka"}
        };

// Create studentInfoButton button action listener
        studentInfoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = studentTable.getSelectedRow();
                if (selectedRow != -1) {
                    // Get the selected student's data
                    Object[] studentInfo = studentInfoData[selectedRow];

                    // Display the selected student's data in the JTextArea
                    studentInformationTextArea.setText(
                            "Name: " + studentInfo[0] + "\n" +
                                    "ID: " + studentInfo[1] + "\n" +
                                    "Father's Name: " + studentInfo[2] + "\n" +
                                    "Mother's Name: " + studentInfo[3] + "\n" +
                                    "CGPA: " + studentInfo[4] + "\n" +
                                    "Credits Completed: " + studentInfo[5] + "\n" +
                                    "Total Semesters: " + studentInfo[6] + "\n" +
                                    "Phone Number: " + studentInfo[7] + "\n" +
                                    "Email: " + studentInfo[8] + "\n" +
                                    "Gender: " + studentInfo[9] + "\n" +
                                    "Program: " + studentInfo[10] + "\n" +
                                    "Department: " + studentInfo[11] + "\n" +
                                    "Address: " + studentInfo[12]
                    );
                } else {
                    // If no student is selected, show a message
                    studentInformationTextArea.setText("No student selected.");
                }
            }
        });


        // "Check Result" Button Action Listener
        checkResultButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = studentTable.getSelectedRow();
                if (selectedRow != -1) {
                    String studentID = (String) studentTable.getValueAt(selectedRow, 0);
                    String studentName = (String) studentTable.getValueAt(selectedRow, 1);
                    double cgpa = cgpas[selectedRow];
                    JOptionPane.showMessageDialog(null, "Selected Student:\nID: " + studentID + "\nName: " + studentName + "\nCGPA: " + cgpa);
                } else {
                    JOptionPane.showMessageDialog(null, "Please select a student.");
                }
            }
        });

        // Create a Clear button
        JButton clearButton = new JButton("Clear");
        clearButton.setFont(new Font("Arial", Font.BOLD, 20));
        clearButton.setBounds(670, 330, 100, 30);
        clearButton.setBackground(Color.GRAY);
        clearButton.setForeground(Color.WHITE);
        c.add(clearButton);

        // Clear button Action Listener
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Clear the JTextArea
                studentInformationTextArea.setText("");
            }
        });

    }

    public static void main(String[] args) {
        Admin a = new Admin();
        a.setVisible(true);
    }
}
