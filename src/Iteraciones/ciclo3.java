package Iteraciones;
import java.util.Scanner;
public class ciclo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,respuesta;
		do {
			System.out.println("Inserte un número");
			num = sc.nextInt();
			multiplos(num);
			respuesta = sc.nextInt();
			while(respuesta >=2) {
				System.out.println("Numero erroneo, intente de nuevo");
				respuesta = sc.nextInt();
			}
		}while(respuesta !=0);
		System.out.println("Fin del programa");
	}
	public static int multiplos(int num) {
		System.out.println("Numeros multiplos de "+num);
		for(int i=1; i<= 100; i++) {
			if(i%num==0) {
				System.out.println(i);
			}
		}
		System.out.println("¿Quiere empezar de nuevo?");
		System.out.println("1: Sí");
		System.out.println("0: No");
		return num;
	}
}
