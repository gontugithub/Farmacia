package objects;

import java.time.LocalDate;

public class Oral extends Producto {
	
	private boolean ayunas;
	private double dosismaxima;
	
	// CONSTRUCTOR
	
	public Oral(int id, String nombre, double precio, double cantidad, String unidad, LocalDate fechaCaducidad,
			boolean ayunas, double dosismaxima) {
		super(id, nombre, precio, cantidad, unidad, fechaCaducidad);
		this.ayunas = ayunas;
		this.dosismaxima = dosismaxima;
	}

	// GETTERS Y SETTERS

	
	public boolean isAyunas() {
		return ayunas;
	}

	public void setAyunas(boolean ayunas) {
		this.ayunas = ayunas;
	}
	
	public double getDosismaxima() {
		return dosismaxima;
	}

	public void setDosismaxima(double dosismaxima) {
		this.dosismaxima = dosismaxima;
	}
	
	

}
