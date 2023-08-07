package Parte_Grafica;
import java.awt.EventQueue;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.TextUI;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import java.awt.Font;


public class Convertidor_Grafico extends JFrame {

	private JPanel panel;
	private JTextField txt_cantidad;
	private JTextField txtResultado;
	private JComboBox <String> cbm_converciones;
	
	


	public Convertidor_Grafico() {
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 475, 435);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panel);
		panel.setLayout(null);
		
		
		cbm_converciones = new JComboBox<String>();
		cbm_converciones.setBounds(158, 167, 175, 28);
		panel.add(cbm_converciones);
		cbm_converciones.addItem("-");
		cbm_converciones.addItem("Peso COP a Dólar");
		cbm_converciones.addItem("Peso COP  a Euros");
		cbm_converciones.addItem("Peso COP  a Libras Esterlinas");
		cbm_converciones.addItem("Peso COP  a Yen Japonés");
		cbm_converciones.addItem("Peso COP  a Won sul-coreano");
		cbm_converciones.addItem("Dólar a Peso COP");
		cbm_converciones.addItem("Euros a Peso COP");
		cbm_converciones.addItem("Libras Peso COP");
		cbm_converciones.addItem("Yen Japonés a Peso COP");
		cbm_converciones.addItem("Won sul-coreano a Peso COP");	

		JLabel lblNewLabel = new JLabel("Converciones");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(27, 171, 93, 21);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cantidad");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(27, 214, 93, 21);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(Convertidor_Grafico.class.getResource("/Imagenes/monedas-divisas.jpg")));
		lblNewLabel_2.setBounds(0, 40, 459, 91);
		panel.add(lblNewLabel_2);
		
		txt_cantidad = new JTextField();
		txt_cantidad.setBounds(158, 214, 86, 20);
		panel.add(txt_cantidad);
		txt_cantidad.setColumns(10);
		
		JButton btn_convertir = new JButton("Convertir");
		btn_convertir.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_convertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				convertir();
			}
		});
		btn_convertir.setBounds(10, 259, 121, 37);
		panel.add(btn_convertir);
		
		JButton btn_limpiar = new JButton("Limpiar");
		btn_limpiar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_limpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cbm_converciones.setSelectedIndex(0);
				txt_cantidad.setText("");
				txtResultado.setText("");
			}
		});
		btn_limpiar.setBounds(71, 320, 143, 46);
		panel.add(btn_limpiar);
		
		txtResultado = new JTextField();
		txtResultado.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtResultado.setColumns(10);
		txtResultado.setBounds(158, 260, 175, 36);
		panel.add(txtResultado);
		txtResultado.setEditable(false);
		
		JLabel lblNewLabel_3 = new JLabel("Convertidor de monedas");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(128, 11, 263, 23);
		panel.add(lblNewLabel_3);
		
		JButton btm_volver1 = new JButton("Volver");
		btm_volver1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ventana_Principal pantallaPrincipal = new Ventana_Principal();
				pantallaPrincipal.setVisible(true);
				pantallaPrincipal.setLocationRelativeTo(null);
				dispose();
			}
		});
		btm_volver1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btm_volver1.setBounds(248, 320, 143, 46);
		panel.add(btm_volver1);
	}
			

					
			protected void convertir() {
				double dolar = 4175;
				double euro = 4421;
				double esterlina = 4973;
				double yenJapones = 28.95;
				double wonSurCorea = 3.14;
				double cantidad;
				String PesosCOP = "Pesos Colombiano";
				String dolar1 = "Dolar";
				String euro1 = "Euros";
				String esterlina1 = "Libra Esterlina";
				String yen = "Yen Japones"; 
				String won = "Won Sur-Coreano";
			        try {
			        	cantidad = Double.parseDouble(txt_cantidad.getText());
			        } catch (NumberFormatException e) {
			            JOptionPane.showMessageDialog(this, "Ingresa una cantidad válida.", "Error", JOptionPane.ERROR_MESSAGE);
			            return;
			        }
				
			    
			    int posicion = cbm_converciones.getSelectedIndex();
				double convertirMoneda = 0.0;
				
				 switch (posicion) {
				 	case 0:
		                convertirMoneda = 0.0 * cantidad;
		                break;
		            case 1:
		                convertirMoneda = cantidad / dolar;
		                break;
		            case 2:
		                convertirMoneda = cantidad /euro;
		                break;
		            case 3:
		                convertirMoneda = cantidad / esterlina;
		                break;
		            case 4:
		                convertirMoneda = cantidad / yenJapones;
		                break;
		            case 5:
		                convertirMoneda = cantidad / wonSurCorea;
		                break;
		            case 6:
		                convertirMoneda = cantidad * dolar;
		                break;
		            case 7:
		                convertirMoneda = cantidad * euro;
		                break;
		            case 8:
		                convertirMoneda = cantidad * esterlina;
		                break;
		            case 9:
		                convertirMoneda = cantidad * yenJapones;
		                break;
		            case 10:
		                convertirMoneda = cantidad * wonSurCorea;
		                break;
		        }
					 DecimalFormat decimal = new DecimalFormat("###,###.##");
					 txtResultado.setText(decimal.format(convertirMoneda)); 
				 }
				
			}
	

	
