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
		
		JTextPane txtpnNamn = new JTextPane();
		sl_contentPane.putConstraint(SpringLayout.WEST, txtpnNamn, 37, SpringLayout.WEST, contentPane);
		txtpnNamn.setBackground(SystemColor.window);
		txtpnNamn.setText("Namn: ");
		contentPane.add(txtpnNamn);
		
		textField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.WEST, textField, 83, SpringLayout.EAST, txtpnNamn);
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtpnNamn, 0, SpringLayout.NORTH, textField);
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField, 22, SpringLayout.NORTH, contentPane);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JTextPane txtpnPersonnummer = new JTextPane();
		txtpnPersonnummer.setBackground(SystemColor.window);
		txtpnPersonnummer.setText("Personnummer:");
		contentPane.add(txtpnPersonnummer);
		
		textField_1 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtpnPersonnummer, 0, SpringLayout.NORTH, textField_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtpnPersonnummer, -30, SpringLayout.WEST, textField_1);
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_1, 7, SpringLayout.SOUTH, textField);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField_1, 0, SpringLayout.WEST, textField);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JTextPane txtpnStaff = new JTextPane();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtpnStaff, 17, SpringLayout.SOUTH, txtpnPersonnummer);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtpnStaff, 0, SpringLayout.WEST, txtpnNamn);
		txtpnStaff.setBackground(SystemColor.window);
		txtpnStaff.setText("Staff:");
		contentPane.add(txtpnStaff);
		
		textField_2 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_2, 6, SpringLayout.SOUTH, textField_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField_2, 0, SpringLayout.EAST, textField);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JTextPane txtpnDivision = new JTextPane();
		sl_contentPane.putConstraint(SpringLayout.WEST, txtpnDivision, 0, SpringLayout.WEST, txtpnNamn);
		txtpnDivision.setBackground(SystemColor.window);
		txtpnDivision.setText("Division:");
		contentPane.add(txtpnDivision);
		
		textField_3 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtpnDivision, 0, SpringLayout.NORTH, textField_3);
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_3, 8, SpringLayout.SOUTH, textField_2);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField_3, 0, SpringLayout.EAST, textField);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JTextPane txtpnText = new JTextPane();
		txtpnText.setBackground(SystemColor.window);
		txtpnText.setText("Text:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtpnText, 37, SpringLayout.SOUTH, txtpnDivision);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtpnText, 0, SpringLayout.WEST, txtpnNamn);
		contentPane.add(txtpnText);
		
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
	}

}
