package Com.Proyecto_Hotel.ClienteBO;

import java.sql.Connection;

import Com.Proyecto_Hotel.ClienteDao.HabitacionDao;
import Com.Proyecto_Hotel.Registro_Clientes.Datos_Habitacion;
import Conexion.Conexion;

public class HabitacionBO {
	private String mensaje = "";
	private HabitacionDao hbd = new HabitacionDao();
	Connection con = null;
	
	public String guardarHabitacion (Datos_Habitacion dhb) {
		con = Conexion.getConectar();
		try {
			mensaje = hbd.GuadarHabitacion(con, dhb);
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
	
}
