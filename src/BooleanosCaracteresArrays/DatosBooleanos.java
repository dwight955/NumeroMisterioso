package BooleanosCaracteresArrays;
import java.util.Scanner;
public class DatosBooleanos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean esPar;
		int dato;
		do {
		dato = sc.nextInt();
		esPar = dato % 2 == 0;
			if(!esPar) {
			System.out.println("ImPar "+ esPar);
			}else {
			System.out.println("par "+ esPar);
			}
		}while(dato !=0);
	}

}
