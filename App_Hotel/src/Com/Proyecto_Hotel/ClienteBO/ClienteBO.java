package Com.Proyecto_Hotel.ClienteBO;

import java.sql.Connection;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import Com.Proyecto_Hotel.ClienteDao.ClienteDao;
import Com.Proyecto_Hotel.ClienteDao.HabitacionDao;
import Com.Proyecto_Hotel.Registro_Clientes.Datos_Clientes;
import Com.Proyecto_Hotel.Registro_Clientes.Datos_Habitacion;
import Conexion.Conexion;


public class ClienteBO {
private String mensaje = "";
private ClienteDao clienteDao= new ClienteDao();

Connection con = null;
	
	public String guardarCliente(Datos_Clientes dcl)  { 
		con = Conexion.getConectar();
		try {
			mensaje = clienteDao.guardarCliente(con, dcl);
			con.rollback();
			
		} catch (Exception e) {
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
	
	public String modificarClientCedula(Datos_Clientes dcl){
		
		con = Conexion.getConectar();
		try {
			mensaje = clienteDao.modificarClienteCedula(con,dcl);
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
	
	public String eliminarCliente(Datos_Clientes dcl ) throws ClassNotFoundException {
		
		con = Conexion.getConectar();
		try {
			mensaje = clienteDao.eliminarCliente(con,dcl );
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
	
	public void mostrarClinteRegistrar(JTable table) {
		con = Conexion.getConectar();
		clienteDao.mostrarCliente(con, table);
		
		try {
		
			con.close();
			System.out.println("Conexion cerrada");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
			
		}
	
	public void buscarFecha (JDateChooser a, JTable tabla) {
		con = Conexion.getConectar();
		clienteDao.buscarFecha(con, a, tabla);
		try {
			con.close();
			System.out.println("Conexion cerrada");
		} catch (Exception ec) {
			System.out.println(ec.getMessage());
		}
	}
	
	public void buscarCedula (JTextField a, JTable tabla) {
		con = Conexion.getConectar();
		clienteDao.buscarCedula (con, a, tabla);
	
		try {
			con.close();
			System.out.println("Conexion cerrada");
		} catch (Exception ec) {
			System.out.println(ec.getMessage());
		}
	}
	
	public String ImportarCeldas ( JTextField a,Datos_Clientes dcl, Datos_Habitacion dhb) {
		con = Conexion.getConectar();
		clienteDao.mostrarCeldas(con, a, dcl, dhb);
	
		try {
			con.close();
			System.out.println("Conexion cerrada");
		} catch (Exception ec) {
			System.out.println(ec.getMessage());
		}
		return mensaje;
	}
	
}
	
