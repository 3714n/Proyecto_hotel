package Com.Proyecto_Hotel.Funsionario;

public class Funcionarios {
	private String Nombre;
	private String Cedula;
	private String Telefono;
	private String Direccion;
	private String Roll;
	private String Usuario;
	private String Contraseña;
	
	
	public Funcionarios() {
		super();
	}

	public Funcionarios(String nombre, String cedula, String telefono, String direccion, String roll, String usuario,
			String contraseña) {
		super();
		this.Nombre = nombre;
		this.Cedula = cedula;
		this.Telefono = telefono;
		this.Direccion = direccion;
		this.Roll = roll;
		this.Usuario = usuario;
		this.Contraseña = contraseña;
	}

	public String getNombre() {
		return Nombre;
	}

	public String getCedula() {
		return Cedula;
	}

	public String getTelefono() {
		return Telefono;
	}

	public String getDireccion() {
		return Direccion;
	}
	
	public String getRoll() {
		return Roll;
	}
	
	public String getUsuario() {
		return Usuario;
	}

	public String getContraseña() {
		return Contraseña;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public void setCedula(String cedula) {
		Cedula = cedula;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public void setRoll(String roll) {
		Direccion = roll;
	}
	
	public void setUsuario(String usuario) {
		Usuario = usuario;
	}

	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}
	
}
