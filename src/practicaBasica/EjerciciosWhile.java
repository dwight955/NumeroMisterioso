package practicaBasica;
import java.util.Scanner;
public class EjerciciosWhile {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		/**Ejercicio 1**/
		/*int x = 5, contador=1;
		while (contador <= 12) {
			imprimir(x + " x "+ contador + " = " + String.valueOf(x*contador));
			contador++;
		}
		imprimir("Terminado!");*/
		
		/**Ejercicio 2**/
		/*imprimir("Introduzca un numero");
		int number = sc.nextInt();
		while(number !=0){
			imprimir(number + " elevado a la 2 es... "+ String.valueOf((int) Math.pow(number, 2)));
			imprimir("Introduce otro número");
			number = sc.nextInt();
		}
		imprimir("El programa ha finalizado");*/
		
		
	}
	static void imprimir(String s) {
		System.out.println(s);
	}
}
