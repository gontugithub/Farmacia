package main;

import enums.Consistencia;
import objects.Direccion;
import objects.Farmacia;
import objects.Producto;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Farmacia f1 = new Farmacia("FARMACIA PACO",new Direccion(),new ArrayList<Producto>());

		f1.addproductooral("RACUTAN",23.2,40,"capsula", LocalDate.of(2025, Month.DECEMBER,23),false,1);
		f1.addproductooral("IBUPROFENO",32.8,80,"pastilla", LocalDate.of(2025, Month.MARCH,23),true,3);
		f1.addproductooral("PARACETAMOL",13.3,70,"pastilla", LocalDate.of(2025, Month.FEBRUARY,23),false,3);
		f1.addproductooral("SENTRALINA",50,84,"capsula", LocalDate.of(2025, Month.APRIL,23),true,2);
		f1.addproductotopico("NIVEA",20.99,200,"ml", LocalDate.of(2025, Month.APRIL,23),12, Consistencia.CREMA,"En todo el cuerpo");
		f1.addproductotopico("VASELINA",10.98,50,"mg", LocalDate.of(2025, Month.APRIL,23),12, Consistencia.BALSAMO,"En los labios");
		f1.addproductotopico("FISIOCREAM",25.12,100,"ml", LocalDate.of(2025, Month.APRIL,23),30, Consistencia.POMADA,"Donde te duela");
		f1.addproductotopico("SERUM",50.5,52,"ml", LocalDate.of(2025, Month.APRIL,23),12, Consistencia.LOCION,"En la cara, para las arrugas");

		mostrarproductos(f1);
		System.out.println(agregarproductocarrito(sc.nextInt()));
		




	}

	public static void mostrarproductos(Farmacia farmacia){
		Producto p1;
		for (int i = 0; i < farmacia.getProductos().size(); i++){
			p1 = farmacia.getProductos().get(i);
			System.out.println("\n  ["+p1.getId()+"] "+p1.getNombre() + " - "+p1.getPrecio() +" €");
		}
	}

	public static ArrayList<Integer> agregarproductocarrito(int producto){

		ArrayList<Integer> carrito = new ArrayList<>();
		carrito.add(producto);
        return carrito;
    };


}
