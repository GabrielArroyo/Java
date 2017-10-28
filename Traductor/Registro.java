import java.awt.EventQueue;
import javax.swing.JOptionPane;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registro {

	private JFrame frmRegistro;
	private JTextField textField;
	private JPasswordField passwordField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField_1;

	public Registro() {
		initialize();
		frmRegistro.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegistro = new JFrame();
		frmRegistro.setTitle("REGISTRO");
		frmRegistro.setBounds(100, 100, 450, 300);
		frmRegistro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistro.getContentPane().setLayout(null);
		
		JLabel lblNombreDeUsuario = new JLabel("Nombre de usuario*");
		lblNombreDeUsuario.setBounds(10, 11, 136, 20);
		frmRegistro.getContentPane().add(lblNombreDeUsuario);
		
		textField = new JTextField();
		textField.setBounds(175, 10, 162, 20);
		frmRegistro.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a*");
		lblContrasea.setBounds(10, 42, 106, 20);
		frmRegistro.getContentPane().add(lblContrasea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(175, 41, 162, 23);
		frmRegistro.getContentPane().add(passwordField);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento");
		lblFechaDeNacimiento.setBounds(10, 136, 136, 23);
		frmRegistro.getContentPane().add(lblFechaDeNacimiento);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(175, 136, 162, 23);
		frmRegistro.getContentPane().add(dateChooser);
		
		JCheckBox chckbxDeseaRecibirPublicidad = new JCheckBox("Desea recibir publicidad");
		chckbxDeseaRecibirPublicidad.setSelected(true);
		chckbxDeseaRecibirPublicidad.setBounds(126, 185, 169, 23);
		frmRegistro.getContentPane().add(chckbxDeseaRecibirPublicidad);
		
		JRadioButton rdbtnHombre = new JRadioButton("Hombre");
		buttonGroup.add(rdbtnHombre);
		rdbtnHombre.setSelected(true);
		rdbtnHombre.setBounds(128, 106, 109, 23);
		frmRegistro.getContentPane().add(rdbtnHombre);
		
		JRadioButton rdbtnMujeres = new JRadioButton("Mujer");
		buttonGroup.add(rdbtnMujeres);
		rdbtnMujeres.setBounds(239, 106, 109, 23);
		frmRegistro.getContentPane().add(rdbtnMujeres);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setBounds(27, 215, 119, 23);
		frmRegistro.getContentPane().add(btnRegistrarse);
		
		JButton btnVolverAlLogin = new JButton("Volver al login");
		btnVolverAlLogin.setBounds(199, 215, 138, 23);
		frmRegistro.getContentPane().add(btnVolverAlLogin);
		
		JLabel lblCorreoElectronico = new JLabel("Correo electronico*");
		lblCorreoElectronico.setBounds(10, 80, 136, 14);
		frmRegistro.getContentPane().add(lblCorreoElectronico);
		
		textField_1 = new JTextField();
		textField_1.setBounds(175, 79, 162, 20);
		frmRegistro.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		
		
		//Eventos
		
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().length() == 0 || textField_1.getText().length() == 0 || passwordField.getText().length() == 0)
				JOptionPane.showMessageDialog(null, "Los campos con un * deben estar relleno", 
						"FALLO¡¡¡", JOptionPane.ERROR_MESSAGE);
					
				
				if(textField.getText().length() != 0 && textField_1.getText().length() != 0 && passwordField.getText().length() != 0)
					JOptionPane.showMessageDialog(null, "Registro realizado correctamente");

			}
		});
		
		
		btnVolverAlLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Interfaz I = new Interfaz();
				frmRegistro.dispose();
				
				
			}
		});
	}
}
