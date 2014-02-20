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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LogIn extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;
	private JTextField textField_1;
	private JTextPane txtpnAnvndarnamn;
	private JTextField textField_2;
	private JTextField textField_3;

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
		
		txtpnAnvndarnamn = new JTextPane();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtpnAnvndarnamn, 16, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtpnAnvndarnamn, 60, SpringLayout.WEST, contentPane);
		txtpnAnvndarnamn.setBackground(Color.LIGHT_GRAY);
		txtpnAnvndarnamn.setText("Anv\u00E4ndarnamn:");
		contentPane.add(txtpnAnvndarnamn);
		
		textField_2 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_2, 10, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField_2, 163, SpringLayout.WEST, contentPane);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		

		
		JButton btnNewButton = new JButton("Log In");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton, 0, SpringLayout.WEST, textField_2);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton, -10, SpringLayout.SOUTH, contentPane);
		contentPane.add(btnNewButton);
		
		JTextPane txtpnLsenord_1 = new JTextPane();
		txtpnLsenord_1.setBackground(Color.LIGHT_GRAY);
		txtpnLsenord_1.setText("L\u00F6senord:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtpnLsenord_1, 19, SpringLayout.SOUTH, txtpnAnvndarnamn);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtpnLsenord_1, 0, SpringLayout.WEST, txtpnAnvndarnamn);
		contentPane.add(txtpnLsenord_1);
		
		textField_3 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.SOUTH, textField_3, 0, SpringLayout.SOUTH, txtpnLsenord_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField_3, 0, SpringLayout.EAST, textField_2);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
	
		

	}
}
