package Colecciones;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class Colecciones {

	public static void main(String[] args) {
		/*
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
		*/
		
		
		//Implementación de un arrayList
		//Clase General (interfaz), tipo de datos que usaré, nombre de mi estructura de datos, instancia de dicha clase general.
		List<String> listaDeContactos = new ArrayList<>();
		
		//Agrego elementos del tipo String a mi arrayList llamado listaDeContactos
		listaDeContactos.add("Felipe");
		listaDeContactos.add("Roberto");
		listaDeContactos.add("Alicia");
		listaDeContactos.add("Fatima");
		
		//Obtener un elemento de la lista - asignarlo a una variable
		String datoFelipe = listaDeContactos.get(0);
		
		System.out.println(datoFelipe);
		
		//Borrar un elemento de la lista
		listaDeContactos.remove(1);
		System.out.println(listaDeContactos);
		
		//Implementación de un conjunto (SET)
		//Sintáxis
		//Interface de donde implemento + tipo de datos que usaré +  nombre que le doy al conjunto + instancia de la clase específica
		
		Set<String> cartasDeJuego = new HashSet<>();
		
		//Agregar elementos
		cartasDeJuego.add("As de corazones");
		cartasDeJuego.add("2 de picas");
		cartasDeJuego.add("Reina de Tréboles");
		
		
		//No puedo saber posiciones, solo saber si lo contiene
		if(cartasDeJuego.contains("Reina de Corazones")) {
			System.out.println("La reina de tréboles sí está en el conjunto");
		}else {
			System.out.println("No encuentro el elemento solicitado");
		}
		
		/*
		Set<Doctores> conjuntoDeDoctores = new HashSet<>();
		
		conjuntoDeDoctores.add("Felipe", "Maqueda", 31, 500.00, "Odontólogo");
		conjuntoDeDoctores.contains("Felipe");
		conjuntoDeDoctores.contains("Odontólogo");
		*/
		
		
		//Implementación de un mapa (hashMap)
		
		Map <String, String> libretaDirecciones = new HashMap<>();
		
		//Agregar elementos a mi libreta direcciones, donde mi K =  nombre y mi V = dirección
		libretaDirecciones.put("Felipe", "Tlalnepantla");
		libretaDirecciones.put("Doctor Simi", "CDMX");
		libretaDirecciones.put("Konoha", "Naruto");
		
		//Método para sacar información de la libreta, creando una nueva Variable
		String direccionFelipe = libretaDirecciones.get("Felipe");
		String direccionDeNaruto = libretaDirecciones.get("Naruto"); //null
		
		//impresión
		System.out.println(direccionFelipe);
		System.out.println(direccionDeNaruto);
		
		
		
		
		
		
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
 * 
 * 
 * 
 * 	- ArrayList
 * 
 * 	Es una implementación de una lista (List), es decir, que está en un nivel abajo de las listas. Utiliza un array dinámico que permite almacenar datos. 
 * 
 * Sus prinicpales características son:
 * 		-Tamaño dinámico, a diferencia de los arrays tradicionales, el tamaño de un arrayList si se puede modificar.
 * 		- Acceso rápido, podemos acceder a un elemento del arrayList por su posición o índice.
 * 		- Coste elevado al momento de insertar o eliminar elementos. Si agrego un elemento, tengo que recorrer todos los demás elementos. 
 * 
 * 
 * Set (conjunto)
 * 
 * Estructura de datos que almacena datos únicos sin orden específico. Las prinicpales caracterías de un set son:
 * 		- No hjay elementos duplicados, ya que los conjuntos no los pueden contener. Si se intenta agregar un elemento ya existente, la operacion se ignora.
 * 		- No hay un orden específico, los elementos se almacenan sin orden específico. 
 * 		- La búsqueda es más sencilla, ya que al no tener elementos duplicados se usa una función hash para encontrar el elemento deseado. 
 * 
 * 
 * 
 * Map (mapas)
 * 
 * Un mapa es una estructura de datos que almacena pares de clave-valor.
 * 
 * 	- Almacenamiento con pares K-V
 * 	- Sin orden alfabético (similar a un Set)
 * 	- Búsqueda rápida, la búsqueda se hace por meido de un valor (key), y usa una función interna hash para buscar elementos.
 * 
 * 
 * Agenda telefónica (aagendar, modificar, eliminar)
 * 
 */














