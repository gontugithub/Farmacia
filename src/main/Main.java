package main;

import enums.Consistencia;
import objects.Direccion;
import objects.Farmacia;
import objects.Item;
import objects.Producto;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	private static Farmacia f1 = new Farmacia("FARMACIA PACO",new Direccion(),new ArrayList<Producto>());
	private static ArrayList<Item> carrito = new ArrayList<>();

	public static void main(String[] args) {



		f1.addproductooral("RACUTAN",23.2,40,"capsula", LocalDate.of(2025, Month.DECEMBER,23),false,1);
		f1.addproductooral("IBUPROFENO",32.8,80,"pastilla", LocalDate.of(2025, Month.MARCH,23),true,3);
		f1.addproductooral("PARACETAMOL",13.3,70,"pastilla", LocalDate.of(2025, Month.FEBRUARY,23),false,3);
		f1.addproductooral("SENTRALINA",50,84,"capsula", LocalDate.of(2025, Month.APRIL,23),true,2);
		f1.addproductotopico("NIVEA",20.99,200,"ml", LocalDate.of(2025, Month.APRIL,23),12, Consistencia.CREMA,"En todo el cuerpo");
		f1.addproductotopico("VASELINA",10.98,50,"mg", LocalDate.of(2025, Month.APRIL,23),12, Consistencia.BALSAMO,"En los labios");
		f1.addproductotopico("FISIOCREAM",25.12,100,"ml", LocalDate.of(2025, Month.APRIL,23),30, Consistencia.POMADA,"Donde te duela");
		f1.addproductotopico("SERUM",50.5,52,"ml", LocalDate.of(2025, Month.APRIL,23),12, Consistencia.LOCION,"En la cara, para las arrugas");

		mostrarproductos(f1);
		agregarproductocarrito(sc.nextInt());



	}

	public static void mostrarproductos(Farmacia farmacia){
		Producto p1;
		for (int i = 0; i < farmacia.getProductos().size(); i++){
			p1 = farmacia.getProductos().get(i);
			System.out.println("\n  ["+p1.getId()+"] "+p1.getNombre() + " - "+p1.getPrecio() +" €");
		}
	}

	public static void agregarproductocarrito(int producto){
		boolean flag = false;

		if (producto == 0){
			System.out.println("\nIMPRIMPIENDO TICKET ... \n");
			imprimirticket();
		} else {
			for (int i = 0; i < carrito.size(); i++) {
				if(carrito.get(i).getProducto().equals(f1.getProductos().get(producto-1))){
					carrito.get(i).setCantidad(carrito.get(i).getCantidad()+1);
					System.out.println(carrito.get(i).getProducto().getNombre() + " AGREGADO AL CARRITO");
					flag = true;
				}
				if (flag == true) break;
			}

			if (flag == false){
				carrito.add(new Item(f1.getProductos().get(producto-1),1));
				System.out.println(f1.getProductos().get(producto-1).getNombre() + " AGREGADO AL CARRITO");
			}
			agregarproductocarrito(sc.nextInt());
		}

    };

	public static void imprimirticket(){
		double preciofinal = 0;
		for (int i = 0; i<carrito.size(); i++){
			System.out.println(carrito.get(i).getProducto().getNombre() + " x"+ carrito.get(i).getCantidad() + " -" + carrito.get(i).getProducto().getPrecio()*carrito.get(i).getCantidad()+ "€");
			preciofinal += carrito.get(i).getProducto().getPrecio()*carrito.get(i).getCantidad();
		}

		System.out.println("\nTOTAL: " + preciofinal + "€");

	}


}
