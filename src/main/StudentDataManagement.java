package main;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;

public class StudentDataManagement {

	private JFrame frmStudentDatabaseManagement;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentDataManagement window = new StudentDataManagement();
					window.frmStudentDatabaseManagement.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentDataManagement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudentDatabaseManagement = new JFrame();
		frmStudentDatabaseManagement.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\NEWJava\\MyFirstJavaProject\\src\\First Java Project Photo\\N infinity.jpg"));
		frmStudentDatabaseManagement.setTitle("Student Database Management");
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension dim=kit.getScreenSize();
		int w=(int)dim.getWidth();
		int h=(int)dim.getHeight();
		frmStudentDatabaseManagement.setSize(w/1,h/1);
		frmStudentDatabaseManagement.setLocationRelativeTo(null);
		frmStudentDatabaseManagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentDatabaseManagement.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Database Management");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 50));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(315, 18, 891, 57);
		frmStudentDatabaseManagement.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(70, 85, 1394, 2);
		frmStudentDatabaseManagement.getContentPane().add(separator);
		
		JPanel panel = new JPanel();
		panel.setBounds(284, 108, 992, 538);
		frmStudentDatabaseManagement.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("E:\\NEWJava\\MyFirstJavaProject\\src\\First Java Project Photo\\Add.jpeg"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(80, 10, 231, 187);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("E:\\NEWJava\\MyFirstJavaProject\\src\\First Java Project Photo\\display list.jpeg"));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(657, 10, 231, 187);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon("E:\\NEWJava\\MyFirstJavaProject\\src\\First Java Project Photo\\delete.jpeg"));
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBounds(657, 293, 231, 180);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setIcon(new ImageIcon("E:\\NEWJava\\MyFirstJavaProject\\src\\First Java Project Photo\\update.jpeg"));
		lblNewLabel_1_3.setBounds(82, 293, 235, 180);
		panel.add(lblNewLabel_1_3);
		
		JButton btnAdd = new JButton("ADD STUDENT");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddStudent.main(null);
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnAdd.setForeground(Color.BLUE);
		btnAdd.setBounds(90, 207, 227, 57);
		panel.add(btnAdd);
		
		JButton btnStudentList = new JButton("STUDENT LIST");
		btnStudentList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentList.main(null);
			}
		});
		btnStudentList.setForeground(Color.BLUE);
		btnStudentList.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnStudentList.setBounds(657, 207, 231, 57);
		panel.add(btnStudentList);
		
		JButton btnUpdateList = new JButton("UPDATE LIST");
		btnUpdateList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentUpdate.main(null);
			}
		});
		btnUpdateList.setForeground(Color.BLUE);
		btnUpdateList.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnUpdateList.setBounds(92, 483, 212, 55);
		panel.add(btnUpdateList);
		
		JButton btnDeleteStudent = new JButton("DELETE STUDENT");
		btnDeleteStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteStudent.main(null);
			}
		});
		btnDeleteStudent.setForeground(Color.BLUE);
		btnDeleteStudent.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnDeleteStudent.setBounds(648, 483, 256, 55);
		panel.add(btnDeleteStudent);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(70, 674, 1394, 2);
		frmStudentDatabaseManagement.getContentPane().add(separator_1);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmStudentDatabaseManagement.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton.setBounds(95, 716, 169, 49);
		frmStudentDatabaseManagement.getContentPane().add(btnNewButton);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(Color.RED);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnExit.setBounds(1250, 716, 169, 49);
		frmStudentDatabaseManagement.getContentPane().add(btnExit);
		
		JButton btnNewButton_1_1_1 = new JButton("Post Announcement");
		btnNewButton_1_1_1.setBounds(486, 708, 556, 57);
		frmStudentDatabaseManagement.getContentPane().add(btnNewButton_1_1_1);
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PostAnnouncement.main(null);
			}
		});
		btnNewButton_1_1_1.setForeground(Color.BLUE);
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 34));
	}
}
