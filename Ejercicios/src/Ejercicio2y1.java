import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;

public class Ejercicio2y1 {

	private JFrame frmCalculadoraBorder;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JLabel lblPrimerN;
	private JTextField textField;
	private JLabel lblSegundoN;
	private JTextField textField_1;
	private JButton button;
	private JButton button_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio2y1 window = new Ejercicio2y1();
					window.frmCalculadoraBorder.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio2y1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadoraBorder = new JFrame();
		frmCalculadoraBorder.setTitle("Calculadora Border\r\n");
		frmCalculadoraBorder.setBounds(100, 100, 452, 351);
		frmCalculadoraBorder.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		frmCalculadoraBorder.getContentPane().add(panel, BorderLayout.NORTH);
		
		lblPrimerN = new JLabel("Primer n\u00BA");
		panel.add(lblPrimerN);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		lblSegundoN = new JLabel("Segundo n\u00BA");
		panel.add(lblSegundoN);
		
		textField_1 = new JTextField();
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		panel_1 = new JPanel();
		frmCalculadoraBorder.getContentPane().add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new GridLayout(2, 1, 0, 12));
		
		button = new JButton("+");
		panel_1.add(button);
		
		button_1 = new JButton("-");
		panel_1.add(button_1);
		
		/*panel_2 = new JPanel();
		frmCalculadoraBorder.getContentPane().add(panel_2, BorderLayout.SOUTH);*/
		
		panel_3 = new JPanel();
		frmCalculadoraBorder.getContentPane().add(panel_3, BorderLayout.EAST);
		panel_3.setLayout(new GridLayout(2, 1, 12, 12));
		
		btnNewButton = new JButton("*");
		panel_3.add(btnNewButton);
		
		btnNewButton_1 = new JButton("/");
		panel_3.add(btnNewButton_1);
		
		JPanel panel_4 = new JPanel();
		frmCalculadoraBorder.getContentPane().add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new GridLayout(1, 1, 0, 0));
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		panel_4.add(textField_2);
		textField_2.setColumns(10);
	}
}
