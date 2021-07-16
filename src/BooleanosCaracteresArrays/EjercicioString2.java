package BooleanosCaracteresArrays;
import java.util.Scanner;
public class EjercicioString2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//StringBuilder
		String nombre = sc.nextLine();
		StringBuilder texto1 = new StringBuilder(nombre);
		String primerCaracter = nombre.substring(0,1);
		String caracterA = "A";
		if(primerCaracter.compareTo(caracterA) == 0) {
			String nuevoTexto = texto1.replace(0, 1, "B").toString();
			imprimir(nuevoTexto);
		}else {
			String nuevoTexto = texto1.replace(0, 1, "A").toString();
			imprimir(nuevoTexto);
		}
		
	}
	static void imprimir(String s) {
		System.out.println(s);
	}
}
