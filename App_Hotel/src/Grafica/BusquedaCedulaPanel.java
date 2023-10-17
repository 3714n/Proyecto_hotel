package Grafica;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JDateChooser;

import Com.Proyecto_Hotel.ClienteBO.ClienteBO;
import Com.Proyecto_Hotel.ClienteBO.HabitacionBO;
import Com.Proyecto_Hotel.ClienteDao.ClienteDao;
import Com.Proyecto_Hotel.Registro_Clientes.Datos_Clientes;
import Com.Proyecto_Hotel.Registro_Clientes.Datos_Habitacion;
import Logica.Metodos;

import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.Date;
import java.awt.event.ActionEvent;

import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class BusquedaCedulaPanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtObservar;
	private JTextField txtNombre;
	private JTextField textField_3;
	private JTextField txtCelular;
	private JTextField txtCantidad;
	private JTextField txtNoches;
	private JTextField txtHoraEntrada;
	private JTextField txtTarifa;
	private JTextField txtPago;
	private JTextField txtTotalPago;
	private JTextField txtValorPagar;
	private JTextField txtDiferencia;
	private JTextField txtBuscarCedula;
	private JTable table;
	
	private ClienteBO cbo = new ClienteBO();
	private ClienteDao cdo = new ClienteDao();
	private Datos_Clientes dcl = new Datos_Clientes();
	private Connection con =null;
	private String mensaje;
	private HabitacionBO hbo = new HabitacionBO();
	private Datos_Habitacion dhb = new Datos_Habitacion();

	public BusquedaCedulaPanel() {
		setBounds(168, 77, 979, 673);
		setLayout(null);
		
		JPanel pasaNoche_2 = new JPanel();
		pasaNoche_2.setLayout(null);
		pasaNoche_2.setForeground(new Color(69, 118, 69));
		pasaNoche_2.setBorder(null);
		pasaNoche_2.setBackground(new Color(236, 244, 236));
		pasaNoche_2.setBounds(0, 0, 977, 673);
		add(pasaNoche_2);
		
		JPanel infReserva_2_1_1_3 = new JPanel();
		infReserva_2_1_1_3.setLayout(null);
		infReserva_2_1_1_3.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133)));
		infReserva_2_1_1_3.setBackground(new Color(236, 244, 236));
		infReserva_2_1_1_3.setBounds(12, 259, 955, 403);
		pasaNoche_2.add(infReserva_2_1_1_3);
		
		JPanel panel_3_1_1_2_1_1 = new JPanel();
		panel_3_1_1_2_1_1.setLayout(null);
		panel_3_1_1_2_1_1.setBorder(null);
		panel_3_1_1_2_1_1.setBackground(new Color(236, 244, 236));
		panel_3_1_1_2_1_1.setBounds(521, 211, 84, 23);
		infReserva_2_1_1_3.add(panel_3_1_1_2_1_1);
		
		JLabel lblObservacin_1 = new JLabel("Observación");
		lblObservacin_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblObservacin_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblObservacin_1.setForeground(new Color(36, 62, 36));
		lblObservacin_1.setBorder(null);
		lblObservacin_1.setBounds(0, 0, 76, 23);
		panel_3_1_1_2_1_1.add(lblObservacin_1);
		
		JPanel infReserva_2_1_1_1_3 = new JPanel();
		infReserva_2_1_1_1_3.setLayout(null);
		infReserva_2_1_1_1_3.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133)));
		infReserva_2_1_1_1_3.setBackground(new Color(236, 244, 236));
		infReserva_2_1_1_1_3.setBounds(510, 13, 232, 187);
		infReserva_2_1_1_3.add(infReserva_2_1_1_1_3);
		
		JLabel lblNewLabel_1_1_2_2_1_3 = new JLabel("Total \r\npagado");
		lblNewLabel_1_1_2_2_1_3.setBounds(12, 27, 79, 20);
		infReserva_2_1_1_1_3.add(lblNewLabel_1_1_2_2_1_3);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(98, 27, 100, 20);
		infReserva_2_1_1_1_3.add(textField);
		
		JLabel lblNewLabel_1_1_2_2_1_1_2 = new JLabel("Valor a pagar");
		lblNewLabel_1_1_2_2_1_1_2.setBounds(12, 59, 79, 20);
		infReserva_2_1_1_1_3.add(lblNewLabel_1_1_2_2_1_1_2);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(98, 59, 100, 20);
		infReserva_2_1_1_1_3.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(98, 91, 100, 20);
		infReserva_2_1_1_1_3.add(textField_2);
		
		JLabel lblNewLabel_1_1_2_2_1_1_1_1 = new JLabel("Diferencia");
		lblNewLabel_1_1_2_2_1_1_1_1.setBounds(12, 91, 79, 20);
		infReserva_2_1_1_1_3.add(lblNewLabel_1_1_2_2_1_1_1_1);
		
		JLabel lblNewLabel_1_1_2_2_1_2_2 = new JLabel("Disponibilidad");
		lblNewLabel_1_1_2_2_1_2_2.setBounds(12, 122, 79, 20);
		infReserva_2_1_1_1_3.add(lblNewLabel_1_1_2_2_1_2_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(98, 122, 100, 20);
		infReserva_2_1_1_1_3.add(textField_3);
		
		JComboBox comboBox_1_1_1 = new JComboBox();
		comboBox_1_1_1.setForeground(Color.WHITE);
		comboBox_1_1_1.setBorder(null);
		comboBox_1_1_1.setBackground(new Color(85, 147, 85));
		comboBox_1_1_1.setBounds(96, 153, 121, 23);
		infReserva_2_1_1_1_3.add(comboBox_1_1_1);
		
		JLabel lblNewLabel_1_1_2_2_1_2_1_1_1 = new JLabel("Publicidad");
		lblNewLabel_1_1_2_2_1_2_1_1_1.setBounds(10, 155, 79, 20);
		infReserva_2_1_1_1_3.add(lblNewLabel_1_1_2_2_1_2_1_1_1);
		
		JPanel infReserva_2_1_1_1_2_1_1 = new JPanel();
		infReserva_2_1_1_1_2_1_1.setLayout(null);
		infReserva_2_1_1_1_2_1_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133)));
		infReserva_2_1_1_1_2_1_1.setBackground(new Color(236, 244, 236));
		infReserva_2_1_1_1_2_1_1.setBounds(510, 222, 232, 108);
		infReserva_2_1_1_3.add(infReserva_2_1_1_1_2_1_1);
		
		txtObservar = new JTextField();
		txtObservar.setEditable(false);
		txtObservar.setColumns(10);
		txtObservar.setBounds(12, 11, 210, 86);
		infReserva_2_1_1_1_2_1_1.add(txtObservar);
		
		JPanel infReserva_2_1_2 = new JPanel();
		infReserva_2_1_2.setBounds(752, 11, 193, 319);
		infReserva_2_1_1_3.add(infReserva_2_1_2);
		infReserva_2_1_2.setLayout(null);
		infReserva_2_1_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133)));
		infReserva_2_1_2.setBackground(new Color(236, 244, 236));
		
		JPanel infReserva_2_2_1_2 = new JPanel();
		infReserva_2_2_1_2.setLayout(null);
		infReserva_2_2_1_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133)));
		infReserva_2_2_1_2.setBackground(new Color(236, 244, 236));
		infReserva_2_2_1_2.setBounds(10, 11, 171, 92);
		infReserva_2_1_2.add(infReserva_2_2_1_2);
		
		JRadioButton rbtG10 = new JRadioButton("G10");
		rbtG10.setVerticalTextPosition(SwingConstants.BOTTOM);
		rbtG10.setHorizontalTextPosition(SwingConstants.CENTER);
		rbtG10.setEnabled(false);
		rbtG10.setContentAreaFilled(false);
		rbtG10.setBounds(127, 51, 23, 34);
		infReserva_2_2_1_2.add(rbtG10);
		
		JRadioButton rbtG9 = new JRadioButton("G9");
		rbtG9.setVerticalTextPosition(SwingConstants.BOTTOM);
		rbtG9.setHorizontalTextPosition(SwingConstants.CENTER);
		rbtG9.setEnabled(false);
		rbtG9.setContentAreaFilled(false);
		rbtG9.setBounds(100, 51, 23, 34);
		infReserva_2_2_1_2.add(rbtG9);
		
		JRadioButton rbtG8 = new JRadioButton("G8");
		rbtG8.setVerticalTextPosition(SwingConstants.BOTTOM);
		rbtG8.setHorizontalTextPosition(SwingConstants.CENTER);
		rbtG8.setEnabled(false);
		rbtG8.setContentAreaFilled(false);
		rbtG8.setBounds(73, 51, 23, 34);
		infReserva_2_2_1_2.add(rbtG8);
		
		JRadioButton rbtG7 = new JRadioButton("G7");
		rbtG7.setVerticalTextPosition(SwingConstants.BOTTOM);
		rbtG7.setHorizontalTextPosition(SwingConstants.CENTER);
		rbtG7.setEnabled(false);
		rbtG7.setContentAreaFilled(false);
		rbtG7.setBounds(46, 51, 23, 34);
		infReserva_2_2_1_2.add(rbtG7);
		
		JRadioButton rbtG6 = new JRadioButton("G6");
		rbtG6.setVerticalTextPosition(SwingConstants.BOTTOM);
		rbtG6.setHorizontalTextPosition(SwingConstants.CENTER);
		rbtG6.setEnabled(false);
		rbtG6.setContentAreaFilled(false);
		rbtG6.setBounds(19, 51, 23, 34);
		infReserva_2_2_1_2.add(rbtG6);
		
		JRadioButton rbtG1 = new JRadioButton("G1");
		rbtG1.setEnabled(false);
		rbtG1.setVerticalTextPosition(SwingConstants.BOTTOM);
		rbtG1.setHorizontalTextPosition(SwingConstants.CENTER);
		rbtG1.setContentAreaFilled(false);
		rbtG1.setBounds(19, 13, 23, 34);
		infReserva_2_2_1_2.add(rbtG1);
		
		JRadioButton rbtG2 = new JRadioButton("G2");
		rbtG2.setVerticalTextPosition(SwingConstants.BOTTOM);
		rbtG2.setHorizontalTextPosition(SwingConstants.CENTER);
		rbtG2.setEnabled(false);
		rbtG2.setContentAreaFilled(false);
		rbtG2.setBounds(46, 13, 23, 34);
		infReserva_2_2_1_2.add(rbtG2);
		
		JRadioButton rbtG3 = new JRadioButton("G3");
		rbtG3.setVerticalTextPosition(SwingConstants.BOTTOM);
		rbtG3.setHorizontalTextPosition(SwingConstants.CENTER);
		rbtG3.setEnabled(false);
		rbtG3.setContentAreaFilled(false);
		rbtG3.setBounds(73, 13, 23, 34);
		infReserva_2_2_1_2.add(rbtG3);
		
		JRadioButton rbtG4 = new JRadioButton("G4");
		rbtG4.setVerticalTextPosition(SwingConstants.BOTTOM);
		rbtG4.setHorizontalTextPosition(SwingConstants.CENTER);
		rbtG4.setEnabled(false);
		rbtG4.setContentAreaFilled(false);
		rbtG4.setBounds(100, 13, 23, 34);
		infReserva_2_2_1_2.add(rbtG4);
		
		JRadioButton rbtG5 = new JRadioButton("G5");
		rbtG5.setVerticalTextPosition(SwingConstants.BOTTOM);
		rbtG5.setHorizontalTextPosition(SwingConstants.CENTER);
		rbtG5.setEnabled(false);
		rbtG5.setContentAreaFilled(false);
		rbtG5.setBounds(127, 13, 23, 34);
		infReserva_2_2_1_2.add(rbtG5);
		
		JPanel infReserva_2_2_1_1_2 = new JPanel();
		infReserva_2_2_1_1_2.setLayout(null);
		infReserva_2_2_1_1_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133)));
		infReserva_2_2_1_1_2.setBackground(new Color(236, 244, 236));
		infReserva_2_2_1_1_2.setBounds(10, 114, 171, 102);
		infReserva_2_1_2.add(infReserva_2_2_1_1_2);
		
		JRadioButton rbtC1 = new JRadioButton("C1");
		rbtC1.setVerticalTextPosition(SwingConstants.BOTTOM);
		rbtC1.setHorizontalTextPosition(SwingConstants.CENTER);
		rbtC1.setEnabled(false);
		rbtC1.setContentAreaFilled(false);
		rbtC1.setBounds(23, 7, 23, 34);
		infReserva_2_2_1_1_2.add(rbtC1);
		
		JRadioButton rbtC2 = new JRadioButton("C2");
		rbtC2.setVerticalTextPosition(SwingConstants.BOTTOM);
		rbtC2.setHorizontalTextPosition(SwingConstants.CENTER);
		rbtC2.setEnabled(false);
		rbtC2.setContentAreaFilled(false);
		rbtC2.setBounds(50, 7, 23, 34);
		infReserva_2_2_1_1_2.add(rbtC2);
		
		JRadioButton rbtC3 = new JRadioButton("C3");
		rbtC3.setVerticalTextPosition(SwingConstants.BOTTOM);
		rbtC3.setHorizontalTextPosition(SwingConstants.CENTER);
		rbtC3.setEnabled(false);
		rbtC3.setContentAreaFilled(false);
		rbtC3.setBounds(77, 7, 23, 34);
		infReserva_2_2_1_1_2.add(rbtC3);
		
		JRadioButton rbtC4 = new JRadioButton("C4");
		rbtC4.setVerticalTextPosition(SwingConstants.BOTTOM);
		rbtC4.setHorizontalTextPosition(SwingConstants.CENTER);
		rbtC4.setEnabled(false);
		rbtC4.setContentAreaFilled(false);
		rbtC4.setBounds(104, 7, 23, 34);
		infReserva_2_2_1_1_2.add(rbtC4);
		
		JRadioButton rbtC5 = new JRadioButton("C5");
		rbtC5.setVerticalTextPosition(SwingConstants.BOTTOM);
		rbtC5.setHorizontalTextPosition(SwingConstants.CENTER);
		rbtC5.setEnabled(false);
		rbtC5.setContentAreaFilled(false);
		rbtC5.setBounds(131, 7, 23, 34);
		infReserva_2_2_1_1_2.add(rbtC5);
		
		JRadioButton rbtC6 = new JRadioButton("C6");
		rbtC6.setVerticalTextPosition(SwingConstants.BOTTOM);
		rbtC6.setHorizontalTextPosition(SwingConstants.CENTER);
		rbtC6.setEnabled(false);
		rbtC6.setContentAreaFilled(false);
		rbtC6.setBounds(23, 45, 23, 34);
		infReserva_2_2_1_1_2.add(rbtC6);
		
		JPanel infReserva_2_2_1_1_1_1 = new JPanel();
		infReserva_2_2_1_1_1_1.setLayout(null);
		infReserva_2_2_1_1_1_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133)));
		infReserva_2_2_1_1_1_1.setBackground(new Color(236, 244, 236));
		infReserva_2_2_1_1_1_1.setBounds(10, 228, 171, 80);
		infReserva_2_1_2.add(infReserva_2_2_1_1_1_1);
		
		JRadioButton rbtA3 = new JRadioButton("A3");
		rbtA3.setVerticalTextPosition(SwingConstants.BOTTOM);
		rbtA3.setHorizontalTextPosition(SwingConstants.CENTER);
		rbtA3.setEnabled(false);
		rbtA3.setContentAreaFilled(false);
		rbtA3.setBounds(74, 22, 23, 34);
		infReserva_2_2_1_1_1_1.add(rbtA3);
		
		JRadioButton rbtA4 = new JRadioButton("A4");
		rbtA4.setVerticalTextPosition(SwingConstants.BOTTOM);
		rbtA4.setHorizontalTextPosition(SwingConstants.CENTER);
		rbtA4.setEnabled(false);
		rbtA4.setContentAreaFilled(false);
		rbtA4.setBounds(101, 22, 23, 34);
		infReserva_2_2_1_1_1_1.add(rbtA4);
		
		JRadioButton rbtA5 = new JRadioButton("A5");
		rbtA5.setVerticalTextPosition(SwingConstants.BOTTOM);
		rbtA5.setHorizontalTextPosition(SwingConstants.CENTER);
		rbtA5.setEnabled(false);
		rbtA5.setContentAreaFilled(false);
		rbtA5.setBounds(128, 22, 23, 34);
		infReserva_2_2_1_1_1_1.add(rbtA5);
		
		JRadioButton rbtA2 = new JRadioButton("A2");
		rbtA2.setVerticalTextPosition(SwingConstants.BOTTOM);
		rbtA2.setHorizontalTextPosition(SwingConstants.CENTER);
		rbtA2.setEnabled(false);
		rbtA2.setContentAreaFilled(false);
		rbtA2.setBounds(47, 22, 23, 34);
		infReserva_2_2_1_1_1_1.add(rbtA2);
		
		JRadioButton rbtA1 = new JRadioButton("A1");
		rbtA1.setVerticalTextPosition(SwingConstants.BOTTOM);
		rbtA1.setHorizontalTextPosition(SwingConstants.CENTER);
		rbtA1.setEnabled(false);
		rbtA1.setContentAreaFilled(false);
		rbtA1.setBounds(20, 22, 23, 34);
		infReserva_2_2_1_1_1_1.add(rbtA1);
		
		JPanel infGneral_1 = new JPanel();
		infGneral_1.setBounds(10, 13, 468, 379);
		infReserva_2_1_1_3.add(infGneral_1);
		infGneral_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133)));
		infGneral_1.setBackground(new Color(236, 244, 236));
		infGneral_1.setLayout(null);
		
		JLabel lblValorPagar = new JLabel("Valor Pagar");
		lblValorPagar.setBounds(10, 240, 75, 29);
		infGneral_1.add(lblValorPagar);
		lblValorPagar.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		txtValorPagar = new JTextField();
		txtValorPagar.setBounds(95, 243, 84, 23);
		infGneral_1.add(txtValorPagar);
		txtValorPagar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtValorPagar.setColumns(10);
		
		JLabel lblDiferencia = new JLabel("Diferencia");
		lblDiferencia.setBounds(227, 243, 75, 29);
		infGneral_1.add(lblDiferencia);
		lblDiferencia.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		txtDiferencia = new JTextField();
		txtDiferencia.setBounds(322, 243, 84, 23);
		infGneral_1.add(txtDiferencia);
		txtDiferencia.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtDiferencia.setColumns(10);
		
		JComboBox cbxMetodoPago = new JComboBox();
		cbxMetodoPago.setEditable(true);
		cbxMetodoPago.setBounds(322, 209, 122, 23);
		infGneral_1.add(cbxMetodoPago);
		cbxMetodoPago.setModel(new DefaultComboBoxModel(new String[] {"Seleccionar", "Efectivo", "Trenferencia", "Datafono"}));
		cbxMetodoPago.setForeground(Color.WHITE);
		cbxMetodoPago.setBorder(null);
		cbxMetodoPago.setBackground(new Color(85, 147, 85));
		
		JLabel lblMetodosPagos = new JLabel("Metodos pagos");
		lblMetodosPagos.setBounds(227, 203, 97, 29);
		infGneral_1.add(lblMetodosPagos);
		lblMetodosPagos.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		txtTotalPago = new JTextField();
		txtTotalPago.setBounds(95, 209, 84, 23);
		infGneral_1.add(txtTotalPago);
		txtTotalPago.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtTotalPago.setColumns(10);
		
		JLabel lblTotalPagos = new JLabel("Total Pagos");
		lblTotalPagos.setBounds(10, 203, 75, 29);
		infGneral_1.add(lblTotalPagos);
		lblTotalPagos.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		JLabel lblTarifa = new JLabel("Tarifa");
		lblTarifa.setBounds(10, 170, 75, 29);
		infGneral_1.add(lblTarifa);
		lblTarifa.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		txtTarifa = new JTextField();
		txtTarifa.setBounds(95, 173, 84, 23);
		infGneral_1.add(txtTarifa);
		txtTarifa.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtTarifa.setColumns(10);
		
		JLabel lblPagos = new JLabel("Pagos");
		lblPagos.setBounds(227, 169, 75, 29);
		infGneral_1.add(lblPagos);
		lblPagos.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		txtPago = new JTextField();
		txtPago.setBounds(322, 173, 84, 23);
		infGneral_1.add(txtPago);
		txtPago.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtPago.setColumns(10);
		
		JDateChooser cldFechaReserva = new JDateChooser();
		cldFechaReserva.setBounds(322, 139, 122, 23);
		infGneral_1.add(cldFechaReserva);
		cldFechaReserva.setDateFormatString("y/MM/d");
		
		JLabel lblFechaReserva = new JLabel("Fecha Reserva");
		lblFechaReserva.setBounds(227, 136, 75, 29);
		infGneral_1.add(lblFechaReserva);
		lblFechaReserva.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		txtHoraEntrada = new JTextField();
		txtHoraEntrada.setBounds(95, 139, 35, 23);
		infGneral_1.add(txtHoraEntrada);
		txtHoraEntrada.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtHoraEntrada.setColumns(10);
		
		JLabel lblHoraEntrada = new JLabel("Hora Entrada");
		lblHoraEntrada.setBounds(10, 136, 75, 29);
		infGneral_1.add(lblHoraEntrada);
		lblHoraEntrada.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		JLabel lblFechaEntrada = new JLabel("Fecha Entrada");
		lblFechaEntrada.setBounds(10, 105, 75, 29);
		infGneral_1.add(lblFechaEntrada);
		lblFechaEntrada.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		JDateChooser cldFechaEntrada = new JDateChooser();
		cldFechaEntrada.setBounds(95, 105, 122, 23);
		infGneral_1.add(cldFechaEntrada);
		cldFechaEntrada.setDateFormatString("y/MM/d");
		
		JLabel lblFechaEntrada_1 = new JLabel("Fecha Salida");
		lblFechaEntrada_1.setBounds(227, 105, 75, 29);
		infGneral_1.add(lblFechaEntrada_1);
		lblFechaEntrada_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		JDateChooser cldFechaSalida = new JDateChooser();
		cldFechaSalida.setBounds(322, 105, 122, 23);
		infGneral_1.add(cldFechaSalida);
		cldFechaSalida.setDateFormatString("y/MM/d");
		
		JLabel lblNoches = new JLabel("Noches");
		lblNoches.setBounds(334, 58, 52, 36);
		infGneral_1.add(lblNoches);
		lblNoches.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		txtNoches = new JTextField();
		txtNoches.setBounds(409, 65, 35, 23);
		infGneral_1.add(txtNoches);
		txtNoches.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtNoches.setColumns(10);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(289, 67, 35, 23);
		infGneral_1.add(txtCantidad);
		txtCantidad.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtCantidad.setColumns(10);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(227, 58, 52, 36);
		infGneral_1.add(lblCantidad);
		lblCantidad.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		JComboBox cbxPaquete = new JComboBox();
		cbxPaquete.setEditable(true);
		cbxPaquete.setBounds(95, 67, 122, 23);
		infGneral_1.add(cbxPaquete);
		cbxPaquete.setModel(new DefaultComboBoxModel(new String[] {"Seleccione", "Pasadia", "Todo incluido"}));
		cbxPaquete.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		cbxPaquete.setForeground(Color.WHITE);
		cbxPaquete.setBorder(null);
		cbxPaquete.setBackground(new Color(85, 147, 85)); 
		
		JLabel lblPaquete = new JLabel("Paquete");
		lblPaquete.setBounds(10, 58, 52, 36);
		infGneral_1.add(lblPaquete);
		lblPaquete.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 11, 52, 36);
		infGneral_1.add(lblNombre);
		lblNombre.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		txtNombre = new JTextField();
		txtNombre.setBounds(95, 18, 193, 23);
		infGneral_1.add(txtNombre);
		txtNombre.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtNombre.setColumns(10);
		
		JLabel lblCelular = new JLabel("Celular");
		lblCelular.setBounds(298, 11, 52, 36);
		infGneral_1.add(lblCelular);
		lblCelular.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		txtCelular = new JTextField();
		txtCelular.setBounds(360, 18, 84, 23);
		infGneral_1.add(txtCelular);
		txtCelular.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtCelular.setColumns(10);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Boolean G1Reg = rbtG1.isSelected();
				Boolean G2Reg = rbtG2.isSelected();
				Boolean G3Reg = rbtG3.isSelected();
				Boolean G4Reg = rbtG4.isSelected();
				Boolean G5Reg = rbtG5.isSelected();
				Boolean G6Reg = rbtG6.isSelected();
				Boolean G7Reg = rbtG7.isSelected();
				Boolean G8Reg = rbtG8.isSelected();
				Boolean G9Reg = rbtG9.isSelected();
				Boolean G10Reg = rbtG10.isSelected();
				Boolean C1Reg = rbtC1.isSelected();
				Boolean C2Reg = rbtC2.isSelected();
				Boolean C3Reg = rbtC3.isSelected();
				Boolean C4Reg = rbtC4.isSelected();
				Boolean C5Reg = rbtC5.isSelected();
				Boolean C6Reg = rbtC6.isSelected();
				Boolean A1Reg = rbtA1.isSelected();
				Boolean A2Reg = rbtA2.isSelected();
				Boolean A3Reg = rbtA3.isSelected();
				Boolean A4Reg = rbtA4.isSelected();
				Boolean A5Reg = rbtA5.isSelected();
				String CedulaReg = txtBuscarCedula.getText();
									
			
			dcl.setNombre(txtNombre.getText());
			dcl.setCedula(CedulaReg);
			dcl.setCelular(txtCelular.getText()); 
			dcl.setFecha_Reserva(cldFechaReserva.getDate());
			dhb.setFechaSalida(cldFechaSalida.getDate());
			dhb.setFechaEntrada(cldFechaEntrada.getDate());
			dcl.setHora_Entrada(txtHoraEntrada.getText());
			dcl.setMetodo_pago(cbxMetodoPago.getSelectedItem().toString()); 
			dcl.setPaquete(cbxPaquete.getSelectedItem().toString()); 
		try {
			dcl.setTarifa(Integer.parseInt(txtTarifa.getText()));
			dcl.setPago(Integer.parseInt(txtPago.getText()));
			dcl.setTotal_Pagado(Integer.parseInt(txtTotalPago.getText()));
			dcl.setCantidad(Integer.parseInt(txtCantidad.getText()));
			dcl.setNoche(Integer.parseInt(txtNoches.getText()));
			dcl.setValor_pagar(Integer.parseInt(txtValorPagar.getText()));
			dcl.setDiferencia(Integer.parseInt(txtDiferencia.getText()));
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
			dhb.setCedula(CedulaReg);
			cbo.modificarClientCedula(dcl);
			hbo.modificarHabitacion(dhb);
			
			JOptionPane.showMessageDialog(null, "Guardado con exito");
		} catch (NumberFormatException e2) {
			JOptionPane.showMessageDialog(null, "Ingrese un numero valido");
			}
		Metodos.limpiarString(txtNombre);				
		Metodos.limpiarString(txtBuscarCedula);				
		Metodos.limpiarString(txtCelular); 
		Metodos.limpiarString(txtCantidad);				
		Metodos.limpiarString(txtCantidad);				
		Metodos.limpiarString(txtHoraEntrada);
		Metodos.limpiarString(txtTarifa);
		Metodos.limpiarString(txtTotalPago);
		Metodos.limpiarString(txtValorPagar);
		Metodos.limpiarString(txtDiferencia);
		Metodos.limpiarString(txtNoches);
		Metodos.limpiarCbx(cbxPaquete);							
		Metodos.limpiarCbx(cbxMetodoPago);
		Metodos.limpiarFecha(cldFechaSalida);
		Metodos.limpiarFecha(cldFechaEntrada);
		Metodos.limpiarFecha(cldFechaReserva);
		Metodos.limpiarString(txtPago);
		rbtA1.setSelected(false);
		rbtA2.setSelected(false);
		rbtA3.setSelected(false);
		rbtA4.setSelected(false);
		rbtA5.setSelected(false);
		rbtC1.setSelected(false);
		rbtC2.setSelected(false);
		rbtC3.setSelected(false);
		rbtC4.setSelected(false);
		rbtC5.setSelected(false);
		rbtC6.setSelected(false);
		rbtG1.setSelected(false);
		rbtG2.setSelected(false);
		rbtG3.setSelected(false);
		rbtG4.setSelected(false);
		rbtG5.setSelected(false);
		rbtG6.setSelected(false);
		rbtG7.setSelected(false);
		rbtG8.setSelected(false);
		rbtG9.setSelected(false);
		rbtG10.setSelected(false);
		
		rbtA1.setEnabled(false);
		rbtA2.setEnabled(false);
		rbtA3.setEnabled(false);
		rbtA4.setEnabled(false);
		rbtA5.setEnabled(false);
		rbtC1.setEnabled(false);
		rbtC2.setEnabled(false);
		rbtC3.setEnabled(false);
		rbtC4.setEnabled(false);
		rbtC5.setEnabled(false);
		rbtC6.setEnabled(false);
		rbtG1.setEnabled(false);
		rbtG2.setEnabled(false);
		rbtG3.setEnabled(false);
		rbtG4.setEnabled(false);
		rbtG5.setEnabled(false);
		rbtG6.setEnabled(false);
		rbtG7.setEnabled(false);
		rbtG8.setEnabled(false);
		rbtG9.setEnabled(false);
		rbtG10.setEnabled(false);	
			
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.setRowCount(0);
		}
		});
		btnModificar.setBounds(819, 351, 98, 26);
		infReserva_2_1_1_3.add(btnModificar);
		
		JButton btnNewButton_1_2 = new JButton("Limpiar");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Metodos.limpiarString(txtBuscarCedula);
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.setRowCount(0);
				Metodos.limpiarString(txtNombre);				
				Metodos.limpiarString(txtBuscarCedula);				
				Metodos.limpiarString(txtCelular); 
				Metodos.limpiarString(txtCantidad);				
				Metodos.limpiarString(txtCantidad);				
				Metodos.limpiarString(txtHoraEntrada);
				Metodos.limpiarString(txtTarifa);
				Metodos.limpiarString(txtTotalPago);
				Metodos.limpiarString(txtValorPagar);
				Metodos.limpiarString(txtDiferencia);
				Metodos.limpiarString(txtNoches);
				Metodos.limpiarCbx(cbxPaquete);							
				Metodos.limpiarCbx(cbxMetodoPago);
				Metodos.limpiarFecha(cldFechaSalida);
				Metodos.limpiarFecha(cldFechaEntrada);
				Metodos.limpiarFecha(cldFechaReserva);
				Metodos.limpiarString(txtPago);
				rbtA1.setSelected(false);
				rbtA2.setSelected(false);
				rbtA3.setSelected(false);
				rbtA4.setSelected(false);
				rbtA5.setSelected(false);
				rbtC1.setSelected(false);
				rbtC2.setSelected(false);
				rbtC3.setSelected(false);
				rbtC4.setSelected(false);
				rbtC5.setSelected(false);
				rbtC6.setSelected(false);
				rbtG1.setSelected(false);
				rbtG2.setSelected(false);
				rbtG3.setSelected(false);
				rbtG4.setSelected(false);
				rbtG5.setSelected(false);
				rbtG6.setSelected(false);
				rbtG7.setSelected(false);
				rbtG8.setSelected(false);
				rbtG9.setSelected(false);
				rbtG10.setSelected(false);
				
				rbtA1.setEnabled(false);
				rbtA2.setEnabled(false);
				rbtA3.setEnabled(false);
				rbtA4.setEnabled(false);
				rbtA5.setEnabled(false);
				rbtC1.setEnabled(false);
				rbtC2.setEnabled(false);
				rbtC3.setEnabled(false);
				rbtC4.setEnabled(false);
				rbtC5.setEnabled(false);
				rbtC6.setEnabled(false);
				rbtG1.setEnabled(false);
				rbtG2.setEnabled(false);
				rbtG3.setEnabled(false);
				rbtG4.setEnabled(false);
				rbtG5.setEnabled(false);
				rbtG6.setEnabled(false);
				rbtG7.setEnabled(false);
				rbtG8.setEnabled(false);
				rbtG9.setEnabled(false);
				rbtG10.setEnabled(false);		
			}
		});
		btnNewButton_1_2.setBounds(711, 351, 98, 26);
		infReserva_2_1_1_3.add(btnNewButton_1_2);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dcl.setCedula(txtBuscarCedula.getText());
				try {
					mensaje =cbo.eliminarCliente(dcl);
					JOptionPane.showMessageDialog(null, mensaje);
				} catch (NumberFormatException | ClassNotFoundException e2) {
					System.out.println(e2.getMessage());
				}
				Metodos.limpiarString(txtNombre);				
				Metodos.limpiarString(txtBuscarCedula);				
				Metodos.limpiarString(txtCelular); 
				Metodos.limpiarString(txtCantidad);				
				Metodos.limpiarString(txtCantidad);				
				Metodos.limpiarString(txtHoraEntrada);
				Metodos.limpiarString(txtTarifa);
				Metodos.limpiarString(txtTotalPago);
				Metodos.limpiarString(txtValorPagar);
				Metodos.limpiarString(txtDiferencia);
				Metodos.limpiarString(txtNoches);
				Metodos.limpiarCbx(cbxPaquete);							
				Metodos.limpiarCbx(cbxMetodoPago);
				Metodos.limpiarFecha(cldFechaSalida);
				Metodos.limpiarFecha(cldFechaEntrada);
				Metodos.limpiarFecha(cldFechaReserva);
				Metodos.limpiarString(txtPago);
				rbtA1.setSelected(false);
				rbtA2.setSelected(false);
				rbtA3.setSelected(false);
				rbtA4.setSelected(false);
				rbtA5.setSelected(false);
				rbtC1.setSelected(false);
				rbtC2.setSelected(false);
				rbtC3.setSelected(false);
				rbtC4.setSelected(false);
				rbtC5.setSelected(false);
				rbtC6.setSelected(false);
				rbtG1.setSelected(false);
				rbtG2.setSelected(false);
				rbtG3.setSelected(false);
				rbtG4.setSelected(false);
				rbtG5.setSelected(false);
				rbtG6.setSelected(false);
				rbtG7.setSelected(false);
				rbtG8.setSelected(false);
				rbtG9.setSelected(false);
				rbtG10.setSelected(false);
				
				rbtA1.setEnabled(false);
				rbtA2.setEnabled(false);
				rbtA3.setEnabled(false);
				rbtA4.setEnabled(false);
				rbtA5.setEnabled(false);
				rbtC1.setEnabled(false);
				rbtC2.setEnabled(false);
				rbtC3.setEnabled(false);
				rbtC4.setEnabled(false);
				rbtC5.setEnabled(false);
				rbtC6.setEnabled(false);
				rbtG1.setEnabled(false);
				rbtG2.setEnabled(false);
				rbtG3.setEnabled(false);
				rbtG4.setEnabled(false);
				rbtG5.setEnabled(false);
				rbtG6.setEnabled(false);
				rbtG7.setEnabled(false);
				rbtG8.setEnabled(false);
				rbtG9.setEnabled(false);
				rbtG10.setEnabled(false);
			}
		});
		btnEliminar.setBounds(603, 351, 98, 26);
		infReserva_2_1_1_3.add(btnEliminar);
		
		JPanel infGneral_1_1 = new JPanel();
		infGneral_1_1.setLayout(null);
		infGneral_1_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133)));
		infGneral_1_1.setBackground(new Color(236, 244, 236));
		infGneral_1_1.setBounds(12, 11, 955, 61);
		pasaNoche_2.add(infGneral_1_1);
		
		txtBuscarCedula = new JTextField();
		txtBuscarCedula.setColumns(10);
		txtBuscarCedula.setBounds(72, 22, 92, 20);
		infGneral_1_1.add(txtBuscarCedula);
		
		JLabel lblCedula = new JLabel("Cedula");
		lblCedula.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblCedula.setBounds(10, 14, 52, 36);
		infGneral_1_1.add(lblCedula);
		
		JButton btnBuscarCedula = new JButton("Buscar");
		btnBuscarCedula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cbo.buscarCedula(txtBuscarCedula, table);
				ClienteBO cbo = new ClienteBO();
				Datos_Clientes dcl = new Datos_Clientes();
				Datos_Habitacion dhb = new Datos_Habitacion();
				String mensaje = cbo.ImportarCeldas(txtBuscarCedula,dcl,dhb);
				 
				txtNombre.setText(dcl.getNombre());				
				txtCelular.setText(dcl.getCelular());								 				
				txtCantidad.setText(Integer.toString(dcl.getCantidad()));								
				txtHoraEntrada.setText(dcl.getHora_Entrada());
				txtTarifa.setText(Integer.toString(dcl.getTarifa()));
				txtPago.setText(Integer.toString(dcl.getPago()));			 	
				txtNoches.setText(Integer.toString(dcl.getNoche()));
				txtTotalPago.setText(Integer.toString(dcl.getTotal_Pagado()));
				txtValorPagar.setText(Integer.toString(dcl.getValor_pagar()));
				txtDiferencia.setText(Integer.toString(dcl.getDiferencia()));
				
				//txtObservar.setText(dcl.getObservacion());
					
				cbxPaquete.setSelectedItem(dcl.getPaquete());							
				cbxMetodoPago.setSelectedItem(dcl.getMetodo_pago());
						
				cldFechaSalida.setDate(dhb.getFechaEntrada());	
				cldFechaEntrada.setDate(dhb.getFechaSalida());	
				cldFechaReserva.setDate(dcl.getFecha_Reserva());
				
				rbtA1.setSelected(dhb.getA1());
				rbtA2.setSelected(dhb.getA2());
				rbtA3.setSelected(dhb.getA3());
				rbtA4.setSelected(dhb.getA4());
				rbtA5.setSelected(dhb.getA5());
				rbtC1.setSelected(dhb.getC1());
				rbtC2.setSelected(dhb.getC2());
				rbtC3.setSelected(dhb.getC3());
				rbtC4.setSelected(dhb.getC4());
				rbtC5.setSelected(dhb.getC5());
				rbtC6.setSelected(dhb.getC6());
				rbtG1.setSelected(dhb.getG1());
				rbtG2.setSelected(dhb.getG2());
				rbtG3.setSelected(dhb.getG3());
				rbtG4.setSelected(dhb.getG4());
				rbtG5.setSelected(dhb.getG5());
				rbtG6.setSelected(dhb.getG6());
				rbtG7.setSelected(dhb.getG7());
				rbtG8.setSelected(dhb.getG8());
				rbtG9.setSelected(dhb.getG9());
				rbtG10.setSelected(dhb.getG10());
				
				rbtA1.setEnabled(true);
				rbtA2.setEnabled(true);
				rbtA3.setEnabled(true);
				rbtA4.setEnabled(true);
				rbtA5.setEnabled(true);
				rbtC1.setEnabled(true);
				rbtC2.setEnabled(true);
				rbtC3.setEnabled(true);
				rbtC4.setEnabled(true);
				rbtC5.setEnabled(true);
				rbtC6.setEnabled(true);
				rbtG1.setEnabled(true);
				rbtG2.setEnabled(true);
				rbtG3.setEnabled(true);
				rbtG4.setEnabled(true);
				rbtG5.setEnabled(true);
				rbtG6.setEnabled(true);
				rbtG7.setEnabled(true);
				rbtG8.setEnabled(true);
				rbtG9.setEnabled(true);
				rbtG10.setEnabled(true);
				
				
				
			
			}
		});
		btnBuscarCedula.setBounds(198, 21, 98, 26);
		infGneral_1_1.add(btnBuscarCedula);
		
		JPanel infGneral_1_1_1 = new JPanel();
		infGneral_1_1_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133)));
		infGneral_1_1_1.setBackground(new Color(236, 244, 236));
		infGneral_1_1_1.setBounds(12, 83, 955, 151);
		pasaNoche_2.add(infGneral_1_1_1);
		infGneral_1_1_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 935, 129);
		infGneral_1_1_1.add(scrollPane);
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
					"ID", "Nombre", "Cedula", "Celular", "Procedencia", "Entrada", "Salida", "Cantidad", "Noches", "Hora Entrada", "Fecha Reserva", "Tarifa", "Pagos", "Metodos Pagos ", "Total Pagos", "Valor a pagar", "Diferencia ", "Publicidad", "Paquetes"}
		));	
	}
}
