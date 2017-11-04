import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Ejercicio2 {

	private JFrame frmCalculadorFlow;
	private JTextField textField;
	private JTextField txtPrimerN;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio2 window = new Ejercicio2();
					window.frmCalculadorFlow.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadorFlow = new JFrame();
		frmCalculadorFlow.setTitle("Calculador flow\r\n");
		frmCalculadorFlow.setBounds(100, 100, 548, 118);
		frmCalculadorFlow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadorFlow.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblPrimerN = new JLabel("Primer n\u00BA");
		frmCalculadorFlow.getContentPane().add(lblPrimerN);
		
		txtPrimerN = new JTextField();
		txtPrimerN.setText("7");
		frmCalculadorFlow.getContentPane().add(txtPrimerN);
		txtPrimerN.setColumns(10);
		
		JLabel lblSegundoN = new JLabel("Segundo n\u00BA");
		frmCalculadorFlow.getContentPane().add(lblSegundoN);
		
		textField = new JTextField();
		textField.setText("4");
		frmCalculadorFlow.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblTotal = new JLabel("Total");
		frmCalculadorFlow.getContentPane().add(lblTotal);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		frmCalculadorFlow.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton button = new JButton("+");
		frmCalculadorFlow.getContentPane().add(button);
		
		JButton button_1 = new JButton("-");
		frmCalculadorFlow.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("*");
		frmCalculadorFlow.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("/");
		frmCalculadorFlow.getContentPane().add(button_3);
	}

}
