package BooleanosCaracteresArrays;
import java.util.Scanner;
public class EjercicioString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserte su nombre");
		String nombre = sc.nextLine();
		int tamaño = nombre.length();
		while(verificador(tamaño, nombre) !=0) {
			System.out.println("Ha introducido el nombre mal");
			nombre = sc.nextLine();
			verificador(tamaño, nombre);
		}
		System.out.println("Bienvenido "+ nombre);
	}
	static int verificador(int tamaño, String nombre) {
		String caracter = nombre.substring(0, 1);
		String caracteres = nombre.substring(1, tamaño);
		String letterMayuscula = caracter.toUpperCase();
		String letterMiniscula = caracteres.toLowerCase();
		String nombreCorrecto = letterMayuscula + letterMiniscula;
		int op = nombre.compareTo(nombreCorrecto);
		return op;
	}
}
