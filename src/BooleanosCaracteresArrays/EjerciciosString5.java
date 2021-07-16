package BooleanosCaracteresArrays;
import java.util.Scanner;
public class EjerciciosString5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int TAMAYO = 8;
		int[] enteros = new int [TAMAYO];
		
		for(int i = 0;i<TAMAYO;i++) {
			System.out.println("Introduzca el "
			+ "valor de la posicion ["+i+"]");
			enteros[i] = sc.nextInt();
		}
		int numMayor = enteros[0], numMenor = enteros[0];
		for(int i =0; i<TAMAYO;i++ ) {
			if(enteros[i] > numMayor) {
				numMayor = enteros[i];
			}
		}
		System.out.println("mayor es "+numMayor);
		
		for(int i =0; i<TAMAYO;i++ ) {
			if(enteros[i] < numMenor) {
				numMayor = enteros[i];
			}
		}
		System.out.println("menor es "+numMayor);
	}

}
