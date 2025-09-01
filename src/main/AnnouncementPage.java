package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class AnnouncementPage {

	private JFrame frmAnnouncementPage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnnouncementPage window = new AnnouncementPage();
					window.frmAnnouncementPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AnnouncementPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAnnouncementPage = new JFrame();
		frmAnnouncementPage.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\NEWJava\\MyFirstJavaProject\\src\\First Java Project Photo\\N infinity.jpg"));
		frmAnnouncementPage.setTitle("Announcement Page");
		frmAnnouncementPage.setBounds(400, 200, 650, 400);
		frmAnnouncementPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAnnouncementPage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Announcement");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(139, 10, 328, 41);
		frmAnnouncementPage.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(39, 61, 561, 2);
		frmAnnouncementPage.getContentPane().add(separator);
		
		JDBCHandling2 jb=new JDBCHandling2();
		String announcement=jb.getLatestAnnouncement();
		
		
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(39, 295, 561, 2);
		frmAnnouncementPage.getContentPane().add(separator_1);
		
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAnnouncementPage.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnNewButton.setBounds(22, 307, 125, 34);
		frmAnnouncementPage.getContentPane().add(btnNewButton);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnExit.setForeground(Color.RED);
		btnExit.setBounds(493, 307, 102, 34);
		frmAnnouncementPage.getContentPane().add(btnExit);
		
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textArea.setForeground(Color.BLUE);
		textArea.setBounds(48, 93, 552, 150); // Adjust height for more announcements
		frmAnnouncementPage.getContentPane().add(textArea);

		
		 // new method you'll write
		textArea.setText(announcement);

	}

}
