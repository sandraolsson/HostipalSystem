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
		
		JTextPane txtpnNamn = new JTextPane();
		txtpnNamn.setBackground(SystemColor.window);
		txtpnNamn.setText("Namn: ");
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtpnNamn, 25, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtpnNamn, 59, SpringLayout.WEST, contentPane);
		contentPane.add(txtpnNamn);
		
		JTextPane txtpnPersonnummmer = new JTextPane();
		txtpnPersonnummmer.setBackground(SystemColor.window);
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtpnPersonnummmer, 6, SpringLayout.SOUTH, txtpnNamn);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtpnPersonnummmer, 0, SpringLayout.WEST, txtpnNamn);
		txtpnPersonnummmer.setText("Personnummmer:");
		contentPane.add(txtpnPersonnummmer);
		
		JTextPane txtpnStaff = new JTextPane();
		txtpnStaff.setBackground(SystemColor.window);
		txtpnStaff.setText("Staff:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtpnStaff, 6, SpringLayout.SOUTH, txtpnPersonnummmer);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtpnStaff, 0, SpringLayout.WEST, txtpnNamn);
		contentPane.add(txtpnStaff);
		
		JTextPane txtpnDivision = new JTextPane();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtpnDivision, 6, SpringLayout.SOUTH, txtpnStaff);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtpnDivision, 0, SpringLayout.WEST, txtpnNamn);
		txtpnDivision.setBackground(SystemColor.window);
		txtpnDivision.setText("Division: ");
		contentPane.add(txtpnDivision);
		
		JTextPane txtpnText = new JTextPane();
		txtpnText.setBackground(SystemColor.window);
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtpnText, 6, SpringLayout.SOUTH, txtpnDivision);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtpnText, 0, SpringLayout.WEST, txtpnNamn);
		txtpnText.setText("Text: ");
		contentPane.add(txtpnText);
		
		JLabel lblTest = new JLabel("Test:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblTest, 15, SpringLayout.SOUTH, txtpnText);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblTest, 0, SpringLayout.WEST, txtpnNamn);
		contentPane.add(lblTest);
	}
}
