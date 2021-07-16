package BooleanosCaracteresArrays;
import java.util.Scanner;
public class EjercicioString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserte su nombre");
		String nombre = sc.nextLine();
		int tama�o = nombre.length();
		while(verificador(tama�o, nombre) !=0) {
			System.out.println("Ha introducido el nombre mal");
			nombre = sc.nextLine();
			verificador(tama�o, nombre);
		}
		System.out.println("Bienvenido "+ nombre);
	}
	static int verificador(int tama�o, String nombre) {
		String caracter = nombre.substring(0, 1);
		String caracteres = nombre.substring(1, tama�o);
		String letterMayuscula = caracter.toUpperCase();
		String letterMiniscula = caracteres.toLowerCase();
		String nombreCorrecto = letterMayuscula + letterMiniscula;
		int op = nombre.compareTo(nombreCorrecto);
		return op;
	}
}
