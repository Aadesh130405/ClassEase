package pyqresource;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cpppyq {

	private JFrame frmCppPyqPage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cpppyq window = new Cpppyq();
					window.frmCppPyqPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cpppyq() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCppPyqPage = new JFrame();
		frmCppPyqPage.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\NEWJava\\MyFirstJavaProject\\src\\First Java Project Photo\\N infinity.jpg"));
		frmCppPyqPage.setTitle("CPP PYQ PAGE");
		frmCppPyqPage.setBounds(200, 100, 1050, 650);
		frmCppPyqPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCppPyqPage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CPP University PYQ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 43));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(259, 10, 523, 56);
		frmCppPyqPage.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(78, 76, 888, 2);
		frmCppPyqPage.getContentPane().add(separator);
		
		JButton btnNewButton = new JButton("MAY 2024 PYQ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openPDF("pdfs/MAY2024.pdf");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBounds(309, 114, 418, 40);
		frmCppPyqPage.getContentPane().add(btnNewButton);
		
		JButton btnOctPyq = new JButton("OCT 2023 PYQ");
		btnOctPyq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openPDF("pdfs/OCT2023.pdf");
			}
		});
		btnOctPyq.setForeground(Color.BLUE);
		btnOctPyq.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnOctPyq.setBounds(309, 187, 418, 40);
		frmCppPyqPage.getContentPane().add(btnOctPyq);
		
		JButton btnNovPyq = new JButton("NOV 2023 PYQ");
		btnNovPyq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openPDF("pdfs/NOV2023.pdf");
			}
		});
		btnNovPyq.setForeground(Color.BLUE);
		btnNovPyq.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNovPyq.setBounds(309, 263, 418, 40);
		frmCppPyqPage.getContentPane().add(btnNovPyq);
		
		JButton btnNovPyq_1 = new JButton("NOV 2022 PYQ");
		btnNovPyq_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openPDF("pdfs/NOV2022.pdf");
			}
		});
		btnNovPyq_1.setForeground(Color.BLUE);
		btnNovPyq_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNovPyq_1.setBounds(309, 341, 418, 40);
		frmCppPyqPage.getContentPane().add(btnNovPyq_1);
		
		JButton btnMayPyq = new JButton("MAY 2022 PYQ");
		btnMayPyq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openPDF("pdfs/MAY2022.pdf");
			}
		});
		btnMayPyq.setForeground(Color.BLUE);
		btnMayPyq.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnMayPyq.setBounds(309, 421, 418, 40);
		frmCppPyqPage.getContentPane().add(btnMayPyq);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(78, 507, 888, 2);
		frmCppPyqPage.getContentPane().add(separator_1);
		
		JButton btnNewButton_5 = new JButton("BACK");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCppPyqPage.setVisible(false);
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnNewButton_5.setBounds(78, 535, 148, 40);
		frmCppPyqPage.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_5_1 = new JButton("EXIT");
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_5_1.setForeground(Color.RED);
		btnNewButton_5_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnNewButton_5_1.setBounds(827, 535, 148, 40);
		frmCppPyqPage.getContentPane().add(btnNewButton_5_1);
	}
	private void openPDF(String resourcePath) {
		try{
			File file=new File(resourcePath);
			if(file.exists()) {
				Desktop.getDesktop().open(file);
			}else {
				JOptionPane.showConfirmDialog(null, "File Not Exits","File Not Exits",JOptionPane.OK_OPTION);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
