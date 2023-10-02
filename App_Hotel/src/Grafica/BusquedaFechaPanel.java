package Grafica;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import com.toedter.calendar.JDateChooser;

import Com.Proyecto_Hotel.ClienteBO.ClienteBO;
import Com.Proyecto_Hotel.ClienteDao.ClienteDao;
import Com.Proyecto_Hotel.Registro_Clientes.Datos_Clientes;
import Conexion.Conexion;
import Logica.Metodos;

import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class BusquedaFechaPanel extends JPanel {
	
	private JDateChooser cldFechaBusqueda;
	private ClienteBO Cbo = new ClienteBO();
	private ClienteDao Cdo = new ClienteDao();
	private Connection con =null; 
	private JTable table;
	public void mostrarClientes () {
		Cbo.mostrarClinte(table);
	} 
	
	/*public void BuscarFechas () {
		Cbo.buscarFecha(cldFechaBusqueda, table);
	}*/

	public BusquedaFechaPanel() {
		setBounds(168, 77, 977, 673);
		setLayout(null);		
		JPanel tblBusqueFecha = new JPanel();
		tblBusqueFecha.setLayout(null);
		tblBusqueFecha.setToolTipText("");
		tblBusqueFecha.setName("khvk");
		tblBusqueFecha.setForeground(new Color(69, 118, 69));
		tblBusqueFecha.setBorder(null);
		tblBusqueFecha.setBackground(new Color(236, 244, 236));
		tblBusqueFecha.setBounds(0, 0, 977, 676);
		add(tblBusqueFecha);
		
		JPanel infReserva12 = new JPanel();
		infReserva12.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133)));
		infReserva12.setBackground(new Color(236, 244, 236));
		infReserva12.setBounds(10, 108, 957, 479);
		tblBusqueFecha.add(infReserva12);
		infReserva12.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 937, 457);
		infReserva12.add(scrollPane);
		
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
		
				
				
		JLabel lblNewLabel_3 = new JLabel("Datos del cliente");
		lblNewLabel_3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(new Color(36, 62, 36));
		lblNewLabel_3.setBorder(null);
		lblNewLabel_3.setBounds(26, 22, 100, 23);
		tblBusqueFecha.add(lblNewLabel_3);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setLayout(null);
		panel_3_2.setBorder(null);
		panel_3_2.setBackground(new Color(236, 244, 236));
		panel_3_2.setBounds(26, 22, 100, 23);
		tblBusqueFecha.add(panel_3_2);
		
		JPanel infReserva_1 = new JPanel();
		infReserva_1.setLayout(null);
		infReserva_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133), new Color(133, 184, 133)));
		infReserva_1.setBackground(new Color(236, 244, 236));
		infReserva_1.setBounds(12, 35, 356, 61);
		tblBusqueFecha.add(infReserva_1);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Fecha Entrada");
		lblNewLabel_1_3_2.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel_1_3_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_3_2.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_1_3_2.setBounds(12, 0, 119, 59);
		infReserva_1.add(lblNewLabel_1_3_2);
		
		JDateChooser cldFechaBusqueda = new JDateChooser();
		cldFechaBusqueda.setDateFormatString("y/MM/d");
		cldFechaBusqueda.setBounds(149, 29, 177, 20);
		infReserva_1.add(cldFechaBusqueda);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					
				Metodos.limpiarFecha(cldFechaBusqueda);
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.setRowCount(0);
				
			}

		});
		btnLimpiar.setBounds(761, 598, 98, 39);
		tblBusqueFecha.add(btnLimpiar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//mostrarClientes();				
				Cbo.buscarFecha(cldFechaBusqueda, table);
				//Metodos.limpiar(cldFechaBusqueda);
				
			}
		});
		btnBuscar.setBounds(869, 598, 98, 39);
		tblBusqueFecha.add(btnBuscar);

	}
	
}
