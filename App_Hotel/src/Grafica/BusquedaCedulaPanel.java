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
		
		JRadioButton rdbtnNewRadioButton_2_2 = new JRadioButton("A1");
		rdbtnNewRadioButton_2_2.setVerticalTextPosition(SwingConstants.BOTTOM);
		rdbtnNewRadioButton_2_2.setHorizontalTextPosition(SwingConstants.CENTER);
		rdbtnNewRadioButton_2_2.setEnabled(false);
		rdbtnNewRadioButton_2_2.setContentAreaFilled(false);
		rdbtnNewRadioButton_2_2.setBounds(127, 51, 23, 34);
		infReserva_2_2_1_2.add(rdbtnNewRadioButton_2_2);
		
		JRadioButton rdbtnNewRadioButton_3_2 = new JRadioButton("A1");
		rdbtnNewRadioButton_3_2.setVerticalTextPosition(SwingConstants.BOTTOM);
		rdbtnNewRadioButton_3_2.setHorizontalTextPosition(SwingConstants.CENTER);
		rdbtnNewRadioButton_3_2.setEnabled(false);
		rdbtnNewRadioButton_3_2.setContentAreaFilled(false);
		rdbtnNewRadioButton_3_2.setBounds(100, 51, 23, 34);
		infReserva_2_2_1_2.add(rdbtnNewRadioButton_3_2);
		
		JRadioButton rdbtnNewRadioButton_3_1_1 = new JRadioButton("A1");
		rdbtnNewRadioButton_3_1_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		rdbtnNewRadioButton_3_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
		rdbtnNewRadioButton_3_1_1.setEnabled(false);
		rdbtnNewRadioButton_3_1_1.setContentAreaFilled(false);
		rdbtnNewRadioButton_3_1_1.setBounds(73, 51, 23, 34);
		infReserva_2_2_1_2.add(rdbtnNewRadioButton_3_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_1_1 = new JRadioButton("A1");
		rdbtnNewRadioButton_1_1_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		rdbtnNewRadioButton_1_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
		rdbtnNewRadioButton_1_1_1.setEnabled(false);
		rdbtnNewRadioButton_1_1_1.setContentAreaFilled(false);
		rdbtnNewRadioButton_1_1_1.setBounds(46, 51, 23, 34);
		infReserva_2_2_1_2.add(rdbtnNewRadioButton_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_3 = new JRadioButton("A1");
		rdbtnNewRadioButton_1_3.setVerticalTextPosition(SwingConstants.BOTTOM);
		rdbtnNewRadioButton_1_3.setHorizontalTextPosition(SwingConstants.CENTER);
		rdbtnNewRadioButton_1_3.setEnabled(false);
		rdbtnNewRadioButton_1_3.setContentAreaFilled(false);
		rdbtnNewRadioButton_1_3.setBounds(19, 51, 23, 34);
		infReserva_2_2_1_2.add(rdbtnNewRadioButton_1_3);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("A1");
		rdbtnNewRadioButton_7.setVerticalTextPosition(SwingConstants.BOTTOM);
		rdbtnNewRadioButton_7.setHorizontalTextPosition(SwingConstants.CENTER);
		rdbtnNewRadioButton_7.setEnabled(false);
		rdbtnNewRadioButton_7.setContentAreaFilled(false);
		rdbtnNewRadioButton_7.setBounds(19, 13, 23, 34);
		infReserva_2_2_1_2.add(rdbtnNewRadioButton_7);
		
		JRadioButton rdbtnNewRadioButton_6_2 = new JRadioButton("A1");
		rdbtnNewRadioButton_6_2.setVerticalTextPosition(SwingConstants.BOTTOM);
		rdbtnNewRadioButton_6_2.setHorizontalTextPosition(SwingConstants.CENTER);
		rdbtnNewRadioButton_6_2.setEnabled(false);
		rdbtnNewRadioButton_6_2.setContentAreaFilled(false);
		rdbtnNewRadioButton_6_2.setBounds(46, 13, 23, 34);
		infReserva_2_2_1_2.add(rdbtnNewRadioButton_6_2);
		
		JRadioButton rdbtnNewRadioButton_4_1_2 = new JRadioButton("A1");
		rdbtnNewRadioButton_4_1_2.setVerticalTextPosition(SwingConstants.BOTTOM);
		rdbtnNewRadioButton_4_1_2.setHorizontalTextPosition(SwingConstants.CENTER);
		rdbtnNewRadioButton_4_1_2.setEnabled(false);
		rdbtnNewRadioButton_4_1_2.setContentAreaFilled(false);
		rdbtnNewRadioButton_4_1_2.setBounds(73, 13, 23, 34);
		infReserva_2_2_1_2.add(rdbtnNewRadioButton_4_1_2);
		
		JRadioButton rdbtnNewRadioButton_4_3 = new JRadioButton("A1");
		rdbtnNewRadioButton_4_3.setVerticalTextPosition(SwingConstants.BOTTOM);
		rdbtnNewRadioButton_4_3.setHorizontalTextPosition(SwingConstants.CENTER);
		rdbtnNewRadioButton_4_3.setEnabled(false);
		rdbtnNewRadioButton_4_3.setContentAreaFilled(false);
		rdbtnNewRadioButton_4_3.setBounds(100, 13, 23, 34);
		infReserva_2_2_1_2.add(rdbtnNewRadioButton_4_3);
		
		JRadioButton rdbtnNewRadioButton_2_1_2 = new JRadioButton("A1");
		rdbtnNewRadioButton_2_1_2.setVerticalTextPosition(SwingConstants.BOTTOM);
		rdbtnNewRadioButton_2_1_2.setHorizontalTextPosition(SwingConstants.CENTER);
		rdbtnNewRadioButton_2_1_2.setEnabled(false);
		rdbtnNewRadioButton_2_1_2.setContentAreaFilled(false);
		rdbtnNewRadioButton_2_1_2.setBounds(127, 13, 23, 34);
		infReserva_2_2_1_2.add(rdbtnNewRadioButton_2_1_2);
		
		JPanel infReserva_2_2_1_1_2 = new JPanel();
		infReserva_2_2_1_1_2.setLayout(null);
		infReserva_2_2_1_1_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133)));
		infReserva_2_2_1_1_2.setBackground(new Color(236, 244, 236));
		infReserva_2_2_1_1_2.setBounds(10, 114, 171, 102);
		infReserva_2_1_2.add(infReserva_2_2_1_1_2);
		
		JRadioButton rdbtnNewRadioButton_5_2 = new JRadioButton("A1");
		rdbtnNewRadioButton_5_2.setVerticalTextPosition(SwingConstants.BOTTOM);
		rdbtnNewRadioButton_5_2.setHorizontalTextPosition(SwingConstants.CENTER);
		rdbtnNewRadioButton_5_2.setEnabled(false);
		rdbtnNewRadioButton_5_2.setContentAreaFilled(false);
		rdbtnNewRadioButton_5_2.setBounds(23, 7, 23, 34);
		infReserva_2_2_1_1_2.add(rdbtnNewRadioButton_5_2);
		
		JRadioButton rdbtnNewRadioButton_6_1_2 = new JRadioButton("A1");
		rdbtnNewRadioButton_6_1_2.setVerticalTextPosition(SwingConstants.BOTTOM);
		rdbtnNewRadioButton_6_1_2.setHorizontalTextPosition(SwingConstants.CENTER);
		rdbtnNewRadioButton_6_1_2.setEnabled(false);
		rdbtnNewRadioButton_6_1_2.setContentAreaFilled(false);
		rdbtnNewRadioButton_6_1_2.setBounds(50, 7, 23, 34);
		infReserva_2_2_1_1_2.add(rdbtnNewRadioButton_6_1_2);
		
		JRadioButton rdbtnNewRadioButton_4_1_1_2 = new JRadioButton("A1");
		rdbtnNewRadioButton_4_1_1_2.setVerticalTextPosition(SwingConstants.BOTTOM);
		rdbtnNewRadioButton_4_1_1_2.setHorizontalTextPosition(SwingConstants.CENTER);
		rdbtnNewRadioButton_4_1_1_2.setEnabled(false);
		rdbtnNewRadioButton_4_1_1_2.setContentAreaFilled(false);
		rdbtnNewRadioButton_4_1_1_2.setBounds(77, 7, 23, 34);
		infReserva_2_2_1_1_2.add(rdbtnNewRadioButton_4_1_1_2);
		
		JRadioButton rdbtnNewRadioButton_4_2_2 = new JRadioButton("A1");
		rdbtnNewRadioButton_4_2_2.setVerticalTextPosition(SwingConstants.BOTTOM);
		rdbtnNewRadioButton_4_2_2.setHorizontalTextPosition(SwingConstants.CENTER);
		rdbtnNewRadioButton_4_2_2.setEnabled(false);
		rdbtnNewRadioButton_4_2_2.setContentAreaFilled(false);
		rdbtnNewRadioButton_4_2_2.setBounds(104, 7, 23, 34);
		infReserva_2_2_1_1_2.add(rdbtnNewRadioButton_4_2_2);
		
		JRadioButton rdbtnNewRadioButton_2_1_1_2 = new JRadioButton("A1");
		rdbtnNewRadioButton_2_1_1_2.setVerticalTextPosition(SwingConstants.BOTTOM);
		rdbtnNewRadioButton_2_1_1_2.setHorizontalTextPosition(SwingConstants.CENTER);
		rdbtnNewRadioButton_2_1_1_2.setEnabled(false);
		rdbtnNewRadioButton_2_1_1_2.setContentAreaFilled(false);
		rdbtnNewRadioButton_2_1_1_2.setBounds(131, 7, 23, 34);
		infReserva_2_2_1_1_2.add(rdbtnNewRadioButton_2_1_1_2);
		
		JRadioButton rdbtnNewRadioButton_1_2_1 = new JRadioButton("A1");
		rdbtnNewRadioButton_1_2_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		rdbtnNewRadioButton_1_2_1.setHorizontalTextPosition(SwingConstants.CENTER);
		rdbtnNewRadioButton_1_2_1.setEnabled(false);
		rdbtnNewRadioButton_1_2_1.setContentAreaFilled(false);
		rdbtnNewRadioButton_1_2_1.setBounds(23, 45, 23, 34);
		infReserva_2_2_1_1_2.add(rdbtnNewRadioButton_1_2_1);
		
		JPanel infReserva_2_2_1_1_1_1 = new JPanel();
		infReserva_2_2_1_1_1_1.setLayout(null);
		infReserva_2_2_1_1_1_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133)));
		infReserva_2_2_1_1_1_1.setBackground(new Color(236, 244, 236));
		infReserva_2_2_1_1_1_1.setBounds(10, 228, 171, 80);
		infReserva_2_1_2.add(infReserva_2_2_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_4_1_1_1_1 = new JRadioButton("A1");
		rdbtnNewRadioButton_4_1_1_1_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		rdbtnNewRadioButton_4_1_1_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
		rdbtnNewRadioButton_4_1_1_1_1.setEnabled(false);
		rdbtnNewRadioButton_4_1_1_1_1.setContentAreaFilled(false);
		rdbtnNewRadioButton_4_1_1_1_1.setBounds(74, 22, 23, 34);
		infReserva_2_2_1_1_1_1.add(rdbtnNewRadioButton_4_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_4_2_1_1 = new JRadioButton("A1");
		rdbtnNewRadioButton_4_2_1_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		rdbtnNewRadioButton_4_2_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
		rdbtnNewRadioButton_4_2_1_1.setEnabled(false);
		rdbtnNewRadioButton_4_2_1_1.setContentAreaFilled(false);
		rdbtnNewRadioButton_4_2_1_1.setBounds(101, 22, 23, 34);
		infReserva_2_2_1_1_1_1.add(rdbtnNewRadioButton_4_2_1_1);
		
		JRadioButton rdbtnNewRadioButton_2_1_1_1_1 = new JRadioButton("A1");
		rdbtnNewRadioButton_2_1_1_1_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		rdbtnNewRadioButton_2_1_1_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
		rdbtnNewRadioButton_2_1_1_1_1.setEnabled(false);
		rdbtnNewRadioButton_2_1_1_1_1.setContentAreaFilled(false);
		rdbtnNewRadioButton_2_1_1_1_1.setBounds(128, 22, 23, 34);
		infReserva_2_2_1_1_1_1.add(rdbtnNewRadioButton_2_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_6_1_1_1 = new JRadioButton("A1");
		rdbtnNewRadioButton_6_1_1_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		rdbtnNewRadioButton_6_1_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
		rdbtnNewRadioButton_6_1_1_1.setEnabled(false);
		rdbtnNewRadioButton_6_1_1_1.setContentAreaFilled(false);
		rdbtnNewRadioButton_6_1_1_1.setBounds(47, 22, 23, 34);
		infReserva_2_2_1_1_1_1.add(rdbtnNewRadioButton_6_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_5_1_1 = new JRadioButton("A1");
		rdbtnNewRadioButton_5_1_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		rdbtnNewRadioButton_5_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
		rdbtnNewRadioButton_5_1_1.setEnabled(false);
		rdbtnNewRadioButton_5_1_1.setContentAreaFilled(false);
		rdbtnNewRadioButton_5_1_1.setBounds(20, 22, 23, 34);
		infReserva_2_2_1_1_1_1.add(rdbtnNewRadioButton_5_1_1);
		
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
			
			dcl.setNombre(txtNombre.getText());
			dcl.setCedula(txtBuscarCedula.getText());
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
			
			mensaje = cbo.modificarClientCedula(dcl);
			JOptionPane.showMessageDialog(null, mensaje);
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
