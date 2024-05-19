package website;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.*;
import java.io.FileWriter;
import javax.swing.table.DefaultTableModel;


public class Admission extends JFrame {

	String[] tableEmail = new String[5];
	String[] tablePhoneNumber = new String[5];
	private int size = 5;
	private int emailIndex = 0;
	private int phoneNumberIndex = 0;


	private JLabel labeL1, labeL2, labeL3, labeL4, labeL5, labeL6, labeL7, labeL8, labeL9, labeL10, labeL11, labeL12, labeL13, labeL14, labeL15;

	private JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9, tf10;

	// private ImageIcon img,img2,img10;
	private JTextArea area2, area1;
	private JRadioButton  maleButton, femaleButton;
	private JFileChooser f1;
	private Font font,font2,font3;
	private JScrollPane scroll, scrollTable;
	private Container c;
	private JTable table;
	private JButton addButton, deleteButton, clearButton,backbutton, updateButton;
	private DefaultTableModel  model; // row chara table create korbe
	private String columsData [] = {"Name","Email","Contuct Number","Nationality"};
	private String rowsData [] = new String[4];
	// initialize the parameters
	 public Admission()
	{
		init();
	}
	public void init()
	{
		// Creating Frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1080, 680);
        this.setResizable(false);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        // Creating Background Image
        ImageIcon backgroundImage = new ImageIcon("Img/Admission.jpg");
        JLabel bgImage = new JLabel(backgroundImage);
        bgImage.setLayout(new BorderLayout());
        this.setContentPane(bgImage);

		// Creating Container
		c = this.getContentPane();
		c.setLayout(null);

		// Back to Home
        JButton backToHome = new JButton("Home");
        backToHome.setFont(new Font("Arial" , Font.BOLD , 20));
        backToHome.setBounds(10,20,100,30);
        backToHome.setBackground(Color.GRAY);
        backToHome.setForeground(Color.WHITE);
        c.add(backToHome);

        // Back to Home button Action Listenter
        backToHome.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                HomePage h2 = new HomePage();
                h2.setVisible(true);
                dispose();
            }
        });

		// Creating Font
		font = new Font("Arial",Font.BOLD,36);
		font2 = new Font("Arial",Font.BOLD,12);
		font3 = new Font("Arial",Font.BOLD,14);


		// Create Label 1
		labeL1 = new JLabel("AIUB ONLINE ADMISSION");
		labeL1.setBounds(280, 0, 800, 80);
		labeL1.setFont(font);
		// Create Label 2
		labeL2 = new JLabel( "Name of the Student:");
		labeL2.setBounds(100,90, 250, 30);
		labeL2.setForeground(Color.BLACK);
		labeL2.setFont(font2);

		tf1 = new JTextField("Md Rijoan Maruf");
		tf1.setBounds(240, 90, 200, 30);

		// Create Label 3
		labeL3 = new JLabel( "Name of the Father:");
		labeL3.setBounds(100, 130, 250, 30);
		labeL3.setForeground(Color.BLACK);
		labeL3.setFont(font2);


		tf2 = new JTextField();
		tf2.setBounds(240, 130, 200, 30);

	    //Creat Label 4
		labeL4 = new JLabel("Name of the Mother:");
		labeL4.setBounds(100, 170, 200, 30);
		labeL4.setForeground(Color.BLACK);
		labeL4.setFont(font2);


		tf3 = new JTextField();
		tf3.setBounds(240, 170, 200, 30);

		//creat Label 5
		labeL5 = new JLabel("Email ID:");
		labeL5.setBounds(100, 210, 250, 30);
		labeL5.setForeground(Color.BLACK);
		labeL5.setFont(font2);


		tf4 = new JTextField("rijoanmaruf@gmail.com");
		tf4.setBounds(240, 210, 200, 30);

		//Create Label 6
		labeL6 = new JLabel("Contact Number:");
		labeL6.setBounds(100, 250, 250, 30);
		labeL6.setForeground(Color.BLACK);
		labeL6.setFont(font2);

		tf5 = new JTextField("01814859438");
		tf5.setBounds(240, 250, 200, 30);

		//Create Label 7
		labeL7 = new JLabel("Address:");
		labeL7.setBounds(100, 290, 250, 30);
		labeL7.setForeground(Color.BLACK);
		labeL7.setFont(font2);

		area1 = new JTextArea("Block C , Road 7 , Bashundhara R/A");
		area1.setBounds(240, 290, 200, 30);

		//Create Label 9
		labeL9 = new JLabel("Gender:");
		labeL9.setBounds(100, 330, 250, 30);
		labeL9.setForeground(Color.BLACK);
		labeL9.setFont(font2);
		// RadionBUtton

		JRadioButton maleButton = new JRadioButton(" Male");
		JRadioButton femaleButton = new JRadioButton(" Female");
		maleButton.setSelected(true);

		maleButton.setBounds(240, 330, 100, 30);
		femaleButton.setBounds(340, 330, 100, 30);

		ButtonGroup bg = new ButtonGroup();
		bg.add(maleButton);
		bg.add(femaleButton);


		//Create label 10
		labeL10 = new JLabel("Nationality:");
		labeL10 .setBounds(100, 370, 250, 30);
		labeL10.setForeground(Color.BLACK);
		labeL10.setFont(font2);

		tf6 = new JTextField("Bangladesh");
		tf6.setBounds(240, 370, 200, 30);

		//Create Label 11
		labeL11 = new JLabel( "Year of passing SSC");
		labeL11.setBounds(100, 410, 250, 30);
		labeL11.setForeground(Color.BLACK);
		labeL11.setFont(font2);

		String []yearOfPassingSsc = {"2016", "2017", "2018", "2019", "2020"};

		// ComboBox1
		final JComboBox cb1 = new JComboBox(yearOfPassingSsc);
		cb1.setBounds(240, 410, 90, 30);
		cb1.setSelectedIndex(4);

		//Creat Label2
		labeL12 = new JLabel("Year of passing HSC");
		labeL12.setBounds(100, 450, 250, 30);
		labeL12.setForeground(Color.BLACK);
		labeL12.setFont(font2);

		String [] YearOfPassingHsc = {"2017","2018","2019","2020", "2021","2022","2023"};

		//ComboBox 2
		final JComboBox cb2 = new JComboBox(YearOfPassingHsc);
		cb2.setBounds(240, 450, 90, 30);
		cb2.setSelectedIndex(5);


		//Create Label 13
		labeL13 = new JLabel("SSC GPA :");
		labeL13.setBounds(100, 490, 200, 30);
		labeL13.setForeground(Color.BLACK);
		labeL13.setFont(font2);

		tf7 = new JTextField("5.00");
		tf7.setBounds(240, 490, 200, 30);

	    // create Label 14
		labeL14 = new JLabel("HSC GPA :");
		labeL14.setBounds(100, 530, 200, 30);
		labeL14.setForeground(Color.BLACK);
		labeL14.setFont(font2);

		tf8 = new JTextField("5.00");
		tf8.setBounds(240, 530, 200, 30);

		//Create Label 8
		labeL8 = new JLabel( " Program Offered here are:");
		labeL8.setBounds(500, 80, 250, 20);
		labeL8.setFont(font3);

		labeL15 = new JLabel( " Seasons Offered here:");
		labeL15.setBounds(750, 80, 250, 20);
		labeL15.setFont(font3);

		final JLabel label = new JLabel();
		label.setBounds(450, 430, 500, 30);

		//JList
		JList list = new JList();
		list.setBounds(600, 350, 350, 125);

        // Generate Receipt Button
		JButton Receipt = new JButton("Generate Receipt");
		Receipt.setBounds(500, 360, 200, 30);
		Receipt.setBackground(new Color(0, 78, 162));
		Receipt.setForeground(Color.WHITE);

		//ResetButton
		JButton resetButton = new JButton("Reset");
		resetButton.setBounds(700, 360, 150, 30); // add 150
		resetButton.setBackground(new Color(0, 78, 162));
		resetButton.setForeground(Color.WHITE);

		JButton Print = new JButton("Print");
		Print.setBounds(850, 360, 150, 30);
		Print.setBackground(new Color(0, 78, 162));
		Print.setForeground(Color.WHITE);

		area2 = new JTextArea();
		area2.setBounds(450, 395, 600, 180);
		//area2.setBackground(Color.LIGHT_GRAY);

		//Submit JButton
		addButton = new JButton("Submit");
		addButton.setBounds(190, 580, 150, 30);
		addButton.setBackground(Color.GRAY);
		addButton.setForeground(Color.WHITE);
		c.add(addButton);


		deleteButton = new JButton("Delete");
		deleteButton.setBounds(510,160,150,30);
		deleteButton.setBackground(new Color(0, 78, 162));
		deleteButton.setForeground(Color.WHITE);
		c.add(deleteButton);

		clearButton = new JButton("Clear");
		clearButton.setBounds(660,160,150,30);
		clearButton.setBackground(new Color(0, 78, 162));
		clearButton.setForeground(Color.WHITE);
		c.add(clearButton);

		updateButton = new JButton("Update");
		updateButton.setBounds(810,160,150,30);
		updateButton.setBackground(new Color(0, 78, 162));
		updateButton.setForeground(Color.WHITE);
		c.add(updateButton);

		//create JTable
		table = new JTable();

		model = new DefaultTableModel();
		model.setColumnIdentifiers(columsData);
		table.setSelectionBackground(Color.GRAY);
		table.setModel(model);
		table.setRowHeight(30);
		scrollTable = new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollTable.setBounds(450,200, 600,130 );
		c.add(scrollTable);


		//add Label to JFrame
		c.add(labeL1);
		c.add(labeL2);
		c.add(labeL3);
		c.add(labeL4);
		c.add(labeL5);
		c.add(labeL6);
		c.add(labeL7);
		c.add(labeL8);
		c.add(labeL9);
		c.add(labeL10);
		c.add(labeL11);
		c.add(labeL12);
		c.add(labeL13);
		c.add(labeL14);

		// add textField to JFrame
		c.add(tf1);
		c.add(tf2);
		c.add(tf3);
		c.add(tf4);
		c.add(tf5);
		c.add(tf6);
		c.add(tf7);
		c.add(tf8);
		c.add(area1);
		c.add(area2);
		c.add(maleButton);
		c.add(femaleButton);
		c.add(cb1);
		c.add(cb2);
		c.add(label);
		c.add(Receipt);
		c.add(resetButton);
		c.add(labeL15);
		c.add(Print);

		//ComboBox3
		String programs[] = { "CSE", "IPE", "EEE", "CIVIL", "LLB" ,"BBA", "ENG","ARCH"};
		final JComboBox cb = new JComboBox(programs);
		cb.setBounds(520, 110, 130, 20);
		c.add(cb);

		// Combox 4

		String seasons[] = { "Spring", "Summer", "Fall"};
		final JComboBox cb4 = new JComboBox(seasons);
		cb4.setBounds(770, 110, 130, 20);
		c.add(cb4);
		// Reset the text fields
		resetButton.addActionListener( new ActionListener() {
				public void actionPerformed( ActionEvent e)
				{
					area2.setText("");
					area1.setText(" ");
					tf1.setText("");
					tf2.setText("");
					tf3.setText("");
					tf4.setText("");
					tf5.setText("");
					tf6.setText(" ");
				}
			});

		// Implementing the Print action
		Print.addActionListener( new ActionListener() {
				public void actionPerformed( ActionEvent e)
				{
					try {
						area2.print();
					}
					catch (PrinterException a) {
						System.err.format( "NoPrinter Found", a.getMessage());
					}
				}
			});

		// Generating the receipt
		Receipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{

				area2.setText(
					"--------------------------------"
					+ "-----------Online Admission FormS---"
					+ "--------------------------"
					+ "--------------------------"
					+ "-------------------\n");

				area2.setText(area2.getText() + "Student Name: "+ tf1.getText() + "\n");

				area2.setText(area2.getText() + "Father's Name: "+ tf2.getText() + "\n");

				area2.setText(area2.getText() + "RollNumber: "+ tf3.getText() + "\n");

				area2.setText(area2.getText() + "Email ID: "+ tf4.getText() + "\n");

				area2.setText(area2.getText() + "Contact Number: "+ tf5.getText() + "\n");

				area2.setText(area2.getText() + "Year Of Passing Ssc: "+ cb1.getSelectedItem() .toString() + "\n");

				area2.setText(area2.getText() + "Year Of Passing Hsc: "+ cb2.getSelectedItem() .toString() + "\n");

				area2.setText(area2.getText() + "SSC GPA : "+ tf7.getText()+ "\n");

				area2.setText(area2.getText() + "HSC GPA: "+ tf8.getText()+"\n");

				area2.setText(area2.getText() + "Wants to take: "+ cb.getSelectedItem() .toString() + "\n");

				if (e.getSource() == Receipt) {
					try {
						FileWriter fw = new FileWriter( "StudentRecipt.txt");
						fw.write(area2.getText());
						fw.close();
					}
					catch (Exception ae) {
						System.out.println(ae);
					}
				}
				if(e.getSource() == maleButton)
				{
					JOptionPane.showMessageDialog( null, "DATA SAVED SUCCESSFULLY!");
				}
				else
				{
					JOptionPane.showMessageDialog( null, "DATA SAVED SUCCESSFULLY!");
				}
			}
		});

		Handler handle = new Handler();
		addButton.addActionListener(handle);
		clearButton.addActionListener(handle);
		deleteButton.addActionListener(handle);
		updateButton.addActionListener(handle);
	}

	class Handler implements ActionListener {
		// submit button
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == addButton) {
				String name = tf1.getText();
				String email = tf4.getText();
				String phoneNumber = tf5.getText();
				String nationality = tf6.getText();

				boolean emailExists = false;
				boolean phoneNumberExists = false;

				// Check if email or phone number already exists
				for (int i = 0; i < emailIndex; i++) {
					if (tableEmail[i].equals(email)) {
						emailExists = true;
						break;
					}
				}

				for (int i = 0; i < phoneNumberIndex; i++) {
					if (tablePhoneNumber[i].equals(phoneNumber)) {
						phoneNumberExists = true;
						break;
					}
				}

				if (emailExists) {
					JOptionPane.showMessageDialog(null, "This email is already registered.");
				} else if (phoneNumberExists) {
					JOptionPane.showMessageDialog(null, "This phone number is already registered.");
				} else{
				if (tf1.getText().isEmpty() || tf2.getText().isEmpty() || tf3.getText().isEmpty() ||
						tf4.getText().isEmpty() || tf5.getText().isEmpty() || tf6.getText().isEmpty() ||
						tf7.getText().isEmpty() || tf8.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please fill the full form");
				} else {

					// Add data to the arrays
					tableEmail[emailIndex] = email;
					tablePhoneNumber[phoneNumberIndex] = phoneNumber;

					// Increment the index for the next entry
					emailIndex++;
					phoneNumberIndex++;


					rowsData[0] = tf1.getText();
					rowsData[1] = tf4.getText();
					rowsData[2] = tf5.getText();
					rowsData[3] = tf6.getText();
					model.addRow(rowsData);
					JOptionPane.showMessageDialog(null, "Successfully Submitted");
				}
			}}
			// Other actions for clearButton, deleteButton, and updateButton...
			else if (e.getSource() == clearButton) {
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
				tf4.setText("");
				tf5.setText("");
				tf6.setText("");
				tf7.setText("");
				tf8.setText("");
			} else if (e.getSource() == deleteButton) {
				int numberOfRow = table.getSelectedRow();
				if (numberOfRow >= 0) {
					model.removeRow(numberOfRow);
				} else {
					JOptionPane.showMessageDialog(null, "No Row has been Selected");
				}
			}
			else if (e.getSource() == updateButton) {
				int numOfRow = table.getSelectedRow();
				int numOfCol = table.getSelectedColumn();
				if (numOfRow >= 0 && numOfCol >= 0) {
					// Get data from the selected cell
					Object newData = table.getValueAt(numOfRow, numOfCol);

					// Update the corresponding text field with the new data
					if (numOfCol == 0) {
						tf1.setText(newData.toString());
					} else if (numOfCol == 1) {
						tf4.setText(newData.toString());
					} else if (numOfCol == 2) {
						tf5.setText(newData.toString());
					} else if (numOfCol == 3) {
						tf6.setText(newData.toString());
					}

					// Deselect the cell and row after update
					table.clearSelection();
					table.getSelectionModel().setAnchorSelectionIndex(-1);
					table.getSelectionModel().setLeadSelectionIndex(-1);

					JOptionPane.showMessageDialog(null, "Data Updated Successfully");
				} else {
					JOptionPane.showMessageDialog(null, "Please select a cell to update");
				}
			}



			else {
					JOptionPane.showMessageDialog(null, "No Row has been Selected");
				}
			}
		}

	public static void main(String[] args) {
		Admission a = new Admission();
		a.setVisible(true);
	}
	}
