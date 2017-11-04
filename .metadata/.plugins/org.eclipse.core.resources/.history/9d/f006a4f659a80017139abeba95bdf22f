import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Principal extends Login{

	protected JFrame frmTraductor;
	protected JTextField textField;
	protected JTextField textField_1;
	private static String getStringFromInputStream(InputStream is) {

		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();

		String line;
		try {

			br = new BufferedReader(new InputStreamReader(is));
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return sb.toString();

	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frmTraductor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmTraductor = new JFrame();
		frmTraductor.setTitle("TRADUCTOR");
		frmTraductor.setBounds(100, 100, 450, 255);
		frmTraductor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTraductor.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frmTraductor.getContentPane().add(panel, BorderLayout.WEST);
		panel.setLayout(new GridLayout(2, 1, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Palabra:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Traducción:");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		JLabel lblIntroduzcaLaPalabra = new JLabel("INTRODUZCA LA PALABRA QUE QUIERE TRADUCIR");
		lblIntroduzcaLaPalabra.setHorizontalAlignment(SwingConstants.CENTER);
		frmTraductor.getContentPane().add(lblIntroduzcaLaPalabra, BorderLayout.NORTH);
		
		
		JPanel panel_1 = new JPanel();
		frmTraductor.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(62, 37, 130, 26);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(62, 101, 130, 26);
		panel_1.add(textField_1);
		
		JButton btnMenuPrincipal = new JButton("Menu Principal");
		btnMenuPrincipal.setBounds(75, 181, 117, 29);
		panel_1.add(btnMenuPrincipal);
		
		JPanel panel_2 = new JPanel();
		frmTraductor.getContentPane().add(panel_2, BorderLayout.EAST);
		panel_2.setLayout(new GridLayout(2, 1, 0, 0));
		
		JButton btnEspfrances = new JButton("ESP-FRANCES");
		panel_2.add(btnEspfrances);
		
		JButton btnEspingles = new JButton("ESP-INGLES");
		panel_2.add(btnEspingles);
		
		JPanel panel_3 = new JPanel();
		frmTraductor.getContentPane().add(panel_3, BorderLayout.SOUTH);
		panel_3.setLayout(null);
		
		//Boton Salir
		
		btnMenuPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login volver  = new Login();
				volver.frmLogin.setVisible(true);
				frmTraductor.dispose();//setVisible(false);
				
			}
		});
		
		//boton ingles  secuencia antes de una palabra en ingles: <td class='ToWrd' >Hello! <em class='tooltip POS2'> 
		btnEspingles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String palabra = textField.getText().toString() ; //sustituir por jtextfield
				URL web = null;
				InputStream contenido = null;
				String pagWeb = "";
				String constante = "<td class='ToWrd' >";
				int auxiliar = 0;
				
				try {
					web = new URL("http://www.wordreference.com/es/translation.asp?tranword="+palabra);
				} catch (MalformedURLException i) {
					// TODO Auto-generated catch block
					i.printStackTrace();
				}
				
			
				try {
					contenido = web.openStream();
				} catch (IOException i) {
					// TODO Auto-generated catch block
					i.printStackTrace();
					
				}
				
				
				
				// Convertir InputStream en String
				pagWeb = getStringFromInputStream(contenido);
				pagWeb = pagWeb.substring(pagWeb.indexOf(constante) + constante.length());
				while(pagWeb.charAt(auxiliar) != '<')
					auxiliar++;
				pagWeb = pagWeb.substring(0, auxiliar -1);
				textField_1.setText(pagWeb);
				
			}
		});
		
		//Boton Frances 
		
		btnEspfrances.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String palabra = textField.getText().toString() ; //sustituir por jtextfield
				URL web = null;
				InputStream contenido = null;
				String pagWeb  = "";
				String constante = "<td class='ToWrd' >";
				int auxiliar = 0;
				
				try {
					web = new URL("http://www.wordreference.com/esfr/"+palabra);
				} catch (MalformedURLException i) {
					// TODO Auto-generated catch block
					i.printStackTrace();
				}
				
			
				try {
					contenido = web.openStream();
				} catch (IOException i) {
					// TODO Auto-generated catch block
					i.printStackTrace();
				}
				
				
				pagWeb = getStringFromInputStream(contenido);
				pagWeb = pagWeb.substring(pagWeb.indexOf(constante) + constante.length());
				while(pagWeb.charAt(auxiliar) != '<')
					auxiliar++;
				pagWeb = pagWeb.substring(0, auxiliar -1);
				textField_1.setText(pagWeb);
				
			}
		});
		
		
		
	}
}
