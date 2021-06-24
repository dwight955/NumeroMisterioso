package practicaBasica;
import java.util.Scanner;
public class DoWhile {

	public static void main(String[] args) {
		int contrase�a;
		int intentos = 0;
		Scanner sc = new Scanner(System.in);
		do {
			imprimir("Introduzca contrase�a");
			contrase�a = sc.nextInt();
			if(contrase�a != 1234) {
				intentos++;
				imprimir("Losiento, intente de nuevo, "+intentos);
			}
		}while(intentos<=3 && contrase�a != 1234);
		if(contrase�a==1234) {
			imprimir("Bienvenido al sistema");
		}else {
			imprimir("Alcanzo el limite de intentos");
		}
	}
	static void imprimir(String s) {
		System.out.println(s);
	}
}
