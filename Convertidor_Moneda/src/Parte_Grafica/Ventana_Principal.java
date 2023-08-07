package Parte_Grafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class Ventana_Principal extends JFrame {

	private JPanel contentPane;
	public Ventana_Principal() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 475, 424);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 62, 229, 334);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Monedas");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Convertidor_Grafico pantallaMoneda = new Convertidor_Grafico ();
				pantallaMoneda.setVisible(true);
				pantallaMoneda.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(51, 36, 129, 51);
		panel.add(btnNewButton);
		
		JButton btnTemperatura = new JButton("Temperatura");
		btnTemperatura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ventana_Temperatura pantallaTemperatura = new Ventana_Temperatura();
				pantallaTemperatura.setVisible(true);
				pantallaTemperatura.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnTemperatura.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnTemperatura.setBounds(51, 109, 129, 51);
		panel.add(btnTemperatura);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSalir.setBounds(51, 237, 129, 51);
		panel.add(btnSalir);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(230, 62, 229, 334);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Ventana_Principal.class.getResource("/Imagenes/png-transparent-computer-icons-data-conversion-religious-conversion-concert-miscellaneous-trademark-logo (1).png")));
		lblNewLabel_1.setBounds(0, 43, 209, 201);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("CONVERTIDORES");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(144, 27, 170, 35);
		contentPane.add(lblNewLabel);
	}
	
	
	
}
