package main;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class StudentList {

	private JFrame frmStudentListPage;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentList window = new StudentList();
					window.frmStudentListPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentList() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudentListPage = new JFrame();
		frmStudentListPage.setTitle("Student List Page");
		frmStudentListPage.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\NEWJava\\MyFirstJavaProject\\src\\First Java Project Photo\\N infinity.jpg"));
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension dim=kit.getScreenSize();
		int w=(int)dim.getWidth();
		int h=(int)dim.getHeight();
		frmStudentListPage.setSize(w/1,h/1);
		frmStudentListPage.setLocationRelativeTo(null);
	
		frmStudentListPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentListPage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student DataBase");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 45));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(372, 20, 731, 41);
		frmStudentListPage.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(98, 91, 1354, 2);
		frmStudentListPage.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(98, 707, 1354, 2);
		frmStudentListPage.getContentPane().add(separator_1);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmStudentListPage.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton.setBounds(157, 732, 139, 51);
		frmStudentListPage.getContentPane().add(btnNewButton);
		
		JButton btnPrint = new JButton("SHOW LIST");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDBCHandling jb=new JDBCHandling();
				ResultSet result=jb.getTable();
				
				DefaultTableModel model=new DefaultTableModel();
				String[] columnNames= {"Id ","Full name","Mobile No","Address","Gender","Degree","D.O.B.","Subject 1","Subject 2"};
				model.setColumnIdentifiers(columnNames);
				
				try {
					while(result.next()) {
						model.addRow(new Object[]{
							result.getInt(1),
							result.getString(2),
							result.getLong(3),
							result.getString(4),
							result.getString(5),
							result.getString(6),
							result.getString(7),
							result.getString(8),
							result.getString(9),
						});
						
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				table.setModel(model);
				//table.getAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
				try {
					result.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnPrint.setForeground(Color.BLUE);
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnPrint.setBounds(647, 732, 216, 51);
		frmStudentListPage.getContentPane().add(btnPrint);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(Color.RED);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnExit.setBounds(1234, 732, 139, 51);
		frmStudentListPage.getContentPane().add(btnExit);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(133, 118, 1293, 564);
		frmStudentListPage.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setForeground(Color.BLUE);
		table.setFont(new Font("Tahoma", Font.PLAIN, 13));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"ID", "Full  Name", "Mobile No", "Address", "Gender", "Degree", "D.O.B.", "Subject 1", "Subject 2"
			}
		));
		scrollPane.setViewportView(table);
	}

}
