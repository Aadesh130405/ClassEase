package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentProfile {

	private JFrame frmStudentProfile;
	private JTextField textId;

	private JLabel lblNameValue;
	private JLabel lblMobileValue;
	private JLabel lblAddressValue;
	private JLabel lblGenderValue;
	private JLabel lblDegreeValue;
	private JLabel lblDobValue;
	private JLabel lblSubjectValue;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentProfile window = new StudentProfile();
					window.frmStudentProfile.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public StudentProfile() {
		initialize();
	}

	private void initialize() {
		frmStudentProfile = new JFrame();
		frmStudentProfile.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\NEWJava\\MyFirstJavaProject\\src\\First Java Project Photo\\N infinity.jpg"));
		frmStudentProfile.setTitle("Student Profile");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension dim = kit.getScreenSize();
		int w = (int) dim.getWidth();
		int h = (int) dim.getHeight();
		frmStudentProfile.setSize(w / 1, h / 1);
		frmStudentProfile.setLocationRelativeTo(null);
		frmStudentProfile.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentProfile.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Enter Student ID ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 45));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(119, 23, 611, 43);
		frmStudentProfile.getContentPane().add(lblNewLabel);

		textId = new JTextField();
		textId.setForeground(Color.BLUE);
		textId.setFont(new Font("Tahoma", Font.BOLD, 40));
		textId.setBounds(776, 23, 204, 43);
		frmStudentProfile.getContentPane().add(textId);
		textId.setColumns(10);

		JButton btnNewButton = new JButton("View Profile");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textId.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please enter Student ID");
					return;
				}
				int number = Integer.parseInt(textId.getText());
				JDBCHandling jb = new JDBCHandling();
				ResultSet result = jb.getRow(number);
				try {
					if (result.next()) {
						lblNameValue.setText(result.getString("name"));
						lblMobileValue.setText(result.getString("mobile"));
						lblAddressValue.setText("<html>" + result.getString("address").replaceAll("\n", "<br>") + "</html>");
						lblGenderValue.setText(result.getString("gender"));
						lblDegreeValue.setText(result.getString("degree"));
						lblDobValue.setText(result.getString("dob"));

						String sub1 = result.getString("subject1");
						String sub2 = result.getString("subject2");

						if (sub2 == null || sub2.isEmpty()) {
							lblSubjectValue.setText(sub1);
						} else {
							lblSubjectValue.setText(sub1 + ", " + sub2);
						}
					} else {
						JOptionPane.showMessageDialog(null, "Student ID not found");
					}
					result.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 34));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(1037, 31, 249, 36);
		frmStudentProfile.getContentPane().add(btnNewButton);

		JSeparator separator = new JSeparator();
		separator.setBounds(63, 101, 1370, 2);
		frmStudentProfile.getContentPane().add(separator);

		JLabel lblName = new JLabel("Full Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblName.setBounds(244, 152, 200, 35);
		frmStudentProfile.getContentPane().add(lblName);

		lblNameValue = new JLabel("");
		lblNameValue.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblNameValue.setForeground(Color.BLUE);
		lblNameValue.setBounds(498, 149, 687, 35);
		frmStudentProfile.getContentPane().add(lblNameValue);

		JLabel lblMobile = new JLabel("Mobile No :");
		lblMobile.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblMobile.setBounds(244, 220, 200, 35);
		frmStudentProfile.getContentPane().add(lblMobile);

		lblMobileValue = new JLabel("");
		lblMobileValue.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblMobileValue.setForeground(Color.BLUE);
		lblMobileValue.setBounds(498, 213, 687, 35);
		frmStudentProfile.getContentPane().add(lblMobileValue);

		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblAddress.setBounds(244, 294, 200, 35);
		frmStudentProfile.getContentPane().add(lblAddress);

		lblAddressValue = new JLabel("");
		lblAddressValue.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblAddressValue.setForeground(Color.BLUE);
		lblAddressValue.setVerticalAlignment(SwingConstants.TOP);
		lblAddressValue.setBounds(498, 293, 687, 106);
		frmStudentProfile.getContentPane().add(lblAddressValue);

		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 29));
		lblGender.setBounds(262, 486, 130, 28);
		frmStudentProfile.getContentPane().add(lblGender);

		lblGenderValue = new JLabel("");
		lblGenderValue.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblGenderValue.setForeground(Color.BLUE);
		lblGenderValue.setBounds(459, 486, 204, 35);
		frmStudentProfile.getContentPane().add(lblGenderValue);

		JLabel lblDegree = new JLabel("Degree");
		lblDegree.setFont(new Font("Tahoma", Font.BOLD, 29));
		lblDegree.setBounds(828, 483, 130, 43);
		frmStudentProfile.getContentPane().add(lblDegree);

		lblDegreeValue = new JLabel("");
		lblDegreeValue.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblDegreeValue.setForeground(Color.BLUE);
		lblDegreeValue.setBounds(1011, 482, 204, 35);
		frmStudentProfile.getContentPane().add(lblDegreeValue);

		JLabel lblDob = new JLabel("D.O.B.");
		lblDob.setFont(new Font("Tahoma", Font.BOLD, 29));
		lblDob.setBounds(262, 587, 130, 28);
		frmStudentProfile.getContentPane().add(lblDob);

		lblDobValue = new JLabel("");
		lblDobValue.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblDobValue.setForeground(Color.BLUE);
		lblDobValue.setBounds(459, 584, 204, 35);
		frmStudentProfile.getContentPane().add(lblDobValue);

		JLabel lblSubject = new JLabel("Subject");
		lblSubject.setFont(new Font("Tahoma", Font.BOLD, 29));
		lblSubject.setBounds(828, 584, 130, 35);
		frmStudentProfile.getContentPane().add(lblSubject);

		lblSubjectValue = new JLabel("");
		lblSubjectValue.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblSubjectValue.setForeground(Color.BLUE);
		lblSubjectValue.setBounds(1011, 584, 300, 35);
		frmStudentProfile.getContentPane().add(lblSubjectValue);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(70, 676, 1363, 2);
		frmStudentProfile.getContentPane().add(separator_1);

		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmStudentProfile.setVisible(false);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnBack.setBounds(86, 727, 130, 43);
		frmStudentProfile.getContentPane().add(btnBack);

		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(Color.RED);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnExit.setBounds(1158, 727, 130, 43);
		frmStudentProfile.getContentPane().add(btnExit);
	}
}
