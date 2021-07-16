package Iteraciones;
import java.util.Scanner;
public class EjerciciosCiclo4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int respuesta=0;
		do {
			int number,contador=0;
			imprimir("Inserte un numero");
			number = sc.nextInt();
			verificar(number, contador);
			respuesta = sc.nextInt();
		}while(respuesta != 0);
		imprimir("Fin del programa :D");
	}
	static void verificar(int number, int contador ) {
		for(int i=1; i<=50;i++) {
			if(number%i==0) {
				imprimir("Divisible entre "+ String.valueOf(i));
				contador++;
			}
		}
		if(contador == 2) {
			imprimir("Es primo");
			mensaje();
		}else {
			imprimir("No es primo");
			mensaje();
		}
	}
	static void mensaje() {
		imprimir("¿Repetir?");
		imprimir("1:Si");
		imprimir("0:No");
	}
	static void imprimir(String s) {
		System.out.println(s);
	}
}
