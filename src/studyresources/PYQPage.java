package studyresources;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import javax.swing.SwingConstants;

import pyqresource.Javapyq;

import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.event.ActionEvent;

public class PYQPage {

	private JFrame frmPyqPage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PYQPage window = new PYQPage();
					window.frmPyqPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PYQPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPyqPage = new JFrame();
		frmPyqPage.setTitle("PYQ Page");
		frmPyqPage.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\NEWJava\\MyFirstJavaProject\\src\\First Java Project Photo\\N infinity.jpg"));
		frmPyqPage.setBounds(200, 50, 1150, 750);
		frmPyqPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPyqPage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Previous Year Questions");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 43));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(297, 10, 565, 59);
		frmPyqPage.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(97, 79, 950, 2);
		frmPyqPage.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("JAVA PYQ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 39));
		lblNewLabel_1.setBounds(97, 103, 216, 44);
		frmPyqPage.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Oracle Test Practice");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					URI uri=new URI("https://www.testsimulate.com/java-se-11-developer--1Z0-819-free-practice-test.html#");
					Desktop.getDesktop().browse(uri);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		frmPyqPage.getContentPane().add(btnNewButton);
		frmPyqPage.setVisible(true);
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnNewButton.setBounds(273, 168, 589, 49);
		frmPyqPage.getContentPane().add(btnNewButton);
		
		JButton btnUniversityPyq = new JButton("University PYQ");
		btnUniversityPyq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Javapyq.main(null);
			}
		});
		btnUniversityPyq.setForeground(Color.BLUE);
		btnUniversityPyq.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnUniversityPyq.setBounds(273, 247, 589, 49);
		frmPyqPage.getContentPane().add(btnUniversityPyq);
		
		JLabel lblNewLabel_1_1 = new JLabel("CPP PYQ");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 39));
		lblNewLabel_1_1.setBounds(97, 355, 202, 44);
		frmPyqPage.getContentPane().add(lblNewLabel_1_1);
		
		JButton btnCppTestsPractice = new JButton("CPP Tests Practice");
		btnCppTestsPractice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					URI uri=new URI("https://www.questionkaka.com/22316-model-answer-paper-question-paper/");
					Desktop.getDesktop().browse(uri);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		frmPyqPage.getContentPane().add(btnCppTestsPractice);
		frmPyqPage.setVisible(true);
		btnCppTestsPractice.setForeground(Color.BLUE);
		btnCppTestsPractice.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnCppTestsPractice.setBounds(273, 415, 589, 49);
		frmPyqPage.getContentPane().add(btnCppTestsPractice);
		
		JButton btnUniversityPyq_1 = new JButton("University PYQ");
		btnUniversityPyq_1.setForeground(Color.BLUE);
		btnUniversityPyq_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnUniversityPyq_1.setBounds(273, 498, 589, 49);
		frmPyqPage.getContentPane().add(btnUniversityPyq_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(97, 327, 950, 2);
		frmPyqPage.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(97, 586, 950, 2);
		frmPyqPage.getContentPane().add(separator_2);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPyqPage.setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnNewButton_1.setBounds(93, 621, 147, 34);
		frmPyqPage.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("EXIT");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1_1.setForeground(Color.RED);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnNewButton_1_1.setBounds(888, 621, 147, 34);
		frmPyqPage.getContentPane().add(btnNewButton_1_1);
	}

}
