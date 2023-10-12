package Com.Proyecto_Hotel.ClienteDao;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import Com.Proyecto_Hotel.Registro_Clientes.Datos_Clientes;

public class DisponibilidadDao {
	public void Consulta (Connection con, Date fecha, JLabel b, JTextField c, JPanel d){ 
		PreparedStatement pds = null; 
		ResultSet rst = null;
		String consulta = "SELECT SUM(C.Cantidad) AS total_personas "
				+ "FROM datos_cliente C "
				+ "JOIN habitaciones H "
				+ "WHERE H.FechaEntrada = ?";
		String traerTexto = c.getText();
		int PersonasRegistrada = 0;
		int cantidadInt = Integer.parseInt(traerTexto);

		try {
		    pds = con.prepareStatement(consulta);
		    pds.setDate(1, new java.sql.Date(fecha.getTime())); // Convierte la fecha de Java util a Java SQL
		    rst = pds.executeQuery();
		    
		    if (rst.next()) {
		        PersonasRegistrada =  rst.getInt("total_personas");
		        cantidadInt = PersonasRegistrada + cantidadInt; 
		        System.out.println("Personas Registradas: " + cantidadInt);
		    }
		    
		    if (cantidadInt < 9) { 
		        d.setBackground(Color.GREEN);
		        b.setText("Disponible");
		        b.setForeground(Color.BLACK);
		    } else {
		        d.setBackground(Color.RED);
		        b.setText("Full");
		        b.setForeground(Color.BLACK);
		    }
		} catch (Exception e) {
		    e.printStackTrace();
		} finally {
		    // Cierra la conexión a la base de datos en el bloque finally
		    if (rst != null) {
		        try {
		            rst.close();
		        } catch (SQLException e) {
		            // Maneja la excepción de cierre de ResultSet si es necesario
		            e.printStackTrace();
		        }
		    }
		    if (pds != null) {
		        try {
		            pds.close();
		        } catch (SQLException e) {
		            // Maneja la excepción de cierre del PreparedStatement si es necesario
		            e.printStackTrace();
		        }
		    }
		}
	}
		
	public void Disponibilidad1(Connection con, JDateChooser a, JLabel b, JTextField c, JPanel d) {
		Date fechaSeleccionada = a.getDate();
		if (fechaSeleccionada != null) {
			Consulta(con, fechaSeleccionada, b, c, d);
			
		} else {
			JOptionPane.showMessageDialog(null, "Ingrese fecha");

		}
		
	}	
	
}	
