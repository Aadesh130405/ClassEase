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
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class DeleteStudent {

	private JFrame frmDeleteStudentPage;
	private JTextField txtID;
	private JTextField txtName;
	private JTextField txtMobile;
	private JTextField txtGender;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteStudent window = new DeleteStudent();
					window.frmDeleteStudentPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DeleteStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDeleteStudentPage = new JFrame();
		frmDeleteStudentPage.setTitle("Delete Student Page");
		frmDeleteStudentPage.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\NEWJava\\MyFirstJavaProject\\src\\First Java Project Photo\\N infinity.jpg"));
		frmDeleteStudentPage.setBounds(250,50,1050,750);

		frmDeleteStudentPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDeleteStudentPage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Delete Student From List");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 45));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(172, 21, 691, 49);
		frmDeleteStudentPage.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(57, 98, 924, 2);
		frmDeleteStudentPage.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Student ID want to deleted");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_1.setForeground(new Color(255, 99, 71));
		lblNewLabel_1.setBounds(30, 168, 625, 43);
		frmDeleteStudentPage.getContentPane().add(lblNewLabel_1);
		
		txtID = new JTextField();
		txtID.setForeground(Color.BLUE);
		txtID.setFont(new Font("Tahoma", Font.BOLD, 40));
		txtID.setBounds(679, 168, 96, 43);
		frmDeleteStudentPage.getContentPane().add(txtID);
		txtID.setColumns(10);
		
		JButton btndata = new JButton("Get Data");
		btndata.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int number=Integer.parseInt(txtID.getText());
				JDBCHandling jb=new JDBCHandling();
				ResultSet result=null;
				result=jb.getRow(number);
				try {
					while(result.next()) {
						txtName.setText(result.getString(2));
						txtMobile.setText(result.getString(3));
						txtGender.setText(result.getString(5));
						
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
		btndata.setBackground(Color.WHITE);
		btndata.setFont(new Font("Tahoma", Font.BOLD, 30));
		btndata.setBounds(815, 170, 187, 42);
		frmDeleteStudentPage.getContentPane().add(btndata);
		
		JLabel lblNewLabel_2 = new JLabel("Full Name");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_2.setBounds(96, 284, 187, 33);
		frmDeleteStudentPage.getContentPane().add(lblNewLabel_2);
		
		txtName = new JTextField();
		txtName.setForeground(Color.BLUE);
		txtName.setFont(new Font("Tahoma", Font.BOLD, 30));
		txtName.setBounds(315, 284, 625, 43);
		frmDeleteStudentPage.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Mobile No:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_2_1.setBounds(96, 384, 200, 33);
		frmDeleteStudentPage.getContentPane().add(lblNewLabel_2_1);
		
		txtMobile = new JTextField();
		txtMobile.setForeground(Color.BLUE);
		txtMobile.setFont(new Font("Tahoma", Font.BOLD, 30));
		txtMobile.setColumns(10);
		txtMobile.setBounds(315, 373, 625, 43);
		frmDeleteStudentPage.getContentPane().add(txtMobile);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Gender");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_2_1_1.setBounds(96, 468, 187, 33);
		frmDeleteStudentPage.getContentPane().add(lblNewLabel_2_1_1);
		
		txtGender = new JTextField();
		txtGender.setForeground(Color.BLUE);
		txtGender.setFont(new Font("Tahoma", Font.BOLD, 30));
		txtGender.setColumns(10);
		txtGender.setBounds(315, 468, 625, 43);
		frmDeleteStudentPage.getContentPane().add(txtGender);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDeleteStudentPage.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 37));
		btnNewButton.setBounds(78, 611, 142, 43);
		frmDeleteStudentPage.getContentPane().add(btnNewButton);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(57, 559, 924, 2);
		frmDeleteStudentPage.getContentPane().add(separator_1);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDBCHandling jb=new JDBCHandling();
				int id=Integer.parseInt(txtID.getText());
				int status=jb.deleteUpdate(id);
				if(status==1) {
					JOptionPane.showConfirmDialog(null, "Data deleted succesfully");
				}else {
					JOptionPane.showConfirmDialog(null, "Problem in Data deletion");
				}
				
				txtName.setText(null);
				txtMobile.setText(null);
				txtGender.setText(null);
			}
		});
		btnDelete.setForeground(Color.RED);
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 37));
		btnDelete.setBounds(450, 611, 181, 43);
		frmDeleteStudentPage.getContentPane().add(btnDelete);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBackground(Color.WHITE);
		btnExit.setForeground(Color.BLACK);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 37));
		btnExit.setBounds(839, 611, 142, 43);
		frmDeleteStudentPage.getContentPane().add(btnExit);
	}
}
