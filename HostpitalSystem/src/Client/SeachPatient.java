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

public class SeachPatient extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

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
		
		JTextPane txtpnNamn = new JTextPane();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtpnNamn, 18, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtpnNamn, 57, SpringLayout.WEST, contentPane);
		txtpnNamn.setBackground(SystemColor.window);
		txtpnNamn.setText("Namn: ");
		contentPane.add(txtpnNamn);
		
		textField = new JTextField();
		contentPane.add(textField);
		textField.setColumns(10);
		
		JTextPane txtpnPersonnummer = new JTextPane();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtpnPersonnummer, 20, SpringLayout.SOUTH, txtpnNamn);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtpnPersonnummer, 0, SpringLayout.WEST, txtpnNamn);
		txtpnPersonnummer.setBackground(SystemColor.window);
		txtpnPersonnummer.setText("Personnummer:");
		contentPane.add(txtpnPersonnummer);
		
		textField_1 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_1, 49, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField_1, 6, SpringLayout.EAST, txtpnPersonnummer);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, textField, -6, SpringLayout.NORTH, textField_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField, 0, SpringLayout.EAST, textField_1);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JTextPane txtpnStaff = new JTextPane();
		sl_contentPane.putConstraint(SpringLayout.WEST, txtpnStaff, 0, SpringLayout.WEST, txtpnNamn);
		txtpnStaff.setBackground(SystemColor.window);
		txtpnStaff.setText("Staff: ");
		contentPane.add(txtpnStaff);
		
		textField_2 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.WEST, textField_2, 67, SpringLayout.EAST, txtpnStaff);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtpnStaff, 0, SpringLayout.SOUTH, textField_2);
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtpnStaff, 0, SpringLayout.NORTH, textField_2);
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtpnStaff, 0, SpringLayout.NORTH, textField_2);
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_2, 6, SpringLayout.SOUTH, textField_1);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JTextPane txtpnDivision = new JTextPane();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtpnDivision, 6, SpringLayout.SOUTH, txtpnStaff);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtpnDivision, 0, SpringLayout.WEST, txtpnNamn);
		txtpnDivision.setBackground(SystemColor.window);
		txtpnDivision.setText("Division: ");
		contentPane.add(txtpnDivision);
		
		textField_3 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.WEST, textField_3, 161, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_3, 6, SpringLayout.SOUTH, textField_2);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JTextPane txtpnText = new JTextPane();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtpnText, 19, SpringLayout.SOUTH, txtpnDivision);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtpnText, 0, SpringLayout.WEST, txtpnNamn);
		txtpnText.setBackground(SystemColor.window);
		txtpnText.setText("Text: ");
		contentPane.add(txtpnText);
		
		textField_4 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_4, 7, SpringLayout.SOUTH, textField_3);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField_4, 68, SpringLayout.EAST, txtpnText);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, textField_4, -42, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField_4, 320, SpringLayout.EAST, txtpnText);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		btnNewButton = new JButton("Spara");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton, -10, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton, 0, SpringLayout.EAST, txtpnPersonnummer);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Tillbaka");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_1, 70, SpringLayout.EAST, btnNewButton);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_1, 0, SpringLayout.SOUTH, btnNewButton);
		contentPane.add(btnNewButton_1);
	}

}
