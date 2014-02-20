package Client;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.DropMode;
import javax.swing.SpringLayout;
import javax.swing.JLabel;

public class LogIn extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblAnvndarnamn;
	private JLabel lblLsenord;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn frame = new LogIn();
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
	public LogIn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		textField_2 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_2, 10, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField_2, 163, SpringLayout.WEST, contentPane);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		

		
		JButton btnNewButton = new JButton("Log In");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton, 0, SpringLayout.WEST, textField_2);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton, -10, SpringLayout.SOUTH, contentPane);
		contentPane.add(btnNewButton);
		
		textField_3 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_3, 1, SpringLayout.SOUTH, textField_2);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField_3, 0, SpringLayout.EAST, textField_2);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		lblAnvndarnamn = new JLabel("Anv\u00E4ndarnamn:");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblAnvndarnamn, 60, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblAnvndarnamn, 6, SpringLayout.NORTH, textField_2);
		contentPane.add(lblAnvndarnamn);
		
		lblLsenord = new JLabel("L\u00F6senord:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblLsenord, 6, SpringLayout.NORTH, textField_3);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblLsenord, 0, SpringLayout.WEST, lblAnvndarnamn);
		contentPane.add(lblLsenord);
		
	
		

	}
}
