package Colecciones;

public class Colecciones {

	public static void main(String[] args) {
		
		//Array
		//tipo de datos del array, nombre, instancia del objeto, arreglo, los datos
		String[] listaDeCompras = new String[] {
				"Leche", "Pan", "Huevos"
				};
		
		//Esta impresión solo muestra el espacio de memoria
		System.out.println(listaDeCompras);
		
		//Imprimir info de listaDeCompras con un forEach
		//Para el dato de tipo String que llamaremos productoAImprimir de la lista de compras, lo valos a tomar y lo vamos a imprimir
		for(String productoAImprimir : listaDeCompras) {
			System.out.println(productoAImprimir);
		}

	}//main

}//class


/*
 * Colecciones
 * 
 * 	-Arrays (arreglos)
 * 
 * 	Es una estructura de datos olineal que contiene elementos del mismo tipo. Los elementos están almacenados de forma contigua (uno al lado del otro), y se pueden acceder a ellos a través de un índice. Las principales características de un array son:
 * 
 * 		- Es una estructura de datos fija, generalmente almacena datos del mismo tipo.
 * 		- La longitud de un array se establece al momento e crearlo, y no cambia.
 * 		- Podemos acceder a elementos per medio de un índice.
 * 		- Los arrays pueden contener datos primitivos y objetos
 * 		- No proporciona métodos adicionales para agregar o eliminar elementos
 * 
 * 
 * Un ejemplo de array es una lista de compras del supermercado
 */














