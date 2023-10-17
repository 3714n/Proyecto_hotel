package Com.Proyecto_Hotel.Registro_Clientes;

public class Datos_Habitacion {
	private Boolean G1= false;
	private Boolean G2 = false; 
	private Boolean G3= false;
	private Boolean G4= false;
	private Boolean G5= false;
	private Boolean G6= false;
	private Boolean G7= false;
	private Boolean G8= false;
	private Boolean G9= false;
	private Boolean G10= false;
	private Boolean C1= false;
	private Boolean C2= false;
	private Boolean C3= false;
	private Boolean C4= false;
	private Boolean C5= false;
	private Boolean C6= false;
	private Boolean A1= false;
	private Boolean A2= false;
	private Boolean A3= false;
	private Boolean A4= false;
	private Boolean A5= false;
	private java.util.Date FechaEntrada; 
	private java.util.Date FechaSalida; 
	private String Cedula;
	public Datos_Habitacion() {
		super();
	}
	public Datos_Habitacion(Boolean g1, Boolean g2, Boolean g3, Boolean g4, Boolean g5, Boolean g6, Boolean g7,
			Boolean g8, Boolean g9, Boolean g10, Boolean c1, Boolean c2, Boolean c3, Boolean c4, Boolean c5, Boolean c6,
			Boolean a1, Boolean a2, Boolean a3, Boolean a4, Boolean a5,java.util.Date fechaEntrada,
			java.util.Date fechaSalida, String cedula) {
		super();
		G1 = g1;
		G2 = g2;
		G3 = g3;
		G4 = g4;
		G5 = g5;
		G6 = g6;
		G7 = g7;
		G8 = g8;
		G9 = g9;
		G10 = g10;
		C1 = c1;
		C2 = c2;
		C3 = c3;
		C4 = c4;
		C5 = c5;
		C6 = c6;
		A1 = a1;
		A2 = a2;
		A3 = a3;
		A4 = a4;
		A5 = a5;
		this.FechaEntrada = fechaEntrada;
		this.FechaSalida = fechaSalida;
		this.Cedula = cedula;
	}
	public Boolean getG1() {
		return G1;
	}
	public Boolean getG2() {
		return G2;
	}
	public Boolean getG3() {
		return G3;
	}
	public Boolean getG4() {
		return G4;
	}
	public Boolean getG5() {
		return G5;
	}
	public Boolean getG6() {
		return G6;
	}
	public Boolean getG7() {
		return G7;
	}
	public Boolean getG8() {
		return G8;
	}
	public Boolean getG9() {
		return G9;
	}
	public Boolean getG10() {
		return G10;
	}
	public Boolean getC1() {
		return C1;
	}
	public Boolean getC2() {
		return C2;
	}
	public Boolean getC3() {
		return C3;
	}
	public Boolean getC4() {
		return C4;
	}
	public Boolean getC5() {
		return C5;
	}
	public Boolean getC6() {
		return C6;
	}
	public Boolean getA1() {
		return A1;
	}
	public Boolean getA2() {
		return A2;
	}
	public Boolean getA3() {
		return A3;
	}
	public Boolean getA4() {
		return A4;
	}
	public Boolean getA5() {
		return A5;
	}
	public java.util.Date getFechaEntrada() {
		return FechaEntrada;
	}
	public java.util.Date getFechaSalida() {
		return FechaSalida;
	}
	public String getCedula() {
		return Cedula;
	}
	public void setG1(Boolean g1) {
		G1 = g1;
	}
	public void setG2(Boolean g2) {
		G2 = g2;
	}
	public void setG3(Boolean g3) {
		G3 = g3;
	}
	public void setG4(Boolean g4) {
		G4 = g4;
	}
	public void setG5(Boolean g5) {
		G5 = g5;
	}
	public void setG6(Boolean g6) {
		G6 = g6;
	}
	public void setG7(Boolean g7) {
		G7 = g7;
	}
	public void setG8(Boolean g8) {
		G8 = g8;
	}
	public void setG9(Boolean g9) {
		G9 = g9;
	}
	public void setG10(Boolean g10) {
		G10 = g10;
	}
	public void setC1(Boolean c1) {
		C1 = c1;
	}
	public void setC2(Boolean c2) {
		C2 = c2;
	}
	public void setC3(Boolean c3) {
		C3 = c3;
	}
	public void setC4(Boolean c4) {
		C4 = c4;
	}
	public void setC5(Boolean c5) {
		C5 = c5;
	}
	public void setC6(Boolean c6) {
		C6 = c6;
	}
	public void setA1(Boolean a1) {
		A1 = a1;
	}
	public void setA2(Boolean a2) {
		A2 = a2;
	}
	public void setA3(Boolean a3) {
		A3 = a3;
	}
	public void setA4(Boolean a4) {
		A4 = a4;
	}
	public void setA5(Boolean a5) {
		A5 = a5;
	}
	public void setFechaEntrada(java.util.Date fechaEntrada) {
		this.FechaEntrada = fechaEntrada;
	}
	
	public void setFechaSalida(java.util.Date fechaSalida) {
		this.FechaSalida = fechaSalida;
	}
	public void setCedula(String cedula) {
		this.Cedula = cedula;
	}
	@Override
	public String toString() {
		return "Datos_Habitacion [G1=" + G1 + ", G2=" + G2 + ", G3=" + G3 + ", G4=" + G4 + ", G5=" + G5 + ", G6=" + G6
				+ ", G7=" + G7 + ", G8=" + G8 + ", G9=" + G9 + ", G10=" + G10 + ", C1=" + C1 + ", C2=" + C2 + ", C3="
				+ C3 + ", C4=" + C4 + ", C5=" + C5 + ", C6=" + C6 + ", A1=" + A1 + ", A2=" + A2 + ", A3=" + A3 + ", A4="
				+ A4 + ", A5=" + A5 + ", FechaEntrada=" + FechaEntrada + ", FechaSalida=" + FechaSalida + ", Cedula="
				+ Cedula + "]";
	}
	
	
	
}