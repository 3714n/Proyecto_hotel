
package Com.Proyecto_Hotel.ClienteDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

import Com.Proyecto_Hotel.Registro_Clientes.Datos_Clientes;
import Com.Proyecto_Hotel.Registro_Clientes.Datos_Habitacion;

public class HabitacionDao {
    private String mensaje = "";

    public String GuardarHabitacion(Connection con, Datos_Habitacion dhb) {
        PreparedStatement pst = null;

        try {
            if (con != null) {
                String sql = "INSERT INTO habitaciones(Cedula,G1,G2,G3,G4,G5,G6,G7,G8,G9,G10,C1,C2,C3,C4,C5,C6,A1,A2,A3,A4,A5,FechaEntrada,FechaSalida)"
                        + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

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
    			pst.setTimestamp(23,new java.sql.Timestamp(dhb.getFechaEntrada().getTime()));		
    			pst.setTimestamp(24,new java.sql.Timestamp(dhb.getFechaSalida().getTime()));
                pst.execute();
                con.commit();
                mensaje = "Guardado con éxito";
                JOptionPane.showMessageDialog(null, mensaje);
            } else {
                mensaje = "No se pudo guardar: conexión no válida";
            }
        } catch (Exception e) {
            mensaje = "No se pudo guardar\nPor: " + e.getMessage();
            e.printStackTrace(); // Imprime la traza de la excepción
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                // Cierra la conexión aquí si no estás utilizando un bloque try-with-resources
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return mensaje;
    }
    public String modificarHabitacion(Connection con,Datos_Habitacion dhb) {
		PreparedStatement pst = null;
		String sql = "UPDATE Habitaciones SET "
				+ "G1=?, G2=?, G3=?, G4=?, G5=?, G6=?, G7=?, G8=?, G9=?, G10=?,"
				+ "C1=?, C2=?, C3=?, C4=?, C5=?, C6=?,"
				+ "A1=?, A2=?, A3=?, A4=?, A5=?,"
				+ "FechaEntrada = ?, FechaSalida = ? "				
				+ "WHERE cedula =?";
		try {
			pst = con.prepareStatement(sql);
			//pst.setString(1, dhb.getCedula());
			pst.setBoolean(1, dhb.getG1());
			pst.setBoolean(2, dhb.getG2());
			pst.setBoolean(3, dhb.getG3());
			pst.setBoolean(4, dhb.getG4());
			pst.setBoolean(5, dhb.getG5());
			pst.setBoolean(6, dhb.getG6());
			pst.setBoolean(7, dhb.getG7());
			pst.setBoolean(8, dhb.getG8());
			pst.setBoolean(9, dhb.getG9());
			pst.setBoolean(10, dhb.getG10());
			pst.setBoolean(11, dhb.getC1());
			pst.setBoolean(12, dhb.getC2());
			pst.setBoolean(13, dhb.getC3());
			pst.setBoolean(14, dhb.getC4());
			pst.setBoolean(15, dhb.getC5());
			pst.setBoolean(16, dhb.getC6());
			pst.setBoolean(17, dhb.getA1());
			pst.setBoolean(18, dhb.getA2());
			pst.setBoolean(19, dhb.getA3());
			pst.setBoolean(20, dhb.getA4());
			pst.setBoolean(21, dhb.getA5());
			pst.setTimestamp(22,new java.sql.Timestamp(dhb.getFechaEntrada().getTime()));		
			pst.setTimestamp(23,new java.sql.Timestamp(dhb.getFechaSalida().getTime()));
			
			pst.setString(24, dhb.getCedula());
			mensaje  = "Actualizado correctamente";
			pst.execute();
			con.commit();
			pst.close();
			System.out.println("Conexion cerrada");
			
			
		} catch (SQLException e) {
			mensaje =  "No se pudo guardar \n por:" + e.getMessage();
		}
		
		return mensaje;	
	}
    public String eliminarHabitaciones(Connection con, Datos_Habitacion  dhb ) {
		PreparedStatement pst = null;
		String sql = "DELETE FROM Habitaciones WHERE cedula = ?";
			
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, dhb.getCedula());
			
			mensaje  = "Eliminado correctamente \n";
			pst.execute();
			con.commit();
			pst.close();
			System.out.println("Conexion cerrada");
			
		} catch (SQLException e) {
			mensaje =  "No se pudo guardar \n por:" + e.getMessage();
		}
		
		return mensaje;	
	}
    private DefaultTableModel consultarFechaHabitacion(Connection con, Date fecha,Datos_Clientes dcl, Datos_Habitacion hbd) {
	    PreparedStatement ps = null;
	    ResultSet rs = null;
	    try {
	        // Prepara la consulta SQL para seleccionar datos de la tabla Habitaciones
	        String sql = "SELECT dc .*, h.*"
	                + " FROM DATOS_CLIENTE dc"
	                + " INNER JOIN Habitaciones h ON dc.Cedula = h.Cedula"
	                + " WHERE ? BETWEEN h.FechaEntrada AND h.FechaSalida";

	        ps = con.prepareStatement(sql);
	        ps.setDate(1, new java.sql.Date(fecha.getTime())); // Convierte la fecha de Java util a Java SQL

	        rs = ps.executeQuery();
	        if (rs.next()) {
	            dcl.setNombre(rs.getString("Nombre"));
	            dcl.setCedula(rs.getString("Cedula"));
	            dcl.setCelular(rs.getString("Celular"));
	            hbd.setFechaEntrada(rs.getTimestamp("FechaEntrada"));
	            hbd.setFechaSalida(rs.getTimestamp("FechaSalida"));
	            dcl.setCantidad(rs.getInt("Cantidad"));
	            dcl.setPago(rs.getInt("Pagos"));
	            dcl.setNoche(rs.getInt("Noches"));
	            dcl.setHora_Entrada(rs.getString("Hora_entrada"));
	            dcl.setFecha_Reserva(rs.getTimestamp("Fecha_Reserva"));
	            dcl.setTarifa(rs.getInt("Tarifa"));
	            dcl.setMetodo_pago(rs.getString("Metodos_pagos"));
	            dcl.setTotal_Pagado(rs.getInt("Total_pagos"));
	            dcl.setValor_pagar(rs.getInt("Valor_pagar"));
	            dcl.setDiferencia(rs.getInt("Diferencia"));
	            dcl.setPaquete(rs.getString("Paquete"));
	            
	            
	            hbd.setA1(rs.getBoolean("A1"));
	            hbd.setA2(rs.getBoolean("A2"));
	            hbd.setA3(rs.getBoolean("A3"));
	            hbd.setA4(rs.getBoolean("A4"));
	            hbd.setA5(rs.getBoolean("A5"));
	            hbd.setC1(rs.getBoolean("C1"));
	            hbd.setC2(rs.getBoolean("C2"));
	            hbd.setC3(rs.getBoolean("C3"));
	            hbd.setC4(rs.getBoolean("C4"));
	            hbd.setC5(rs.getBoolean("C5"));
	            hbd.setC6(rs.getBoolean("C6"));
	            hbd.setG1(rs.getBoolean("G1"));
	            hbd.setG2(rs.getBoolean("G2"));
	            hbd.setG3(rs.getBoolean("G3"));
	            hbd.setG4(rs.getBoolean("G4"));
	            hbd.setG5(rs.getBoolean("G5"));
	            hbd.setG6(rs.getBoolean("G6"));
	            hbd.setG7(rs.getBoolean("G7"));
	            hbd.setG8(rs.getBoolean("G8"));
	            hbd.setG9(rs.getBoolean("G9"));
	            hbd.setG10(rs.getBoolean("G10"));
	        }else {
	        	
	        }
	    }catch (Exception e) {
			// TODO: handle exception
		}finally {
	        try {
	            if (rs != null) {
	                rs.close();
	                System.out.println("Conexion cerrada");
	            }
	            if (ps != null) {
	                ps.close();
	                System.out.println("Conexion cerrada");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	
    return null;
    }
    public void buscarFechaHabitacion(Connection con, JDateChooser a,Datos_Clientes dcl, Datos_Habitacion hbd ) {
		Date fechaSeleccionada = a.getDate();
	   if (fechaSeleccionada != null) { 
			consultarFechaHabitacion(con, fechaSeleccionada,dcl, hbd);	        
	   }else {
		   JOptionPane.showMessageDialog(null, "Seleccione una fecha antes de buscar.");
	   }
	}
}