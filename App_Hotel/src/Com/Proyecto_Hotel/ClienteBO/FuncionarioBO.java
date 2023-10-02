package Com.Proyecto_Hotel.ClienteBO;

import Com.Proyecto_Hotel.Funsionario.Funcionarios;
import Conexion.Conexion;

import java.sql.Connection;

import Com.Proyecto_Hotel.ClienteDao.FuncionarioDao;

public class FuncionarioBO {
	private String mensaje ="";
	private FuncionarioDao FuncionarioDao = new FuncionarioDao();
	Connection con = null;
	
	public String GuardarFuncionario(Funcionarios Fcn) {
		 con =  Conexion.getConectar();
		 try {
			mensaje = FuncionarioDao.GuardarUsuario(con, Fcn);
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

}
