import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.event.CaretListener;
import javax.swing.event.CaretEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Examen {
	
	double opera;
	double total;
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Examen window = new Examen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Examen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		frame.setBounds(100, 100, 663, 411);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCaracteristicasDeSu = new JLabel("Caracteristicas de su billete de viaje:");
		lblCaracteristicasDeSu.setBounds(10, 11, 224, 14);
		frame.getContentPane().add(lblCaracteristicasDeSu);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"MADRID", "BARCELONA"}));
		comboBox.setBounds(108, 36, 139, 20);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setToolTipText("");
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"BILBAO", "ZARAGOZA"}));
		comboBox_1.setBounds(108, 67, 139, 20);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblOrigen = new JLabel("Origen:*");
		lblOrigen.setBounds(10, 39, 75, 14);
		frame.getContentPane().add(lblOrigen);
		
		JLabel lblDestino = new JLabel("Destino:*");
		lblDestino.setBounds(10, 70, 63, 14);
		frame.getContentPane().add(lblDestino);
		
		JLabel lblNDeBilletes = new JLabel("N\u00BA de billetes:");
		lblNDeBilletes.setBounds(10, 95, 88, 14);
		frame.getContentPane().add(lblNDeBilletes);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		comboBox_2.setBounds(108, 92, 52, 20);
		frame.getContentPane().add(comboBox_2);
		
		JLabel lblTipoDeViaje = new JLabel("Tipo de viaje:");
		lblTipoDeViaje.setBounds(10, 120, 75, 14);
		frame.getContentPane().add(lblTipoDeViaje);
		
		JRadioButton rdbtnIdavta = new JRadioButton("Ida/Vta");
		
		rdbtnIdavta.setSelected(true);
		buttonGroup.add(rdbtnIdavta);
		rdbtnIdavta.setBounds(95, 119, 75, 23);
		frame.getContentPane().add(rdbtnIdavta);
		
		JRadioButton rdbtnSoloIda = new JRadioButton("Solo ida");
		buttonGroup.add(rdbtnSoloIda);
		rdbtnSoloIda.setBounds(172, 119, 75, 23);
		frame.getContentPane().add(rdbtnSoloIda);
		
		JLabel lblFormaDePago = new JLabel("Forma de pago:");
		lblFormaDePago.setBounds(10, 145, 91, 14);
		frame.getContentPane().add(lblFormaDePago);
		
		JRadioButton rdbtnTarjeta = new JRadioButton("Tarjeta");
		
		rdbtnTarjeta.setSelected(true);
		buttonGroup_1.add(rdbtnTarjeta);
		rdbtnTarjeta.setBounds(95, 141, 75, 23);
		frame.getContentPane().add(rdbtnTarjeta);
		
		JRadioButton rdbtnIban = new JRadioButton("IBAN(+5%)");
		buttonGroup_1.add(rdbtnIban);
		rdbtnIban.setBounds(172, 142, 91, 23);
		frame.getContentPane().add(rdbtnIban);
		
		JLabel lblDescuentos = new JLabel("Descuentos:");
		lblDescuentos.setBounds(10, 170, 75, 14);
		frame.getContentPane().add(lblDescuentos);
		
		JCheckBox chckbxFamiliaNumerosa = new JCheckBox("Familia numerosa (-10%)");
		chckbxFamiliaNumerosa.setBounds(95, 166, 168, 23);
		frame.getContentPane().add(chckbxFamiliaNumerosa);
		
		JCheckBox chckbxCarneJoven = new JCheckBox("Carne Joven(-8%)");
		
		chckbxCarneJoven.setBounds(95, 192, 139, 23);
		frame.getContentPane().add(chckbxCarneJoven);
		
		JCheckBox chckbxDesempleado = new JCheckBox("Desempleado(-6%)");
		
		chckbxDesempleado.setBounds(95, 218, 139, 23);
		frame.getContentPane().add(chckbxDesempleado);
		
		JLabel lblTotalAPagar = new JLabel("Total a PAGAR:");
		lblTotalAPagar.setBounds(10, 276, 91, 14);
		frame.getContentPane().add(lblTotalAPagar);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(95, 273, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lbluros = new JLabel("\u20ACuros");
		lbluros.setBounds(191, 276, 46, 14);
		frame.getContentPane().add(lbluros);
		
		JButton btnProcederAlPago = new JButton("Proceder al pago");
		btnProcederAlPago.setBounds(10, 324, 137, 23);
		frame.getContentPane().add(btnProcederAlPago);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(174, 324, 89, 23);
		frame.getContentPane().add(btnSalir);
		
		JLabel lblMtodosDePago = new JLabel("M\u00E9todos de Pago:");
		lblMtodosDePago.setBounds(314, 11, 167, 14);
		frame.getContentPane().add(lblMtodosDePago);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(314, 39, 323, 131);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblDatosTarjeta = new JLabel("Datos Tarjeta:");
		lblDatosTarjeta.setBounds(10, 11, 83, 14);
		panel.add(lblDatosTarjeta);
		
		JLabel lblTitular = new JLabel("Titular:*");
		lblTitular.setBounds(20, 36, 70, 14);
		panel.add(lblTitular);
		
		textField_1 = new JTextField();
		textField_1.setBounds(84, 33, 229, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNTarjeta = new JLabel("N\u00BA Tarjeta:*");
		lblNTarjeta.setBounds(10, 61, 70, 14);
		panel.add(lblNTarjeta);
		
		textField_2 = new JTextField();
		textField_2.setBounds(84, 58, 168, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblDigit = new JLabel("16 DIGIT");
		lblDigit.setBounds(267, 61, 46, 14);
		panel.add(lblDigit);
		
		JLabel lblCvv = new JLabel("CVV:*");
		lblCvv.setBounds(10, 95, 46, 14);
		panel.add(lblCvv);
		
		textField_3 = new JTextField();
		textField_3.setBounds(60, 92, 57, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblDigit_1 = new JLabel("3 DIGIT");
		lblDigit_1.setBounds(127, 95, 46, 14);
		panel.add(lblDigit_1);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setBounds(183, 95, 46, 14);
		panel.add(lblTipo);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"VISA", "MASTERCARD"}));
		comboBox_3.setBounds(224, 92, 89, 20);
		panel.add(comboBox_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(314, 181, 323, 91);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		panel_1.setVisible(false);
		
		JLabel lblDatosDeCuenta = new JLabel("Datos de cuenta IBAN:");
		lblDatosDeCuenta.setBounds(10, 11, 167, 14);
		panel_1.add(lblDatosDeCuenta);
		
		JLabel lblIbanes = new JLabel("IBAN-ES:*");
		lblIbanes.setBounds(10, 36, 84, 14);
		panel_1.add(lblIbanes);
		
		textField_4 = new JTextField();
		textField_4.setBounds(72, 33, 191, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblBanco = new JLabel("Banco:*");
		lblBanco.setBounds(20, 61, 58, 14);
		panel_1.add(lblBanco);
		
		textField_5 = new JTextField();
		textField_5.setBounds(72, 58, 241, 20);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblDigit_2 = new JLabel("22 DIGIT");
		lblDigit_2.setBounds(267, 36, 46, 14);
		panel_1.add(lblDigit_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(314, 284, 323, 77);
		frame.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		String mult = comboBox_2.getSelectedItem().toString();
		opera = total * Double.parseDouble(mult);
		
		
		
		//eventos
		
		
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de que deseas salir?", "Alerta!", JOptionPane.YES_NO_OPTION);
				if (resp == 0) {
					frame.dispose();
				}
			}
		});
		
		chckbxDesempleado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opera = opera * 0.94;
				textField.setText(String.valueOf(opera));
				
			}
		});
		
		chckbxCarneJoven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opera = opera * 0.92;
				textField.setText(String.valueOf(opera));
			}
		});
		
		
		rdbtnSoloIda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedItem().toString() == "MADRID" && comboBox_1.getSelectedItem().toString() == "BILBAO") {
					total = 30;
					String mult = comboBox_2.getSelectedItem().toString();
					opera = total * Double.parseDouble(mult);
				}else {
					if(comboBox.getSelectedItem().toString() == "MADRID" && comboBox_1.getSelectedItem().toString() == "ZARAGOZA"){
				total = 15;
				String mult = comboBox_2.getSelectedItem().toString();
				opera = total * Double.parseDouble(mult);
		}else {
			if (comboBox.getSelectedItem().toString() == "BARCELONA" && comboBox_1.getSelectedItem().toString() == "BILBAO") {
				total = 20;
				String mult = comboBox_2.getSelectedItem().toString();
				opera = total * Double.parseDouble(mult);
			}else {
				if (comboBox.getSelectedItem().toString() == "BARCELONA" && comboBox_1.getSelectedItem().toString() == "ZARAGOZA") {
					total = 12;
					String mult = comboBox_2.getSelectedItem().toString();
					opera = total * Double.parseDouble(mult);
				} 
				
			}
		}
					
					
				}
				textField.setText(String.valueOf(opera));	
			}
		});
		
		rdbtnIdavta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				if (comboBox.getSelectedItem().toString() == "MADRID" && comboBox_1.getSelectedItem().toString() == "BILBAO") {
					total = 50;
					String mult = comboBox_2.getSelectedItem().toString();
					opera = total * Double.parseDouble(mult);
				}else {
					if(comboBox.getSelectedItem().toString() == "MADRID" && comboBox_1.getSelectedItem().toString() == "ZARAGOZA"){
				total = 25;
				String mult = comboBox_2.getSelectedItem().toString();
				opera = total * Double.parseDouble(mult);
		}else {
			if (comboBox.getSelectedItem().toString() == "BARCELONA" && comboBox_1.getSelectedItem().toString() == "BILBAO") {
				total = 25;
				String mult = comboBox_2.getSelectedItem().toString();
				opera = total * Double.parseDouble(mult);
			}else {
				if (comboBox.getSelectedItem().toString() == "BARCELONA" && comboBox_1.getSelectedItem().toString() == "ZARAGOZA") {
					total = 20;
					String mult = comboBox_2.getSelectedItem().toString();
					opera = total * Double.parseDouble(mult);
				} 
				
			}
		}
					
					
				}
				textField.setText(String.valueOf(opera));
				
			}
		});
		
		chckbxFamiliaNumerosa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opera = opera * 0.90;
				textField.setText(String.valueOf(opera));
			}
		});
		
		
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {
				comboBox.setSelectedItem(null);
				comboBox_1.setSelectedItem(null);
				
			}
		});
		
		btnProcederAlPago.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem() == null || comboBox_1.getSelectedItem() == null) {
					JOptionPane.showMessageDialog(null, "Datos de viaje incompletos", 
							"Error de datos", JOptionPane.ERROR_MESSAGE);}
				else {	
				if(textField_2.getText().length() > 16 || textField_3.getText().length() > 3 ||
						textField_2.getText().length() < 17 || textField_3.getText().length() > 4 || textField_1.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Datos de compra incorrectos", 
						"Error de compra", JOptionPane.ERROR_MESSAGE);
				}else {
					textArea.setText("RESUMEN DE COMPRA" + "\n" + "ORIGEN:" + comboBox.getSelectedItem().toString() + "\n"
							+ "DESTINO: " + comboBox_1.getSelectedItem().toString() + "\n" + "NUMERO DE BILLETES:" + 
							comboBox_2.getSelectedItem().toString() + "\n" + textField.getText());
				}
				if(textField_4.getText().length() > 22 && textField_5.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Datos de compra incorrectos", 
							"Error de compra", JOptionPane.ERROR_MESSAGE);
				}else {
					textArea.setText("RESUMEN DE COMPRA" + "\n" + "ORIGEN:" + comboBox.getSelectedItem().toString() + "\n"
							+ "DESTINO: " + comboBox_1.getSelectedItem().toString() + "\n" + "NUMERO DE BILLETES:" + 
							comboBox_2.getSelectedItem().toString() + "\n" + "TOTAL PAGADO: " +  textField.getText());}

			}
			}
			
			
		});
		
		
		rdbtnIban.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel.setVisible(false);
				panel_1.setVisible(true);
				double a = 1.05;
				opera = opera * a;
				textField.setText(String.valueOf(opera));
				
			}
		});
		
		rdbtnTarjeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(true);
				panel_1.setVisible(false);
				opera = opera * 0.93;
				textField.setText(String.valueOf(opera));
				
			}
		});
		
		
		
		
		
	}
	
	
}
