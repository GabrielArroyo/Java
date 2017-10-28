import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.awt.event.ActionEvent;

public class TraductorInterfaz {

	private JFrame frmTraductor;
	private JTextField textField;
	private JTextField textField_1;

	
	public TraductorInterfaz() {
		initialize();
		frmTraductor.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		
	
		
		frmTraductor = new JFrame();
		frmTraductor.setTitle("TRADUCTOR");
		frmTraductor.setBounds(100, 100, 377, 250);
		frmTraductor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTraductor.getContentPane().setLayout(null);
		
		JLabel lblPalabraEnEspaol = new JLabel("Palabra en Espa\u00F1ol");
		lblPalabraEnEspaol.setBounds(10, 40, 128, 25);
		frmTraductor.getContentPane().add(lblPalabraEnEspaol);
		
		textField = new JTextField();
		textField.setBounds(148, 42, 162, 20);
		frmTraductor.getContentPane().add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ingles", "Frances"}));
		comboBox.setBounds(10, 76, 101, 20);
		frmTraductor.getContentPane().add(comboBox);
		
		JLabel lblPalabraTraducida = new JLabel("Palabra Traducida");
		lblPalabraTraducida.setBounds(10, 120, 128, 14);
		frmTraductor.getContentPane().add(lblPalabraTraducida);
		
		textField_1 = new JTextField();
		textField_1.setBounds(148, 117, 162, 20);
		frmTraductor.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setBounds(49, 177, 89, 23);
		frmTraductor.getContentPane().add(btnVolver);
		
		JButton btnTraducir = new JButton("Traducir");
		btnTraducir.setBounds(206, 177, 89, 23);
		frmTraductor.getContentPane().add(btnTraducir);
		
		
		//Eventos
		 
	
	
		 btnTraducir.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					URL web = null;
				    InputStream contenido = null;
				    String pagWeb = "";
				    
				    //Traducir en en ingles
					if(comboBox.getSelectedItem().toString() == "Ingles") {
					String palabraTraducir = textField.getText(); // Guardar palabra a traducir.
					String palabraError = textField_1.getText();
					 textField_1.setText(palabraTraducir); // Se escribe en el campo como recordatorio para el usuario.
					 textField.setText(""); // Queda en blanco para otra posible palabra.
					 
					 try {
						 web = new URL("http://www.wordreference.com/es/en/translation.asp?spen="+palabraTraducir);
					 } catch (MalformedURLException e1) {
						 // TODO Auto-generated catch block
						 e1.printStackTrace();
					 }
					 
					 try {
						 contenido = web.openStream();
					 } catch (IOException e1) {
						 // TODO Auto-generated catch block
						 e1.printStackTrace();
					 }
					 
					 
					 // Convertir InputStream en String
					 pagWeb = getStringFromInputStream(contenido);
					 String variable = "<td class='ToWrd' >";
					 int aux = 0;			 
					 pagWeb = pagWeb.substring(pagWeb.indexOf(variable)+variable.length());
					 
					 while(pagWeb.charAt(aux) != '<')
						 aux++;
					 pagWeb = pagWeb.substring(0, aux);
					 
					 textField_1.setText(pagWeb);
				}
					//Traducir en frances
					if(comboBox.getSelectedItem().toString() == "Frances") {
						String palabraTraducir = textField.getText(); 
						 textField_1.setText(palabraTraducir); 
						 textField.setText(""); 
						 
						 try {
							 web = new URL("http://www.wordreference.com/esfr/"+palabraTraducir);
						 } catch (MalformedURLException e1) {
							 // TODO Auto-generated catch block
							 e1.printStackTrace();
						 }
						 
						 try {
							 contenido = web.openStream();
						 } catch (IOException e1) {
							 // TODO Auto-generated catch block
							 e1.printStackTrace();
						 }
						 
						 
					
						 pagWeb = getStringFromInputStream(contenido);
						 String variable = "<td class='ToWrd' >";
						 int aux = 0;			 
						 pagWeb = pagWeb.substring(pagWeb.indexOf(variable)+variable.length());
						 
						 while(pagWeb.charAt(aux) != '<')
							 aux++;
						 pagWeb = pagWeb.substring(0, aux);
						 
						 textField_1.setText(pagWeb);
					}
				}
			});
		 
		 
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Interfaz I = new Interfaz();
				frmTraductor.dispose();
			}
		});
	}

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
}
