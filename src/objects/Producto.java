package objects;

import java.time.LocalDate;

public class Producto {
	
	private int id;
	private String nombre;
	private double precio;
	private double cantidad ;
	private String unidad;
	private LocalDate fechaCaducidad;
	
	// CONSTRUCTOR
	
	public Producto(int id, String nombre, double precio, double cantidad, String unidad, LocalDate fechaCaducidad) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
		this.unidad = unidad;
		this.fechaCaducidad = fechaCaducidad;
	}
	

	// GETTERS Y SETTERS

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

	public LocalDate getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(LocalDate fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	@Override
	public String toString() {
		return "\n  ["+id+"] "+nombre + " - "+precio+" €";
	}
}
