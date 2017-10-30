import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Ejercicio3 {

	private JFrame frmListaDeLa;
	private JTextField txtCliente;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private double total;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio3 window = new Ejercicio3();
					window.frmListaDeLa.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frmListaDeLa = new JFrame();
		frmListaDeLa.setResizable(false);
		frmListaDeLa.setTitle("Lista de la compra\r\n");
		frmListaDeLa.setBounds(100, 100, 591, 245);
		frmListaDeLa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmListaDeLa.getContentPane().setLayout(null);

		JLabel lblIdentificacinDelUsuario = new JLabel("Identificaci\u00F3n del usuario");
		lblIdentificacinDelUsuario.setBounds(10, 11, 150, 14);
		frmListaDeLa.getContentPane().add(lblIdentificacinDelUsuario);

		txtCliente = new JTextField();
		txtCliente.setEditable(false);
		txtCliente.setBounds(154, 8, 86, 20);
		frmListaDeLa.getContentPane().add(txtCliente);
		txtCliente.setColumns(10);

		JLabel lblTotalAPagar = new JLabel("Total a pagar (\u20AC)");
		lblTotalAPagar.setBounds(272, 11, 95, 14);
		frmListaDeLa.getContentPane().add(lblTotalAPagar);

		textField = new JTextField();
		textField.setText("0.0");
		textField.setEditable(false);
		textField.setBounds(377, 8, 86, 20);
		frmListaDeLa.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblProducto = new JLabel("Producto");
		lblProducto.setBounds(10, 63, 65, 14);
		frmListaDeLa.getContentPane().add(lblProducto);

		textField_1 = new JTextField();
		textField_1.setBounds(85, 60, 103, 20);
		frmListaDeLa.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel lblCantidadYPreciounidad = new JLabel("Cantidad y precio/unidad:");
		lblCantidadYPreciounidad.setBounds(211, 63, 156, 14);
		frmListaDeLa.getContentPane().add(lblCantidadYPreciounidad);

		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		comboBox.setBounds(370, 60, 48, 20);
		frmListaDeLa.getContentPane().add(comboBox);

		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setBounds(428, 60, 137, 20);
		frmListaDeLa.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 111, 359, 85);
		frmListaDeLa.getContentPane().add(scrollPane);

		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setBorder(new LineBorder(new Color(0, 0, 0)));
		textArea.setEditable(false);

		JButton btnNewButton = new JButton("A\u00F1adir Producto Creado");

		btnNewButton.setBounds(370, 111, 177, 23);
		frmListaDeLa.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Finalizar Compra");
		
		btnNewButton_1.setBounds(370, 168, 177, 23);
		frmListaDeLa.getContentPane().add(btnNewButton_1);

		// EVENTOS

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String primero = textField_1.getText().toString();
				String suma = textField.getText().toString();
				String seleccionado = comboBox.getSelectedItem().toString();
				String dinero = textField_2.getText().toString();
				double i = Double.parseDouble(seleccionado);
				double j = Double.parseDouble(dinero);
				double suma1 = Double.parseDouble(suma);
				total = i*j + suma1;					
				textArea.setText(textArea.getText() + primero + "(" + seleccionado + ")"+"-->" + dinero + "\n");
				
				textField.setText(String.valueOf(total));
			}
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Hasta luego, tienes que pagar"+total, "gracias por su compra", JOptionPane.INFORMATION_MESSAGE);
			}
		});

		frmListaDeLa.addWindowListener(new WindowAdapter() {
			public void windowOpened(WindowEvent arg0) {
				comboBox.setSelectedItem(null);
			}
		});

		/*
		 * textField_1.addKeyListener(new KeyAdapter() { public void keyTyped(KeyEvent
		 * arg0) { if (textField_1.getText().length()>=6) { textField_1.setText(null); }
		 * } });
		 */

		/*
		 * comboBox.addItemListener(new ItemListener() { public void
		 * itemStateChanged(ItemEvent arg0) { if(comboBox.getSelectedItem()!=null) {
		 * String seleccionado = comboBox.getSelectedItem().toString();
		 * textField_2.setText(seleccionado); } }
		 * 
		 * });
		 */

	}
}
