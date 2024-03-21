package objects;

import enums.Consistencia;

import java.time.LocalDate;
import java.util.ArrayList;

public class Farmacia {
	
	private String nombre;
	private Direccion direccion;
	private ArrayList<Producto> productos;
	
	
	// CONSTRUCTOR 
	
	public Farmacia(String nombre, Direccion direccion, ArrayList<Producto> productos) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.productos = productos;
	}

	// METODOS

	public void addproductooral( String nombre, double precio, double cantidad, String unidad, LocalDate fechaCaducidad, boolean ayunas, double dosismax){
			this.productos.add(new Oral(this.productos.size()+1, nombre,precio,cantidad,unidad,fechaCaducidad,ayunas,dosismax));

	}

	public void addproductotopico(String nombre, double precio, double cantidad, String unidad, LocalDate fechaCaducidad, int pao, Consistencia consistencia, String aplicacion){
		this.productos.add(new Topico(this.productos.size()+1, nombre,precio,cantidad,unidad,fechaCaducidad,pao,consistencia,aplicacion));

	}
	
	// GETTERS Y SETTERS

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	


	public Direccion getDireccion() {
		return direccion;
	}



	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}


	public ArrayList<Producto> getProductos() {
		return productos;
	}


	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	
	
	
	
	
	
	
	
}
