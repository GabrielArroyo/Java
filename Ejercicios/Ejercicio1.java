import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import javax.swing.JTree;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JMenuItem;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Ejercicio1 {

	private JFrame frmElijeLaQue;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio1 window = new Ejercicio1();
					window.frmElijeLaQue.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmElijeLaQue = new JFrame();
		frmElijeLaQue.setResizable(false);
		frmElijeLaQue.setTitle("Elije la que mas te ha gustado\r\n");
		frmElijeLaQue.getContentPane().setBackground(new Color(255, 255, 204));
		frmElijeLaQue.setBounds(100, 100, 583, 467);
		frmElijeLaQue.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmElijeLaQue.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Temporada Verano 2017");
		lblNewLabel.setBounds(10, 93, 165, 28);
		frmElijeLaQue.getContentPane().add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Kings and magic", "tsundere children", "Fate", "Gamers"}));
		comboBox.setBounds(10, 132, 165, 20);
		frmElijeLaQue.getContentPane().add(comboBox);
		
		JLabel lblQueTemporadaEs = new JLabel("Que temporada es mejor");
		lblQueTemporadaEs.setBounds(214, 165, 193, 28);
		frmElijeLaQue.getContentPane().add(lblQueTemporadaEs);
		
		JLabel lblTemporadaInvierno = new JLabel("Temporada invierno 2017");
		lblTemporadaInvierno.setBounds(370, 100, 165, 14);
		frmElijeLaQue.getContentPane().add(lblTemporadaInvierno);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Konosuba 2", "Eromanga-sensei", "One piece", "Final Naruto"}));
		comboBox_1.setBounds(370, 132, 165, 20);
		frmElijeLaQue.getContentPane().add(comboBox_1);
		
		JButton btnNewButton = new JButton("El verano es mejor");
		btnNewButton.setBounds(10, 333, 165, 23);
		frmElijeLaQue.getContentPane().add(btnNewButton);
		
		JButton btnElInviernoSi = new JButton("El invierno si que mola");
		btnElInviernoSi.setBounds(370, 333, 165, 23);
		frmElijeLaQue.getContentPane().add(btnElInviernoSi);
		
		JLabel lblQueTemporadaPrefieres = new JLabel("QUE TEMPORADA PREFIERES");
		lblQueTemporadaPrefieres.setBackground(new Color(255, 204, 102));
		lblQueTemporadaPrefieres.setBounds(186, 11, 193, 61);
		frmElijeLaQue.getContentPane().add(lblQueTemporadaPrefieres);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 219, 127, 103);
		frmElijeLaQue.getContentPane().add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"ASGASGAGASGA", "SGAS", "GASGASGAGASGAS", "GASGASGASG", "ASGDFB", "DXB", "DF", "SV", "SD", "GB", ""};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		JMenuBar menuBar = new JMenuBar();
		frmElijeLaQue.setJMenuBar(menuBar);
		
		JMenu mnAnimes = new JMenu("Animes");
		menuBar.add(mnAnimes);
		
		JMenuItem mntmShonen = new JMenuItem("Shonen");
		mnAnimes.add(mntmShonen);
		
		JMenuItem mntmShojo = new JMenuItem("Shojo");
		mnAnimes.add(mntmShojo);
		
		JMenuItem mntmCosasDeLa = new JMenuItem("Cosas de la vida");
		mnAnimes.add(mntmCosasDeLa);
	}
}
