package Client;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class Nurse extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblSkPatient;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nurse frame = new Nurse();
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
	public Nurse() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		textField_1 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.WEST, textField_1, 165, SpringLayout.WEST, contentPane);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("S\u00D6K");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, textField_1, -45, SpringLayout.NORTH, btnNewButton);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton, -86, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton, -176, SpringLayout.EAST, contentPane);
		contentPane.add(btnNewButton);
		
		lblSkPatient = new JLabel("S\u00F6k Patient:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblSkPatient, 6, SpringLayout.NORTH, textField_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblSkPatient, -29, SpringLayout.WEST, textField_1);
		contentPane.add(lblSkPatient);
	}

}
