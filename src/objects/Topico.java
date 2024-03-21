package objects;

import enums.Consistencia;

import java.time.LocalDate;

public class Topico extends Producto{
	
	private int pao;
	private Consistencia consistencia;
	private String aplicacion;
	
	// CONSTRUCTOR

	public Topico(int id, String nombre, double precio, double cantidad, String unidad, LocalDate fechaCaducidad,
			int pao, Consistencia consistencia, String aplicacion) {
		super(id, nombre, precio, cantidad, unidad, fechaCaducidad);
		this.pao = pao;
		this.consistencia = consistencia;
		this.aplicacion = aplicacion;
	}
	
	// GETTERS Y SETTERS

	public int getPao() {
		return pao;
	}

	public void setPao(int pao) {
		this.pao = pao;
	}

	public Consistencia getConsistencia() {
		return consistencia;
	}

	public void setConsistencia(Consistencia consistencia) {
		this.consistencia = consistencia;
	}

	public String getAplicacion() {
		return aplicacion;
	}

	public void setAplicacion(String aplicacion) {
		this.aplicacion = aplicacion;
	}
	
	
	
	

	

}
