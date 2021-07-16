package Iteraciones;
import java.util.Scanner;
public class EjerciciosCiclo7 {

	public static void main(String[] args) {
		int dato;
		boolean todoCorrecto;
		Scanner sc = new Scanner(System.in);
		/*do {
			System.out.println("Introduce un dato del 0 al 10");
			dato = sc.nextInt();
			todoCorrecto = true;
			if(dato < 0) {
				todoCorrecto = false;
			}else if(dato > 10) {
				todoCorrecto = false;
			}else if(! todoCorrecto) {
				System.out.println("No es válido");
			}
		}while(!todoCorrecto);
		System.out.println("Terminado!");
		*/
		do {
			System.out.println("Introduce un dato del 0 al 10");
			dato = sc.nextInt();
			todoCorrecto = (dato>=0) && (dato <= 10);
			if(!todoCorrecto)
				System.out.println("No es válido");
		}while(!todoCorrecto);
		System.out.println("Terminado");
	}
}
