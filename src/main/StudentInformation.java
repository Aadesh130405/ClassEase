package main;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JSeparator;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentInformation {

	private JFrame frmStudentInformationPage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentInformation window = new StudentInformation();
					window.frmStudentInformationPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentInformation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudentInformationPage = new JFrame();
		frmStudentInformationPage.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\NEWJava\\MyFirstJavaProject\\src\\First Java Project Photo\\N infinity.jpg"));
		frmStudentInformationPage.setTitle("Student Information Page");
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension dim=kit.getScreenSize();
		int w=(int)dim.getWidth();
		int h=(int)dim.getHeight();
		frmStudentInformationPage.setSize(w/1,h/1);
		frmStudentInformationPage.setLocationRelativeTo(null);
		frmStudentInformationPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentInformationPage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Information Page");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 45));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(403, 10, 703, 57);
		frmStudentInformationPage.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(105, 94, 1338, 2);
		frmStudentInformationPage.getContentPane().add(separator);
		
		JPanel panel = new JPanel();
		panel.setBounds(246, 106, 1090, 553);
		frmStudentInformationPage.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("E:\\NEWJava\\MyFirstJavaProject\\src\\First Java Project Photo\\view_profile.jpeg"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(108, 0, 265, 217);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("E:\\NEWJava\\MyFirstJavaProject\\src\\First Java Project Photo\\Study material.jpeg"));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(732, 0, 265, 217);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon("E:\\NEWJava\\MyFirstJavaProject\\src\\First Java Project Photo\\timetable.jpeg"));
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBounds(108, 265, 265, 217);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("");
		lblNewLabel_1_3.setIcon(new ImageIcon("E:\\NEWJava\\MyFirstJavaProject\\src\\First Java Project Photo\\OIP.jpeg"));
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setBounds(732, 265, 265, 217);
		panel.add(lblNewLabel_1_3);

		
		JButton btnProfile = new JButton("View Profile");
		btnProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentProfile.main(null);
			}
		});
		btnProfile.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnProfile.setBounds(134, 210, 231, 51);
		panel.add(btnProfile);
		
		JButton btnStudy = new JButton("Study Material");
		btnStudy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudyMaterial.main(null);
			}
		});
		
		btnStudy.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnStudy.setBounds(742, 210, 268, 51);
		panel.add(btnStudy);
		
		JButton btnTimetable = new JButton("Timetable");
		btnTimetable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TimetablePage.main(null);
			}
		});
		btnTimetable.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnTimetable.setBounds(134, 481, 231, 51);
		panel.add(btnTimetable);
		
		JButton btnAnnouncement = new JButton("Announcement");
		btnAnnouncement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AnnouncementPage.main(null);
			}
		});
		btnAnnouncement.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnAnnouncement.setBounds(742, 481, 268, 51);
		panel.add(btnAnnouncement);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(105, 694, 1338, 2);
		frmStudentInformationPage.getContentPane().add(separator_1);
		
		JButton btnNewButton_2 = new JButton("BACK");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmStudentInformationPage.setVisible(false);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 37));
		btnNewButton_2.setBounds(163, 726, 163, 47);
		frmStudentInformationPage.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("EXIT");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2_1.setForeground(Color.RED);
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 37));
		btnNewButton_2_1.setBounds(1278, 726, 163, 47);
		frmStudentInformationPage.getContentPane().add(btnNewButton_2_1);
	}
}
