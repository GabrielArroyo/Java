import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interfaz {

	private JFrame frmLogin;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz window = new Interfaz();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interfaz() {
		initialize();
		frmLogin.setVisible(true);
	}

	public JFrame getFrmLogin() {
		return frmLogin;
	}

	public void setFrmLogin(JFrame frmLogin) {
		this.frmLogin = frmLogin;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 381, 297);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(118, 45, 175, 25);
		frmLogin.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblUsuario = new JLabel("USUARIO");
		lblUsuario.setBounds(10, 50, 87, 14);
		frmLogin.getContentPane().add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("CONTRASE\u00D1A");
		lblContrasea.setBounds(10, 99, 87, 14);
		frmLogin.getContentPane().add(lblContrasea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(118, 96, 175, 20);
		frmLogin.getContentPane().add(passwordField);
		
		JButton btnRgistrarse = new JButton("REGISTRARSE");
		
		btnRgistrarse.setBounds(42, 199, 125, 23);
		frmLogin.getContentPane().add(btnRgistrarse);
		
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.setBounds(204, 199, 89, 23);
		frmLogin.getContentPane().add(btnEntrar);
		
		
		
		
		
		
		//Eventos
		
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField.getText().length() == 0 || passwordField.getText().length() == 0 || !textField.getText().equals(passwordField.getText())) {	
					JOptionPane.showMessageDialog(null, "No pueden estar los campos vacios", 
							"FALLO¡¡", JOptionPane.ERROR_MESSAGE);
				}
				
				if(textField.getText().equals(passwordField.getText()))
				{
	                    JOptionPane.showMessageDialog(null, "Has logueado correctamente");
	                    TraductorInterfaz t = new TraductorInterfaz();
	        			frmLogin.dispose();
				
				  }
			
			}
		});
		
		btnRgistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Registro r = new Registro();
				frmLogin.dispose();
				
			}
		});
	}
}
