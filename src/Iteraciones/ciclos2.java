package Iteraciones;
import java.util.Scanner;
public class ciclos2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el alto");
		byte alto = sc.nextByte();
		System.out.println("Introduzca el ancho");
		byte ancho = sc.nextByte();
		
		for(int fila=1; fila <= alto;fila++) {
			for(int columna = 1; columna <= ancho;columna++ ) {
				if((fila==1)||(fila == alto)|| (columna==1) || (columna==ancho)) {
					System.out.print("*");
				}else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
