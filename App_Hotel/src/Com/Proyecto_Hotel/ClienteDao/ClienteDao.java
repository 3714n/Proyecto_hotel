package Com.Proyecto_Hotel.ClienteDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

import Com.Proyecto_Hotel.Registro_Clientes.Datos_Clientes;
import Com.Proyecto_Hotel.Registro_Clientes.Datos_Habitacion;
import Conexion.Conexion;
import Logica.Metodos;



public class ClienteDao {
	private String mensaje = ""; 
	
	public String guardarCliente(Connection con,Datos_Clientes dcl) {
		PreparedStatement pst;
		String sql = "INSERT INTO DATOS_CLIENTE(Nombre, Cedula, Celular, Procedencia,"
				+ "Cantidad, Noches, Hora_entrada,"
				+ "Fecha_Reserva, Tarifa, Pagos, Metodos_pagos,Total_pagos,Valor_pagar,"
				+ "Diferencia,Publicidad,Paquete)"
				+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			pst = con.prepareStatement(sql);
			
			
			pst.setString(1,dcl.getNombre());			
			pst.setString(2,dcl.getCedula());			
			pst.setString(3,dcl.getCelular());			
			pst.setString(4,dcl.getProcedencia());				
			pst.setInt(5,dcl.getCantidad());			
			pst.setInt(6,dcl.getNoche());		
			pst.setString(7,dcl.getHora_Entrada());
			pst.setTimestamp(8,new java.sql.Timestamp(dcl.getFecha_Reserva().getTime()));		
			pst.setInt(9,dcl.getTarifa());		
			pst.setInt(10,dcl.getPago());			
			pst.setString(11,dcl.getMetodo_pago());
			pst.setInt(12, dcl.getTotal_Pagado());
			pst.setInt(13, dcl.getValor_pagar());
			pst.setInt(14, dcl.getDiferencia());
			pst.setString(15, dcl.getPublicidad());
			pst.setString(16,dcl.getPaquete());
			
			mensaje  ="Guardado correctamente";
			JOptionPane.showMessageDialog(null, "Guardado correctamente");
			pst.execute();
			con.commit();
			pst.close();
			System.out.println("Conexion cerrada");
			
			
			
		} catch (SQLException e) {
			mensaje =  "No se pudo guardar \n por:" + e.getMessage();
		}
		
		return mensaje;	
	}
	
	public String modificarClienteCedula(Connection con,Datos_Clientes dcl) {
		PreparedStatement pst = null;
		String sql = "UPDATE DATOS_CLIENTE SET Nombre = ?, Celular=?,"
				+ "Cantidad = ?,Noches = ?,Hora_entrada = ?,"
				+ "Fecha_Reserva = ?, Tarifa = ?, Pagos = ?, Metodos_pagos = ?,Total_pagos = ?,Valor_pagar = ?,"
				+ "Diferencia = ?, Paquete = ? "
				+ "WHERE Cedula =?";
			
		try {
			pst = con.prepareStatement(sql);
			
			pst.setString(1,dcl.getNombre());
			pst.setString(2,dcl.getCelular());
			pst.setInt(3,dcl.getCantidad());
			pst.setInt(4,dcl.getNoche());
			pst.setString(5,dcl.getHora_Entrada());
			pst.setTimestamp(6,new java.sql.Timestamp(dcl.getFecha_Reserva().getTime()));
			pst.setInt(7,dcl.getTarifa());
			pst.setInt(8,dcl.getPago());
			pst.setString(9,dcl.getMetodo_pago());
			pst.setInt(10, dcl.getTotal_Pagado());
			pst.setInt(11, dcl.getValor_pagar());
			pst.setInt(12, dcl.getDiferencia());
			pst.setString(13,dcl.getPaquete());
			pst.setString(14,dcl.getCedula());
			
			
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
	
	public String eliminarCliente(Connection con, Datos_Clientes dcl ) {
		PreparedStatement pst = null;
		String sql = "DELETE FROM DATOS_CLIENTE WHERE cedula = ?";
			
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, dcl.getCedula());
			
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
	
	public void mostrarCliente(Connection con, JTable tabla) {
		DefaultTableModel modelo;
		String columnas[] = {"id", "nombre", "cedula", "celular", "procedencia", "FechaEntrada", "FechaSalida",
								"cantidad", "noches", "hora_entrada", "fecha_reserva", "tarifa", "pagos", "metodos_pagos",
								"total_pagos", "valor_pagar", "diferencia", "publicidad", "paquete"};
		modelo =new DefaultTableModel(null,columnas);
		String sql = "SELECT c.ID, c.Nombre, c.Cedula, c.celular, c.procedencia, h.FechaEntrada, h.FechaSalida,"
	            + " c.cantidad, c.noches, c.hora_entrada, c.fecha_Reserva, c.tarifa, c.pagos, c.metodos_pagos,"
	            + " c.total_pagos, c.valor_pagar, c.diferencia, c.publicidad, c.paquete "
	            + " FROM DATOS_CLIENTE c "
	            + " INNER JOIN Habitaciones h ON c.Cedula = h.Cedula "
	            + " ORDER BY c.ID";
		String [] filas = new String [19];
		Arrays.fill(filas, ""); 
		Statement st =null;
		ResultSet rs = null;
		
		try {
			st = con.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				for (int i = 0; i<19; i++) {
					filas[i] = rs.getString(i+1);
				}
				modelo.addRow(filas);
			}   
			tabla.setModel(modelo); 
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al mostrar la tabla: " + e.getMessage() + "\nStackTrace: " + e.getStackTrace());
			System.out.println(e.getMessage() + "\nStackTrace: " + e.getStackTrace());
		}finally {
	        try {
	            if (rs != null) {
	                rs.close();
	                System.out.println("Conexion cerrada");
	            }
	            if (st != null) {
	               st.close();
	               System.out.println("Conexion cerrada");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
		
	}
			
	}
	
	private DefaultTableModel consultarFecha(Connection con, Date fecha) {
	    DefaultTableModel modelo;
	    String columnas[] = {"id", "nombre", "cedula", "celular", "procedencia",
	            "cantidad", "noches", "hora_entrada", "fecha_reserva", "tarifa", "pagos", "metodos_pagos",
	            "total_pagos", "valor_pagar", "diferencia", "publicidad", "paquete"};
	    modelo = new DefaultTableModel(null, columnas);

	    PreparedStatement ps = null;
	    ResultSet rs = null;

	    try {
	        // Prepara la consulta SQL para seleccionar datos de la tabla Habitaciones
	        String sql = "SELECT dc.id, dc.nombre, dc.cedula, dc.celular, dc.procedencia,"
	                + " dc.cantidad, dc.noches, dc.hora_entrada, dc.fecha_reserva, dc.tarifa, dc.pagos, dc.metodos_pagos,"
	                + " dc.total_pagos, dc.valor_pagar, dc.diferencia, dc.publicidad, dc.paquete"
	                + " FROM DATOS_CLIENTE dc"
	                + " INNER JOIN Habitaciones h ON dc.Cedula = h.Cedula"
	                + " WHERE ? BETWEEN h.FechaEntrada AND h.FechaSalida";

	        ps = con.prepareStatement(sql);
	        ps.setDate(1, new java.sql.Date(fecha.getTime())); // Convierte la fecha de Java util a Java SQL

	        rs = ps.executeQuery();

	        String filas[] = new String[17];

	        while (rs.next()) {
	            for (int i = 0; i < 17; i++) {
	                filas[i] = rs.getString(columnas[i]);
	            }
	            modelo.addRow(filas);
	        }
	    } catch (SQLException e) {
	        System.out.println(e.getMessage()); // Manejo básico de errores, puedes personalizarlo.
	    } finally {
	        try {
	            if (rs != null) {
	                rs.close();
	                System.out.println("Conexion cerrada");
	            }
	            if (ps != null) {
	                ps.close();
	            }
	        } catch (SQLException e) {
	            System.out.println(e.getMessage()); // Manejo básico de errores, puedes personalizarlo.
	        }
	    }

	    return modelo;
	}

	// Llamar a este método para realizar la búsqueda y actualizar la tabla
	public void buscarFecha(Connection con, JDateChooser a, JTable tabla) {
		Date fechaSeleccionada = a.getDate();
	   if (fechaSeleccionada != null) { 
			DefaultTableModel modelo = consultarFecha(con, fechaSeleccionada);
		    tabla.setModel(modelo);
		    
	   }else {
		   JOptionPane.showMessageDialog(null, "Seleccione una fecha antes de buscar.");
	   }
	}
	 
	private DefaultTableModel consultarRegistros(Connection con, String cedula) {
	    DefaultTableModel modelo;
	    String columnas[] = {"ID", "Nombre", "Cedula", "Celular", "Procedencia",  
	    		"Cantidad", "Noches", "Hora Entrada", "Fecha Reserva", "Tarifa", "Pagos", "Metodos Pagos ",
	    		"Total Pagos", "Valor a pagar", "Diferencia ", "Publicidad", "Paquetes"};
	    modelo = new DefaultTableModel(null, columnas);

	    PreparedStatement ps = null;
	    ResultSet rs = null;

	    try {
	        // Prepara la consulta SQL con un parámetro para la fecha
	        String sql = "SELECT ID, Nombre, Cedula, Celular,"
	                + " Cantidad, Noches, Hora_entrada,"
	                + " Fecha_reserva, Tarifa, Pagos, Metodos_pagos, Total_pagos, Valor_pagar,"
	                + " Diferencia, Paquete FROM DATOS_CLIENTE WHERE CEDULA = ?";
	        ps = con.prepareStatement(sql);
	        ps.setString(1, new String(cedula.toString())); // Convierte la CEDULA	 de Java util a Java SQL

	        rs = ps.executeQuery();
	        
	        String filas[] = new String[15];
	        
	        
	        	 while (rs.next()) {
	 	            for (int i = 0; i < 15; i++) {
	 	                filas[i] = rs.getString(i + 1);
	 	            }
	 	            modelo.addRow(filas);
	 	        }		
	       
	    } catch (SQLException e) {
	    	System.out.println(e.getMessage()); // Manejo básico de errores, puedes personalizarlo.
	    } finally {
	        try {
	            if (rs != null) {
	                rs.close();
	                System.out.println("Conexion cerrada");
	            }
	            if (ps != null) {
	                ps.close();
	            }
	        } catch (SQLException e) {
	        	System.out.println(e.getMessage()); // Manejo básico de errores, puedes personalizarlo.
	        }
	    }

	    return modelo;
	}

	// Llamar a este método para realizar la búsqueda y actualizar la tabla
	public void buscarCedula(Connection con, JTextField a, JTable tabla) {
		String cedula = a.getText();
	   if (cedula != null) { 
			DefaultTableModel modelo = consultarRegistros(con, cedula);
		    tabla.setModel(modelo);
		    
	   }else {
		   JOptionPane.showMessageDialog(null, "La Cedula no existe.");
	   }
	}
	
	public void mostrarCeldas(Connection con, JTextField a, Datos_Clientes dcl, Datos_Habitacion hbd) {
	    PreparedStatement pst = null;
	    ResultSet rs = null;

	    try {
	        String sql = "SELECT DC.*, H.*"+
	                "FROM DATOS_CLIENTE DC " +
                    "LEFT JOIN Habitaciones H ON DC.CEDULA = H.CEDULA " +
                    "WHERE DC.CEDULA = ?";
	        pst = con.prepareStatement(sql);
	        pst.setString(1, a.getText()); // Establece la cédula como parámetro

	        rs = pst.executeQuery();

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
        
	            
	        } else {
	            // Si no se encontró ningún registro con la cédula proporcionada, puedes manejarlo aquí.
	            // Por ejemplo, mostrar un mensaje de error o establecer valores predeterminados en el objeto Datos_Clientes.
	        	JOptionPane.showMessageDialog(null, "No se encontro ningun numero de cedula");
	        }
	    } catch (Exception e) {
	        e.printStackTrace(); // Manejo adecuado de excepciones
	    } finally {
	        try {
	            if (rs != null) {
	               rs.close();
	               System.out.println("Conexion cerrada");
	            }
	            if (pst != null) {
	                pst.close();
	                System.out.println("Conexion cerrada");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}
	
}
	
