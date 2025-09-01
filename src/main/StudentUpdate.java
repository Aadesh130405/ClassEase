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
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JDateChooser;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class StudentUpdate {

	private JFrame frmStudentUpdatePage;
	private JTextField textId;
	private JTextField txtName;
	private JTextField txtmobile;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentUpdate window = new StudentUpdate();
					window.frmStudentUpdatePage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentUpdate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudentUpdatePage = new JFrame();
		frmStudentUpdatePage.setTitle(" Student Update Page");
		frmStudentUpdatePage.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\NEWJava\\MyFirstJavaProject\\src\\First Java Project Photo\\N infinity.jpg"));
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension dim=kit.getScreenSize();
		int w=(int)dim.getWidth();
		int h=(int)dim.getHeight();
		frmStudentUpdatePage.setSize(w/1,h/1);
		frmStudentUpdatePage.setLocationRelativeTo(null);
		frmStudentUpdatePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentUpdatePage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Student ID to Update");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 40));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(70, 23, 691, 43);
		frmStudentUpdatePage.getContentPane().add(lblNewLabel);
		
		textId = new JTextField();
		textId.setForeground(Color.BLUE);
		textId.setFont(new Font("Tahoma", Font.BOLD, 40));
		textId.setBounds(844, 31, 114, 35);
		frmStudentUpdatePage.getContentPane().add(textId);
		textId.setColumns(10);
		
		JTextArea txtAddress = new JTextArea();
		txtAddress.setForeground(Color.BLUE);
		txtAddress.setFont(new Font("Tahoma", Font.BOLD, 23));
		txtAddress.setBounds(498, 293, 687, 106);
		frmStudentUpdatePage.getContentPane().add(txtAddress);
		
		JButton btnNewButton = new JButton("Get Data");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int number=Integer.parseInt(textId.getText());
				JDBCHandling jb=new JDBCHandling();
				ResultSet result=null;
				result=jb.getRow(number);
				try {
					while(result.next()) {
						txtName.setText(result.getString(2));
						txtmobile.setText(result.getString(3));
						txtAddress.setText(result.getString(4));
						
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					result.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 34));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(1081, 31, 197, 36);
		frmStudentUpdatePage.getContentPane().add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(63, 101, 1370, 2);
		frmStudentUpdatePage.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Full Name");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel_1.setBounds(244, 152, 148, 28);
		frmStudentUpdatePage.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Mobile No :");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel_1_1.setBounds(244, 220, 160, 28);
		frmStudentUpdatePage.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Address");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel_1_2.setBounds(244, 294, 130, 28);
		frmStudentUpdatePage.getContentPane().add(lblNewLabel_1_2);
		
		txtName = new JTextField();
		txtName.setForeground(Color.BLUE);
		txtName.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtName.setColumns(10);
		txtName.setBounds(498, 149, 687, 35);
		frmStudentUpdatePage.getContentPane().add(txtName);
		
		txtmobile = new JTextField();
		txtmobile.setForeground(Color.BLUE);
		txtmobile.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtmobile.setColumns(10);
		txtmobile.setBounds(498, 213, 687, 35);
		frmStudentUpdatePage.getContentPane().add(txtmobile);
		
		
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Gender");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 29));
		lblNewLabel_1_2_1.setBounds(262, 486, 130, 28);
		frmStudentUpdatePage.getContentPane().add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Degree");
		lblNewLabel_1_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 29));
		lblNewLabel_1_2_1_1.setBounds(828, 483, 130, 35);
		frmStudentUpdatePage.getContentPane().add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_2_1_2 = new JLabel("D.O.B.");
		lblNewLabel_1_2_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 29));
		lblNewLabel_1_2_1_2.setBounds(262, 587, 130, 28);
		frmStudentUpdatePage.getContentPane().add(lblNewLabel_1_2_1_2);
		
		JLabel lblNewLabel_1_2_1_3 = new JLabel("Subject");
		lblNewLabel_1_2_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 29));
		lblNewLabel_1_2_1_3.setBounds(828, 584, 130, 35);
		frmStudentUpdatePage.getContentPane().add(lblNewLabel_1_2_1_3);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(70, 676, 1363, 2);
		frmStudentUpdatePage.getContentPane().add(separator_1);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmStudentUpdatePage.setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_1.setBounds(86, 727, 130, 43);
		frmStudentUpdatePage.getContentPane().add(btnNewButton_1);
		
		JComboBox genderBox = new JComboBox();
		genderBox.setModel(new DefaultComboBoxModel(new String[] {"MALE", "FEMALE", "OTHER"}));
		genderBox.setForeground(Color.BLUE);
		genderBox.setFont(new Font("Tahoma", Font.BOLD, 28));
		genderBox.setBounds(459, 486, 204, 35);
		frmStudentUpdatePage.getContentPane().add(genderBox);
		
		JComboBox degreeBox = new JComboBox();
		degreeBox.setModel(new DefaultComboBoxModel(new String[] {"BE", "DIPLOMA", "ME", "MCA", "OTHER"}));
		degreeBox.setForeground(Color.BLUE);
		degreeBox.setFont(new Font("Tahoma", Font.BOLD, 29));
		degreeBox.setBounds(1011, 482, 204, 32);
		frmStudentUpdatePage.getContentPane().add(degreeBox);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setForeground(Color.BLUE);
		dateChooser.setDateFormatString("yyyy-MM-dd");
		dateChooser.setBounds(459, 587, 226, 28);
		frmStudentUpdatePage.getContentPane().add(dateChooser);
		
		JCheckBox checkBox1 = new JCheckBox("JAVA");
		checkBox1.setFont(new Font("Tahoma", Font.BOLD, 27));
		checkBox1.setForeground(Color.RED);
		checkBox1.setBounds(1011, 588, 120, 28);
		frmStudentUpdatePage.getContentPane().add(checkBox1);
		
		JCheckBox checkBox2 = new JCheckBox("CPP");
		checkBox2.setForeground(Color.RED);
		checkBox2.setFont(new Font("Tahoma", Font.BOLD, 28));
		checkBox2.setBounds(1181, 587, 93, 28);
		frmStudentUpdatePage.getContentPane().add(checkBox2);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=null;
				
				if(txtName.getText().isEmpty()) {
					JOptionPane.showConfirmDialog(null, "Please Enter Name","Not Enter Name",JOptionPane.OK_OPTION);
				}else {
					name=txtName.getText();
				}
				
				long mobile=0;
				if(txtmobile.getText().isEmpty()) {
					JOptionPane.showConfirmDialog(null, "Please Enter Mobile Number","Not Enter Mobile Number",JOptionPane.OK_OPTION);
				}else {
					 mobile=Long.parseLong(txtmobile.getText());
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
//				
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
				
				
				JDBCHandling j1 = new JDBCHandling();
				int id = Integer.parseInt(textId.getText());
				int status = j1.insertUpdate(name, mobile, address, gender, degree, date, sub1, sub2, id);

				if(status==1) {
					
					JOptionPane.showConfirmDialog(null, "Data Added Succesfully");
				}else {
					JOptionPane.showConfirmDialog(null, "Problem in Add Data");
				}
				
				
			}
		
	});
		btnSave.setForeground(Color.BLUE);
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnSave.setBounds(405, 727, 130, 43);
		frmStudentUpdatePage.getContentPane().add(btnSave);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnReset.setBounds(776, 727, 148, 43);
		frmStudentUpdatePage.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setForeground(Color.RED);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnExit.setBounds(1158, 727, 130, 43);
		frmStudentUpdatePage.getContentPane().add(btnExit);
		
		
	}
}
