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
		
		JTextPane txtpnPatientenDuSkt = new JTextPane();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtpnPatientenDuSkt, 10, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtpnPatientenDuSkt, 124, SpringLayout.WEST, contentPane);
		txtpnPatientenDuSkt.setBackground(SystemColor.window);
		txtpnPatientenDuSkt.setText("Patienten du s\u00F6kt finns ej");
		contentPane.add(txtpnPatientenDuSkt);
		
		JTextPane txtpnSkPNytt = new JTextPane();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtpnSkPNytt, 84, SpringLayout.SOUTH, txtpnPatientenDuSkt);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtpnSkPNytt, 10, SpringLayout.WEST, contentPane);
		txtpnSkPNytt.setBackground(SystemColor.window);
		txtpnSkPNytt.setText("S\u00F6k p\u00E5 nytt personnummer:");
		contentPane.add(txtpnSkPNytt);
		
		textField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.WEST, textField, 20, SpringLayout.EAST, txtpnSkPNytt);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, textField, 0, SpringLayout.SOUTH, txtpnSkPNytt);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("S\u00F6k");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton, 0, SpringLayout.SOUTH, txtpnSkPNytt);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton, -10, SpringLayout.EAST, contentPane);
		contentPane.add(btnNewButton);
		
		JButton btnTillbaka = new JButton("Tillbaka");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnTillbaka, 154, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnTillbaka, -10, SpringLayout.SOUTH, contentPane);
		contentPane.add(btnTillbaka);
	}

}
