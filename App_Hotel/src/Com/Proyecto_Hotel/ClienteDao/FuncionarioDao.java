package Com.Proyecto_Hotel.ClienteDao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;
import java.io.CharArrayReader;
import java.io.Reader;

import Com.Proyecto_Hotel.Funsionario.Funcionarios;

public class FuncionarioDao {
	String mensaje =""; 
	
	public String GuardarUsuario(Connection con, Funcionarios fcn ) {
		PreparedStatement pst;
		String sql = "INSERT INTO USUARIO ( Nombre, Cedula, Telefono, Direccion, Usuario, Contraseña) VALUES (?,?,?,?,?,?)";
		
		try {
			
			pst = con.prepareStatement(sql);
			
			pst.setString(1, fcn.getNombre());
			pst.setString(2, fcn.getCedula());
			pst.setString(3, fcn.getTelefono());
			pst.setString(4, fcn.getDireccion());
			pst.setString(5, fcn.getUsuario());
			//pst.SetPassword(6,fcn.getContraseña()):
			 
			mensaje = "Guardado con exito";
			JOptionPane.showMessageDialog(null, mensaje);
			pst.execute();
			con.commit();
					
		} catch (Exception e) {
			mensaje = "No se pudo guardar" + e.getMessage();
		}				
		return null;
		
	}

}
