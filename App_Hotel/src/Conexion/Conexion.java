package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.cj.x.protobuf.MysqlxConnection.Close;

public class Conexion {
	private static Connection con;
	private static String login = "root";
	private static String calve = "Evan1234*";
	private static String url = "jdbc:mysql://localhost:3306/hotel_proyecto?useTimeZone=true&serverTimeZone=UTC";
	
	public static Connection getConectar() { 
		try {
		
		con = DriverManager.getConnection(
				url,login,calve);
		con.setAutoCommit(false);
		System.out.println("conectado");
		if(con != null) {
			System.out.println("Conexión Exitosa");
		}else {
			System.out.println("No se puedo conectar");
			}
		
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return con;
	}
	
		public void desconexion () {
			try {
				con.close();
			} catch (Exception e) {
				System.out.println("Error al desconectar " + e.getMessage());
			}
		}
	
}

