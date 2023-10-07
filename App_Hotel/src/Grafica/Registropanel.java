package Grafica;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;



import com.toedter.calendar.JDateChooser;

import Com.Proyecto_Hotel.ClienteBO.ClienteBO;
import Com.Proyecto_Hotel.ClienteBO.DisponibilidadBO;
import Com.Proyecto_Hotel.ClienteBO.HabitacionBO;
import Com.Proyecto_Hotel.Registro_Clientes.Datos_Clientes;
import Com.Proyecto_Hotel.Registro_Clientes.Datos_Habitacion;
import Conexion.Conexion;
import Habitaciones.G1_Panel;
import Logica.Metodos;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JTable;
import javax.swing.event.AncestorListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.AncestorEvent;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

public class Registropanel extends JPanel {
	private JTextField txtTotalPagado;
	private JTextField txtValorAPagar;
	private JTextField txtDiferencia;
	private JTextField txtNombre;
	private JTextField txtCedula;
	private JTextField txtCelular;
	private JTextField txtProcedencia;
	private JTextField txtCantidad;
	private JTextField txtNoche;
	private JTextField txtHoraEntrada;
	private JTextField txtPago;
	private JTextField txtTarifa;
	private JTextField txtHabSeleccionadas;
	public JTextField txtInsertNombre;
	private JTextField txtInsertCc;
	private JTextField txtInsertFechEnt;
	private JTextField txtInsertFecSal;
	private JTextField txtInsertCant;
	private JTextField txtInsertFechReserv;
	private JTextField txtInsertTari;
	private JTextField txtInserPagos;
	private JTextField textField_10;
	private JTextField txtInsertHabi;
	private JTextField txtSelecPaque;
	private JTextField txtInsertNoche;
	private JTable table;
	private JDateChooser cldFechaEntrada;
	private JPanel PanelDispo;
	private String mensaje = "";
	
	Datos_Clientes dcl = new Datos_Clientes();
	ClienteBO cbo = new ClienteBO();
	DisponibilidadBO dp = new DisponibilidadBO();
	HabitacionBO hbo = new HabitacionBO();
	Datos_Habitacion dhb = new Datos_Habitacion();
	public Registropanel() {
		setBounds(168, 77, 964, 673);
		setLayout(null);
		
	
		
		
		JPanel pasaNoche = new JPanel();
		pasaNoche.setLayout(null);
		pasaNoche.setForeground(new Color(69, 118, 69));
		pasaNoche.setBorder(null);
		pasaNoche.setBackground(new Color(236, 244, 236));
		pasaNoche.setBounds(0, 0, 1031, 671);
		add(pasaNoche);
		
		JPanel panel_3_1_1_2 = new JPanel();
		panel_3_1_1_2.setLayout(null);
		panel_3_1_1_2.setBorder(null);
		panel_3_1_1_2.setBackground(new Color(236, 244, 236));
		panel_3_1_1_2.setBounds(26, 234, 100, 23);
		pasaNoche.add(panel_3_1_1_2);
		
		JLabel lblDatosGenerales = new JLabel("Datos Generales");
		lblDatosGenerales.setHorizontalTextPosition(SwingConstants.CENTER);
		lblDatosGenerales.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosGenerales.setForeground(new Color(36, 62, 36));
		lblDatosGenerales.setBorder(null);
		lblDatosGenerales.setBounds(0, 0, 100, 23);
		panel_3_1_1_2.add(lblDatosGenerales);
		
		JPanel panel_3_1_1_1 = new JPanel();
		panel_3_1_1_1.setLayout(null);
		panel_3_1_1_1.setBorder(null);
		panel_3_1_1_1.setBackground(new Color(236, 244, 236));
		panel_3_1_1_1.setBounds(782, 152, 78, 23);
		pasaNoche.add(panel_3_1_1_1);
		
		JLabel lblHabitaciones = new JLabel("Habitaciones");
		lblHabitaciones.setHorizontalTextPosition(SwingConstants.CENTER);
		lblHabitaciones.setHorizontalAlignment(SwingConstants.CENTER);
		lblHabitaciones.setForeground(new Color(36, 62, 36));
		lblHabitaciones.setBorder(null);
		lblHabitaciones.setBounds(0, 0, 78, 23);
		panel_3_1_1_1.add(lblHabitaciones);
		
		JPanel infReserva_2_1_1 = new JPanel();
		infReserva_2_1_1.setLayout(null);
		infReserva_2_1_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133)));
		infReserva_2_1_1.setBackground(new Color(236, 244, 236));
		infReserva_2_1_1.setBounds(12, 245, 740, 417);
		pasaNoche.add(infReserva_2_1_1);
		
		JPanel panel_3_1_1_2_1 = new JPanel();
		panel_3_1_1_2_1.setLayout(null);
		panel_3_1_1_2_1.setBorder(null);
		panel_3_1_1_2_1.setBackground(new Color(236, 244, 236));
		panel_3_1_1_2_1.setBounds(499, 0, 90, 23);
		infReserva_2_1_1.add(panel_3_1_1_2_1);
		
		JLabel lblObservacin = new JLabel("Observación");
		lblObservacin.setHorizontalTextPosition(SwingConstants.CENTER);
		lblObservacin.setHorizontalAlignment(SwingConstants.CENTER);
		lblObservacin.setForeground(new Color(36, 62, 36));
		lblObservacin.setBorder(null);
		lblObservacin.setBounds(0, 0, 90, 23);
		panel_3_1_1_2_1.add(lblObservacin);
		
		JPanel infReserva_2_1_1_1 = new JPanel();
		infReserva_2_1_1_1.setLayout(null);
		infReserva_2_1_1_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133)));
		infReserva_2_1_1_1.setBackground(new Color(236, 244, 236));
		infReserva_2_1_1_1.setBounds(12, 12, 231, 164);
		infReserva_2_1_1.add(infReserva_2_1_1_1);
		
		JLabel lblNewLabel_1_1_2_2_1 = new JLabel("Total \r\npagado");
		lblNewLabel_1_1_2_2_1.setBounds(12, 27, 79, 20);
		infReserva_2_1_1_1.add(lblNewLabel_1_1_2_2_1);
		
		txtTotalPagado = new JTextField();
		txtTotalPagado.setEditable(false);
		txtTotalPagado.setColumns(10);
		txtTotalPagado.setBounds(98, 27, 100, 20);
		infReserva_2_1_1_1.add(txtTotalPagado);
		
		JLabel lblNewLabel_1_1_2_2_1_1 = new JLabel("Valor a pagar");
		lblNewLabel_1_1_2_2_1_1.setBounds(12, 59, 79, 20);
		infReserva_2_1_1_1.add(lblNewLabel_1_1_2_2_1_1);
		
		txtValorAPagar = new JTextField();
		
		
		txtValorAPagar.setEditable(false);
		txtValorAPagar.setColumns(10);
		txtValorAPagar.setBounds(98, 59, 100, 20);
		infReserva_2_1_1_1.add(txtValorAPagar);
		
		txtDiferencia = new JTextField();
		txtDiferencia.setEditable(false);
		txtDiferencia.setColumns(10);
		txtDiferencia.setBounds(98, 91, 100, 20);
		infReserva_2_1_1_1.add(txtDiferencia);
		
		JLabel lblNewLabel_1_1_2_2_1_1_1 = new JLabel("Diferencia");
		lblNewLabel_1_1_2_2_1_1_1.setBounds(12, 91, 79, 20);
		infReserva_2_1_1_1.add(lblNewLabel_1_1_2_2_1_1_1);
		
		JPanel infReserva_2_1_1_1_1 = new JPanel();
		infReserva_2_1_1_1_1.setLayout(null);
		infReserva_2_1_1_1_1.setBackground(new Color(236, 244, 236));
		infReserva_2_1_1_1_1.setBounds(255, 12, 231, 80);
		infReserva_2_1_1.add(infReserva_2_1_1_1_1);
		
		JLabel lblNewLabel_1_1_2_2_1_2 = new JLabel("Disponibilidad");
		lblNewLabel_1_1_2_2_1_2.setBounds(12, 11, 79, 20);
		infReserva_2_1_1_1_1.add(lblNewLabel_1_1_2_2_1_2);
		
		PanelDispo = new JPanel();
		PanelDispo.setBounds(101, 11, 102, 23);
		infReserva_2_1_1_1_1.add(PanelDispo);
		PanelDispo.setLayout(null);
		
		JLabel lblNewLabel_1_1_2_2_1_2_1_1 = new JLabel("Publicidad");
		lblNewLabel_1_1_2_2_1_2_1_1.setBounds(12, 46, 79, 20);
		infReserva_2_1_1_1_1.add(lblNewLabel_1_1_2_2_1_2_1_1);
		
		JComboBox cbxPublicidad = new JComboBox();
		cbxPublicidad.setBounds(101, 45, 121, 23);
		infReserva_2_1_1_1_1.add(cbxPublicidad);
		cbxPublicidad.setModel(new DefaultComboBoxModel(new String[] {"Seleccionar", "Istagram", "Facebook", "Youtube", "Recomendación", "Voz"}));
		cbxPublicidad.setForeground(Color.WHITE);
		cbxPublicidad.setBorder(null);
		cbxPublicidad.setBackground(new Color(85, 147, 85));
		
		JLabel lblDisponibilidad = new JLabel("");
		lblDisponibilidad.setBounds(101, 8, 102, 23);
		infReserva_2_1_1_1_1.add(lblDisponibilidad);
		lblDisponibilidad.setBackground(new Color(0, 0, 0));
		lblDisponibilidad.setBorder(null);
		lblDisponibilidad.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		
		JPanel infReserva_2_1_1_1_2 = new JPanel();
		infReserva_2_1_1_1_2.setLayout(null);
		infReserva_2_1_1_1_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133)));
		infReserva_2_1_1_1_2.setBackground(new Color(236, 244, 236));
		infReserva_2_1_1_1_2.setBounds(497, 12, 231, 154);
		infReserva_2_1_1.add(infReserva_2_1_1_1_2);
		
		txtHabSeleccionadas = new JTextField();
		txtHabSeleccionadas.setBounds(10, 11, 211, 132);
		infReserva_2_1_1_1_2.add(txtHabSeleccionadas);
		txtHabSeleccionadas.setColumns(10);
		
		JPanel infReserva_2_1_1_1_2_1 = new JPanel();
		infReserva_2_1_1_1_2_1.setLayout(null);
		infReserva_2_1_1_1_2_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133)));
		infReserva_2_1_1_1_2_1.setBackground(new Color(236, 244, 236));
		infReserva_2_1_1_1_2_1.setBounds(12, 188, 716, 218);
		infReserva_2_1_1.add(infReserva_2_1_1_1_2_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 696, 196);
		infReserva_2_1_1_1_2_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				},
				new String[] {
						"ID", "Nombre", "Cedula", "Celular", "Procedencia", "Entrada", "Salida", "Cantidad", "Noches", "Hora Entrada", "Fecha Reserva", "Tarifa", "Pagos", "Metodos Pagos ", "Total Pagos", "Valor a pagar", "Diferencia ", "Publicidad", "Paquetes"
				}
			));
		scrollPane.setViewportView(table);
		
		table.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
				
			
				
				cbo.mostrarClinte(table); 
				
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		
		JPanel infReserva_2_1_1_1_1_1 = new JPanel();
		infReserva_2_1_1_1_1_1.setLayout(null);
		infReserva_2_1_1_1_1_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133)));
		infReserva_2_1_1_1_1_1.setBackground(new Color(236, 244, 236));
		infReserva_2_1_1_1_1_1.setBounds(255, 96, 231, 80);
		infReserva_2_1_1.add(infReserva_2_1_1_1_1_1);
		
		txtInsertHabi = new JTextField();
		txtInsertHabi.setForeground(new Color(255, 0, 0));
		txtInsertHabi.setFont(new Font("Arial", Font.PLAIN, 8));
		txtInsertHabi.setEditable(false);
		txtInsertHabi.setColumns(10);
		txtInsertHabi.setBorder(null);
		txtInsertHabi.setBackground(new Color(236, 244, 236));
		txtInsertHabi.setBounds(497, 165, 60, 11);
		infReserva_2_1_1.add(txtInsertHabi);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(null);
		panel_3.setBackground(new Color(236, 244, 236));
		panel_3.setBounds(26, 0, 100, 23);
		pasaNoche.add(panel_3);
		
		JLabel lblNewLabel = new JLabel("Datos del cliente");
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(36, 62, 36));
		lblNewLabel.setBorder(null);
		lblNewLabel.setBounds(0, 0, 88, 23);
		panel_3.add(lblNewLabel);
		
		JPanel infGneral = new JPanel();
		infGneral.setLayout(null);
		infGneral.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133)));
		infGneral.setBackground(new Color(236, 244, 236));
		infGneral.setBounds(12, 12, 740, 56);
		pasaNoche.add(infGneral);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(12, 0, 60, 50);
		infGneral.add(lblNewLabel_1);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(90, 15, 160, 20);
		infGneral.add(txtNombre);
		
		JLabel lblNewLabel_1_1 = new JLabel("C.C.");
		lblNewLabel_1_1.setBounds(259, 0, 30, 50);
		infGneral.add(lblNewLabel_1_1);
		
		txtCedula = new JTextField();
		txtCedula.setColumns(10);
		txtCedula.setBounds(297, 15, 92, 20);
		infGneral.add(txtCedula);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("CEL");
		lblNewLabel_1_1_1.setBounds(401, 0, 30, 50);
		infGneral.add(lblNewLabel_1_1_1);
		
		txtCelular = new JTextField();
		txtCelular.setColumns(10);
		txtCelular.setBounds(437, 15, 92, 20);
		infGneral.add(txtCelular);
		
		txtProcedencia = new JTextField();
		txtProcedencia.setColumns(10);
		txtProcedencia.setBounds(627, 15, 92, 20);
		infGneral.add(txtProcedencia);
		
		JLabel lblNewLabel_1_2 = new JLabel("Procedencia");
		lblNewLabel_1_2.setBounds(544, 0, 81, 50);
		infGneral.add(lblNewLabel_1_2);
		
		txtInsertNombre = new JTextField();
		txtInsertNombre.setForeground(new Color(255, 0, 0));
		txtInsertNombre.setBackground(new Color(236, 244, 236));
		txtInsertNombre.setEditable(false);
		txtInsertNombre.setBorder(null);
		txtInsertNombre.setFont(new Font("Arial", Font.PLAIN, 8));
		txtInsertNombre.setBounds(100, 39, 60, 11);
		infGneral.add(txtInsertNombre);
		txtInsertNombre.setColumns(10);
		
		txtInsertCc = new JTextField();
		txtInsertCc.setForeground(new Color(255, 0, 0));
		txtInsertCc.setFont(new Font("Arial", Font.PLAIN, 8));
		txtInsertCc.setEditable(false);
		txtInsertCc.setColumns(10);
		txtInsertCc.setBorder(null);
		txtInsertCc.setBackground(new Color(236, 244, 236));
		txtInsertCc.setBounds(299, 39, 60, 11);
		infGneral.add(txtInsertCc);
		
		JPanel infPaquete = new JPanel();
		infPaquete.setLayout(null);
		infPaquete.setBorder(null);
		infPaquete.setBackground(new Color(236, 244, 236));
		infPaquete.setBounds(774, 13, 214, 49);
		pasaNoche.add(infPaquete);
		
		JLabel lblNewLabel_2 = new JLabel("Paquete");
		lblNewLabel_2.setForeground(new Color(36, 62, 36));
		lblNewLabel_2.setBounds(12, 0, 55, 16);
		infPaquete.add(lblNewLabel_2);
		
		JComboBox cbxPaquete = new JComboBox();
		cbxPaquete.setModel(new DefaultComboBoxModel(new String[] {"Seleccione", "Pasadia", "Todo incluido"}));
		cbxPaquete.setForeground(Color.WHITE);
		cbxPaquete.setBorder(null);
		cbxPaquete.setBackground(new Color(85, 147, 85));
		cbxPaquete.setBounds(12, 26, 160, 23);
		infPaquete.add(cbxPaquete);
		
		txtSelecPaque = new JTextField();
		txtSelecPaque.setForeground(new Color(255, 0, 0));
		txtSelecPaque.setFont(new Font("Arial", Font.PLAIN, 8));
		txtSelecPaque.setEditable(false);
		txtSelecPaque.setColumns(10);
		txtSelecPaque.setBorder(null);
		txtSelecPaque.setBackground(new Color(236, 244, 236));
		txtSelecPaque.setBounds(127, 5, 60, 11);
		infPaquete.add(txtSelecPaque);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBorder(null);
		panel_3_1.setBackground(new Color(236, 244, 236));
		panel_3_1.setBounds(26, 74, 57, 23);
		pasaNoche.add(panel_3_1);
		
		JLabel lblReserva = new JLabel("Reserva");
		lblReserva.setHorizontalTextPosition(SwingConstants.CENTER);
		lblReserva.setHorizontalAlignment(SwingConstants.CENTER);
		lblReserva.setForeground(new Color(36, 62, 36));
		lblReserva.setBorder(null);
		lblReserva.setBounds(0, 0, 52, 23);
		panel_3_1.add(lblReserva);
		
		JPanel infReserva = new JPanel();
		infReserva.setLayout(null);
		infReserva.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133)));
		infReserva.setBackground(new Color(236, 244, 236));
		infReserva.setBounds(12, 93, 976, 60);
		pasaNoche.add(infReserva);
		
		JLabel lblNewLabel_1_3 = new JLabel("Fecha Entrada");
		lblNewLabel_1_3.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_3.setBounds(12, 0, 86, 50);
		infReserva.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Fecha Salida");
		lblNewLabel_1_1_2.setBounds(233, 0, 81, 50);
		infReserva.add(lblNewLabel_1_1_2);
		
		cldFechaEntrada = new JDateChooser();
		cldFechaEntrada.addPropertyChangeListener(new PropertyChangeListener() {
		    @Override
		    public void propertyChange(PropertyChangeEvent evt) {
		        if ("date".equals(evt.getPropertyName())) {
		            // Aquí puedes ejecutar la consulta cada vez que cambie la fecha
		            // Puedes obtener la fecha seleccionada con cldFechaEntrada.getDate()
		            Date fechaSeleccionada = cldFechaEntrada.getDate();
		            
		            // Luego, obtén la cantidad de personas desde el txtCantidad
		            String cantidadPersonas = txtCantidad.getText();
		            
		            // Verifica que tanto la fecha como la cantidad de personas no sean nulas o vacías
		            if (fechaSeleccionada != null && !cantidadPersonas.isEmpty()) {
		                // Convierte la cantidad de personas a un valor numérico (puedes manejar errores aquí)
		                int cantidad = Integer.parseInt(cantidadPersonas);
		                
		                // Luego, ejecuta la consulta con ambos valores
		                dp.Disponibilidad(cldFechaEntrada, lblDisponibilidad, txtCantidad, PanelDispo);
		            }else {
		            	PanelDispo.setBackground(Color.GRAY);
		            	txtCantidad.setText("");
		            }
		        }
		    }
		});
		cldFechaEntrada.setDateFormatString("y/MM/d");
		cldFechaEntrada.setToolTipText("0");
		cldFechaEntrada.setBounds(96, 15, 119, 20);
		infReserva.add(cldFechaEntrada);
		
		
		JDateChooser cldFechaSalida = new JDateChooser();
		cldFechaSalida.setDateFormatString("y/MM/d");
		cldFechaSalida.setBounds(312, 15, 119, 20);
		infReserva.add(cldFechaSalida);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Cantidad");
		lblNewLabel_1_1_2_1.setBounds(447, 0, 59, 50);
		infReserva.add(lblNewLabel_1_1_2_1);
		
		txtCantidad = new JTextField();
		txtCantidad.getDocument().addDocumentListener(new DocumentListener() {
		    @Override
		    public void insertUpdate(DocumentEvent e) {
		        // Aquí puedes ejecutar la consulta cada vez que cambie el contenido del campo de texto
		        // Puedes obtener la cantidad de personas desde txtCantidad.getText()
		        String cantidadPersonas = txtCantidad.getText();
		        
		        // Verifica si ambos valores (fecha y cantidad) están disponibles
		        Date fechaSeleccionada = cldFechaEntrada.getDate();
		        if (fechaSeleccionada != null && !cantidadPersonas.isEmpty()) {
		            // Convierte la cantidad de personas a un valor numérico (puedes manejar errores aquí)
		            int cantidad = Integer.parseInt(cantidadPersonas);
		            
		            // Luego, ejecuta la consulta con la fecha y actualiza el color del JLabel
		            dp.Disponibilidad(cldFechaEntrada, lblDisponibilidad, txtCantidad, PanelDispo);
		            
		        } else {
		            // Si alguno de los valores no está presente, establece el color del JLabel en otro valor (por ejemplo, gris)
		            PanelDispo.setBackground(Color.GRAY);
		            txtCantidad.setText("");
		        }
		    }

			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				
			}

		    // Implementa los otros métodos del DocumentListener según sea necesario
		});
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(508, 15, 59, 20);
		infReserva.add(txtCantidad);
		
		txtNoche = new JTextField();
		txtNoche.setColumns(10);
		txtNoche.setBounds(640, 15, 59, 20);
		infReserva.add(txtNoche);
		
		JLabel lblNewLabel_1_1_2_1_1 = new JLabel("Noches");
		lblNewLabel_1_1_2_1_1.setBounds(579, 0, 59, 50);
		infReserva.add(lblNewLabel_1_1_2_1_1);
		
		JLabel lblNewLabel_1_1_2_1_2 = new JLabel("Hora Entrada");
		lblNewLabel_1_1_2_1_2.setBounds(711, 0, 81, 50);
		infReserva.add(lblNewLabel_1_1_2_1_2);
		
		txtHoraEntrada = new JTextField();
		txtHoraEntrada.setColumns(10);
		txtHoraEntrada.setBounds(802, 15, 59, 20);
		infReserva.add(txtHoraEntrada);
		
		txtInsertFechEnt = new JTextField();
		txtInsertFechEnt.setForeground(new Color(255, 0, 0));
		txtInsertFechEnt.setFont(new Font("Arial", Font.PLAIN, 8));
		txtInsertFechEnt.setEditable(false);
		txtInsertFechEnt.setColumns(10);
		txtInsertFechEnt.setBorder(null);
		txtInsertFechEnt.setBackground(new Color(236, 244, 236));
		txtInsertFechEnt.setBounds(96, 39, 60, 11);
		infReserva.add(txtInsertFechEnt);
		
		txtInsertFecSal = new JTextField();
		txtInsertFecSal.setForeground(new Color(255, 0, 0));
		txtInsertFecSal.setFont(new Font("Arial", Font.PLAIN, 8));
		txtInsertFecSal.setEditable(false);
		txtInsertFecSal.setColumns(10);
		txtInsertFecSal.setBorder(null);
		txtInsertFecSal.setBackground(new Color(236, 244, 236));
		txtInsertFecSal.setBounds(312, 39, 60, 11);
		infReserva.add(txtInsertFecSal);
		
		txtInsertCant = new JTextField();
		txtInsertCant.setForeground(new Color(255, 0, 0));
		txtInsertCant.setFont(new Font("Arial", Font.PLAIN, 8));
		txtInsertCant.setEditable(false);
		txtInsertCant.setColumns(10);
		txtInsertCant.setBorder(null);
		txtInsertCant.setBackground(new Color(236, 244, 236));
		txtInsertCant.setBounds(508, 39, 60, 11);
		infReserva.add(txtInsertCant);
		
		txtInsertNoche = new JTextField();
		txtInsertNoche.setForeground(Color.RED);
		txtInsertNoche.setFont(new Font("Arial", Font.PLAIN, 8));
		txtInsertNoche.setEditable(false);
		txtInsertNoche.setColumns(10);
		txtInsertNoche.setBorder(null);
		txtInsertNoche.setBackground(new Color(236, 244, 236));
		txtInsertNoche.setBounds(640, 39, 60, 11);
		infReserva.add(txtInsertNoche);
		
		JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setLayout(null);
		panel_3_1_1.setBorder(null);
		panel_3_1_1.setBackground(new Color(236, 244, 236));
		panel_3_1_1.setBounds(26, 152, 90, 23);
		pasaNoche.add(panel_3_1_1);
		
		JLabel lblInfFinaciera = new JLabel("Inf Finaciera");
		lblInfFinaciera.setHorizontalTextPosition(SwingConstants.CENTER);
		lblInfFinaciera.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfFinaciera.setForeground(new Color(36, 62, 36));
		lblInfFinaciera.setBorder(null);
		lblInfFinaciera.setBounds(0, 0, 78, 23);
		panel_3_1_1.add(lblInfFinaciera);
		
		JPanel infReserva_2 = new JPanel();
		infReserva_2.setLayout(null);
		infReserva_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133)));
		infReserva_2.setBackground(new Color(236, 244, 236));
		infReserva_2.setBounds(12, 164, 740, 59);
		pasaNoche.add(infReserva_2);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Fecha Reserva");
		lblNewLabel_1_3_1.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel_1_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_3_1.setBounds(12, 0, 86, 50);
		infReserva_2.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_1_2_2 = new JLabel("Tarifa");
		lblNewLabel_1_1_2_2.setBounds(240, 0, 33, 50);
		infReserva_2.add(lblNewLabel_1_1_2_2);
		
		JDateChooser cldFechaReserva = new JDateChooser();
		cldFechaReserva.setDateFormatString("y/MM/d");
		cldFechaReserva.setBounds(108, 15, 119, 20);
		infReserva_2.add(cldFechaReserva);
		
		JLabel lblNewLabel_1_1_2_1_3 = new JLabel("Pagó");
		lblNewLabel_1_1_2_1_3.setBounds(360, 0, 39, 50);
		infReserva_2.add(lblNewLabel_1_1_2_1_3);
		
		txtPago = new JTextField();
		if(txtPago != null) {
		Metodos.Reflejar(txtPago, txtTotalPagado);
		}
		
		if(txtTotalPagado != null || txtValorAPagar != null || txtPago != null) {
			Metodos.Reflejar1( txtValorAPagar,txtTotalPagado,txtDiferencia);
			}
		txtPago.setColumns(10);
		txtPago.setBounds(401, 15, 59, 20);
		infReserva_2.add(txtPago);
		
		JLabel lblNewLabel_1_1_2_1_1_1 = new JLabel("Metodo Pago");
		lblNewLabel_1_1_2_1_1_1.setBounds(478, 0, 74, 50);
		infReserva_2.add(lblNewLabel_1_1_2_1_1_1);
		
		txtTarifa = new JTextField();
		if(txtCantidad != null || txtTarifa!= null || txtNoche!= null) {
			Metodos.Reflejar2(txtCantidad, txtTarifa, txtNoche, txtValorAPagar);
			}
		txtTarifa.setColumns(10);
		txtTarifa.setBounds(283, 15, 59, 20);
		infReserva_2.add(txtTarifa);
		
		JComboBox cbxMetodoPago = new JComboBox();
		cbxMetodoPago.setModel(new DefaultComboBoxModel(new String[] {"Seleccionar", "Efectivo", "Trenferencia", "Datafono"}));
		cbxMetodoPago.setForeground(Color.WHITE);
		cbxMetodoPago.setBorder(null);
		cbxMetodoPago.setBackground(new Color(85, 147, 85));
		cbxMetodoPago.setBounds(556, 13, 160, 23);
		infReserva_2.add(cbxMetodoPago);
		
		txtInsertFechReserv = new JTextField();
		txtInsertFechReserv.setForeground(new Color(255, 0, 0));
		txtInsertFechReserv.setFont(new Font("Arial", Font.PLAIN, 8));
		txtInsertFechReserv.setEditable(false);
		txtInsertFechReserv.setColumns(10);
		txtInsertFechReserv.setBorder(null);
		txtInsertFechReserv.setBackground(new Color(236, 244, 236));
		txtInsertFechReserv.setBounds(108, 39, 60, 11);
		infReserva_2.add(txtInsertFechReserv);
		
		txtInsertTari = new JTextField();
		txtInsertTari.setForeground(new Color(255, 0, 0));
		txtInsertTari.setFont(new Font("Arial", Font.PLAIN, 8));
		txtInsertTari.setEditable(false);
		txtInsertTari.setColumns(10);
		txtInsertTari.setBorder(null);
		txtInsertTari.setBackground(new Color(236, 244, 236));
		txtInsertTari.setBounds(283, 39, 60, 11);
		infReserva_2.add(txtInsertTari);
		
		txtInserPagos = new JTextField();
		txtInserPagos.setForeground(new Color(255, 0, 0));
		txtInserPagos.setFont(new Font("Arial", Font.PLAIN, 8));
		txtInserPagos.setEditable(false);
		txtInserPagos.setColumns(10);
		txtInserPagos.setBorder(null);
		txtInserPagos.setBackground(new Color(236, 244, 236));
		txtInserPagos.setBounds(401, 39, 60, 11);
		infReserva_2.add(txtInserPagos);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(834, 517, 115, 50);
		pasaNoche.add(btnLimpiar);
		
		JPanel infReserva_2_1 = new JPanel();
		infReserva_2_1.setLayout(null);
		infReserva_2_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133)));
		infReserva_2_1.setBackground(new Color(236, 244, 236));
		infReserva_2_1.setBounds(774, 164, 214, 319);
		pasaNoche.add(infReserva_2_1);
		
		JPanel infReserva_2_2_1 = new JPanel();
		infReserva_2_2_1.setLayout(null);
		infReserva_2_2_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133)));
		infReserva_2_2_1.setBackground(new Color(236, 244, 236));
		infReserva_2_2_1.setBounds(0, 0, 214, 102);
		infReserva_2_1.add(infReserva_2_2_1);
		
		JRadioButton rbG10 = new JRadioButton("G10");
		rbG10.setVerticalTextPosition(SwingConstants.BOTTOM);
		rbG10.setHorizontalTextPosition(SwingConstants.CENTER);
		rbG10.setContentAreaFilled(false);
		rbG10.setBounds(128, 60, 34, 34);
		infReserva_2_2_1.add(rbG10);
		
		JRadioButton rbG9 = new JRadioButton("G9");
		rbG9.setVerticalTextPosition(SwingConstants.BOTTOM);
		rbG9.setHorizontalTextPosition(SwingConstants.CENTER);
		rbG9.setContentAreaFilled(false);
		rbG9.setBounds(101, 60, 23, 34);
		infReserva_2_2_1.add(rbG9);
		
		JRadioButton rbG8 = new JRadioButton("G8");
		rbG8.setVerticalTextPosition(SwingConstants.BOTTOM);
		rbG8.setHorizontalTextPosition(SwingConstants.CENTER);
		rbG8.setContentAreaFilled(false);
		rbG8.setBounds(74, 60, 23, 34);
		infReserva_2_2_1.add(rbG8);
		
		JRadioButton rbG7 = new JRadioButton("G7");
		rbG7.setVerticalTextPosition(SwingConstants.BOTTOM);
		rbG7.setHorizontalTextPosition(SwingConstants.CENTER);
		rbG7.setContentAreaFilled(false);
		rbG7.setBounds(47, 60, 23, 34);
		infReserva_2_2_1.add(rbG7);
		
		JRadioButton rbG6 = new JRadioButton("G6");
		rbG6.setVerticalTextPosition(SwingConstants.BOTTOM);
		rbG6.setHorizontalTextPosition(SwingConstants.CENTER);
		rbG6.setContentAreaFilled(false);
		rbG6.setBounds(20, 60, 23, 34);
		infReserva_2_2_1.add(rbG6);
		
		JRadioButton rbG1 = new JRadioButton("G1");
		rbG1.setVerticalTextPosition(SwingConstants.BOTTOM);
		rbG1.setHorizontalTextPosition(SwingConstants.CENTER);
		rbG1.setContentAreaFilled(false);
		rbG1.setBounds(20, 22, 23, 34);
		infReserva_2_2_1.add(rbG1);
		
		JRadioButton rbG2 = new JRadioButton("G2");
		rbG2.setVerticalTextPosition(SwingConstants.BOTTOM);
		rbG2.setHorizontalTextPosition(SwingConstants.CENTER);
		rbG2.setContentAreaFilled(false);
		rbG2.setBounds(47, 22, 23, 34);
		infReserva_2_2_1.add(rbG2);
		
		JRadioButton rbG3 = new JRadioButton("G3");
		rbG3.setVerticalTextPosition(SwingConstants.BOTTOM);
		rbG3.setHorizontalTextPosition(SwingConstants.CENTER);
		rbG3.setContentAreaFilled(false);
		rbG3.setBounds(74, 22, 23, 34);
		infReserva_2_2_1.add(rbG3);
		
		JRadioButton rbG4 = new JRadioButton("G4");
		rbG4.setVerticalTextPosition(SwingConstants.BOTTOM);
		rbG4.setHorizontalTextPosition(SwingConstants.CENTER);
		rbG4.setContentAreaFilled(false);
		rbG4.setBounds(101, 22, 23, 34);
		infReserva_2_2_1.add(rbG4);
		
		JRadioButton rbG5 = new JRadioButton("G5");
		rbG5.setVerticalTextPosition(SwingConstants.BOTTOM);
		rbG5.setHorizontalTextPosition(SwingConstants.CENTER);
		rbG5.setContentAreaFilled(false);
		rbG5.setBounds(128, 22, 23, 34);
		infReserva_2_2_1.add(rbG5);
		
		textField_10 = new JTextField();
		textField_10.setForeground(new Color(255, 0, 0));
		textField_10.setFont(new Font("Arial", Font.PLAIN, 8));
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBorder(null);
		textField_10.setBackground(new Color(236, 244, 236));
		textField_10.setBounds(128, 4, 60, 11);
		infReserva_2_2_1.add(textField_10);
		
		JPanel infReserva_2_2_1_1 = new JPanel();
		infReserva_2_2_1_1.setLayout(null);
		infReserva_2_2_1_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133)));
		infReserva_2_2_1_1.setBackground(new Color(236, 244, 236));
		infReserva_2_2_1_1.setBounds(0, 114, 214, 102);
		infReserva_2_1.add(infReserva_2_2_1_1);
		
		JRadioButton rbC6 = new JRadioButton("C6");
		rbC6.setVerticalTextPosition(SwingConstants.BOTTOM);
		rbC6.setHorizontalTextPosition(SwingConstants.CENTER);
		rbC6.setContentAreaFilled(false);
		rbC6.setBounds(20, 60, 23, 34);
		infReserva_2_2_1_1.add(rbC6);
		
		JRadioButton rbC1 = new JRadioButton("C1");
		rbC1.setVerticalTextPosition(SwingConstants.BOTTOM);
		rbC1.setHorizontalTextPosition(SwingConstants.CENTER);
		rbC1.setContentAreaFilled(false);
		rbC1.setBounds(20, 22, 23, 34);
		infReserva_2_2_1_1.add(rbC1);
		
		JRadioButton rbC2 = new JRadioButton("C2");
		rbC2.setVerticalTextPosition(SwingConstants.BOTTOM);
		rbC2.setHorizontalTextPosition(SwingConstants.CENTER);
		rbC2.setContentAreaFilled(false);
		rbC2.setBounds(47, 22, 23, 34);
		infReserva_2_2_1_1.add(rbC2);
		
		JRadioButton rbC3 = new JRadioButton("C3");
		rbC3.setVerticalTextPosition(SwingConstants.BOTTOM);
		rbC3.setHorizontalTextPosition(SwingConstants.CENTER);
		rbC3.setContentAreaFilled(false);
		rbC3.setBounds(74, 22, 23, 34);
		infReserva_2_2_1_1.add(rbC3);
		
		JRadioButton rbC4 = new JRadioButton("C4");
		rbC4.setVerticalTextPosition(SwingConstants.BOTTOM);
		rbC4.setHorizontalTextPosition(SwingConstants.CENTER);
		rbC4.setContentAreaFilled(false);
		rbC4.setBounds(101, 22, 23, 34);
		infReserva_2_2_1_1.add(rbC4);
		
		JRadioButton rbC5 = new JRadioButton("C5");
		rbC5.setVerticalTextPosition(SwingConstants.BOTTOM);
		rbC5.setHorizontalTextPosition(SwingConstants.CENTER);
		rbC5.setContentAreaFilled(false);
		rbC5.setBounds(128, 22, 23, 34);
		infReserva_2_2_1_1.add(rbC5);
		
		JPanel infReserva_2_2_1_1_1 = new JPanel();
		infReserva_2_2_1_1_1.setLayout(null);
		infReserva_2_2_1_1_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133)));
		infReserva_2_2_1_1_1.setBackground(new Color(236, 244, 236));
		infReserva_2_2_1_1_1.setBounds(0, 228, 214, 91);
		infReserva_2_1.add(infReserva_2_2_1_1_1);
		
		JRadioButton rbA3 = new JRadioButton("A3");
		rbA3.setVerticalTextPosition(SwingConstants.BOTTOM);
		rbA3.setHorizontalTextPosition(SwingConstants.CENTER);
		rbA3.setContentAreaFilled(false);
		rbA3.setBounds(74, 22, 23, 34);
		infReserva_2_2_1_1_1.add(rbA3);
		
		JRadioButton rbA4 = new JRadioButton("A4");
		rbA4.setVerticalTextPosition(SwingConstants.BOTTOM);
		rbA4.setHorizontalTextPosition(SwingConstants.CENTER);
		rbA4.setContentAreaFilled(false);
		rbA4.setBounds(101, 22, 23, 34);
		infReserva_2_2_1_1_1.add(rbA4);
		
		JRadioButton rbA5 = new JRadioButton("A5");
		rbA5.setVerticalTextPosition(SwingConstants.BOTTOM);
		rbA5.setHorizontalTextPosition(SwingConstants.CENTER);
		rbA5.setContentAreaFilled(false);
		rbA5.setBounds(128, 22, 23, 34);
		infReserva_2_2_1_1_1.add(rbA5);
		
		JRadioButton rbA2 = new JRadioButton("A2");
		rbA2.setVerticalTextPosition(SwingConstants.BOTTOM);
		rbA2.setHorizontalTextPosition(SwingConstants.CENTER);
		rbA2.setContentAreaFilled(false);
		rbA2.setBounds(47, 22, 23, 34);
		infReserva_2_2_1_1_1.add(rbA2);
		
		JRadioButton rbA1 = new JRadioButton("A1");
		rbA1.setVerticalTextPosition(SwingConstants.BOTTOM);
		rbA1.setHorizontalTextPosition(SwingConstants.CENTER);
		rbA1.setContentAreaFilled(false);
		rbA1.setBounds(20, 22, 23, 34);
		infReserva_2_2_1_1_1.add(rbA1);
		
		JButton btnGuardarRegistro = new JButton("Guardar");
		btnGuardarRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPago.setEnabled(false);
			
			String nombreReg = txtNombre.getText();				
			String cedulaReg = txtCedula.getText();				
			String celularReg = txtCelular.getText(); 
			String procedenciaReg = txtProcedencia.getText();
			String cantidadReg = txtCantidad.getText();				
			String nocheReg = txtCantidad.getText();				
			String horaEntrReg = txtHoraEntrada.getText();
			String tarifaReg = txtTarifa.getText();
			String pagoReg = txtPago.getText();			 	
			String totalPagadoReg = txtTotalPagado.getText();
			String valorPagarReg = txtValorAPagar.getText();
			String diferenciaReg = txtDiferencia.getText(); 
			//String observacionReg = txtObservacion.getText();*/
				
			String paqueteReg = cbxPaquete.getSelectedItem().toString();							
			String metodoPagoReg= cbxMetodoPago.getSelectedItem().toString();
			String publicidadReg = cbxPublicidad.getSelectedItem().toString();				
				
					
			String fechaEntrada = ((JTextField) cldFechaEntrada.getDateEditor().getUiComponent()).getText();	
			Date fechaEntradaReg =cldFechaEntrada.getDate();									
			String fechaSalida = ((JTextField) cldFechaReserva.getDateEditor().getUiComponent()).getText();	
			Date fechaSalidaReg =cldFechaSalida.getDate();												
			String fechaReserva = ((JTextField) cldFechaReserva.getDateEditor().getUiComponent()).getText();	
			Date fechaReservaReg =cldFechaReserva.getDate();
			
			
			Boolean G1Reg = rbG1.isSelected();
			Boolean G2Reg = rbG2.isSelected();
			Boolean G3Reg = rbG3.isSelected();
			Boolean G4Reg = rbG4.isSelected();
			Boolean G5Reg = rbG5.isSelected();
			Boolean G6Reg = rbG6.isSelected();
			Boolean G7Reg = rbG7.isSelected();
			Boolean G8Reg = rbG8.isSelected();
			Boolean G9Reg = rbG9.isSelected();
			Boolean G10Reg = rbG10.isSelected();
			Boolean C1Reg = rbC1.isSelected();
			Boolean C2Reg = rbC2.isSelected();
			Boolean C3Reg = rbC3.isSelected();
			Boolean C4Reg = rbC4.isSelected();
			Boolean C5Reg = rbC5.isSelected();
			Boolean C6Reg = rbC6.isSelected();
			Boolean A1Reg = rbA1.isSelected();
			Boolean A2Reg = rbA2.isSelected();
			Boolean A3Reg = rbA3.isSelected();
			Boolean A4Reg = rbA4.isSelected();
			Boolean A5Reg = rbA5.isSelected();
								
			
			
			
				
			if(nombreReg.isEmpty()){Metodos.Casillavacia(nombreReg, txtInsertNombre);}
			if(cedulaReg.isEmpty()) {Metodos.Casillavacia(cedulaReg, txtInsertCc);}
			if(cantidadReg.isEmpty()) {Metodos.Casillavacia(cantidadReg, txtInsertCant);}
			if(nocheReg.isEmpty()) {Metodos.Casillavacia(nocheReg, txtInsertNoche);}
			if(tarifaReg.isEmpty()) {Metodos.Casillavacia(tarifaReg, txtInsertTari);}
			if(pagoReg.isEmpty()) {Metodos.Casillavacia(pagoReg, txtInserPagos);}
			if(paqueteReg.isEmpty()) {Metodos.SeleccionCasilla(paqueteReg, txtSelecPaque);}
			if(fechaEntradaReg == null) {Metodos.IngreseFecha(fechaEntradaReg, txtInsertFechEnt);}
			if(fechaSalidaReg == null) {Metodos.IngreseFecha(fechaSalidaReg, txtInsertFecSal);}				
			if(fechaReservaReg == null) {Metodos.IngreseFecha(fechaReservaReg, txtInsertFechReserv);}
				
			if(nombreReg.isEmpty()||cedulaReg.isEmpty()||cantidadReg.isEmpty()
				||nocheReg.isEmpty()||tarifaReg.isEmpty()||pagoReg.isEmpty()||
				paqueteReg.isEmpty()||fechaEntradaReg == null||fechaSalidaReg == null||
				fechaReservaReg == null) {
			JOptionPane.showMessageDialog(null, "Complete la casillas obligaroias");	
			}else {
				dcl.setNombre(txtNombre.getText());
				dcl.setCedula(txtCedula.getText());
				dcl.setCelular(txtCelular.getText()); 
				dcl.setProcedencia(txtProcedencia.getText());
				dcl.setFecha_Reserva(fechaReservaReg);
				dcl.setFecha_Entrada(fechaEntradaReg);
				dcl.setFecha_Salida(fechaSalidaReg);
				dcl.setHora_Entrada(txtHoraEntrada.getText());
				dcl.setMetodo_pago(cbxMetodoPago.getSelectedItem().toString()); 
				dcl.setPaquete(cbxPaquete.getSelectedItem().toString());
				dcl.setPublicidad(cbxPublicidad.getSelectedItem().toString());			
													
				dhb.setG1(G1Reg);
				dhb.setG2(G2Reg);
				dhb.setG3(G3Reg);
				dhb.setG4(G4Reg);
				dhb.setG5(G5Reg);
				dhb.setG6(G6Reg);
				dhb.setG7(G7Reg);
				dhb.setG8(G8Reg);
				dhb.setG9(G9Reg);
				dhb.setG10(G10Reg);
				dhb.setC1(C1Reg);
				dhb.setC2(C2Reg);
				dhb.setC3(C3Reg);
				dhb.setC4(C4Reg);
				dhb.setC5(C5Reg);
				dhb.setC6(C6Reg);
				dhb.setA1(A1Reg);
				dhb.setA2(A2Reg);
				dhb.setA3(A3Reg);
				dhb.setA4(A4Reg);
				dhb.setA5(A5Reg);
				dhb.setCedula(cedulaReg);
				
			try {
				dcl.setTarifa(Integer.parseInt(txtTarifa.getText()));
				dcl.setPago(Integer.parseInt(txtPago.getText()));
				dcl.setTotal_Pagado(Integer.parseInt(txtTotalPagado.getText()));
				dcl.setCantidad(Integer.parseInt(txtCantidad.getText()));
				dcl.setNoche(Integer.parseInt(txtNoche.getText()));
				dcl.setValor_pagar(Integer.parseInt(txtValorAPagar.getText()));
				dcl.setDiferencia(Integer.parseInt(txtDiferencia.getText()));
						  
			} catch (NumberFormatException e2) {
				JOptionPane.showMessageDialog(null, "Ingrese un numero valido");
			}										 
			cbo.guardarCliente(dcl); 
			cbo.mostrarClinte(table);
			hbo.guardarHabitacion(dhb); 		
									 								 				
			
			Metodos.limpiarString(txtNombre);				
			Metodos.limpiarString(txtCedula);				
			Metodos.limpiarString(txtCelular); 
			Metodos.limpiarString(txtProcedencia);
			Metodos.limpiarString(txtCantidad);				
			Metodos.limpiarString(txtCantidad);				
			Metodos.limpiarString(txtHoraEntrada);
			Metodos.limpiarString(txtTarifa);
			Metodos.limpiarString(txtTotalPagado);
			Metodos.limpiarString(txtValorAPagar);
			Metodos.limpiarString(txtDiferencia);
			//Metodos.limpiarString(lblDisponibilidad);	
			Metodos.limpiarString(txtNoche);
			Metodos.limpiarCbx(cbxPaquete);							
			Metodos.limpiarCbx(cbxMetodoPago);
			Metodos.limpiarCbx(cbxPublicidad);
			Metodos.limpiarFecha(cldFechaEntrada);
			Metodos.limpiarFecha(cldFechaSalida);
			Metodos.limpiarFecha(cldFechaReserva);
			Metodos.limpiarString(txtPago);			 				
			//Metodos.limpiarString(txtObservacion);			
			}									
			}
		});
		
		btnGuardarRegistro.setBounds(834, 578, 115, 50);
		pasaNoche.add(btnGuardarRegistro);
	
	}	        
}

