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
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginForm {

	private JFrame frmNInfinityAcadam;
	private JTextField txtLogin;
	private JPasswordField passwordField;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm window = new LoginForm();
					window.frmNInfinityAcadam.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNInfinityAcadam = new JFrame();
		frmNInfinityAcadam.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\NEWJava\\MyFirstJavaProject\\src\\First Java Project Photo\\N infinity.jpg"));
		frmNInfinityAcadam.setTitle("N Infinity Academy");
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension dim=kit.getScreenSize();
		int w=(int)dim.getWidth();
		int h=(int)dim.getHeight();
		frmNInfinityAcadam.setSize(w/2,h/2);
		frmNInfinityAcadam.setLocationRelativeTo(null);
		
		
		frmNInfinityAcadam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNInfinityAcadam.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("N Infinity Academy");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(104, 22, 546, 35);
		frmNInfinityAcadam.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Login Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_1.setBounds(83, 123, 139, 28);
		frmNInfinityAcadam.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(83, 82, 594, 2);
		frmNInfinityAcadam.getContentPane().add(separator);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_1_1.setBounds(83, 206, 139, 28);
		frmNInfinityAcadam.getContentPane().add(lblNewLabel_1_1);
		
		txtLogin = new JTextField();
		txtLogin.setForeground(Color.BLUE);
		txtLogin.setFont(new Font("Tahoma", Font.BOLD, 22));
		txtLogin.setBounds(266, 123, 411, 28);
		frmNInfinityAcadam.getContentPane().add(txtLogin);
		txtLogin.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(676, 222, -416, 19);
		frmNInfinityAcadam.getContentPane().add(passwordField);
		
		txtPassword = new JPasswordField();
		txtPassword.setForeground(Color.BLUE);
		txtPassword.setFont(new Font("Tahoma", Font.BOLD, 22));
		txtPassword.setBounds(266, 206, 411, 28);
		frmNInfinityAcadam.getContentPane().add(txtPassword);
		
		JSeparator separator2 = new JSeparator();
		separator2.setBounds(86, 278, 591, 2);
		frmNInfinityAcadam.getContentPane().add(separator2);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtLogin.setText(null);
				txtPassword.setText(null);
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.setBounds(83, 323, 110, 35);
		frmNInfinityAcadam.getContentPane().add(btnNewButton);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=txtLogin.getText();
				String password=txtPassword.getText();
				
				
				if(name.trim().equals("Aadesh")&&password.equals("123")) {
					MainEntryPage.main(null);
					
				}else {
					JOptionPane.showConfirmDialog(null, "Invalid User","Invalid Failure Error",JOptionPane.DEFAULT_OPTION);
				}
			}
		});
		btnLogin.setForeground(Color.BLUE);
		
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnLogin.setBounds(324, 323, 110, 35);

		frmNInfinityAcadam.getContentPane().add(btnLogin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(Color.RED);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnExit.setBounds(552, 323, 110, 35);
		frmNInfinityAcadam.getContentPane().add(btnExit);
	}
}
