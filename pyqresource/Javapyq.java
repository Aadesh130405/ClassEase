package pyqresource;

import java.awt.Desktop;
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class Javapyq {

	private JFrame frmJavaPyqPage;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Javapyq window = new Javapyq();
					window.frmJavaPyqPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Javapyq() {
		initialize();
	}

	private void initialize() {
		frmJavaPyqPage = new JFrame();
		frmJavaPyqPage.setTitle("Java PYQ Page");
		frmJavaPyqPage.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\NEWJava\\MyFirstJavaProject\\src\\First Java Project Photo\\N infinity.jpg"));
		frmJavaPyqPage.setBounds(200, 100, 1050, 650);
		frmJavaPyqPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJavaPyqPage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("JAVA University PYQ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(250, 10, 535, 53);
		frmJavaPyqPage.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(58, 87, 926, 2);
		frmJavaPyqPage.getContentPane().add(separator);

		// ====== Button to open May 2023 PDF ======
		JButton btnMar2024 = new JButton(" MAR 2024 PYQ");
		btnMar2024.setForeground(Color.BLUE);
		btnMar2024.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnMar2024.setBounds(354, 147, 327, 43);
		frmJavaPyqPage.getContentPane().add(btnMar2024);

		btnMar2024.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openPDF("pdfs/PPLMARCH2024.pdf");
			}
		});

		// ====== Button to open Dec 2022 PDF ======
		JButton btn2024 = new JButton(" MAY 2024 PYQ");
		btn2024.setForeground(Color.BLUE);
		btn2024.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn2024.setBounds(354, 220, 327, 43);
		frmJavaPyqPage.getContentPane().add(btn2024);
		btn2024.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openPDF("pdfs/PPL2024.pdf");
			}
		});
		
		JButton btnMayPyq = new JButton(" MAY 2023 PYQ");
		btnMayPyq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openPDF("pdfs/PPL2023.pdf");
			}
		});
		btnMayPyq.setForeground(Color.BLUE);
		btnMayPyq.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnMayPyq.setBounds(354, 298, 327, 43);
		frmJavaPyqPage.getContentPane().add(btnMayPyq);
		
		JButton btnDec2022_2 = new JButton(" Dec 2022 PYQ");
		btnDec2022_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openPDF("pdfs/PPL2022.pdf");
			}
		});
		btnDec2022_2.setForeground(Color.BLUE);
		btnDec2022_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnDec2022_2.setBounds(354, 378, 327, 43);
		frmJavaPyqPage.getContentPane().add(btnDec2022_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(58, 493, 926, 2);
		frmJavaPyqPage.getContentPane().add(separator_1);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmJavaPyqPage.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnNewButton.setBounds(83, 520, 151, 43);
		frmJavaPyqPage.getContentPane().add(btnNewButton);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(Color.RED);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnExit.setBounds(816, 520, 151, 43);
		frmJavaPyqPage.getContentPane().add(btnExit);

		
	}

	// Method to open PDF file
	private void openPDF(String relativePath) {
		try {
			File file = new File(relativePath);
			if (file.exists()) {
				Desktop.getDesktop().open(file);
			} else {
				JOptionPane.showConfirmDialog(null, "File Not Exits","File Not Exits",JOptionPane.OK_CANCEL_OPTION);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
