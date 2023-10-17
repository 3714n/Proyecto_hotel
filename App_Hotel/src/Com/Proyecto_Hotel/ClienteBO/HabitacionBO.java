package Com.Proyecto_Hotel.ClienteBO;

import java.sql.Connection;

import javax.swing.JTable;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import Com.Proyecto_Hotel.ClienteDao.HabitacionDao;
import Com.Proyecto_Hotel.Registro_Clientes.Datos_Clientes;
import Com.Proyecto_Hotel.Registro_Clientes.Datos_Habitacion;
import Conexion.Conexion;

public class HabitacionBO {
	private String mensaje = "";
	private HabitacionDao hbd = new HabitacionDao();
	Connection con = null;
	
	public String guardarHabitacion (Datos_Habitacion dhb) {
		con = Conexion.getConectar();
		try {
			mensaje = hbd.GuardarHabitacion(con, dhb);
			con.rollback();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if (con != null) {
					con.close();
					System.out.println("Conexion cerrada");
				}
			} catch (Exception e2) {
				mensaje = mensaje + " "+ e2.getMessage();
			}
		}
		
		return mensaje;
	}
	public String modificarHabitacion (Datos_Habitacion dhb){
		
		con = Conexion.getConectar();
		try {
			mensaje = hbd.modificarHabitacion(con,dhb); 
			con.rollback();
		} catch (Exception e) {
			mensaje = mensaje + " "+ e.getMessage();
		}finally {
			try {
				if (con != null) {
					con.close();
					System.out.println("Conexion cerrada");
				}
			} catch (Exception e2) {
				mensaje = mensaje + " "+ e2.getMessage();
			}
		}
	return mensaje;	
		}
	public String eliminarCliente (Datos_Habitacion dhb) {
		
		con = Conexion.getConectar();
		try {
			mensaje = hbd.eliminarHabitaciones(con, dhb );
			con.rollback();
		} catch (Exception e) { 
			mensaje = mensaje + " "+ e.getMessage();
		}finally {
			try {
				if (con != null) {
					con.close();
					System.out.println("Conexion cerrada");
				}
			} catch (Exception e2) {
				mensaje = mensaje + " "+ e2.getMessage();
			}
		} 
	return mensaje;		
		}
	public void buscarFechaHabitacion (JDateChooser a, Datos_Clientes dcl, Datos_Habitacion dhb) {
		con = Conexion.getConectar();
		hbd.buscarFechaHabitacion(con, a, dcl, dhb);
	
		try {
			con.close();
			System.out.println("Conexion cerrada");
		} catch (Exception ec) {
			System.out.println(ec.getMessage());
		}
	}
}
