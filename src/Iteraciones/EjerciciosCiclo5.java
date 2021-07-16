package Iteraciones;
import java.util.Scanner;
public class EjerciciosCiclo5 {
		public static void main(String[] args) {
			//FALTA CORREGIR
			Scanner sc=new Scanner(System.in);
			int contador=0, number=0,aux=0,inicio=0,finish=0;
			imprimir("Introduzca el inicio");
			inicio = sc.nextInt();//51
			imprimir("Introduzca el final");
			finish = sc.nextInt();//60
			
			int repeticiones = finish - inicio;//9
			for(int y = inicio; y<=finish; y++ ) {
				imprimir(String.valueOf(y));
				for(int i=inicio; i<=finish; i++) {
					if(y%i==0) {
						imprimir("Divisible entre "+i);
						contador++;
					}
				}
				imprimir(String.valueOf(contador));
				if(contador == 2) {
				aux++;
			}
				contador=0;
				imprimir("");
			}
			imprimir("Hay "+aux+" primos");
		}
		
		static void imprimir(String s) {
			System.out.println(s);
		}

}
