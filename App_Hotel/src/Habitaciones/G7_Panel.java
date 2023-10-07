package Habitaciones;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.border.BevelBorder;

public class G7_Panel extends JPanel {

	
	public G7_Panel() {
		setBounds(10, 11, 454, 578);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 454, 578);
		add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 434, 216);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBackground(new Color(0, 0, 0));
		panel_2.setBounds(10, 11, 414, 59);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("G7");
		lblNewLabel_2.setFont(new Font("Castellar", Font.BOLD, 40));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(177, 0, 60, 59);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("Descripción:");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNewLabel.setBounds(10, 81, 67, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Habitación sencilla");
		lblNewLabel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(87, 81, 137, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTipo.setBounds(10, 106, 67, 14);
		panel_1.add(lblTipo);
		
		JLabel lblNewLabel_1_1 = new JLabel("Habitación doble");
		lblNewLabel_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(87, 106, 137, 14);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblUbicacin = new JLabel("Ubicación");
		lblUbicacin.setFont(new Font("Arial", Font.PLAIN, 11));
		lblUbicacin.setBounds(10, 131, 67, 14);
		panel_1.add(lblUbicacin);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Norte");
		lblNewLabel_1_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(87, 131, 74, 14);
		panel_1.add(lblNewLabel_1_1_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(234, 81, 190, 124);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblEsta = new JLabel("Estado:");
		lblEsta.setFont(new Font("Arial", Font.PLAIN, 11));
		lblEsta.setBounds(10, 69, 45, 14);
		panel_3.add(lblEsta);
		
		JLabel lblLibre = new JLabel("Libre");
		lblLibre.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblLibre.setBackground(new Color(192, 192, 192));
		lblLibre.setFont(new Font("Arial", Font.PLAIN, 11));
		lblLibre.setBounds(65, 69, 79, 14);
		panel_3.add(lblLibre);
		
		JLabel lblEstLimpieza = new JLabel("Est Limpieza ");
		lblEstLimpieza.setFont(new Font("Arial", Font.PLAIN, 11));
		lblEstLimpieza.setBounds(10, 85, 45, 14);
		panel_3.add(lblEstLimpieza);
		
		JLabel lblEstLimpieza_1 = new JLabel("Limpia");
		lblEstLimpieza_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblEstLimpieza_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblEstLimpieza_1.setBackground(Color.LIGHT_GRAY);
		lblEstLimpieza_1.setBounds(65, 85, 79, 14);
		panel_3.add(lblEstLimpieza_1);
		
		JLabel lblFactura = new JLabel("Factura");
		lblFactura.setBounds(10, 99, 45, 14);
		panel_3.add(lblFactura);
		lblFactura.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel lblHabitaFactura = new JLabel("");
		lblHabitaFactura.setBounds(65, 99, 79, 14);
		panel_3.add(lblHabitaFactura);
		lblHabitaFactura.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblHabitaFactura.setFont(new Font("Arial", Font.PLAIN, 11));
		lblHabitaFactura.setBackground(Color.LIGHT_GRAY);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 11, 170, 52);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNoche = new JLabel("Entrada");
		lblNoche.setBounds(10, 27, 45, 14);
		panel_4.add(lblNoche);
		lblNoche.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel lblHabitaFactura_1 = new JLabel("");
		lblHabitaFactura_1.setBounds(55, 27, 28, 14);
		panel_4.add(lblHabitaFactura_1);
		lblHabitaFactura_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblHabitaFactura_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblHabitaFactura_1.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblSalida = new JLabel("Salida");
		lblSalida.setBounds(93, 27, 45, 14);
		panel_4.add(lblSalida);
		lblSalida.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel lblHabitaFactura_1_1 = new JLabel("");
		lblHabitaFactura_1_1.setBounds(132, 27, 28, 14);
		panel_4.add(lblHabitaFactura_1_1);
		lblHabitaFactura_1_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblHabitaFactura_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblHabitaFactura_1_1.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblHorario = new JLabel("Horario");
		lblHorario.setFont(new Font("Arial", Font.PLAIN, 11));
		lblHorario.setBounds(55, 0, 45, 14);
		panel_4.add(lblHorario);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(10, 238, 434, 289);
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
		lblHabitacionCLiente.setBounds(87, 41, 127, 14);
		panel_1_1.add(lblHabitacionCLiente);
		
		JLabel lblTarifa = new JLabel("Celular");
		lblTarifa.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTarifa.setBounds(10, 66, 67, 14);
		panel_1_1.add(lblTarifa);
		
		JLabel lblHabitacionCelular = new JLabel("");
		lblHabitacionCelular.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblHabitacionCelular.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblHabitacionCelular.setBounds(87, 66, 127, 14);
		panel_1_1.add(lblHabitacionCelular);
		
		JLabel lblFechaEntrada = new JLabel("Fecha Entrada");
		lblFechaEntrada.setFont(new Font("Arial", Font.PLAIN, 11));
		lblFechaEntrada.setBounds(10, 91, 79, 14);
		panel_1_1.add(lblFechaEntrada);
		
		JLabel lblHabitacionFechaEnt = new JLabel("");
		lblHabitacionFechaEnt.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblHabitacionFechaEnt.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblHabitacionFechaEnt.setBounds(97, 91, 117, 14);
		panel_1_1.add(lblHabitacionFechaEnt);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBounds(242, 138, 182, 140);
		panel_1_1.add(panel_3_1);
		
		JLabel lblNoches = new JLabel("1");
		lblNoches.setBounds(33, 24, 6, 14);
		panel_3_1.add(lblNoches);
		lblNoches.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel lblHabitNoches = new JLabel("");
		lblHabitNoches.setBounds(20, 40, 30, 14);
		panel_3_1.add(lblHabitNoches);
		lblHabitNoches.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblHabitNoches.setFont(new Font("Arial Black", Font.PLAIN, 12));
		
		JLabel lblSaldo = new JLabel("Saldo");
		lblSaldo.setBounds(20, 115, 47, 14);
		panel_3_1.add(lblSaldo);
		lblSaldo.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel lblHabitSaldo = new JLabel("");
		lblHabitSaldo.setBounds(71, 115, 75, 14);
		panel_3_1.add(lblHabitSaldo);
		lblHabitSaldo.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblHabitSaldo.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		JLabel lblHabitCuenta = new JLabel("");
		lblHabitCuenta.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblHabitCuenta.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblHabitCuenta.setBounds(71, 65, 75, 14);
		panel_3_1.add(lblHabitCuenta);
		
		JLabel lblCuenta = new JLabel("Cuenta");
		lblCuenta.setFont(new Font("Arial", Font.PLAIN, 11));
		lblCuenta.setBounds(20, 65, 47, 14);
		panel_3_1.add(lblCuenta);
		
		JLabel lblHabitPagos = new JLabel("");
		lblHabitPagos.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblHabitPagos.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblHabitPagos.setBounds(71, 90, 75, 14);
		panel_3_1.add(lblHabitPagos);
		
		JLabel lblPagos = new JLabel("Pagos");
		lblPagos.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPagos.setBounds(20, 90, 47, 14);
		panel_3_1.add(lblPagos);
		
		JLabel lblNoches_1 = new JLabel("2");
		lblNoches_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNoches_1.setBounds(84, 24, 6, 14);
		panel_3_1.add(lblNoches_1);
		
		JLabel lblHabitNoches_1 = new JLabel("");
		lblHabitNoches_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblHabitNoches_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblHabitNoches_1.setBounds(71, 40, 30, 14);
		panel_3_1.add(lblHabitNoches_1);
		
		JLabel lblNoches_2 = new JLabel("3");
		lblNoches_2.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNoches_2.setBounds(129, 24, 6, 14);
		panel_3_1.add(lblNoches_2);
		
		JLabel lblHabitNoches_2 = new JLabel("");
		lblHabitNoches_2.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblHabitNoches_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblHabitNoches_2.setBounds(116, 40, 30, 14);
		panel_3_1.add(lblHabitNoches_2);
		
		JLabel lblComidas = new JLabel("Comidas");
		lblComidas.setFont(new Font("Arial", Font.PLAIN, 11));
		lblComidas.setBounds(20, 11, 47, 14);
		panel_3_1.add(lblComidas);
		
		JLabel lblFechaSalida = new JLabel("Fecha Salida");
		lblFechaSalida.setFont(new Font("Arial", Font.PLAIN, 11));
		lblFechaSalida.setBounds(10, 116, 67, 14);
		panel_1_1.add(lblFechaSalida);
		
		JLabel lblHabitacionFechaSalida = new JLabel("");
		lblHabitacionFechaSalida.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblHabitacionFechaSalida.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblHabitacionFechaSalida.setBounds(97, 116, 117, 14);
		panel_1_1.add(lblHabitacionFechaSalida);
		
		JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setLayout(null);
		panel_3_1_1.setBounds(242, 41, 182, 95);
		panel_1_1.add(panel_3_1_1);
		
		JLabel lblHabitacionASu = new JLabel("Habitacionones");
		lblHabitacionASu.setFont(new Font("Arial", Font.PLAIN, 11));
		lblHabitacionASu.setBounds(10, 11, 80, 14);
		panel_3_1_1.add(lblHabitacionASu);
		
		JLabel lblHabitaciones = new JLabel("");
		lblHabitaciones.setFont(new Font("Arial", Font.PLAIN, 11));
		lblHabitaciones.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblHabitaciones.setBackground(Color.LIGHT_GRAY);
		lblHabitaciones.setBounds(10, 25, 162, 58);
		panel_3_1_1.add(lblHabitaciones);
		
		JLabel lblFechaReserva = new JLabel("Fecha Reserva");
		lblFechaReserva.setFont(new Font("Arial", Font.PLAIN, 11));
		lblFechaReserva.setBounds(10, 138, 79, 14);
		panel_1_1.add(lblFechaReserva);
		
		JLabel lblHabitacionFechaSalida_1 = new JLabel("");
		lblHabitacionFechaSalida_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblHabitacionFechaSalida_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblHabitacionFechaSalida_1.setBounds(97, 138, 117, 14);
		panel_1_1.add(lblHabitacionFechaSalida_1);
		
		JPanel panel_3_1_1_1 = new JPanel();
		panel_3_1_1_1.setLayout(null);
		panel_3_1_1_1.setBounds(10, 183, 222, 95);
		panel_1_1.add(panel_3_1_1_1);
		
		JLabel lblComentario = new JLabel("Comentario");
		lblComentario.setFont(new Font("Arial", Font.PLAIN, 11));
		lblComentario.setBounds(10, 11, 68, 14);
		panel_3_1_1_1.add(lblComentario);
		
		JLabel lblDescripcion = new JLabel("");
		lblDescripcion.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDescripcion.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblDescripcion.setBackground(Color.LIGHT_GRAY);
		lblDescripcion.setBounds(10, 24, 202, 59);
		panel_3_1_1_1.add(lblDescripcion);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setBounds(355, 538, 89, 23);
		panel.add(btnImprimir);
		
		JButton btnWhatsapp = new JButton("Whatsapp");
		btnWhatsapp.setBounds(256, 538, 89, 23);
		panel.add(btnWhatsapp);
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

	}
}



	