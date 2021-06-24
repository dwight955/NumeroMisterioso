package practicaBasica;
import java.util.Scanner;
public class DoWhile {

	public static void main(String[] args) {
		int contraseña;
		int intentos = 0;
		Scanner sc = new Scanner(System.in);
		do {
			imprimir("Introduzca contraseña");
			contraseña = sc.nextInt();
			if(contraseña != 1234) {
				intentos++;
				imprimir("Losiento, intente de nuevo, "+intentos);
			}
		}while(intentos<=3 && contraseña != 1234);
		if(contraseña==1234) {
			imprimir("Bienvenido al sistema");
		}else {
			imprimir("Alcanzo el limite de intentos");
		}
	}
	static void imprimir(String s) {
		System.out.println(s);
	}
}
