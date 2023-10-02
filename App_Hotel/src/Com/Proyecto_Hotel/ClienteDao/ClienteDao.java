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
import Conexion.Conexion;
import Logica.Metodos;



public class ClienteDao {
	private String mensaje = ""; 
	
	public String guardarCliente(Connection con,Datos_Clientes dcl) {
		PreparedStatement pst;
		String sql = "INSERT INTO DATOS_CLIENTE(nombre, cedula, celular, procedencia,"
				+ "fecha_entrada,fecha_salida,cantidad,noches,hora_entrada,"
				+ "fecha_Reserva, tarifa, pagos, metodos_pagos,total_pagos,valor_pagar,"
				+ "diferencia,publicidad,paquete)"
				+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			pst = con.prepareStatement(sql);
			
			
			pst.setString(1,dcl.getNombre());			
			pst.setString(2,dcl.getCedula());			
			pst.setString(3,dcl.getCelular());			
			pst.setString(4,dcl.getProcedencia());		
			pst.setTimestamp(5,new java.sql.Timestamp(dcl.getFecha_Entrada().getTime()));		
			pst.setTimestamp(6,new java.sql.Timestamp(dcl.getFecha_Salida().getTime()));			
			pst.setInt(7,dcl.getCantidad());			
			pst.setInt(8,dcl.getNoche());		
			pst.setString(9,dcl.getHora_Entrada());
			pst.setTimestamp(10,new java.sql.Timestamp(dcl.getFecha_Reserva().getTime()));		
			pst.setInt(11,dcl.getTarifa());		
			pst.setInt(12,dcl.getPago());			
			pst.setString(13,dcl.getMetodo_pago());
			pst.setInt(14, dcl.getTotal_Pagado());
			pst.setInt(15, dcl.getValor_pagar());
			pst.setInt(16, dcl.getDiferencia());
			pst.setString(17, dcl.getPublicidad());
			pst.setString(18,dcl.getPaquete());
			
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
	
	public String modificarCliente(Connection con,Datos_Clientes dcl) {
		PreparedStatement pst = null;
		String sql = "UPDATE DATOS_CLIENTE SET nombre = ?, celular=?,"
				+ "fecha_entrada = ?,fecha_salida = ?,cantidad = ?,noches = ?,hora_entrada = ?,"
				+ "fecha_Reserva = ?, tarifa = ?, pagos = ?, metodos_pagos = ?,total_pagos = ?,valor_pagar = ?,"
				+ "diferencia = ?, paquete = ?"
				+ "WHERE cedula =?";
			
		try {
			pst = con.prepareStatement(sql);
			
			pst.setString(1,dcl.getNombre());			
			pst.setString(2,dcl.getCelular());
			pst.setTimestamp(3,new java.sql.Timestamp(dcl.getFecha_Entrada().getTime()));
			pst.setTimestamp(4,new java.sql.Timestamp(dcl.getFecha_Salida().getTime()));
			pst.setInt(5,dcl.getCantidad());
			pst.setInt(6,dcl.getNoche());
			pst.setString(7,dcl.getHora_Entrada());
			pst.setTimestamp(8,new java.sql.Timestamp(dcl.getFecha_Entrada().getTime()));
			pst.setInt(9,dcl.getTarifa());
			pst.setInt(10,dcl.getPago());
			pst.setString(11,dcl.getMetodo_pago());
			pst.setInt(12, dcl.getTotal_Pagado());
			pst.setInt(13, dcl.getValor_pagar());
			pst.setInt(14, dcl.getDiferencia());
			pst.setString(15,dcl.getPaquete());
			pst.setString(16, dcl.getCedula());
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
	
	public void mostrarClente(Connection con, JTable tabla) {
		DefaultTableModel modelo;
		String columnas[] = {"id", "nombre", "cedula", "celular", "procedencia", "fecha_entrada", "fecha_salida",
								"cantidad", "noches", "hora_entrada", "fecha_reserva", "tarifa", "pagos", "metodos_pagos",
								"total_pagos", "valor_pagar", "diferencia", "publicidad", "paquete"};
		modelo =new DefaultTableModel(null,columnas);
		String sql = "SELECT ID, Nombre, Cedula, celular, procedencia,"
				+ "				fecha_entrada,fecha_salida,cantidad,noches,hora_entrada,"
				+ "				fecha_Reserva, tarifa, pagos, metodos_pagos,total_pagos,valor_pagar,"
				+ "				diferencia,publicidad,paquete FROM DATOS_CLIENTE ORDER BY ID";
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
	
	private DefaultTableModel consultarRegistros(Connection con, Date fecha) {
	    DefaultTableModel modelo;
	    String columnas[] = {"id", "nombre", "cedula", "celular", "procedencia", "fecha_entrada", "fecha_salida",
	            "cantidad", "noches", "hora_entrada", "fecha_reserva", "tarifa", "pagos", "metodos_pagos",
	            "total_pagos", "valor_pagar", "diferencia", "publicidad", "paquete"};
	    modelo = new DefaultTableModel(null, columnas);

	    PreparedStatement ps = null;
	    ResultSet rs = null;

	    try {
	        // Prepara la consulta SQL con un parámetro para la fecha
	        String sql = "SELECT id, nombre, cedula, celular, procedencia,"
	                + " fecha_entrada, fecha_salida, cantidad, noches, hora_entrada,"
	                + " fecha_Reserva, tarifa, pagos, metodos_pagos, total_pagos, valor_pagar,"
	                + " diferencia, publicidad, paquete FROM DATOS_CLIENTE WHERE FECHA_ENTRADA = ?";
	        ps = con.prepareStatement(sql);
	        ps.setDate(1, new java.sql.Date(fecha.getTime())); // Convierte la fecha de Java util a Java SQL

	        rs = ps.executeQuery();
	        
	        String filas[] = new String[19];
	        
	        
	        	 while (rs.next()) {
	 	            for (int i = 0; i < 19; i++) {
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
	                System.out.println("Conexion cerrada");
	            }
	        } catch (SQLException e) {
	        	System.out.println(e.getMessage()); // Manejo básico de errores, puedes personalizarlo.
	        }
	    }

	    return modelo;
	}

	// Llamar a este método para realizar la búsqueda y actualizar la tabla
	public void buscar(Connection con, JDateChooser a, JTable tabla) {
		Date fechaSeleccionada = a.getDate();
	   if (fechaSeleccionada != null) { 
			DefaultTableModel modelo = consultarRegistros(con, fechaSeleccionada);
		    tabla.setModel(modelo);
		    
	   }else {
		   JOptionPane.showMessageDialog(null, "Seleccione una fecha antes de buscar.");
	   }
	}
	 
	private DefaultTableModel consultarRegistros(Connection con, String cedula) {
	    DefaultTableModel modelo;
	    String columnas[] = {"ID", "Nombre", "Cedula", "Celular", "Procedencia", "Entrada", "Salida", 
	    		"Cantidad", "Noches", "Hora Entrada", "Fecha Reserva", "Tarifa", "Pagos", "Metodos Pagos ",
	    		"Total Pagos", "Valor a pagar", "Diferencia ", "Publicidad", "Paquetes"};
	    modelo = new DefaultTableModel(null, columnas);

	    PreparedStatement ps = null;
	    ResultSet rs = null;

	    try {
	        // Prepara la consulta SQL con un parámetro para la fecha
	        String sql = "SELECT ID, Nombre, Cedula, Celular,"
	                + " Fecha_entrada, Fecha_salida, Cantidad, Noches, Hora_entrada,"
	                + " Fecha_Reserva, Tarifa, Pagos, Metodos_pagos, Total_pagos, Valor_pagar,"
	                + " Diferencia, Paquete FROM DATOS_CLIENTE WHERE CEDULA = ?";
	        ps = con.prepareStatement(sql);
	        ps.setString(1, new String(cedula.toString())); // Convierte la CEDULA	 de Java util a Java SQL

	        rs = ps.executeQuery();
	        
	        String filas[] = new String[17];
	        
	        
	        	 while (rs.next()) {
	 	            for (int i = 0; i < 17; i++) {
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
	
	
	public void mostrarCeldas(Connection con, JTextField a, Datos_Clientes dcl) {
	    PreparedStatement pst = null;
	    ResultSet rs = null;

	    try {
	        String sql = "SELECT * FROM DATOS_CLIENTE WHERE CEDULA = ?";
	        pst = con.prepareStatement(sql);
	        pst.setString(1, a.getText()); // Establece la cédula como parámetro

	        rs = pst.executeQuery();

	        if (rs.next()) {
	            dcl.setNombre(rs.getString("nombre"));
	            dcl.setCedula(rs.getString("cedula"));
	            dcl.setCelular(rs.getString("celular"));
	            dcl.setFecha_Entrada(rs.getTimestamp("fecha_entrada"));
	            dcl.setFecha_Salida(rs.getTimestamp("fecha_salida"));
	            dcl.setCantidad(rs.getInt("cantidad"));
	            dcl.setPago(rs.getInt("pagos"));
	            dcl.setNoche(rs.getInt("noches"));
	            dcl.setHora_Entrada(rs.getString("hora_entrada"));
	            dcl.setFecha_Reserva(rs.getTimestamp("fecha_Reserva"));
	            dcl.setTarifa(rs.getInt("tarifa"));
	            dcl.setMetodo_pago(rs.getString("metodos_pagos"));
	            dcl.setTotal_Pagado(rs.getInt("total_pagos"));
	            dcl.setValor_pagar(rs.getInt("valor_pagar"));
	            dcl.setDiferencia(rs.getInt("diferencia"));
	            dcl.setPaquete(rs.getString("paquete"));
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
	
