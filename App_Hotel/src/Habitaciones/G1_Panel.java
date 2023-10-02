package Habitaciones;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.BevelBorder;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class G1_Panel extends JPanel {


	public G1_Panel() {
		setBounds(10, 11, 454, 578);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 454, 567);
		add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 40, 434, 216);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBackground(new Color(0, 0, 0));
		panel_2.setBounds(10, 11, 414, 59);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("G1");
		lblNewLabel_2.setFont(new Font("Castellar", Font.BOLD, 40));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(177, 0, 60, 59);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("Descripción:");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNewLabel.setBounds(10, 103, 67, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Habitación sencilla");
		lblNewLabel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(87, 103, 137, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTipo.setBounds(10, 128, 67, 14);
		panel_1.add(lblTipo);
		
		JLabel lblNewLabel_1_1 = new JLabel("Habitación doble");
		lblNewLabel_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(87, 128, 137, 14);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblUbicacin = new JLabel("Ubicación");
		lblUbicacin.setFont(new Font("Arial", Font.PLAIN, 11));
		lblUbicacin.setBounds(10, 153, 67, 14);
		panel_1.add(lblUbicacin);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Norte");
		lblNewLabel_1_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(87, 153, 74, 14);
		panel_1.add(lblNewLabel_1_1_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(270, 81, 154, 102);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblEsta = new JLabel("Estado:");
		lblEsta.setFont(new Font("Arial", Font.PLAIN, 11));
		lblEsta.setBounds(10, 11, 45, 14);
		panel_3.add(lblEsta);
		
		JLabel lblLibre = new JLabel("Libre");
		lblLibre.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblLibre.setBackground(new Color(192, 192, 192));
		lblLibre.setFont(new Font("Arial", Font.PLAIN, 11));
		lblLibre.setBounds(65, 11, 79, 14);
		panel_3.add(lblLibre);
		
		JLabel lblEstLimpieza = new JLabel("Est Limpieza ");
		lblEstLimpieza.setFont(new Font("Arial", Font.PLAIN, 11));
		lblEstLimpieza.setBounds(10, 36, 45, 14);
		panel_3.add(lblEstLimpieza);
		
		JLabel lblEstLimpieza_1 = new JLabel("Limpia");
		lblEstLimpieza_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblEstLimpieza_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblEstLimpieza_1.setBackground(Color.LIGHT_GRAY);
		lblEstLimpieza_1.setBounds(65, 36, 79, 14);
		panel_3.add(lblEstLimpieza_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(10, 267, 434, 289);
		panel.add(panel_1_1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.BLACK);
		panel_2_1.setBounds(10, 11, 414, 19);
		panel_1_1.add(panel_2_1);
		
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setFont(new Font("Arial", Font.PLAIN, 11));
		lblCliente.setBounds(10, 41, 67, 14);
		panel_1_1.add(lblCliente);
		
		JLabel lblHabitacionCLiente = new JLabel("");
		lblHabitacionCLiente.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblHabitacionCLiente.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblHabitacionCLiente.setBounds(87, 41, 137, 14);
		panel_1_1.add(lblHabitacionCLiente);
		
		JLabel lblTarifa = new JLabel("Tarifa");
		lblTarifa.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTarifa.setBounds(10, 66, 67, 14);
		panel_1_1.add(lblTarifa);
		
		JLabel lblHabitacionTarifa = new JLabel("");
		lblHabitacionTarifa.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblHabitacionTarifa.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblHabitacionTarifa.setBounds(87, 66, 137, 14);
		panel_1_1.add(lblHabitacionTarifa);
		
		JLabel lblFechaEntrada = new JLabel("Fecha Entrada");
		lblFechaEntrada.setFont(new Font("Arial", Font.PLAIN, 11));
		lblFechaEntrada.setBounds(10, 91, 79, 14);
		panel_1_1.add(lblFechaEntrada);
		
		JLabel lblHabitacionFechaEnt = new JLabel("");
		lblHabitacionFechaEnt.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblHabitacionFechaEnt.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblHabitacionFechaEnt.setBounds(87, 91, 137, 14);
		panel_1_1.add(lblHabitacionFechaEnt);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBounds(234, 41, 190, 97);
		panel_1_1.add(panel_3_1);
		
		JLabel lblFactura = new JLabel("Factura");
		lblFactura.setFont(new Font("Arial", Font.PLAIN, 11));
		lblFactura.setBounds(10, 11, 45, 14);
		panel_3_1.add(lblFactura);
		
		JLabel lblHabitaFactura = new JLabel("");
		lblHabitaFactura.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblHabitaFactura.setFont(new Font("Arial", Font.PLAIN, 11));
		lblHabitaFactura.setBackground(Color.LIGHT_GRAY);
		lblHabitaFactura.setBounds(101, 11, 79, 14);
		panel_3_1.add(lblHabitaFactura);
		
		JLabel lblEstLimpieza_2 = new JLabel("Est Limpieza ");
		lblEstLimpieza_2.setFont(new Font("Arial", Font.PLAIN, 11));
		lblEstLimpieza_2.setBounds(10, 36, 45, 14);
		panel_3_1.add(lblEstLimpieza_2);
		
		JLabel lblEstLimpieza_1_1 = new JLabel("Limpia");
		lblEstLimpieza_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblEstLimpieza_1_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblEstLimpieza_1_1.setBackground(Color.LIGHT_GRAY);
		lblEstLimpieza_1_1.setBounds(101, 36, 79, 14);
		panel_3_1.add(lblEstLimpieza_1_1);
		
		JLabel lblFechaSalida = new JLabel("Fecha Salida");
		lblFechaSalida.setFont(new Font("Arial", Font.PLAIN, 11));
		lblFechaSalida.setBounds(10, 116, 67, 14);
		panel_1_1.add(lblFechaSalida);
		
		JLabel lblHabitacionFechaSalida = new JLabel("");
		lblHabitacionFechaSalida.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblHabitacionFechaSalida.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblHabitacionFechaSalida.setBounds(87, 116, 137, 14);
		panel_1_1.add(lblHabitacionFechaSalida);
		
		JLabel lblNoches = new JLabel("Noches");
		lblNoches.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNoches.setBounds(10, 141, 67, 14);
		panel_1_1.add(lblNoches);
		
		JLabel lblHabitNoches = new JLabel("");
		lblHabitNoches.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblHabitNoches.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblHabitNoches.setBounds(87, 141, 55, 14);
		panel_1_1.add(lblHabitNoches);
		
		JLabel lblHabitNoches_1 = new JLabel("");
		lblHabitNoches_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblHabitNoches_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblHabitNoches_1.setBounds(87, 166, 55, 14);
		panel_1_1.add(lblHabitNoches_1);
		
		JLabel lblSaldo = new JLabel("Saldo");
		lblSaldo.setFont(new Font("Arial", Font.PLAIN, 11));
		lblSaldo.setBounds(10, 166, 67, 14);
		panel_1_1.add(lblSaldo);
		
		JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setLayout(null);
		panel_3_1_1.setBounds(234, 166, 190, 114);
		panel_1_1.add(panel_3_1_1);
		
		JLabel lblHabitacionASu = new JLabel("Habitacion a su cargo");
		lblHabitacionASu.setFont(new Font("Arial", Font.PLAIN, 11));
		lblHabitacionASu.setBounds(10, 11, 134, 14);
		panel_3_1_1.add(lblHabitacionASu);
		
		JLabel lblHabitaciones = new JLabel("");
		lblHabitaciones.setFont(new Font("Arial", Font.PLAIN, 11));
		lblHabitaciones.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblHabitaciones.setBackground(Color.LIGHT_GRAY);
		lblHabitaciones.setBounds(10, 36, 170, 67);
		panel_3_1_1.add(lblHabitaciones);
		
		JButton btnNewButton = new JButton("Imprimir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(135, 255, 89, 23);
		panel_1_1.add(btnNewButton);

	}
}
