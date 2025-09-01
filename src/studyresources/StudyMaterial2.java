package studyresources;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;

public class StudyMaterial2 {

	private JFrame frmStudyMaterialPage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudyMaterial2 window = new StudyMaterial2();
					window.frmStudyMaterialPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudyMaterial2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudyMaterialPage = new JFrame();
		frmStudyMaterialPage.setTitle("Study Material Page");
		frmStudyMaterialPage.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\NEWJava\\MyFirstJavaProject\\src\\First Java Project Photo\\N infinity.jpg"));
		frmStudyMaterialPage.setBounds(250,50,1050,750);
		frmStudyMaterialPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudyMaterialPage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Study Material");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 43));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(124, 10, 788, 50);
		frmStudyMaterialPage.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.DARK_GRAY);
		separator.setBounds(61, 70, 934, 2);
		frmStudyMaterialPage.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("JAVA MATERIAL");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBounds(24, 94, 366, 30);
		frmStudyMaterialPage.getContentPane().add(lblNewLabel_1);
	
	        
			
		
		JLabel lblNewLabel_1_1 = new JLabel("CPP MATERIAL");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_1_1.setBounds(61, 352, 327, 30);
		frmStudyMaterialPage.getContentPane().add(lblNewLabel_1_1);
		
		JButton btnOpenLink = new JButton("NOTES");
		btnOpenLink.setForeground(Color.BLUE);
		btnOpenLink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try {
	                    URI uri = new URI("https://drive.google.com/file/d/1TQwa6iLSPJyyvmimugZ4Nizc7qjc0psw/preview");
	                    Desktop.getDesktop().browse(uri);
	                } catch (Exception ex) {
	                    ex.printStackTrace();
	                }
			}
		});
		frmStudyMaterialPage.getContentPane().add(btnOpenLink);
		frmStudyMaterialPage.setVisible(true);
		
		btnOpenLink.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnOpenLink.setBounds(181, 208, 679, 38);
		frmStudyMaterialPage.getContentPane().add(btnOpenLink);
		
		JButton btnConcepts = new JButton("REFRENCE");
		btnConcepts.setForeground(Color.BLUE);
		btnConcepts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				URI url;
				try {
					url = new URI("https://www.w3schools.com/java/");
					Desktop.getDesktop().browse(url);
				}  catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		frmStudyMaterialPage.getContentPane().add(btnConcepts);
		frmStudyMaterialPage.setVisible(true);
		btnConcepts.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnConcepts.setBounds(181, 271, 679, 38);
		frmStudyMaterialPage.getContentPane().add(btnConcepts);
		
		JButton btnSyllabus = new JButton("SYLLABUS");
		btnSyllabus.setForeground(Color.BLUE);
		btnSyllabus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					URI url=new URI("https://www.w3schools.com/Java/java_syllabus.asp");
					Desktop.getDesktop().browse(url);
				}catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		frmStudyMaterialPage.getContentPane().add(btnSyllabus);
		frmStudyMaterialPage.setVisible(true);
		btnSyllabus.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnSyllabus.setBounds(181, 147, 679, 38);
		frmStudyMaterialPage.getContentPane().add(btnSyllabus);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.DARK_GRAY);
		separator_1.setBounds(61, 335, 934, 2);
		frmStudyMaterialPage.getContentPane().add(separator_1);
		
		JButton btnSyllabus_1 = new JButton("SYLLABUS");
		btnSyllabus_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					try {
						URI url=new URI("https://www.w3schools.com/CPP/cpp_syllabus.asp");
						Desktop.getDesktop().browse(url);
					}catch(Exception ex) {
						ex.printStackTrace();
					}
				}
			});
			frmStudyMaterialPage.getContentPane().add(btnSyllabus_1);
			frmStudyMaterialPage.setVisible(true);
			
		
		btnSyllabus_1.setForeground(Color.BLUE);
		btnSyllabus_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnSyllabus_1.setBounds(181, 420, 679, 38);
		frmStudyMaterialPage.getContentPane().add(btnSyllabus_1);
		
		JButton btnNotes = new JButton("NOTES");
		btnNotes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					URI url=new URI("https://cstutorialpoint.com/cpp-programming-notes/");
					Desktop.getDesktop().browse(url);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		frmStudyMaterialPage.getContentPane().add(btnNotes);
		frmStudyMaterialPage.setVisible(true);
		btnNotes.setForeground(Color.BLUE);
		btnNotes.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnNotes.setBounds(181, 487, 679, 38);
		frmStudyMaterialPage.getContentPane().add(btnNotes);
		
		JButton btnRefrence = new JButton("REFRENCE");
		btnRefrence.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					URI url=new URI("https://www.geeksforgeeks.org/cpp/c-plus-plus/");
					Desktop.getDesktop().browse(url);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		frmStudyMaterialPage.getContentPane().add(btnRefrence);
		frmStudyMaterialPage.setVisible(true);
		btnRefrence.setForeground(Color.BLUE);
		btnRefrence.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnRefrence.setBounds(181, 554, 679, 38);
		frmStudyMaterialPage.getContentPane().add(btnRefrence);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmStudyMaterialPage.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton.setBounds(61, 625, 138, 50);
		frmStudyMaterialPage.getContentPane().add(btnNewButton);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(Color.RED);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnExit.setBounds(828, 625, 138, 50);
		frmStudyMaterialPage.getContentPane().add(btnExit);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.DARK_GRAY);
		separator_2.setBounds(61, 614, 934, 1);
		frmStudyMaterialPage.getContentPane().add(separator_2);
	}

}
