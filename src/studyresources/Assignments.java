package studyresources;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.awt.event.ActionEvent;

public class Assignments {

	private JFrame frmAssignmentsframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Assignments window = new Assignments();
					window.frmAssignmentsframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Assignments() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAssignmentsframe = new JFrame();
		frmAssignmentsframe.setTitle("Assignments Frame");
		frmAssignmentsframe.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\NEWJava\\MyFirstJavaProject\\src\\First Java Project Photo\\N infinity.jpg"));
		frmAssignmentsframe.setBounds(220,10,1150,800);
		frmAssignmentsframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAssignmentsframe.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Assignmensts ");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 43));
		lblNewLabel.setBounds(302, 0, 532, 58);
		frmAssignmentsframe.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(62, 68, 1001, 2);
		frmAssignmentsframe.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("JAVA ASSIGNMENTS");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBounds(62, 80, 347, 37);
		frmAssignmentsframe.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("30 Java Basic Exercises with Solutions");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				URI url;
				try {
					url = new URI("https://www.placementpreparation.io/programming-exercises/java/beginners/");
					Desktop.getDesktop().browse(url);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		frmAssignmentsframe.getContentPane().add(btnNewButton);
		frmAssignmentsframe.setVisible(true);
		
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton.setBounds(204, 136, 728, 51);
		frmAssignmentsframe.getContentPane().add(btnNewButton);
		
		JButton btnBasicsToAdvanced = new JButton("Basics To Advanced Programs ");
		btnBasicsToAdvanced.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					URI uri=new URI("https://www.geeksforgeeks.org/java/java-exercises/");
					Desktop.getDesktop().browse(uri);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		frmAssignmentsframe.getContentPane().add(btnBasicsToAdvanced);
		frmAssignmentsframe.setVisible(true);
		
		btnBasicsToAdvanced.setForeground(Color.BLUE);
		btnBasicsToAdvanced.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnBasicsToAdvanced.setBounds(204, 213, 728, 51);
		frmAssignmentsframe.getContentPane().add(btnBasicsToAdvanced);
		
		JButton btnNewButton_1 = new JButton("Exercises, Practice, Solution");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					URI uri=new URI("https://www.w3resource.com/java-exercises/");
					Desktop.getDesktop().browse(uri);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		frmAssignmentsframe.getContentPane().add(btnNewButton_1);
		frmAssignmentsframe.setVisible(true);
		
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_1.setBounds(204, 291, 728, 51);
		frmAssignmentsframe.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("CPP ASSIGNMENTS");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(62, 396, 347, 37);
		frmAssignmentsframe.getContentPane().add(lblNewLabel_1_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(62, 377, 1001, 2);
		frmAssignmentsframe.getContentPane().add(separator_1);
		
		JButton btnNewButton_2 = new JButton("30 Java Basic Exercises with Solutions");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					URI uri=new URI("https://www.placementpreparation.io/programming-exercises/cpp/beginners/");
					Desktop.getDesktop().browse(uri);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		frmAssignmentsframe.getContentPane().add(btnNewButton_2);
		frmAssignmentsframe.setVisible(true);
		btnNewButton_2.setForeground(Color.BLUE);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_2.setBounds(204, 452, 728, 51);
		frmAssignmentsframe.getContentPane().add(btnNewButton_2);
		
		JButton btnBasicsToAdvanced_1 = new JButton("Basics To Advanced Programs ");
		btnBasicsToAdvanced_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					URI uri=new URI("https://www.geeksforgeeks.org/cpp/cpp-exercises/");
					Desktop.getDesktop().browse(uri);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		frmAssignmentsframe.getContentPane().add(btnBasicsToAdvanced_1);
		frmAssignmentsframe.setVisible(true);
		btnBasicsToAdvanced_1.setForeground(Color.BLUE);
		btnBasicsToAdvanced_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnBasicsToAdvanced_1.setBounds(204, 530, 728, 51);
		frmAssignmentsframe.getContentPane().add(btnBasicsToAdvanced_1);
		
		JButton btnBasicsToAdvanced_2 = new JButton("Exercises,Practice,Solution");
		btnBasicsToAdvanced_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					URI uri=new URI("https://www.w3resource.com/cpp-exercises/#google_vignette");
					Desktop.getDesktop().browse(uri);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		frmAssignmentsframe.getContentPane().add(btnBasicsToAdvanced_2);
		frmAssignmentsframe.setVisible(true);
		btnBasicsToAdvanced_2.setForeground(Color.BLUE);
		btnBasicsToAdvanced_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnBasicsToAdvanced_2.setBounds(204, 608, 728, 51);
		frmAssignmentsframe.getContentPane().add(btnBasicsToAdvanced_2);
		
		JButton btnNewButton_3 = new JButton("BACK");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAssignmentsframe.setVisible(false);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnNewButton_3.setBounds(62, 707, 160, 37);
		frmAssignmentsframe.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("EXIT");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_3_1.setForeground(Color.RED);
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnNewButton_3_1.setBounds(922, 707, 160, 37);
		frmAssignmentsframe.getContentPane().add(btnNewButton_3_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(62, 684, 1001, 2);
		frmAssignmentsframe.getContentPane().add(separator_2);
	}

}
