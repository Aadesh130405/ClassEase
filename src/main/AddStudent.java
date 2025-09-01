package main;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import com.toedter.calendar.JDateChooser;

public class AddStudent {

	private JFrame frmAddStudentPage;
	private JTextField txtName;
	private JTextField txtMobile;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddStudent window = new AddStudent();
					window.frmAddStudentPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddStudentPage = new JFrame();
		frmAddStudentPage.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\NEWJava\\MyFirstJavaProject\\src\\First Java Project Photo\\N infinity.jpg"));
		frmAddStudentPage.setTitle("Add Student Page");
		frmAddStudentPage.setBounds(250,50,1050,750);
		frmAddStudentPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddStudentPage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Entry Form");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 40));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(163, 10, 710, 43);
		frmAddStudentPage.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(53, 63, 944, 2);
		frmAddStudentPage.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Full Name");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_1.setBounds(83, 111, 148, 28);
		frmAddStudentPage.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Mobile No :");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(83, 178, 148, 28);
		frmAddStudentPage.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Address");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_1_2.setBounds(83, 249, 130, 28);
		frmAddStudentPage.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Gender");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_1_2_1.setBounds(83, 414, 130, 28);
		frmAddStudentPage.getContentPane().add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Degree");
		lblNewLabel_1_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_1_2_2.setBounds(580, 414, 130, 28);
		frmAddStudentPage.getContentPane().add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("D.O.B.");
		lblNewLabel_1_2_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_3.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_1_2_3.setBounds(83, 520, 130, 28);
		frmAddStudentPage.getContentPane().add(lblNewLabel_1_2_3);
		
		JLabel lblNewLabel_1_2_4 = new JLabel("Subject");
		lblNewLabel_1_2_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_4.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_1_2_4.setBounds(580, 505, 130, 28);
		frmAddStudentPage.getContentPane().add(lblNewLabel_1_2_4);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(53, 611, 944, 2);
		frmAddStudentPage.getContentPane().add(separator_1);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAddStudentPage.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton.setBounds(69, 647, 130, 43);
		frmAddStudentPage.getContentPane().add(btnNewButton);
		JTextArea txtAddress = new JTextArea();
		txtAddress.setForeground(Color.BLUE);
		txtAddress.setFont(new Font("Tahoma", Font.BOLD, 23));
		txtAddress.setBounds(244, 249, 687, 106);
		frmAddStudentPage.getContentPane().add(txtAddress);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setForeground(Color.BLUE);
		dateChooser.setToolTipText("");
		dateChooser.setDateFormatString("yyyy-MM-dd");
		dateChooser.setBounds(244, 520, 204, 28);
		frmAddStudentPage.getContentPane().add(dateChooser);
		
		JCheckBox checkBox1 = new JCheckBox("JAVA");
		checkBox1.setForeground(Color.RED);
		checkBox1.setFont(new Font("Tahoma", Font.BOLD, 24));
		checkBox1.setBounds(731, 505, 93, 28);
		frmAddStudentPage.getContentPane().add(checkBox1);
		
		JCheckBox checkBox2 = new JCheckBox("CPP");
		checkBox2.setForeground(Color.RED);
		checkBox2.setFont(new Font("Tahoma", Font.BOLD, 24));
		checkBox2.setBounds(850, 505, 93, 28);
		frmAddStudentPage.getContentPane().add(checkBox2);
		

		JComboBox degreeBox = new JComboBox();
		degreeBox.setForeground(Color.BLUE);
		degreeBox.setFont(new Font("Tahoma", Font.BOLD, 23));
		degreeBox.setModel(new DefaultComboBoxModel(new String[] {"BE", "DIPLOMA", "ME", "MCA", "OTHER"}));
		degreeBox.setBounds(727, 415, 204, 28);
		frmAddStudentPage.getContentPane().add(degreeBox);
		
		JComboBox genderBox = new JComboBox();
		genderBox.setForeground(Color.BLUE);
		genderBox.setModel(new DefaultComboBoxModel(new String[] {"MALE", "FEMALE", "OTHER"}));
		genderBox.setFont(new Font("Tahoma", Font.BOLD, 22));
		genderBox.setBounds(244, 415, 204, 28);
		frmAddStudentPage.getContentPane().add(genderBox);
		
		
		
		
		JButton btnSave = new JButton("SAVE");
		btnSave.setForeground(Color.BLUE);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=null;
				
				if(txtName.getText().isEmpty()) {
					JOptionPane.showConfirmDialog(null, "Please Enter Name","Not Enter Name",JOptionPane.OK_OPTION);
				}else {
					name=txtName.getText();
				}
				
				long mobile=0;
				if(txtMobile.getText().isEmpty()) {
					JOptionPane.showConfirmDialog(null, "Please Enter Mobile Number","Not Enter Mobile Number",JOptionPane.OK_OPTION);
				}else {
					 mobile=Long.parseLong(txtMobile.getText());
				}
				String address=null;
				if(txtAddress.getText().isEmpty()) {
					JOptionPane.showConfirmDialog(null, "Please Enter Address","Not Enter Adress",JOptionPane.OK_OPTION);
				}else {
					address=txtAddress.getText();
				}
				String date=null;
				
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
				if(dateChooser.getDate()==null) {
					JOptionPane.showConfirmDialog(null, "Please select DOB","DOB Not Selected",JOptionPane.OK_OPTION);
				}else {
					date=sdf.format(dateChooser.getDate());
				}
				
				String sub1 = "";
				String sub2 = "";

				if (checkBox1.isSelected()) {
				    sub1 = checkBox1.getText(); // "JAVA"
				}

				if (checkBox2.isSelected()) {
				    if (sub1.isEmpty()) {
				        sub1 = checkBox2.getText(); // "CPP"
				    } else {
				        sub2 = checkBox2.getText(); // if both selected
				    }
				}

				if (sub1.isEmpty()) {
				    JOptionPane.showConfirmDialog(null, "Please select at least one subject", "Subject Not Selected", JOptionPane.OK_OPTION);
				    return;
				}

				
				String gender=null;
				gender=(String)genderBox.getSelectedItem();
				
				String degree=null;
				degree=(String)degreeBox.getSelectedItem();
				
				
				JDBCHandling j1=new JDBCHandling();
				int status=j1.insertData(name, mobile, address, gender, degree, date, sub1, sub2);
				if(status==1) {
					
					JOptionPane.showConfirmDialog(null, "Data Added Succesfully");
				}else {
					JOptionPane.showConfirmDialog(null, "Problem in Add Data");
				}
				
				
			}
		});
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnSave.setBounds(315, 647, 115, 43);
		frmAddStudentPage.getContentPane().add(btnSave);
		
		
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText(null);
				txtMobile.setText(null);
				txtAddress.setText(null);
				dateChooser.setCalendar(null);
				checkBox1.setSelected(false);
				checkBox2.setSelected(false);
				
				
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnReset.setBounds(567, 647, 135, 43);
		frmAddStudentPage.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(Color.RED);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnExit.setBounds(850, 647, 115, 43);
		frmAddStudentPage.getContentPane().add(btnExit);
		
		txtName = new JTextField();
		txtName.setForeground(Color.BLUE);
		txtName.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtName.setBounds(244, 111, 687, 30);
		frmAddStudentPage.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		txtMobile = new JTextField();
		txtMobile.setForeground(Color.BLUE);
		txtMobile.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtMobile.setColumns(10);
		txtMobile.setBounds(244, 178, 687, 30);
		frmAddStudentPage.getContentPane().add(txtMobile);
		
		
		
		
	}
}
