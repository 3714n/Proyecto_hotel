package Parte_Grafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class Ventana_Temperatura extends JFrame {

	private JPanel contentPane;
	private JTextField txt_cantidad2;
	private JTextField txt_resultado2;
	private JComboBox <String> cbm_converciones2;

	public Ventana_Temperatura() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 475, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 459, 396);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel_1.setBounds(0, 0, 459, 396);
		panel.add(panel_1);
		
		cbm_converciones2 = new JComboBox<String>();
		cbm_converciones2.setBounds(158, 167, 175, 28);
		panel_1.add(cbm_converciones2);
		cbm_converciones2.addItem("-");
		cbm_converciones2.addItem("Celsius a Fahrenheit");
		cbm_converciones2.addItem("Celsius a Kelvin");
		cbm_converciones2.addItem("Celsius a Rankine");
		cbm_converciones2.addItem("Fahrenheit a Celsius");
		cbm_converciones2.addItem("Kelvin a Celsius");
		cbm_converciones2.addItem("Rankine a Celsius");
;
		
		JLabel lblNewLabel = new JLabel("Converciones");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(27, 171, 93, 21);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cantidad");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(27, 214, 93, 21);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(Ventana_Temperatura.class.getResource("/Imagenes/imagen-del-sol-de-la-nasa-tomada-en-2006.jpeg")));
		lblNewLabel_2.setBounds(0, 40, 459, 91);
		panel_1.add(lblNewLabel_2);
		
		txt_cantidad2 = new JTextField();
		txt_cantidad2.setColumns(10);
		txt_cantidad2.setBounds(158, 214, 86, 20);
		panel_1.add(txt_cantidad2);
		
		JButton btn_convertir2 = new JButton("Convertir");
		btn_convertir2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				convertir2();
			}
		});
		btn_convertir2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_convertir2.setBounds(10, 259, 121, 37);
		panel_1.add(btn_convertir2);
		
		JButton btn_limpiar1 = new JButton("Limpiar");
		btn_limpiar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cbm_converciones2.setSelectedIndex(0);
				txt_cantidad2.setText("");
				txt_resultado2.setText("");
			}
		});
		btn_limpiar1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_limpiar1.setBounds(71, 320, 143, 46);
		panel_1.add(btn_limpiar1);
		
		txt_resultado2 = new JTextField();
		txt_resultado2.setFont(new Font("Tahoma", Font.BOLD, 16));
		txt_resultado2.setColumns(10);
		txt_resultado2.setBounds(158, 260, 175, 36);
		panel_1.add(txt_resultado2);
		txt_resultado2.setEditable(false);
		
		JLabel lblNewLabel_3 = new JLabel("Convertidor de monedas");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(128, 11, 263, 23);
		panel_1.add(lblNewLabel_3);
		
		JButton btn_Volver = new JButton("Volver");
		btn_Volver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ventana_Principal pantallaPrincipal = new Ventana_Principal();
				pantallaPrincipal.setVisible(true);
				pantallaPrincipal.setLocationRelativeTo(null);
				dispose();
				
			}
		});
		btn_Volver.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_Volver.setBounds(248, 320, 143, 46);
		panel_1.add(btn_Volver);
	}

			protected void convertir2() {
				double temperatura;
				
					
		        try {
			        	temperatura = Double.parseDouble(txt_cantidad2.getText());
			        } catch (NumberFormatException e) {
			            JOptionPane.showMessageDialog(this, "Ingresa una cantidad válida.", "Error", JOptionPane.ERROR_MESSAGE);
			            return;
			        }
				
			    
			    int posicion = cbm_converciones2.getSelectedIndex();
				double convertirTemperatura = 0.0;
				
				 switch (posicion) {
				 	case 0:
				 		convertirTemperatura = 0.0 * temperatura;
		                break;
		            case 1:
		            	convertirTemperatura = (temperatura*1.8)+32;
		                break;
		            case 2:
		            	convertirTemperatura = temperatura + 273.15;
		                break;
		            case 3:
		            	convertirTemperatura = (temperatura + 273.15) * 1.8;
		                break;
		            case 4:
		            	convertirTemperatura = (temperatura - 32)*0.55;
		                break;
		            case 5:
		            	convertirTemperatura = temperatura - 273.15;
		                break;
		            case 6:
		            	convertirTemperatura =  (temperatura - 491.67)*0.55;
		                break;
		        }
					 DecimalFormat decimal = new DecimalFormat("###,###.###");
					 txt_resultado2.setText(decimal.format(convertirTemperatura)); 
				 }

}
