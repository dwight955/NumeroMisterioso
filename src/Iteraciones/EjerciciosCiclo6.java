package Iteraciones;
import java.lang.annotation.Repeatable;
import java.util.Scanner;
public class EjerciciosCiclo6 {
	private static int primos;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int inicio,finish,primos = 0,aux=0;
		System.out.println("Ingrese el inicio y el final");
		inicio = sc.nextInt();//5
		finish = sc.nextInt();//20
		for(int i =inicio;i<=finish;i++) {
			int contador =0;
			System.out.println(i);
				for(int y=1; y<=100;y++) {
					if(i%y==0) {
						System.out.println("Divisible entre "+ y);
						contador++;
					}
			}
				if(contador == 2) {
					System.out.println("Es primo");
					primos++;
					System.out.println(primos);
				}
		}
		System.out.println("Hay "+primos+" primos");
	}
	static void imprimir(String s) {
		System.out.println(s);
	}
}