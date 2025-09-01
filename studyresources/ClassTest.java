package studyresources;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.event.ActionEvent;

public class ClassTest {

	private JFrame frmClassTest;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClassTest window = new ClassTest();
					window.frmClassTest.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ClassTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmClassTest = new JFrame();
		frmClassTest.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\NEWJava\\MyFirstJavaProject\\src\\First Java Project Photo\\N infinity.jpg"));
		frmClassTest.setTitle("Class Test");
		frmClassTest.setBounds(200, 10, 1150, 790);
		frmClassTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmClassTest.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Class Tests");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 42));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(330, 10, 475, 44);
		frmClassTest.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(93, 69, 962, 2);
		frmClassTest.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("JAVA TESTS");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 37));
		lblNewLabel_1.setBounds(123, 101, 257, 38);
		frmClassTest.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Class Test : 1 To 10");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				URI url;
				try {
					url = new URI("https://www.indiabix.com/online-test/java-programming-test/#google_vignette");
					Desktop.getDesktop().browse(url);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		frmClassTest.getContentPane().add(btnNewButton);
		frmClassTest.setVisible(true);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBounds(286, 172, 563, 44);
		frmClassTest.getContentPane().add(btnNewButton);
		
		JButton btnTest = new JButton("Online Test : 1 To 50");
		btnTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				URI url;
				try {
					url = new URI("https://test.sanfoundry.com/java-programming-tests/#google_vignette");
					Desktop.getDesktop().browse(url);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		frmClassTest.getContentPane().add(btnTest);
		frmClassTest.setVisible(true);
		btnTest.setForeground(Color.BLUE);
		btnTest.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnTest.setBounds(286, 254, 563, 44);
		frmClassTest.getContentPane().add(btnTest);
		
		JLabel lblNewLabel_1_1 = new JLabel("CPP TESTS");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 37));
		lblNewLabel_1_1.setBounds(123, 374, 257, 38);
		frmClassTest.getContentPane().add(lblNewLabel_1_1);
		
		JButton btnNewButton_1 = new JButton("Class Test : 1 To 10");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				URI url;
				try {
					url = new URI("https://www.indiabix.com/online-test/cpp-programming-test/");
					Desktop.getDesktop().browse(url);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		frmClassTest.getContentPane().add(btnNewButton_1);
		frmClassTest.setVisible(true);
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnNewButton_1.setBounds(286, 449, 563, 44);
		frmClassTest.getContentPane().add(btnNewButton_1);
		
		JButton btnOnlineTest = new JButton("Online Test : 1 To 50");
		btnOnlineTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				URI url;
				try {
					url = new URI("https://test.sanfoundry.com/cplusplus-programming-tests/");
					Desktop.getDesktop().browse(url);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		frmClassTest.getContentPane().add(btnOnlineTest);
		frmClassTest.setVisible(true);
		btnOnlineTest.setForeground(Color.BLUE);
		btnOnlineTest.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnOnlineTest.setBounds(286, 534, 563, 44);
		frmClassTest.getContentPane().add(btnOnlineTest);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(93, 339, 962, 2);
		frmClassTest.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(93, 632, 962, 2);
		frmClassTest.getContentPane().add(separator_2);
		
		JButton btnNewButton_2 = new JButton("BACK");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmClassTest.setVisible(false);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 38));
		btnNewButton_2.setBounds(105, 676, 151, 44);
		frmClassTest.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("EXIT");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2_1.setForeground(Color.RED);
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 38));
		btnNewButton_2_1.setBounds(893, 676, 151, 44);
		frmClassTest.getContentPane().add(btnNewButton_2_1);
	}

}
