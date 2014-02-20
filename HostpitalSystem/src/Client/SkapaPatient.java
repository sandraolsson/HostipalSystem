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

public class SkapaPatient extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SkapaPatient frame = new SkapaPatient();
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
	public SkapaPatient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		textField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.WEST, textField, 165, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField, 22, SpringLayout.NORTH, contentPane);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_1, 7, SpringLayout.SOUTH, textField);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField_1, 0, SpringLayout.WEST, textField);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_2, 6, SpringLayout.SOUTH, textField_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField_2, 0, SpringLayout.EAST, textField);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_3, 8, SpringLayout.SOUTH, textField_2);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField_3, 0, SpringLayout.EAST, textField);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_4, 6, SpringLayout.SOUTH, textField_3);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField_4, 0, SpringLayout.WEST, textField);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, textField_4, -44, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField_4, -15, SpringLayout.EAST, contentPane);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("L\u00E4gg till");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton, 6, SpringLayout.SOUTH, textField_4);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton, 81, SpringLayout.WEST, contentPane);
		contentPane.add(btnNewButton);
		
		JButton btnTillbaka = new JButton("Tillbaka");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnTillbaka, 6, SpringLayout.SOUTH, textField_4);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnTillbaka, -74, SpringLayout.EAST, contentPane);
		contentPane.add(btnTillbaka);
		
		JLabel lblNamn = new JLabel("Namn:");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNamn, 37, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNamn, 6, SpringLayout.NORTH, textField);
		contentPane.add(lblNamn);
		
		JLabel lblPersonnummer = new JLabel("Personnummer:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblPersonnummer, 6, SpringLayout.NORTH, textField_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblPersonnummer, 37, SpringLayout.WEST, contentPane);
		contentPane.add(lblPersonnummer);
		
		JLabel lblStaff = new JLabel("Staff:");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblStaff, 37, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblStaff, 6, SpringLayout.NORTH, textField_2);
		contentPane.add(lblStaff);
		
		JLabel lblDivision = new JLabel("Division:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblDivision, 6, SpringLayout.NORTH, textField_3);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblDivision, 37, SpringLayout.WEST, contentPane);
		contentPane.add(lblDivision);
		
		JLabel lblText = new JLabel("Text:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblText, 23, SpringLayout.NORTH, textField_4);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblText, 0, SpringLayout.WEST, lblNamn);
		contentPane.add(lblText);
	}

}
