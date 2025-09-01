package main;

import java.awt.Dimension;

import studyresources.*;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudyMaterial {

	private JFrame frmStudyMaterial;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudyMaterial window = new StudyMaterial();
					window.frmStudyMaterial.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudyMaterial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudyMaterial = new JFrame();
		frmStudyMaterial.setTitle("Study Material");
		frmStudyMaterial.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\NEWJava\\MyFirstJavaProject\\src\\First Java Project Photo\\N infinity.jpg"));
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension dim=kit.getScreenSize();
		int w=(int)dim.getWidth();
		int h=(int)dim.getHeight();
		frmStudyMaterial.setSize(w/1,h/1);
		frmStudyMaterial.setLocationRelativeTo(null);
		frmStudyMaterial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudyMaterial.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Study Material And Assignments");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 43));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(349, 10, 830, 62);
		frmStudyMaterial.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(61, 93, 1376, 2);
		frmStudyMaterial.getContentPane().add(separator);
		
		JButton btnAssignments = new JButton("Assignments");
		btnAssignments.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Assignments.main(null);
			}
		});
		btnAssignments.setForeground(Color.BLUE);
		btnAssignments.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnAssignments.setBounds(202, 295, 1074, 52);
		frmStudyMaterial.getContentPane().add(btnAssignments);
		
		JButton btnClassTest = new JButton("Class Test");
		btnClassTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClassTest.main(null);
			}
		});
		btnClassTest.setForeground(Color.BLUE);
		btnClassTest.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnClassTest.setBounds(202, 424, 1074, 52);
		frmStudyMaterial.getContentPane().add(btnClassTest);
		
		JButton btnPrevious = new JButton("Previous Test Paper");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PYQPage.main(null);
			}
		});
		btnPrevious.setForeground(Color.BLUE);
		btnPrevious.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnPrevious.setBounds(202, 564, 1074, 52);
		frmStudyMaterial.getContentPane().add(btnPrevious);
		
		JButton btnStudyMaterial = new JButton("Study Material");
		btnStudyMaterial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudyMaterial2.main(null);
			
			}
		});
		btnStudyMaterial.setForeground(Color.BLUE);
		btnStudyMaterial.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnStudyMaterial.setBounds(202, 158, 1074, 52);
		frmStudyMaterial.getContentPane().add(btnStudyMaterial);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(61, 681, 1376, 2);
		frmStudyMaterial.getContentPane().add(separator_1);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmStudyMaterial.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton.setBounds(114, 725, 154, 40);
		frmStudyMaterial.getContentPane().add(btnNewButton);
		
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(Color.RED);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnExit.setBounds(1183, 725, 154, 40);
		frmStudyMaterial.getContentPane().add(btnExit);
	}
}
