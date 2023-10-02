package Com.Proyecto_Hotel.Login;



import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;

import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import java.awt.BorderLayout;

import java.awt.Cursor;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

	
public class Login extends JFrame {
	private JTextField txt_Usuario;
	private JPasswordField txt_Contrasena;
	private JTextField btn_Entrar;
	private JPanel contentPane;
	
	int xMouse, yMouse;
	private JLabel btn_Cerrar;
	
	
		
	

	public Login() {
		setResizable(false);
		setUndecorated(true);
		setLocationByPlatform(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 779, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(16, 56, 32)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		panel.setBorder(null);
		panel.setForeground(new Color(7, 38, 22));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 460, 461);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("USUARIO");
		lblNewLabel.setBounds(52, 170, 388, 21);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		
		txt_Usuario = new JTextField();
		txt_Usuario.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (txt_Usuario.getText().equals("Ingrese usuario")) {
					txt_Usuario.setText("");
					txt_Usuario.setForeground(Color.black);
				}
				if (String.valueOf(txt_Contrasena.getPassword()).isEmpty()) {
					txt_Contrasena.setText("********");
					txt_Contrasena.setForeground(Color.black);
					}
			}
			
		});
		txt_Usuario.setForeground(new Color(0, 0, 0));
		txt_Usuario.setToolTipText("");
		txt_Usuario.setBounds(52, 191, 296, 29);
		txt_Usuario.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(13, 60, 35)));
		txt_Usuario.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("INICIAR SESION");
		lblNewLabel_3.setBounds(52, 110, 296, 21);
		lblNewLabel_3.setFont(new Font("Arial Black", Font.PLAIN, 24));
		
		JLabel lblNewLabel_5 = new JLabel("TRAVEL NATURAL");
		lblNewLabel_5.setBounds(10, 11, 168, 62);
		lblNewLabel_5.setIcon(new ImageIcon(Login.class.getResource("/Imagenes/pngtree-women-nature-logo-png-image_7598785.png")));
		
		JLabel lblContrasea = new JLabel("CONTRASEÑA");
		lblContrasea.setBounds(52, 254, 358, 21);
		lblContrasea.setFont(new Font("Arial", Font.PLAIN, 18));
		
		txt_Contrasena = new JPasswordField();
		txt_Contrasena.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (String.valueOf(txt_Contrasena.getPassword()).equals("********")) {
					txt_Contrasena.setText("");
					txt_Contrasena.setForeground(Color.black);
					}
				
				if (txt_Usuario.getText().isEmpty()) {
					txt_Usuario.setText("Ingrese usuario");
					txt_Usuario.setForeground(Color.black);	
					}
			}
		});
		txt_Contrasena.setBounds(52, 274, 296, 29);
		txt_Contrasena.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(13, 60, 35)));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(52, 365, 334, 45);
		panel_2.setBackground(new Color(13, 60, 35));
		panel_2.setLayout(new BorderLayout(0, 0));
		panel.setLayout(null);
		panel.add(lblNewLabel_5);
		panel.add(lblContrasea);
		panel.add(txt_Contrasena);
		panel.add(panel_2);
		
		btn_Entrar = new JTextField();
		btn_Entrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_Entrar.setBackground(new Color(46,86,36));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btn_Entrar.setBackground(new Color(13, 60, 35));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btn_Entrar.setEditable(false);
		btn_Entrar.setHorizontalAlignment(SwingConstants.CENTER);
		btn_Entrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_Entrar.setForeground(new Color(255, 255, 255));
		btn_Entrar.setFont(new Font("Arial", Font.PLAIN, 18));
		btn_Entrar.setBorder(null);
		btn_Entrar.setText("ENTRAR");
		btn_Entrar.setBackground(new Color(13, 60, 35));
		panel_2.add(btn_Entrar, BorderLayout.CENTER);
		btn_Entrar.setColumns(10);
		panel.add(lblNewLabel);
		panel.add(txt_Usuario);
		panel.add(lblNewLabel_3);
		
		JPanel Mover = new JPanel();
		Mover.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x - xMouse,y - yMouse);
			}
		});
		Mover.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xMouse = e.getX();
				yMouse = e.getY();		
			}
		});
		Mover.setBorder(null);
		Mover.setBackground(new Color(255, 255, 255));
		Mover.setBounds(0, 0, 780, 45);
		panel.add(Mover);
		Mover.setLayout(null);
		
		JLabel Registrate = new JLabel("Registrate");
		Registrate.setForeground(new Color(0, 0, 0));
		Registrate.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				Registrate.setForeground(new Color(0, 0, 0));
				
			}
		});
		Registrate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				NuevoUsuario Registrar = new NuevoUsuario();
				Registrar.setVisible(true);
				Registrar.setLocationRelativeTo(null);
			}
		});
		Registrate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Registrate.setBounds(52, 314, 65, 14);
		panel.add(Registrate);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(459, 0, 320, 461);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("ETIAN GUTIERREZ");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBackground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Arial Black", Font.PLAIN, 24));
		lblNewLabel_4.setBounds(0, 299, 325, 35);
		panel_1.add(lblNewLabel_4);
		
		btn_Cerrar = new JLabel("x");
		btn_Cerrar.setVerticalAlignment(SwingConstants.BOTTOM);
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
		btn_Cerrar.setBounds(274, 11, 36, 35);
		panel_1.add(btn_Cerrar);
		btn_Cerrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_Cerrar.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_Cerrar.setForeground(new Color(255, 255, 255));
		btn_Cerrar.setFont(new Font("Arial Black", Font.PLAIN, 38));
		
		JLabel lblNewLabel_2 = new JLabel("Nombre de la empresa");
		lblNewLabel_2.setBounds(0, 0, 338, 461);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon(Login.class.getResource("/Imagenes/f4a34ed0e53a15c4e87b9d394f4aa541.png")));
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
