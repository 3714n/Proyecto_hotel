package Com.Proyecto_Hotel.ClienteDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import Com.Proyecto_Hotel.Registro_Clientes.Datos_Clientes;
import Com.Proyecto_Hotel.Registro_Clientes.Datos_Habitacion;

public class HabitacionDao {
private String mensaje = "";
	
	public String GuadarHabitacion(Connection con, Datos_Habitacion dhb) {
		PreparedStatement pst;
		String sql= "INSERT INTO habitaciones(Cedula,G1,G2,G3,G4,G5,G6,G7,G8,G9,G10,C1,C2,C3,C4,C5,C6,A1,A2,A3,A4,A5) "
				+ "VALUE (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		ResultSet rst = null;
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, dhb.getCedula());
			pst.setBoolean(2, dhb.getG1());
			pst.setBoolean(3, dhb.getG2());
			pst.setBoolean(4, dhb.getG3());
			pst.setBoolean(5, dhb.getG4());
			pst.setBoolean(6, dhb.getG5());
			pst.setBoolean(7, dhb.getG6());
			pst.setBoolean(8, dhb.getG7());
			pst.setBoolean(9, dhb.getG8());
			pst.setBoolean(10, dhb.getG9());
			pst.setBoolean(11, dhb.getG10());
			pst.setBoolean(12, dhb.getC1());
			pst.setBoolean(13, dhb.getC2());
			pst.setBoolean(14, dhb.getC3());
			pst.setBoolean(15, dhb.getC4());
			pst.setBoolean(16, dhb.getC5());
			pst.setBoolean(17, dhb.getC6());
			pst.setBoolean(18, dhb.getA1());
			pst.setBoolean(19, dhb.getA2());
			pst.setBoolean(20, dhb.getA3());
			pst.setBoolean(21, dhb.getA4());
			pst.setBoolean(22, dhb.getA5());
			
			
			
			mensaje = "Guadado con exito";
			JOptionPane.showMessageDialog(null, "Guadado con exito" );
			pst.execute();
			con.commit();
			pst.close();
			con.close();
			System.out.println("Conexion cerrada");
			
			
			
		} catch (Exception e) {
			mensaje =  "No se pudo guardar \n por:" + e.getMessage();
		}
		
		return mensaje;
		
	}
}
