package timetable;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import java.awt.Toolkit;
import java.awt.datatransfer.SystemFlavorMap;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CppTimetable {

	private JFrame frmCppTimetablePage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CppTimetable window = new CppTimetable();
					window.frmCppTimetablePage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CppTimetable() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCppTimetablePage = new JFrame();
		frmCppTimetablePage.setTitle("CPP TImetable page");
		frmCppTimetablePage.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\NEWJava\\MyFirstJavaProject\\src\\First Java Project Photo\\N infinity.jpg"));
		frmCppTimetablePage.setBounds(250, 50, 950, 650);
		frmCppTimetablePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCppTimetablePage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CPP Timetable");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 43));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(229, 21, 468, 44);
		frmCppTimetablePage.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(64, 86, 805, 2);
		frmCppTimetablePage.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Monday ");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(93, 123, 148, 33);
		frmCppTimetablePage.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tuesday");
		lblNewLabel_1_1.setForeground(Color.BLUE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(93, 184, 148, 33);
		frmCppTimetablePage.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Wednesday");
		lblNewLabel_1_2.setForeground(Color.BLUE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_2.setBounds(93, 248, 148, 33);
		frmCppTimetablePage.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Thursday");
		lblNewLabel_1_3.setForeground(Color.BLUE);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_3.setBounds(93, 314, 148, 33);
		frmCppTimetablePage.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Friday");
		lblNewLabel_1_4.setForeground(Color.BLUE);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_4.setBounds(93, 382, 148, 33);
		frmCppTimetablePage.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Saturday");
		lblNewLabel_1_5.setForeground(Color.BLUE);
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_5.setBounds(93, 447, 148, 33);
		frmCppTimetablePage.getContentPane().add(lblNewLabel_1_5);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(64, 518, 805, 2);
		frmCppTimetablePage.getContentPane().add(separator_1);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCppTimetablePage.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 33));
		btnNewButton.setBounds(64, 540, 148, 44);
		frmCppTimetablePage.getContentPane().add(btnNewButton);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(Color.RED);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 33));
		btnExit.setBounds(709, 540, 148, 44);
		
		
		JLabel lblNewLabel_1_6_1 = new JLabel("5:30 To 7:30 PM");
		lblNewLabel_1_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6_1.setForeground(Color.BLUE);
		lblNewLabel_1_6_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_6_1.setBounds(357, 184, 204, 33);
		frmCppTimetablePage.getContentPane().add(lblNewLabel_1_6_1);
		
		JLabel lblNewLabel_1_6_2 = new JLabel("5:30 To 7:00 PM");
		lblNewLabel_1_6_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6_2.setForeground(Color.BLUE);
		lblNewLabel_1_6_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_6_2.setBounds(357, 248, 204, 33);
		frmCppTimetablePage.getContentPane().add(lblNewLabel_1_6_2);
		
		JLabel lblNewLabel_1_6_3 = new JLabel("5:30 To 7:30 PM");
		lblNewLabel_1_6_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6_3.setForeground(Color.BLUE);
		lblNewLabel_1_6_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_6_3.setBounds(357, 314, 204, 33);
		frmCppTimetablePage.getContentPane().add(lblNewLabel_1_6_3);
		
		JLabel lblNewLabel_1_6_4 = new JLabel("5:30 To 7:30 PM");
		lblNewLabel_1_6_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6_4.setForeground(Color.BLUE);
		lblNewLabel_1_6_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_6_4.setBounds(357, 382, 204, 33);
		frmCppTimetablePage.getContentPane().add(lblNewLabel_1_6_4);
		
		JLabel lblNewLabel_1_6_5 = new JLabel("5:30 To 7:00 PM");
		lblNewLabel_1_6_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6_5.setForeground(Color.BLUE);
		lblNewLabel_1_6_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_6_5.setBounds(357, 447, 204, 33);
		frmCppTimetablePage.getContentPane().add(lblNewLabel_1_6_5);
		
		JLabel lblNewLabel_1_6_6 = new JLabel("Theory Session");
		lblNewLabel_1_6_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6_6.setForeground(Color.BLUE);
		lblNewLabel_1_6_6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_6_6.setBounds(657, 123, 200, 33);
		frmCppTimetablePage.getContentPane().add(lblNewLabel_1_6_6);
		
		JLabel lblNewLabel_1_6_7 = new JLabel("Theory Session");
		lblNewLabel_1_6_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6_7.setForeground(Color.BLUE);
		lblNewLabel_1_6_7.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_6_7.setBounds(675, 184, 173, 33);
		frmCppTimetablePage.getContentPane().add(lblNewLabel_1_6_7);
		
		JLabel lblNewLabel_1_6_7_1 = new JLabel("Theory Session");
		lblNewLabel_1_6_7_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6_7_1.setForeground(Color.BLUE);
		lblNewLabel_1_6_7_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_6_7_1.setBounds(675, 314, 173, 33);
		frmCppTimetablePage.getContentPane().add(lblNewLabel_1_6_7_1);
		
		JLabel lblNewLabel_1_6_7_2 = new JLabel("Theory Session");
		lblNewLabel_1_6_7_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6_7_2.setForeground(Color.BLUE);
		lblNewLabel_1_6_7_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_6_7_2.setBounds(675, 382, 173, 33);
		frmCppTimetablePage.getContentPane().add(lblNewLabel_1_6_7_2);
		
		JLabel lblNewLabel_1_6_7_3 = new JLabel("Practical");
		lblNewLabel_1_6_7_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6_7_3.setForeground(Color.BLUE);
		lblNewLabel_1_6_7_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_6_7_3.setBounds(675, 447, 173, 33);
		frmCppTimetablePage.getContentPane().add(lblNewLabel_1_6_7_3);
		
		JLabel lblNewLabel_1_6_7_4 = new JLabel("Practical");
		lblNewLabel_1_6_7_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6_7_4.setForeground(Color.BLUE);
		lblNewLabel_1_6_7_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_6_7_4.setBounds(675, 248, 173, 33);
		frmCppTimetablePage.getContentPane().add(lblNewLabel_1_6_7_4);
		
		JLabel lblNewLabel_1_6_1_1 = new JLabel("5:30 To 7:30 PM");
		lblNewLabel_1_6_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6_1_1.setForeground(Color.BLUE);
		lblNewLabel_1_6_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_6_1_1.setBounds(357, 123, 204, 33);
		frmCppTimetablePage.getContentPane().add(lblNewLabel_1_6_1_1);
		
		JButton btnExit_1 = new JButton("EXIT");
		btnExit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit_1.setForeground(Color.RED);
		btnExit_1.setFont(new Font("Tahoma", Font.BOLD, 33));
		btnExit_1.setBounds(711, 540, 148, 44);
		frmCppTimetablePage.getContentPane().add(btnExit_1);
	}
	

}
