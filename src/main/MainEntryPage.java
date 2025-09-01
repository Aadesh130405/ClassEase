package main;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainEntryPage {

	private JFrame frmNInfinityAcademy;
	private JFrame f1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainEntryPage window = new MainEntryPage();
					window.frmNInfinityAcademy.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainEntryPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNInfinityAcademy = new JFrame();
		frmNInfinityAcademy.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\NEWJava\\MyFirstJavaProject\\src\\First Java Project Photo\\N infinity.jpg"));
		frmNInfinityAcademy.setTitle("N Infinity Academy Main Page");
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension dim=kit.getScreenSize();
		int w=(int)dim.getWidth();
		int h=(int)dim.getHeight();
		frmNInfinityAcademy.setSize(w/1,h/1);
		frmNInfinityAcademy.setLocationRelativeTo(null);
		frmNInfinityAcademy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNInfinityAcademy.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome To N-Infinity Accademy");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 42));
		lblNewLabel.setBounds(245, 28, 1031, 43);
		frmNInfinityAcademy.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(81, 96, 1259, 2);
		frmNInfinityAcademy.getContentPane().add(separator);
		
		JButton btnStaff = new JButton("STUDENT");
		btnStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentInformation.main(null);
			}
		});
		btnStaff.setForeground(Color.BLUE);
		btnStaff.setFont(new Font("Algerian", Font.BOLD, 40));
		btnStaff.setBounds(278, 546, 241, 51);
		frmNInfinityAcademy.getContentPane().add(btnStaff);
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		ImageIcon originalIcon = new ImageIcon("E:\\NEWJava\\MyFirstJavaProject\\src\\First Java Project Photo\\student.jpeg");
		Image scaledImage = originalIcon.getImage().getScaledInstance(343, 301, Image.SCALE_SMOOTH); // +30px
		lblNewLabel_1.setIcon(new ImageIcon(scaledImage));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(231, 224, 343, 301); // Also update label size
		frmNInfinityAcademy.getContentPane().add(lblNewLabel_1);

		// Add Student image with increased size
		JLabel lblNewLabel_1_1 = new JLabel("");
		ImageIcon originalIcon1 = new ImageIcon("E:\\NEWJava\\MyFirstJavaProject\\src\\First Java Project Photo\\staf.jpeg");
		Image resizedImage = originalIcon1.getImage().getScaledInstance(343, 301, Image.SCALE_SMOOTH); // +30px
		lblNewLabel_1_1.setIcon(new ImageIcon(resizedImage));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(882, 224, 343, 301); // Update bounds too
		frmNInfinityAcademy.getContentPane().add(lblNewLabel_1_1);
		


		

		
		JButton btnStudent = new JButton("STAFF");
		btnStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentDataManagement.main(null);
			}
		});
		btnStudent.setForeground(Color.BLUE);
		btnStudent.setFont(new Font("Algerian", Font.BOLD, 40));
		btnStudent.setBounds(937, 546, 228, 51);
		frmNInfinityAcademy.getContentPane().add(btnStudent);
		
		JLabel lblNewLabel_2 = new JLabel(" Please select your role to Continue...");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 25));
		lblNewLabel_2.setBounds(328, 129, 778, 51);
		frmNInfinityAcademy.getContentPane().add(lblNewLabel_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(81, 638, 1259, 2);
		frmNInfinityAcademy.getContentPane().add(separator_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmNInfinityAcademy.setVisible(false);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnBack.setBounds(143, 697, 166, 43);
		frmNInfinityAcademy.getContentPane().add(btnBack);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnExit.setForeground(Color.RED);
		btnExit.setBounds(1073, 697, 166, 43);
		frmNInfinityAcademy.getContentPane().add(btnExit);
	}
}
