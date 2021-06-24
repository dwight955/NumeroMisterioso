package Iteraciones;
import java.util.Scanner;
public class ciclos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte alto,ancho;
		
		System.out.println("Introduzca el ancho del rectangulo");
		ancho = sc.nextByte();
		System.out.println("Introduzca el alto del rectangulo");
		alto = sc.nextByte();
		
		for(int fila=0;fila <=alto; fila++) {
			for(int columna=0; columna <=ancho; columna++) {
				if((fila == 0) || (fila == alto)||(columna == 0) || (columna == ancho)){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
