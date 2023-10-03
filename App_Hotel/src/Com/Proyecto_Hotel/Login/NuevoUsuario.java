package Com.Proyecto_Hotel.Login;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.ComponentOrientation;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import Com.Proyecto_Hotel.ClienteBO.FuncionarioBO;
import Com.Proyecto_Hotel.Funsionario.Funcionarios;
import Logica.Metodos;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class NuevoUsuario extends JFrame {

	private JPanel contentPane;
	private JLabel btn_Cerrar;
	private JTextField txtNombre;
	private JTextField txtCedula;
	private JTextField txtDireccion;
	private JTextField txtUsuario;
	private JPasswordField txtContraceña;
	private JPasswordField TxtContraceña2;
	private JLabel Verificar;
	
	
	FuncionarioBO fbo = new FuncionarioBO();
	Funcionarios fcn = new Funcionarios();
	private JTextField txtTelefono;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NuevoUsuario frame = new NuevoUsuario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NuevoUsuario() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		panel.setBackground(new Color(236, 244, 236));
		panel.setBounds(0, 0, 500, 461);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NUEVO USUARIO");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 46));
		lblNewLabel.setBounds(0, 22, 500, 44);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(255, 255, 255));
		panel_1.setBackground(new Color(13, 60, 35));
		panel_1.setBounds(0, 0, 500, 22);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		btn_Cerrar = new JLabel("x");
		btn_Cerrar.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_Cerrar.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_Cerrar.setBounds(467, 0, 33, 30);
		panel_1.add(btn_Cerrar);
		btn_Cerrar.setHorizontalAlignment(SwingConstants.CENTER);
		btn_Cerrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas cerrar la aplicación?", "Confirmar Cierre", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    System.exit(0);
			}
		}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_Cerrar.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btn_Cerrar.setForeground(Color.white);
			}
		});
		btn_Cerrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_Cerrar.setForeground(new Color(255, 255, 255));
		btn_Cerrar.setFont(new Font("Arial Black", Font.PLAIN, 34));
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 77, 88, 27);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Cedula");
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(10, 115, 88, 27);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Dirección:");
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_1_2.setBounds(10, 187, 88, 27);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Usuario:");
		lblNewLabel_1_2_1.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_1_2_1.setBounds(10, 284, 88, 27);
		panel.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("Contraceña:");
		lblNewLabel_1_2_3.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_1_2_3.setBounds(10, 322, 95, 27);
		panel.add(lblNewLabel_1_2_3);
		
		JLabel lblNewLabel_1_2_3_1 = new JLabel("Confirmar:");
		lblNewLabel_1_2_3_1.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_1_2_3_1.setBounds(10, 360, 95, 27);
		panel.add(lblNewLabel_1_2_3_1);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtNombre.setBounds(130, 80, 277, 25);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCedula = new JTextField();
		txtCedula.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtCedula.setColumns(10);
		txtCedula.setBounds(130, 118, 277, 25);
		panel.add(txtCedula);
		
		txtDireccion = new JTextField();
		txtDireccion.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(130, 190, 277, 25);
		panel.add(txtDireccion);
		
		txtUsuario = new JTextField();
		txtUsuario.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtUsuario.setColumns(10);
		txtUsuario.setBounds(130, 284, 277, 25);
		panel.add(txtUsuario);
		
		txtContraceña = new JPasswordField();
		txtContraceña.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtContraceña.setBounds(130, 322, 277, 25);
		panel.add(txtContraceña);
		
		TxtContraceña2 = new JPasswordField();
		TxtContraceña2.setFont(new Font("Dialog", Font.PLAIN, 12));
		TxtContraceña2.setBounds(130, 360, 277, 25);
		panel.add(TxtContraceña2);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Telefono:");
		lblNewLabel_1_2_2.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_1_2_2.setBounds(10, 153, 88, 27);
		panel.add(lblNewLabel_1_2_2);
		
		txtTelefono = new JTextField();
		txtTelefono.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(130, 154, 277, 25);
		panel.add(txtTelefono);
		
		Verificar = new JLabel("");
		Verificar.setForeground(new Color(255, 0, 0));
		Verificar.setBackground(new Color(236, 244, 236));
		Verificar.setBounds(130, 385, 277, 14);
		panel.add(Verificar);
		
		JLabel lblNewLabel_1_2_4 = new JLabel("Roll");
		lblNewLabel_1_2_4.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_1_2_4.setBounds(10, 246, 88, 27);
		panel.add(lblNewLabel_1_2_4);
		
		JComboBox cbxRoll = new JComboBox();
		cbxRoll.setFont(new Font("Dialog", Font.BOLD, 12));
		cbxRoll.setModel(new DefaultComboBoxModel(new String[] {"Seleccionar:", "Gerente", "Administrador", "Vendedor", "Auxiliar"}));
		cbxRoll.setBounds(130, 251, 194, 22);
		panel.add(cbxRoll);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {												
				 String Nombre = txtNombre.getText();
				 String Cedula = txtCedula.getText();
				 String Direccion = txtDireccion.getText();
				 String Usuario = txtUsuario.getText();
				 char[] Contra = txtContraceña.getPassword();
				 char[] Contra2 = txtContraceña.getPassword();
				 String Contraseña = new String (Contra);
				 String Contraseña2 = new String (Contra2);
				 String Roll = cbxRoll.getSelectedItem().toString();
				 	
				 	if (Nombre.isEmpty()|| Cedula.isEmpty()||Direccion.isEmpty()
				 			||Usuario.isEmpty()||Contraseña.isEmpty()||Contraseña2.isEmpty()) {
				 		JOptionPane.showMessageDialog(null, "Complete las Casillas");
				 		}
					else {						
						fcn.setNombre(Nombre);
						fcn.setTelefono(Cedula);
						fcn.setCedula(Cedula);
						fcn.setDireccion(Direccion);
						fcn.setUsuario(Usuario);
						fcn.setContraseña(Contraseña);
						fcn.setRoll(Roll);
						
						fbo.GuardarFuncionario(fcn);
						Metodos.limpiarString(txtNombre);
						Metodos.limpiarString(txtCedula);
						Metodos.limpiarString(txtTelefono);
						Metodos.limpiarString(txtDireccion);
						Metodos.limpiarString(txtUsuario);
						Metodos.limpiarString(txtContraceña);
						Metodos.limpiarString(TxtContraceña2);
						Metodos.limpiarCbx(cbxRoll);
					}																
			}
		});
		btnGuardar.setFont(new Font("Dialog", Font.BOLD, 14));
		btnGuardar.setBounds(343, 417, 105, 33);
		panel.add(btnGuardar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Metodos.limpiarString(txtNombre);
				Metodos.limpiarString(txtCedula);
				Metodos.limpiarString(txtTelefono);
				Metodos.limpiarString(txtDireccion);
				Metodos.limpiarString(txtUsuario);
				Metodos.limpiarString(txtContraceña);
				Metodos.limpiarString(TxtContraceña2);
				Metodos.limpiarCbx(cbxRoll);
				
			}
		});
		btnLimpiar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLimpiar.setFont(new Font("Dialog", Font.BOLD, 14));
		btnLimpiar.setBounds(228, 417, 105, 33);
		panel.add(btnLimpiar);
		
		
	
	}
}
