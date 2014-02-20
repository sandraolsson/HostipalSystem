package Client;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JLabel;

public class SeachPatient extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblNamn;
	private JLabel lblPersonnummer;
	private JLabel lblStaff;
	private JLabel lblDivision;
	private JLabel lblText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeachPatient frame = new SeachPatient();
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
	public SeachPatient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		textField = new JTextField();
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_1, 49, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField_1, 161, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, textField, -6, SpringLayout.NORTH, textField_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField, 0, SpringLayout.EAST, textField_1);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.WEST, textField_2, 161, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_2, 6, SpringLayout.SOUTH, textField_1);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.WEST, textField_3, 161, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_3, 6, SpringLayout.SOUTH, textField_2);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_4, 7, SpringLayout.SOUTH, textField_3);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, textField_4, -42, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField_4, -27, SpringLayout.EAST, contentPane);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		btnNewButton = new JButton("Spara");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton, -10, SpringLayout.SOUTH, contentPane);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Tillbaka");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_1, 225, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton, -70, SpringLayout.WEST, btnNewButton_1);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_1, 0, SpringLayout.SOUTH, btnNewButton);
		contentPane.add(btnNewButton_1);
		
		lblNamn = new JLabel("Namn:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNamn, 6, SpringLayout.NORTH, textField);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNamn, 57, SpringLayout.WEST, contentPane);
		contentPane.add(lblNamn);
		
		lblPersonnummer = new JLabel("Personnummer:");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblPersonnummer, 57, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblPersonnummer, 6, SpringLayout.NORTH, textField_1);
		contentPane.add(lblPersonnummer);
		
		lblStaff = new JLabel("Staff:");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblStaff, 57, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblStaff, 6, SpringLayout.NORTH, textField_2);
		contentPane.add(lblStaff);
		
		lblDivision = new JLabel("Division:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblDivision, 6, SpringLayout.NORTH, textField_3);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblDivision, 57, SpringLayout.WEST, contentPane);
		contentPane.add(lblDivision);
		
		lblText = new JLabel("Text:");
		sl_contentPane.putConstraint(SpringLayout.WEST, textField_4, 72, SpringLayout.EAST, lblText);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblText, 23, SpringLayout.SOUTH, lblDivision);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblText, 0, SpringLayout.WEST, lblNamn);
		contentPane.add(lblText);
	}

}
