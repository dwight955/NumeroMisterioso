package practicaBasica;
import java.util.Scanner;
public class DoWhile {

	public static void main(String[] args) {
		int contraseņa;
		int intentos = 0;
		Scanner sc = new Scanner(System.in);
		do {
			imprimir("Introduzca contraseņa");
			contraseņa = sc.nextInt();
			if(contraseņa != 1234) {
				intentos++;
				imprimir("Losiento, intente de nuevo, "+intentos);
			}
		}while(intentos<=3 && contraseņa != 1234);
		if(contraseņa==1234) {
			imprimir("Bienvenido al sistema");
		}else {
			imprimir("Alcanzo el limite de intentos");
		}
	}
	static void imprimir(String s) {
		System.out.println(s);
	}
}
