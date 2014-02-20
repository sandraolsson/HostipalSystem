package Client;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Patientfinnsej extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Patientfinnsej frame = new Patientfinnsej();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Patientfinnsej() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		textField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.WEST, textField, 204, SpringLayout.WEST, contentPane);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("S\u00F6k");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton, 97, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton, -10, SpringLayout.EAST, contentPane);
		contentPane.add(btnNewButton);
		
		JButton btnTillbaka = new JButton("Tillbaka");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, textField, -103, SpringLayout.NORTH, btnTillbaka);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnTillbaka, 154, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnTillbaka, -10, SpringLayout.SOUTH, contentPane);
		contentPane.add(btnTillbaka);
		
		JLabel lblPatientenDuSkt = new JLabel("Patienten du s\u00F6kt p\u00E5 finns ej!");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblPatientenDuSkt, 23, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblPatientenDuSkt, 121, SpringLayout.WEST, contentPane);
		contentPane.add(lblPatientenDuSkt);
		
		JLabel lblSkPNytt = new JLabel("S\u00F6k p\u00E5 nytt personnummer:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblSkPNytt, 6, SpringLayout.NORTH, textField);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblSkPNytt, 10, SpringLayout.WEST, contentPane);
		contentPane.add(lblSkPNytt);
	}

}
