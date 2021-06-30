package Iteraciones;
import java.util.Scanner;
public class funciones {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2,respuesta;
		do {
			System.out.println("Introduzca dos numeros");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			sumar(num1,num2);
			respuesta = sc.nextInt();
		}while(respuesta != 0 );
		System.out.println("Fin del programa");
	}
	static int sumar(int a, int b) {
		int r = a + b;
		System.out.println(r);
		System.out.println("¿Quiere empezar de nuevo?");
		System.out.println("1: Si");
		System.out.println("0: No");
		return r;
	}

}
