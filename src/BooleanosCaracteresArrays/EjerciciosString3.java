package BooleanosCaracteresArrays;
import java.util.Scanner;
public class EjerciciosString3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su nombre");
		String nombreDeEntrada = sc.nextLine();
		String nombre = nombreDeEntrada.toLowerCase();
		int tamaño = nombre.length();
		StringBuilder cadena = new StringBuilder(nombre);
		//dwight
		//012345
		//123456.lenght
		for(int i=0;i<tamaño; i++) {
			if(i%2 == 0) {
				char car = nombre.charAt(i);
				String letterMayusculas = String.valueOf(car).toUpperCase();
				cadena.replace(i, i+1, letterMayusculas);
			}
		}
		imprimir(cadena.toString());
	}
	static void imprimir(String s) {
		System.out.print(s);
	}
}
