package Com.Proyecto_Hotel.Registro_Clientes;

import java.sql.Date;
import java.sql.Time;
import java.text.DateFormat;

public class Datos_Clientes {
	private String nombre; 
	private String cedula; 
	private String celular; 
	private String procedencia; 
	private java.util.Date fecha_Reserva; 
	private int tarifa; 
	private int pago; 
	private String metodo_pago;
	private int total_Pagado; 
	
	private int cantidad; 
	private int noche;
	private String hora_Entrada;
	private int valor_pagar; 
	private int diferencia;
	private String paquete;
	private String publicidad; 
	private String observacion;
	private String selecionarHabitacion;
	public int id;
	
	
	public Datos_Clientes() {
		
	}
	public Datos_Clientes(String nombre, String cedula, String celular, String procedencia, java.util.Date fecha_Reserva,
			int tarifa, int pago, String metodo_pago, int total_Pagado,  int cantidad, int noche, String hora_Entrada, int valor_pagar, int diferencia,
			String paquete, String publicidad, String observacion,int getId,
			String selecionarHabitacion) {
		this.nombre = nombre;
		this.cedula = cedula;
		this.celular = celular;
		this.procedencia = procedencia;
		this.fecha_Reserva = fecha_Reserva;
		this.tarifa = tarifa;
		this.pago = pago;
		this.metodo_pago = metodo_pago;
		this.total_Pagado = total_Pagado;
		
		this.cantidad = cantidad;
		this.noche = noche;
		this.hora_Entrada = hora_Entrada;
		this.valor_pagar = valor_pagar;
		this.diferencia = diferencia;
		this.paquete = paquete;
		this.publicidad = publicidad;
		this.observacion = observacion;
		this.id = id;
		this.selecionarHabitacion = selecionarHabitacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getProcedencia() {
		return procedencia;
	}
	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}
	public java.util.Date getFecha_Reserva() {
		return fecha_Reserva;
	}
	public void setFecha_Reserva(java.util.Date fechaReserva) {
		this.fecha_Reserva = fechaReserva;
	}
	public int getTarifa() {
		return tarifa;
	}
	public void setTarifa(int tarifa) {
		this.tarifa = tarifa;
	}
	public int getPago() {
		return pago;
	}
	public void setPago(int pago) {
		this.pago = pago;
	}
	public String getMetodo_pago() {
		return metodo_pago;
	}
	public void setMetodo_pago(String metodo_pago) {
		this.metodo_pago = metodo_pago;
	}
	public int getTotal_Pagado() {
		return total_Pagado;
	}
	public void setTotal_Pagado(int total_Pagado) {
		this.total_Pagado = total_Pagado;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getNoche() {
		return noche;
	}
	public void setNoche(int noche) {
		this.noche = noche;
	}
	public String getHora_Entrada() {
		return hora_Entrada;
	}
	public void setHora_Entrada(String hora_Entrada) {
		this.hora_Entrada = hora_Entrada;
	}
	public int getValor_pagar() {
		return valor_pagar;
	}
	public void setValor_pagar(int valor_pagar) {
		this.valor_pagar = valor_pagar;
	}
	public int getDiferencia() {
		return diferencia;
	}
	public void setDiferencia(int diferencia) {
		this.diferencia = diferencia;
	}
	public String getPaquete() {
		return paquete;
	}
	public void setPaquete(String paquete) {
		this.paquete = paquete;
	}
	public String getPublicidad() {
		return publicidad;
	}
	public void setPublicidad(String publicidad) {
		this.publicidad = publicidad;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getSelecionarHabitacion() {
		return selecionarHabitacion;
	}
	public void setSelecionarHabitacion(String selecionarHabitacion) {
		this.selecionarHabitacion = selecionarHabitacion;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Datos_Clientes [nombre=").append(nombre).append(", cedula=").append(cedula).append(", celular=")
				.append(celular).append(", procedencia=").append(procedencia).append(", fecha_Reserva=")
				.append(fecha_Reserva).append(", tarifa=").append(tarifa).append(", pago=").append(pago)
				.append(", metodo_pago=").append(metodo_pago).append(", total_Pagado=").append(total_Pagado)
				.append(", cantidad=").append(cantidad).append(", noche=").append(noche).append(", hora_Entrada=")
				.append(hora_Entrada).append(", valor_pagar=").append(valor_pagar).append(", diferencia=")
				.append(diferencia).append(", paquete=").append(paquete).append(", publicidad=")
				.append(publicidad).append(", observacion=").append(observacion).append(", id=").append(id)
				.append(", selecionarHabitacion=").append(selecionarHabitacion).append("]");
		return builder.toString();
	}
	
	
	
	
}
