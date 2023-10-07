package Grafica;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Cursor;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import com.toedter.calendar.JCalendar;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana_Principal extends JFrame {
	
	private JPanel contentPane;
	private JCalendar calendar; 
 
	
	
		
	public Ventana_Principal() { 
		
		
		
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null); 
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 0));
		panel.setBounds(168, 27, 1032, 52);
		contentPane.add(panel);
		
		JPanel tabla = new JPanel();
		tabla.setBounds(168, 79, 1032, 671);
		contentPane.add(tabla);
		
		JPanel Menu = new JPanel();
		Menu.setBackground(new Color(55, 102, 57));
		Menu.setBounds(0, 27, 169, 723);
		contentPane.add(Menu);
		Menu.setLayout(null);  
		 
		JLabel Logo1 = new JLabel("TRAVEL NATURAL");
		Logo1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		Logo1.setIcon(new ImageIcon(Ventana_Principal.class.getResource("/Imagenes/pngtree-women-nature-logo-png-image_7598785.png")));
		Logo1.setHorizontalAlignment(SwingConstants.LEFT);
		Logo1.setForeground(new Color(200, 200, 200));
		Logo1.setBounds(12, 0, 157, 103);
		Menu.add(Logo1);
		
		JButton btnHabitacion = new JButton("Habitaciones");
		btnHabitacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				HabitacioPanel habitacion = new HabitacioPanel();
				mostrarPanel (habitacion,tabla);
				
			}
		}); 
		btnHabitacion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnHabitacion.setForeground(Color.white);
	
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnHabitacion.setForeground(new Color(200,200,200));
			}
			
		});
		btnHabitacion.setHorizontalAlignment(SwingConstants.LEFT);
		btnHabitacion.setForeground(new Color(200, 200, 200));
		btnHabitacion.setBorder(null);
		btnHabitacion.setContentAreaFilled(false);
		btnHabitacion.setRolloverIcon(new ImageIcon(Ventana_Principal.class.getResource("/Imagenes/yellow_single-room_icon-icons.com_59593.png")));
		btnHabitacion.setPressedIcon(new ImageIcon(Ventana_Principal.class.getResource("/Imagenes/yellow_single-room_icon-icons.com_59593.png")));
		btnHabitacion.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnHabitacion.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnHabitacion.setFont(new Font("Dialog", Font.BOLD, 12));
		btnHabitacion.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHabitacion.setIcon(new ImageIcon(Ventana_Principal.class.getResource("/Imagenes/Habitacion apagado.png")));
		btnHabitacion.setBounds(22, 115, 135, 40);
		Menu.add(btnHabitacion);
		
		JButton btnRegistro = new JButton("Registrar"); 
		btnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registropanel registro = new Registropanel();
				mostrarPanel (registro,tabla);
				
			}
		});
		btnRegistro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnRegistro.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnRegistro.setForeground(new Color(200,200,200));
			}
		});
		btnRegistro.setForeground(new Color(200, 200, 200));
		btnRegistro.setBorder(null);
		btnRegistro.setContentAreaFilled(false);
		btnRegistro.setPressedIcon(new ImageIcon(Ventana_Principal.class.getResource("/Imagenes/ingresox45.png")));
		btnRegistro.setRolloverIcon(new ImageIcon(Ventana_Principal.class.getResource("/Imagenes/ingresox45.png")));
		btnRegistro.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnRegistro.setHorizontalAlignment(SwingConstants.LEFT);
		btnRegistro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRegistro.setIcon(new ImageIcon(Ventana_Principal.class.getResource("/Imagenes/Datos apagados.png")));
		btnRegistro.setAlignmentX(0.5f);
		btnRegistro.setBounds(22, 167, 135, 40);
		Menu.add(btnRegistro);
		
		JButton btnBusqueda = new JButton("Busqueda");
		btnBusqueda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BusquedaBarraPanel BusquedaFecha = new BusquedaBarraPanel();
				mostrarPanel(BusquedaFecha, tabla);
				
			}
		});
		btnBusqueda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnBusqueda.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnBusqueda.setForeground(new Color(200,200,200));
			}
		});
		btnBusqueda.setForeground(new Color(200, 200, 200));
		btnBusqueda.setBorder(null);
		btnBusqueda.setContentAreaFilled(false);
		btnBusqueda.setPressedIcon(new ImageIcon(Ventana_Principal.class.getResource("/Imagenes/busqueda pequeño.png")));
		btnBusqueda.setRolloverIcon(new ImageIcon(Ventana_Principal.class.getResource("/Imagenes/busqueda pequeño.png")));
		btnBusqueda.setIcon(new ImageIcon(Ventana_Principal.class.getResource("/Imagenes/buscar apagado.png")));
		btnBusqueda.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnBusqueda.setHorizontalAlignment(SwingConstants.LEFT);
		btnBusqueda.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBusqueda.setAlignmentX(0.5f);
		btnBusqueda.setBounds(22, 219, 135, 40);
		Menu.add(btnBusqueda);
		
		JButton btnReporte = new JButton("Reporte");
		btnReporte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnReporte.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnReporte.setForeground(new Color(200,200,200));
			}
		});
		btnReporte.setForeground(new Color(200, 200, 200));
		btnReporte.setBorder(null);
		btnReporte.setContentAreaFilled(false);
		btnReporte.setPressedIcon(new ImageIcon(Ventana_Principal.class.getResource("/Imagenes/informex45.png")));
		btnReporte.setRolloverIcon(new ImageIcon(Ventana_Principal.class.getResource("/Imagenes/informex45.png")));
		btnReporte.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnReporte.setIcon(new ImageIcon(Ventana_Principal.class.getResource("/Imagenes/reporte apagado.png")));
		btnReporte.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnReporte.setHorizontalAlignment(SwingConstants.LEFT);
		btnReporte.setAlignmentX(0.5f);
		btnReporte.setBounds(22, 271, 135, 40);
		Menu.add(btnReporte);
		
		JPanel Barra = new JPanel();
		Barra.setBackground(new Color(248, 248, 248));
		Barra.setBounds(0, 0, 1200, 27);
		contentPane.add(Barra);
		Barra.setLayout(null);
		
		JLabel btnCerrar2 = new JLabel("X");
		btnCerrar2.setForeground(new Color(51, 51, 51));
		btnCerrar2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int opcion2 = JOptionPane.showConfirmDialog(null,"¿Estas seguro que deseas cerrar la aplicacion?","Confirmar cierre",JOptionPane.YES_NO_OPTION);
				if (opcion2 == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnCerrar2.setForeground(Color.red);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				btnCerrar2.setForeground(new Color(51,51,51));
			}
		});
		btnCerrar2.setHorizontalTextPosition(SwingConstants.LEADING);
		btnCerrar2.setHorizontalAlignment(SwingConstants.CENTER);
		btnCerrar2.setFont(new Font("Arial Black", Font.BOLD, 28));
		btnCerrar2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCerrar2.setBounds(1157, 0, 31, 28);
		Barra.add(btnCerrar2);
		
	
		
		HabitacioPanel habitacion = new HabitacioPanel();
			habitacion.setSize(1032, 671);
			habitacion.setLocation(0,0);
			tabla.removeAll();
			tabla.setLayout(null);
			tabla.add(habitacion, BorderLayout.CENTER);
			tabla.revalidate();
			tabla.repaint();
		
		
		}

	private void mostrarPanel(JPanel p, Container c) {
		p.setSize(1032, 671);
		p.setLocation(0,0);
		
		c.removeAll();
		c.setLayout(null);
		c.add(p, BorderLayout.CENTER);
		c.revalidate();
		c.repaint();
		
	}
}
