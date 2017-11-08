package miniSudoku;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class Interfaz {
	int cont = 0;
	int a = 0;
	Sudoku prueba = new Sudoku();
	private JFrame frmPractica;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton btnComprobar;

	public Interfaz() {
		initialize();
		frmPractica.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPractica = new JFrame();
		
		frmPractica.setTitle("Practica 2\r\n");
		frmPractica.setBounds(100, 100, 613, 386);
		frmPractica.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmPractica.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JCheckBox chckbxMostrarSombreadoOriginal = new JCheckBox("Mostrar sombreado original");
		chckbxMostrarSombreadoOriginal.setSelected(true);
		panel.add(chckbxMostrarSombreadoOriginal);
				
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Permitir redimensionar");
		rdbtnNewRadioButton.setSelected(true);
		buttonGroup.add(rdbtnNewRadioButton);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNoPermitirRedimensionar = new JRadioButton("No permitir redimensionar");
		
		buttonGroup.add(rdbtnNoPermitirRedimensionar);
		panel.add(rdbtnNoPermitirRedimensionar);
		
		//JPanel panel_1 = new JPanel();
		//frmPractica.getContentPane().add(panel_1, BorderLayout.WEST);
		
		JPanel panel_2 = new JPanel();
		frmPractica.getContentPane().add(panel_2, BorderLayout.SOUTH);
		
		JButton btnResolicionAutomatica = new JButton("Resolicion automatica");
		panel_2.add(btnResolicionAutomatica);
		
		JButton btnNewButton = new JButton("Reiniciar\r\n juego");
		panel_2.add(btnNewButton);
		
		btnComprobar = new JButton("Comprobar");
		panel_2.add(btnComprobar);
		
		JButton btnSalirDelJuego = new JButton("Salir del juego");
		panel_2.add(btnSalirDelJuego);
		
		//JPanel panel_3 = new JPanel();
		//frmPractica.getContentPane().add(panel_3, BorderLayout.EAST);
		
		JPanel panel_4 = new JPanel();
		frmPractica.getContentPane().add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new GridLayout(4, 4, 0, 0));
		
		textField = new JTextField();
		textField.setDisabledTextColor(Color.GRAY);
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 28));
		panel_4.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 28));
		panel_4.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 28));
		panel_4.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 28));
		panel_4.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 28));
		panel_4.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 28));
		panel_4.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 28));
		panel_4.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 28));
		panel_4.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 28));
		panel_4.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 28));
		panel_4.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 28));
		panel_4.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 28));
		panel_4.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 28));
		panel_4.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setFont(new Font("Tahoma", Font.PLAIN, 28));
		panel_4.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setEditable(false);
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setFont(new Font("Tahoma", Font.PLAIN, 28));
		panel_4.add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setFont(new Font("Tahoma", Font.PLAIN, 28));
		panel_4.add(textField_15);
		textField_15.setColumns(10);
		
		JTextField JTexField[][] = {{textField, textField_1, textField_2, textField_3},
									{textField_4, textField_5, textField_6, textField_7},
									{textField_8, textField_9, textField_10, textField_11},
									{textField_12, textField_13, textField_14, textField_15}
};
		
		//eventos
		
		frmPractica.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {
				String z = "0";
				for (int i = 0; i < JTexField.length; i++) {
					for (int j = 0; j < JTexField.length; j++) {
						 JTexField[i][j].setText(String.valueOf(prueba.grid[i][j])); 
						 
						 if(JTexField[i][j].getText().equals(z)) {
							JTexField[i][j].setText("");
							
						}
					}
					
				}
				
				
			}
		});
		
		btnSalirDelJuego.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de que deseas salir?", "Alerta!", JOptionPane.YES_NO_OPTION);
				if (resp == 0) {
					frmPractica.dispose();
				}
			}
		});
		
		btnComprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = 0;
				int j = 0;
				for (i = 0; i < JTexField.length; i++) {
					for (j = 0; j < JTexField.length; j++) {
						
						if (JTexField[i][j].getText().equals(String.valueOf(prueba.grid1[i][j]))) {
							cont++;}
					}
				}
				
				if(cont == 16) {
					 JOptionPane.showMessageDialog(null, "El sudoku esta correcto, bien hecho");
					 }else {
						 JOptionPane.showMessageDialog(null, "El Sudoku esta mal, reinicia y vuelve a intentarlo", 
								"ERRONEO¡¡", JOptionPane.ERROR_MESSAGE);
						 
					 }
				
				
				
			}
		});
		
		
		rdbtnNoPermitirRedimensionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmPractica.setResizable(false);
					
				
			}
		});
		
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPractica.setResizable(true);
			}
		});
		
		btnResolicionAutomatica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				for (int i = 0; i < JTexField.length; i++) {
					for (int j = 0; j < JTexField.length; j++) {
						 JTexField[i][j].setText(String.valueOf(prueba.grid1[i][j])); }}
				
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String z = "0";
				for (int i = 0; i < JTexField.length; i++) {
					for (int j = 0; j < JTexField.length; j++) {
						 JTexField[i][j].setText(String.valueOf(prueba.grid[i][j])); 
						 
						 if(JTexField[i][j].getText().equals(z)) {
							JTexField[i][j].setText("");
							
						}
					}
					
				}
				
				
			}
		});
		
		chckbxMostrarSombreadoOriginal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(a == 0) {
				a++;
				textField.setEditable(true);
				textField_5.setEditable(true);
				textField_7.setEditable(true);
				textField_8.setEditable(true);
				textField_11.setEditable(true);
				textField_12.setEditable(true);
				textField_14.setEditable(true);
				}else{
				textField.setEditable(false);
				textField_5.setEditable(false);
				textField_7.setEditable(false);
				textField_8.setEditable(false);
				textField_11.setEditable(false);
				textField_12.setEditable(false);
				textField_14.setEditable(false);
				a--;
				}
				
			}
		});
		
	}
}
