package Client;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JLabel;

public class LoginPatient extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPatient frame = new LoginPatient();
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
	public LoginPatient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel lblNamn = new JLabel("Namn:");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNamn, 59, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNamn, -227, SpringLayout.SOUTH, contentPane);
		contentPane.add(lblNamn);
		
		JLabel lblPersonnummer = new JLabel("Personnummer:");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblPersonnummer, 59, SpringLayout.WEST, contentPane);
		contentPane.add(lblPersonnummer);
		
		JLabel lblStaff = new JLabel("Staff:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblStaff, 69, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblStaff, 59, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblPersonnummer, -6, SpringLayout.NORTH, lblStaff);
		contentPane.add(lblStaff);
		
		JLabel lblDivision = new JLabel("Division:");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblDivision, 59, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblDivision, 6, SpringLayout.SOUTH, lblStaff);
		contentPane.add(lblDivision);
		
		JLabel lblText = new JLabel("Text:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblText, 6, SpringLayout.SOUTH, lblDivision);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblText, 0, SpringLayout.WEST, lblNamn);
		contentPane.add(lblText);
	}
}
