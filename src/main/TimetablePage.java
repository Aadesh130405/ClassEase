package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

import timetable.CppTimetable;
import timetable.JavaTimetable;

import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TimetablePage {

	private JFrame frmTimetablePage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TimetablePage window = new TimetablePage();
					window.frmTimetablePage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TimetablePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTimetablePage = new JFrame();
		frmTimetablePage.setTitle("Timetable page");
		frmTimetablePage.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\NEWJava\\MyFirstJavaProject\\src\\First Java Project Photo\\N infinity.jpg"));
		frmTimetablePage.setBounds(400, 180, 750, 450);
		frmTimetablePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTimetablePage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Timetable");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(113, 10, 510, 46);
		frmTimetablePage.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(65, 66, 607, 2);
		frmTimetablePage.getContentPane().add(separator);
		
		JButton btnNewButton = new JButton("JAVA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JavaTimetable.main(null);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBounds(213, 151, 341, 39);
		frmTimetablePage.getContentPane().add(btnNewButton);
		
		JButton btnCpp = new JButton("CPP");
		btnCpp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CppTimetable.main(null);
			}
		});
		btnCpp.setForeground(Color.BLUE);
		btnCpp.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnCpp.setBounds(213, 215, 341, 39);
		frmTimetablePage.getContentPane().add(btnCpp);
		
		JLabel lblNewLabel_1 = new JLabel("Select your Subject");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(213, 87, 309, 29);
		frmTimetablePage.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(65, 302, 612, 2);
		frmTimetablePage.getContentPane().add(separator_1);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmTimetablePage.setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnNewButton_1.setBounds(67, 332, 139, 39);
		frmTimetablePage.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("EXIT");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1_1.setForeground(Color.RED);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnNewButton_1_1.setBounds(543, 332, 129, 39);
		frmTimetablePage.getContentPane().add(btnNewButton_1_1);
	}
}
