package Logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import Com.Proyecto_Hotel.Registro_Clientes.Datos_Clientes;

public class Capasidad {

private String mensaje = ""; 
	
	public String CapasidadHotel(Connection con,Datos_Clientes dcl) {
		PreparedStatement pst;		
		String consultaSQL = "SELECT SUM(Cantidad) AS total_Capasidad FROM DATOS_CLIENTE WHERE Fecha_Entrada = ?";
			
		try {
			
			pst = con.prepareStatement(consultaSQL);
			java.sql.Timestamp Fecha_Entrada = new java.sql.Timestamp(dcl.getFecha_Entrada().getTime());
			pst.setTimestamp(1, Fecha_Entrada);
			
			ResultSet resultado = pst.executeQuery();
			 if (resultado.next()) {
	                int totalPersonas = resultado.getInt("total_unidades_celulares");
	                mensaje ="Total de personas en " + Fecha_Entrada + ": " + totalPersonas;
	            }

	            //resultado.close();
	            //pst.close();
	            //con.close();
	        } catch (SQLException e) {
	            mensaje = e.getMessage();
	        }
		return consultaSQL;
	    }
	}
		
