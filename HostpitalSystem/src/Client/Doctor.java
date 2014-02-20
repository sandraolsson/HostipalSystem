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
import java.awt.Font;
import javax.swing.JButton;

public class Doctor extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Doctor frame = new Doctor();
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
	public Doctor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JTextPane txtpnSkPatient = new JTextPane();
		sl_contentPane.putConstraint(SpringLayout.WEST, txtpnSkPatient, 77, SpringLayout.WEST, contentPane);
		txtpnSkPatient.setBackground(SystemColor.window);
		txtpnSkPatient.setText("S\u00F6k Patient:");
		contentPane.add(txtpnSkPatient);
		
		textField_1 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtpnSkPatient, 0, SpringLayout.NORTH, textField_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtpnSkPatient, -57, SpringLayout.WEST, textField_1);
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_1, 74, SpringLayout.NORTH, contentPane);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("S\u00D6K");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton, 89, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton, -276, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton, -46, SpringLayout.SOUTH, contentPane);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Skapa ny patient");
		sl_contentPane.putConstraint(SpringLayout.EAST, textField_1, 0, SpringLayout.EAST, btnNewButton_1);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_1, 0, SpringLayout.NORTH, btnNewButton);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_1, 40, SpringLayout.EAST, btnNewButton);
		contentPane.add(btnNewButton_1);
		
		
		
		
	
		

	}
}
