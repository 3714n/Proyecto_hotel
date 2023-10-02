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
	private java.util.Date fecha_Entrada; 
	private java.util.Date fecha_Salida; 
	private int cantidad; 
	private int noche;
	private String hora_Entrada;
	private int valor_pagar; 
	private int diferencia;
	private String paquete;
	private String publicidad; 
	private String observacion;
	private String G1;
	private String G2; 
	private String G3;
	private String G4;
	private String G5;
	private String G6;
	private String G7;
	private String G8;
	private String G9;
	private String G10;
	private String C1;
	private String C2;
	private String C3;
	private String C4;
	private String C5;
	private String C6;
	private String A1;
	private String A2;
	private String A3;
	private String A4;
	private String A5;
	private String A6;
	private String selecionarHabitacion;
	public int id;
	
	
	public Datos_Clientes() {
		
	}
	public Datos_Clientes(String nombre, String cedula, String celular, String procedencia, java.util.Date fecha_Reserva,
			int tarifa, int pago, String metodo_pago, int total_Pagado, java.util.Date fecha_Entrada,
			java.util.Date fecha_Salida, int cantidad, int noche, String hora_Entrada, int valor_pagar, int diferencia,
			String paquete, String publicidad, String observacion,int getId,
			String g1, String g2, String g3, String g4,
			String g5, String g6, String g7, String g8, String g9, String g10, String c1, String c2, String c3,
			String c4, String c5, String c6, String a1, String a2, String a3, String a4, String a5, String a6,
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
		this.fecha_Entrada = fecha_Entrada;
		this.fecha_Salida = fecha_Salida;
		this.cantidad = cantidad;
		this.noche = noche;
		this.hora_Entrada = hora_Entrada;
		this.valor_pagar = valor_pagar;
		this.diferencia = diferencia;
		this.paquete = paquete;
		this.publicidad = publicidad;
		this.observacion = observacion;
		this.id = id;
		this.G1 = g1;
		this.G2 = g2;
		this.G3 = g3;
		this.G4 = g4;
		this.G5 = g5;
		this.G6 = g6;
		this.G7 = g7;
		this.G8 = g8;
		this.G9 = g9;
		this.G10 = g10;
		this.C1 = c1;
		this.C2 = c2;
		this.C3 = c3;
		this.C4 = c4;
		this.C5 = c5;
		this.C6 = c6;
		this.A1 = a1;
		this.A2 = a2;
		this.A3 = a3;
		this.A4 = a4;
		this.A5 = a5;
		this.A6 = a6;
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
	public java.util.Date getFecha_Entrada() {
		return fecha_Entrada;
	}
	public void setFecha_Entrada(java.util.Date fecha_Entrada) {
		this.fecha_Entrada = fecha_Entrada;
	}
	public java.util.Date getFecha_Salida() {
		return fecha_Salida;
	}
	public void setFecha_Salida(java.util.Date fecha_Salida) {
		this.fecha_Salida = fecha_Salida;
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
	public String getG1() {
		return G1;
	}
	public void setG1(String g1) {
		G1 = g1;
	}
	public String getG2() {
		return G2;
	}
	public void setG2(String g2) {
		G2 = g2;
	}
	public String getG3() {
		return G3;
	}
	public void setG3(String g3) {
		G3 = g3;
	}
	public String getG4() {
		return G4;
	}
	public void setG4(String g4) {
		G4 = g4;
	}
	public String getG5() {
		return G5;
	}
	public void setG5(String g5) {
		G5 = g5;
	}
	public String getG6() {
		return G6;
	}
	public void setG6(String g6) {
		G6 = g6;
	}
	public String getG7() {
		return G7;
	}
	public void setG7(String g7) {
		G7 = g7;
	}
	public String getG8() {
		return G8;
	}
	public void setG8(String g8) {
		G8 = g8;
	}
	public String getG9() {
		return G9;
	}
	public void setG9(String g9) {
		G9 = g9;
	}
	public String getG10() {
		return G10;
	}
	public void setG10(String g10) {
		G10 = g10;
	}
	public String getC1() {
		return C1;
	}
	public void setC1(String c1) {
		C1 = c1;
	}
	public String getC2() {
		return C2;
	}
	public void setC2(String c2) {
		C2 = c2;
	}
	public String getC3() {
		return C3;
	}
	public void setC3(String c3) {
		C3 = c3;
	}
	public String getC4() {
		return C4;
	}
	public void setC4(String c4) {
		C4 = c4;
	}
	public String getC5() {
		return C5;
	}
	public void setC5(String c5) {
		C5 = c5;
	}
	public String getC6() {
		return C6;
	}
	public void setC6(String c6) {
		C6 = c6;
	}
	public String getA1() {
		return A1;
	}
	public void setA1(String a1) {
		A1 = a1;
	}
	public String getA2() {
		return A2;
	}
	public void setA2(String a2) {
		A2 = a2;
	}
	public String getA3() {
		return A3;
	}
	public void setA3(String a3) {
		A3 = a3;
	}
	public String getA4() {
		return A4;
	}
	public void setA4(String a4) {
		A4 = a4;
	}
	public String getA5() {
		return A5;
	}
	public void setA5(String a5) {
		A5 = a5;
	}
	public String getA6() {
		return A6;
	}
	public void setA6(String a6) {
		A6 = a6;
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
				.append(", fecha_Entrada=").append(fecha_Entrada).append(", fecha_Salida=").append(fecha_Salida)
				.append(", cantidad=").append(cantidad).append(", noche=").append(noche).append(", hora_Entrada=")
				.append(hora_Entrada).append(", valor_pagar=").append(valor_pagar).append(", diferencia=")
				.append(diferencia).append(", paquete=").append(paquete).append(", publicidad=")
				.append(publicidad).append(", observacion=").append(observacion).append(", id=").append(id).append(", G1=").append(G1)
				.append(", G2=").append(G2).append(", G3=").append(G3).append(", G4=").append(G4).append(", G5=")
				.append(G5).append(", G6=").append(G6).append(", G7=").append(G7).append(", G8=").append(G8)
				.append(", G9=").append(G9).append(", G10=").append(G10).append(", C1=").append(C1).append(", C2=")
				.append(C2).append(", C3=").append(C3).append(", C4=").append(C4).append(", C5=").append(C5)
				.append(", C6=").append(C6).append(", A1=").append(A1).append(", A2=").append(A2).append(", A3=")
				.append(A3).append(", A4=").append(A4).append(", A5=").append(A5).append(", A6=").append(A6)
				.append(", selecionarHabitacion=").append(selecionarHabitacion).append("]");
		return builder.toString();
	}
	
	
	
	
}
