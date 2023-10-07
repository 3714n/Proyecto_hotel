package Grafica;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Color;
import com.toedter.calendar.JDateChooser;

import Habitaciones.*;
import Logica.Metodos;

import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;

public class HabitacioPanel extends JPanel {
	private JPanel MostrarHabitacion;

	public HabitacioPanel() {
		setBounds(168, 77, 1032, 673);
		setLayout(null);
		
		JPanel tblHabitacion = new JPanel();
		tblHabitacion.setLayout(null);
		tblHabitacion.setBounds(0, 0, 1032, 673);
		add(tblHabitacion);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(10, 62, 528, 600);
		tblHabitacion.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 11, 508, 178);
		panel_2.add(panel);
		panel.setLayout(null);
		
		JLabel btnG1 = new JLabel("G1");
		btnG1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnG1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				G1_Panel G1 = new G1_Panel();					
				Metodos.mostrarHabitaciones (G1,MostrarHabitacion);
			}
		});
		btnG1.setBounds(20, 11, 85, 72);
		panel.add(btnG1);
		btnG1.setIcon(new ImageIcon(HabitacioPanel.class.getResource("/Imagenes/HabitacionDisponible.png")));
		btnG1.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnG1.setVerticalAlignment(SwingConstants.TOP);
		btnG1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnG1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel btnG2 = new JLabel("G2");
		btnG2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnG2.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				G2_Panel G2 = new G2_Panel();					
				Metodos.mostrarHabitaciones (G2,MostrarHabitacion);
			}
		});
		btnG2.setBounds(115, 11, 85, 72);
		panel.add(btnG2);
		btnG2.setIcon(new ImageIcon(HabitacioPanel.class.getResource("/Imagenes/HabitacionDisponible.png")));
		btnG2.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnG2.setVerticalAlignment(SwingConstants.TOP);
		btnG2.setHorizontalTextPosition(SwingConstants.CENTER);
		btnG2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel btnG3 = new JLabel("G3");
		btnG3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnG3.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				G3_Panel G3 = new G3_Panel();					
				Metodos.mostrarHabitaciones (G3,MostrarHabitacion);
			}
		});
		btnG3.setBounds(210, 11, 85, 72);
		panel.add(btnG3);
		btnG3.setIcon(new ImageIcon(HabitacioPanel.class.getResource("/Imagenes/HabitacionDisponible.png")));
		btnG3.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnG3.setVerticalAlignment(SwingConstants.TOP);
		btnG3.setHorizontalTextPosition(SwingConstants.CENTER);
		btnG3.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel btnG4 = new JLabel("G4");
		btnG4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnG4.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				G4_Panel G4 = new G4_Panel();					
				Metodos.mostrarHabitaciones (G4,MostrarHabitacion);
			}
		});
		btnG4.setBounds(305, 11, 85, 72);
		panel.add(btnG4);
		btnG4.setIcon(new ImageIcon(HabitacioPanel.class.getResource("/Imagenes/HabitacionDisponible.png")));
		btnG4.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnG4.setVerticalAlignment(SwingConstants.TOP);
		btnG4.setHorizontalTextPosition(SwingConstants.CENTER);
		btnG4.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel btnG5 = new JLabel("G5");
		btnG5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnG5.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				G5_Panel G5 = new G5_Panel();					
				Metodos.mostrarHabitaciones (G5,MostrarHabitacion);
			}
		});
		btnG5.setBounds(400, 11, 85, 72);
		panel.add(btnG5);
		btnG5.setIcon(new ImageIcon(HabitacioPanel.class.getResource("/Imagenes/HabitacionDisponible.png")));
		btnG5.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnG5.setVerticalAlignment(SwingConstants.TOP);
		btnG5.setHorizontalTextPosition(SwingConstants.CENTER);
		btnG5.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel btnG6 = new JLabel("G6");
		btnG6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnG6.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				G6_Panel G6 = new G6_Panel();					
				Metodos.mostrarHabitaciones (G6,MostrarHabitacion);
			}
		});
		btnG6.setIcon(new ImageIcon(HabitacioPanel.class.getResource("/Imagenes/HabitacionDisponible.png")));
		btnG6.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnG6.setVerticalAlignment(SwingConstants.TOP);
		btnG6.setHorizontalTextPosition(SwingConstants.CENTER);
		btnG6.setHorizontalAlignment(SwingConstants.CENTER);
		btnG6.setBounds(20, 94, 85, 72);
		panel.add(btnG6);
		
		JLabel btnG7 = new JLabel("G7");
		btnG7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnG7.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				G7_Panel G7 = new G7_Panel();					
				Metodos.mostrarHabitaciones (G7,MostrarHabitacion);
			}
		});
		btnG7.setIcon(new ImageIcon(HabitacioPanel.class.getResource("/Imagenes/HabitacionDisponible.png")));
		btnG7.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnG7.setVerticalAlignment(SwingConstants.TOP);
		btnG7.setHorizontalTextPosition(SwingConstants.CENTER);
		btnG7.setHorizontalAlignment(SwingConstants.CENTER);
		btnG7.setBounds(115, 94, 85, 72);
		panel.add(btnG7);
		
		JLabel btnG8 = new JLabel("G8");
		btnG8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnG8.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				G8_Panel G8 = new G8_Panel();					
				Metodos.mostrarHabitaciones (G8,MostrarHabitacion);
			}
		});
		btnG8.setIcon(new ImageIcon(HabitacioPanel.class.getResource("/Imagenes/HabitacionDisponible.png")));
		btnG8.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnG8.setVerticalAlignment(SwingConstants.TOP);
		btnG8.setHorizontalTextPosition(SwingConstants.CENTER);
		btnG8.setHorizontalAlignment(SwingConstants.CENTER);
		btnG8.setBounds(210, 94, 85, 72);
		panel.add(btnG8);
		
		JLabel btnG9 = new JLabel("G9");
		btnG9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnG9.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				G9_Panel G9 = new G9_Panel();					
				Metodos.mostrarHabitaciones (G9,MostrarHabitacion);
			}
		});
		btnG9.setIcon(new ImageIcon(HabitacioPanel.class.getResource("/Imagenes/HabitacionDisponible.png")));
		btnG9.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnG9.setVerticalAlignment(SwingConstants.TOP);
		btnG9.setHorizontalTextPosition(SwingConstants.CENTER);
		btnG9.setHorizontalAlignment(SwingConstants.CENTER);
		btnG9.setBounds(305, 94, 85, 72);
		panel.add(btnG9);
		
		JLabel btnG10 = new JLabel("G10");
		btnG10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnG10.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				G10_Panel G10 = new G10_Panel();					
				Metodos.mostrarHabitaciones (G10,MostrarHabitacion);
			}
		});
		btnG10.setIcon(new ImageIcon(HabitacioPanel.class.getResource("/Imagenes/HabitacionDisponible.png")));
		btnG10.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnG10.setVerticalAlignment(SwingConstants.TOP);
		btnG10.setHorizontalTextPosition(SwingConstants.CENTER);
		btnG10.setHorizontalAlignment(SwingConstants.CENTER);
		btnG10.setBounds(400, 94, 85, 72);
		panel.add(btnG10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setLayout(null);
		panel_1.setBounds(10, 200, 508, 178);
		panel_2.add(panel_1);
		
		JLabel btnC1 = new JLabel("C1");
		btnC1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnC1.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				C1_Panel C1 = new C1_Panel();					
				Metodos.mostrarHabitaciones (C1,MostrarHabitacion);
			}
		});
		btnC1.setIcon(new ImageIcon(HabitacioPanel.class.getResource("/Imagenes/HabitacionDisponible.png")));
		btnC1.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnC1.setVerticalAlignment(SwingConstants.TOP);
		btnC1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnC1.setHorizontalAlignment(SwingConstants.CENTER);
		btnC1.setBounds(20, 11, 85, 72);
		panel_1.add(btnC1);
		
		JLabel btnC2 = new JLabel("C2");
		btnC2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnC2.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				C2_Panel C2 = new C2_Panel();					
				Metodos.mostrarHabitaciones (C2,MostrarHabitacion);
			}
		});
		btnC2.setIcon(new ImageIcon(HabitacioPanel.class.getResource("/Imagenes/HabitacionDisponible.png")));
		btnC2.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnC2.setVerticalAlignment(SwingConstants.TOP);
		btnC2.setHorizontalTextPosition(SwingConstants.CENTER);
		btnC2.setHorizontalAlignment(SwingConstants.CENTER);
		btnC2.setBounds(115, 11, 85, 72);
		panel_1.add(btnC2);
		
		JLabel btnC3 = new JLabel("C3");
		btnC3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnC3.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				C3_Panel C3 = new C3_Panel();					
				Metodos.mostrarHabitaciones (C3,MostrarHabitacion);
			}
		});
		btnC3.setIcon(new ImageIcon(HabitacioPanel.class.getResource("/Imagenes/HabitacionDisponible.png")));
		btnC3.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnC3.setVerticalAlignment(SwingConstants.TOP);
		btnC3.setHorizontalTextPosition(SwingConstants.CENTER);
		btnC3.setHorizontalAlignment(SwingConstants.CENTER);
		btnC3.setBounds(210, 11, 85, 72);
		panel_1.add(btnC3);
		
		JLabel btnC4 = new JLabel("C4");
		btnC4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnC4.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				C4_Panel C4 = new C4_Panel();					
				Metodos.mostrarHabitaciones (C4,MostrarHabitacion);
			}
		});
		btnC4.setIcon(new ImageIcon(HabitacioPanel.class.getResource("/Imagenes/HabitacionDisponible.png")));
		btnC4.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnC4.setVerticalAlignment(SwingConstants.TOP);
		btnC4.setHorizontalTextPosition(SwingConstants.CENTER);
		btnC4.setHorizontalAlignment(SwingConstants.CENTER);
		btnC4.setBounds(305, 11, 85, 72);
		panel_1.add(btnC4);
		
		JLabel btnC5 = new JLabel("C5");
		btnC5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnC5.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				C5_Panel C5 = new C5_Panel();					
				Metodos.mostrarHabitaciones (C5,MostrarHabitacion);
			}
		});
		btnC5.setIcon(new ImageIcon(HabitacioPanel.class.getResource("/Imagenes/HabitacionDisponible.png")));
		btnC5.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnC5.setVerticalAlignment(SwingConstants.TOP);
		btnC5.setHorizontalTextPosition(SwingConstants.CENTER);
		btnC5.setHorizontalAlignment(SwingConstants.CENTER);
		btnC5.setBounds(400, 11, 85, 72);
		panel_1.add(btnC5);
		
		JLabel btnC6 = new JLabel("C6");
		btnC6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnC6.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				C6_Panel C6 = new C6_Panel();					
				Metodos.mostrarHabitaciones (C6,MostrarHabitacion);
			}
		});
		btnC6.setIcon(new ImageIcon(HabitacioPanel.class.getResource("/Imagenes/HabitacionDisponible.png")));
		btnC6.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnC6.setVerticalAlignment(SwingConstants.TOP);
		btnC6.setHorizontalTextPosition(SwingConstants.CENTER);
		btnC6.setHorizontalAlignment(SwingConstants.CENTER);
		btnC6.setBounds(20, 95, 85, 72);
		panel_1.add(btnC6);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setLayout(null);
		panel_3.setBounds(10, 389, 508, 200);
		panel_2.add(panel_3);
		
		JLabel btnA1 = new JLabel("A1");
		btnA1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnA1.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				A1_Panel A1 = new A1_Panel();					
				Metodos.mostrarHabitaciones (A1,MostrarHabitacion);
			}
		});
		btnA1.setIcon(new ImageIcon(HabitacioPanel.class.getResource("/Imagenes/HabitacionDisponible.png")));
		btnA1.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnA1.setVerticalAlignment(SwingConstants.TOP);
		btnA1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnA1.setHorizontalAlignment(SwingConstants.CENTER);
		btnA1.setBounds(20, 11, 85, 72);
		panel_3.add(btnA1);
		
		JLabel btnA2 = new JLabel("A2");
		btnA2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnA2.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				A2_Panel A2 = new A2_Panel();					
				Metodos.mostrarHabitaciones (A2,MostrarHabitacion);
			}
		});
		btnA2.setIcon(new ImageIcon(HabitacioPanel.class.getResource("/Imagenes/HabitacionDisponible.png")));
		btnA2.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnA2.setVerticalAlignment(SwingConstants.TOP);
		btnA2.setHorizontalTextPosition(SwingConstants.CENTER);
		btnA2.setHorizontalAlignment(SwingConstants.CENTER);
		btnA2.setBounds(115, 11, 85, 72);
		panel_3.add(btnA2);
		
		JLabel btnA3 = new JLabel("A3");
		btnA3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnA3.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				A3_Panel A3 = new A3_Panel();					
				Metodos.mostrarHabitaciones (A3,MostrarHabitacion);
			}
		});
		btnA3.setIcon(new ImageIcon(HabitacioPanel.class.getResource("/Imagenes/HabitacionDisponible.png")));
		btnA3.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnA3.setVerticalAlignment(SwingConstants.TOP);
		btnA3.setHorizontalTextPosition(SwingConstants.CENTER);
		btnA3.setHorizontalAlignment(SwingConstants.CENTER);
		btnA3.setBounds(210, 11, 85, 72);
		panel_3.add(btnA3);
		
		JLabel btnA4 = new JLabel("A4");
		btnA4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnA4.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				A4_Panel A4 = new A4_Panel();					
				Metodos.mostrarHabitaciones (A4,MostrarHabitacion);
			}
		});
		btnA4.setIcon(new ImageIcon(HabitacioPanel.class.getResource("/Imagenes/HabitacionDisponible.png")));
		btnA4.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnA4.setVerticalAlignment(SwingConstants.TOP);
		btnA4.setHorizontalTextPosition(SwingConstants.CENTER);
		btnA4.setHorizontalAlignment(SwingConstants.CENTER);
		btnA4.setBounds(305, 11, 85, 72);
		panel_3.add(btnA4);
		
		JLabel btnA5 = new JLabel("A5");
		btnA5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnA5.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				A5_Panel A5 = new A5_Panel();					
				Metodos.mostrarHabitaciones (A5,MostrarHabitacion);
			}
		});
		btnA5.setIcon(new ImageIcon(HabitacioPanel.class.getResource("/Imagenes/HabitacionDisponible.png")));
		btnA5.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnA5.setVerticalAlignment(SwingConstants.TOP);
		btnA5.setHorizontalTextPosition(SwingConstants.CENTER);
		btnA5.setHorizontalAlignment(SwingConstants.CENTER);
		btnA5.setBounds(400, 11, 85, 72);
		panel_3.add(btnA5);
		
		JPanel MostralHabitaciones = new JPanel();
		MostralHabitaciones.setBorder(new LineBorder(new Color(0, 0, 0)));
		MostralHabitaciones.setBounds(548, 62, 474, 600);
		tblHabitacion.add(MostralHabitaciones);
		MostralHabitaciones.setLayout(null);
		
		MostrarHabitacion = new JPanel();
		MostrarHabitacion.setBorder(new LineBorder(new Color(0, 0, 0)));
		MostrarHabitacion.setBounds(10, 11, 454, 578);
		MostralHabitaciones.add(MostrarHabitacion);
		
		JDateChooser cldFecha = new JDateChooser();
		cldFecha.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		cldFecha.setDateFormatString("y/MM/d");
		cldFecha.setBounds(64, 25, 153, 26);
		tblHabitacion.add(cldFecha);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBuscar.setBounds(272, 25, 99, 26);
		tblHabitacion.add(btnBuscar);

	}
}
