package practicaBasica;

import java.util.Scanner;

public class BasesDeJava {

	public static void main(String[] args) {
		
		
		Scanner escanear = new Scanner(System.in);
		/*
		int centigrados, fahrenheit;
		System.out.println("Temperatura en Centigrados");
		centigrados = escanear.nextInt();
		fahrenheit = (9 * centigrados/5) + 32;
		System.out.println( centigrados + " °C es igual a " + fahrenheit + " °F");
		*/
		
		int b, a, s;
		
		System.out.println("Cuanto mide la base del triangulo");
		b = escanear.nextInt();
		System.out.println("Cuanto mide la altura del triangulo");
		a = escanear.nextInt();
		
		s = (b*a)/2;
		System.out.println("La superficie es :" + s);
		
	}
}
