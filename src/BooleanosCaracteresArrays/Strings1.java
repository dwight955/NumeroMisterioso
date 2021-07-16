package BooleanosCaracteresArrays;
import java.util.Scanner;

public class Strings1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String texto1 = "Hola";
		//Declarar y dar valor usando un "constructor"
		String texto2 = new String("Prueba");
		//Declaracion sin valor
		String resultado;
		System.out.println("Texto 1 :"+texto1);
		System.out.println("Texto 2 :"+texto2);
		
		//Manipulaciones basicas
		resultado = texto1 + texto2;
		System.out.println("Concatenado los dos dan: "+ resultado);
		
		resultado = texto1 + 5 + " " + 23.5 + '.';
		System.out.println("Concatenado varios: "+ resultado);
		
		System.out.println("");
		
		//Longitud de la cadena
		System.out.println("La longitud del texto 2 es: "+ texto2.length());
		System.out.println("La segunda letra del texto 2 es: "+ texto2.charAt(2));
		imprimir("");
		
		//En general, las operaciones no modifican la cadena 
		texto2.toUpperCase();
		imprimir("Texto 2 no cambio a mayusculas: "+texto2);
		resultado = texto2.toUpperCase();
		imprimir("Ahora si: "+resultado);
		
		imprimir("");
		
		//Podemos extraer fragmentos 
		resultado = texto2.substring(2, 5);
		imprimir("Tres letras desde la posicion 2: "+ resultado);
		
		imprimir("");
		
		//Comparacion de cadenas
		imprimir("Comparamos texto1 y texto2"+texto1.compareTo(texto2));
		if(texto1.compareTo(texto2)<0)
			imprimir("Texto 1 es menor que texto 2");
		
		imprimir("");
		
		//Finalmente, pedimos su nombre completo al usuario
		imprimir("¿Cómo te llamas?");
		//String nombre = sc.nextLine();
		//imprimir("Hola, " + nombre);
		
		imprimir("");
		
		//O podemos bien leer sólo la primera palabra
		imprimir("Teclea varias palabras y espacios...");
		String primeraPalabra = sc.next();
		imprimir("La primera letra es: "+ primeraPalabra);
	}
	static void imprimir(String s) {
		System.out.println(s);
	}
}
