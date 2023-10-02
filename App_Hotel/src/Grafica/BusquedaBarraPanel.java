package Grafica;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.SoftBevelBorder;

import Com.Proyecto_Hotel.ClienteBO.ClienteBO;

import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTable;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;



public class BusquedaBarraPanel extends JPanel {
	
 
		public BusquedaBarraPanel() {
			
			
			
			
			setBounds(168, 77, 1032, 671);
			setLayout(null);
			
			JPanel MostrarPaneles = new JPanel();
			MostrarPaneles.setBounds(58, 0, 974, 673);
			add(MostrarPaneles);
			BusquedaFechaPanel Fecha = new BusquedaFechaPanel();
			mostrarpanel (Fecha, MostrarPaneles);
			
			
			
			JPanel panel_1 = new JPanel();
			panel_1.setLayout(null);
			panel_1.setBackground(new Color(57, 102, 57));
			panel_1.setBounds(0, 0, 56, 673);
			add(panel_1);
			
			JButton btnBusquedaFecha = new JButton("FECHA");
			btnBusquedaFecha.setRolloverIcon(new ImageIcon(BusquedaBarraPanel.class.getResource("/Imagenes/Fecha.png")));
			btnBusquedaFecha.setIcon(new ImageIcon(BusquedaBarraPanel.class.getResource("/Imagenes/Fecha apagado.png")));
			btnBusquedaFecha.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					BusquedaFechaPanel Fecha = new BusquedaFechaPanel();
					
					mostrarpanel (Fecha, MostrarPaneles);
					
				}
			});
			btnBusquedaFecha.setVerticalTextPosition(SwingConstants.BOTTOM);
			btnBusquedaFecha.setIconTextGap(0);
			btnBusquedaFecha.setHorizontalTextPosition(SwingConstants.CENTER);
			btnBusquedaFecha.setFont(new Font("Dialog", Font.BOLD, 12));
			btnBusquedaFecha.setContentAreaFilled(false);
			btnBusquedaFecha.setBorder(null);
			btnBusquedaFecha.setAlignmentX(0.5f);
			btnBusquedaFecha.setBounds(0, 50, 56, 64);
			panel_1.add(btnBusquedaFecha);
			
			JButton btnbusquedaCedula = new JButton("CEDULA");
			btnbusquedaCedula.setIcon(new ImageIcon(BusquedaBarraPanel.class.getResource("/Imagenes/Cedulan Apagada.png")));
			btnbusquedaCedula.setRolloverIcon(new ImageIcon(BusquedaBarraPanel.class.getResource("/Imagenes/Cedulaa.png")));
			btnbusquedaCedula.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					BusquedaCedulaPanel busquedaCedula = new BusquedaCedulaPanel();
					mostrarpanel(busquedaCedula, MostrarPaneles);
				}
			});
			btnbusquedaCedula.setVerticalTextPosition(SwingConstants.BOTTOM);
			btnbusquedaCedula.setIconTextGap(0);
			btnbusquedaCedula.setHorizontalTextPosition(SwingConstants.CENTER);
			btnbusquedaCedula.setContentAreaFilled(false);
			btnbusquedaCedula.setBorder(null);
			btnbusquedaCedula.setAlignmentX(0.5f);
			btnbusquedaCedula.setBounds(0, 137, 56, 64);
			panel_1.add(btnbusquedaCedula);
			
			
			
	}
		private void mostrarpanel(JPanel a, JPanel q) {
			a.setSize(974, 673);
			a.setLocation(0,0);
			
			q.removeAll();
			q.setLayout(null);
			q.add(a, BorderLayout.CENTER);
			q.revalidate();
			q.repaint();
			
		}
}
