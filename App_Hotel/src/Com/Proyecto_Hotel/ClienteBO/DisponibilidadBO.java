package Com.Proyecto_Hotel.ClienteBO;

import java.sql.Connection;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import Com.Proyecto_Hotel.ClienteDao.DisponibilidadDao;
import Conexion.Conexion;

public class DisponibilidadBO {	
	private DisponibilidadDao Cantidad = new DisponibilidadDao();
	Connection con = null;
	
 public void Disponibilidad (JDateChooser a, JLabel b, JTextField c, JPanel d) {
	 con = Conexion.getConectar();
	 Cantidad.Disponibilidad1(con, a, b, c, d);
	 try {
		 con.close();

		 System.out.println("Conexion cerrada");
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	 
 }
}
