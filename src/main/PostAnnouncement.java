package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class PostAnnouncement {

	private JFrame frmPostAnnouncement;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PostAnnouncement window = new PostAnnouncement();
					window.frmPostAnnouncement.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PostAnnouncement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPostAnnouncement = new JFrame();
		frmPostAnnouncement.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\NEWJava\\MyFirstJavaProject\\src\\First Java Project Photo\\N infinity.jpg"));
		frmPostAnnouncement.setTitle("Post Announcement");
		frmPostAnnouncement.setBounds(500, 150, 650, 500);
		frmPostAnnouncement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPostAnnouncement.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Post Announcement");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(81, 22, 452, 45);
		frmPostAnnouncement.getContentPane().add(lblNewLabel);
		
		JTextArea textAnnounce = new JTextArea();
		textAnnounce.setFont(new Font("Tahoma", Font.BOLD, 23));
		textAnnounce.setBounds(97, 175, 436, 110);
		frmPostAnnouncement.getContentPane().add(textAnnounce);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(32, 77, 569, 2);
		frmPostAnnouncement.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Enter a new Annoucement");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(119, 122, 414, 31);
		frmPostAnnouncement.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Post Announcement");
		btnNewButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String announcement = textAnnounce.getText().trim();
		        if (announcement.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "Announcement cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
		        } else if (announcement.length() > 350) {
		            JOptionPane.showMessageDialog(null, "Max 350 characters allowed!", "Limit Exceeded", JOptionPane.WARNING_MESSAGE);
		        } else {
		            JDBCHandling2 jdbc = new JDBCHandling2();
		            int result = jdbc.postAnnouncement(announcement);
		            if (result > 0) {
		                JOptionPane.showMessageDialog(null, "Announcement Posted Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
		                textAnnounce.setText("");
		            } else {
		                JOptionPane.showMessageDialog(null, "Failed to post announcement.", "Error", JOptionPane.ERROR_MESSAGE);
		            }
		        }
		    }
		});

		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 32));
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBounds(129, 305, 368, 45);
		frmPostAnnouncement.getContentPane().add(btnNewButton);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(32, 379, 561, 2);
		frmPostAnnouncement.getContentPane().add(separator_1);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPostAnnouncement.setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 29));
		btnNewButton_1.setBounds(39, 408, 116, 31);
		frmPostAnnouncement.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("EXIT");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1_1.setForeground(Color.RED);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 29));
		btnNewButton_1_1.setBounds(474, 408, 116, 31);
		frmPostAnnouncement.getContentPane().add(btnNewButton_1_1);
		
	
	}
}
