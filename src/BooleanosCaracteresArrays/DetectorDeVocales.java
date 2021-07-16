package BooleanosCaracteresArrays;
import java.util.Scanner;
public class DetectorDeVocales {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*Crea un programa que reciba una palabra
		 * y la cambie por un "%" a todas las vocales
		 * por ejemplo así: 
		 * INPUT
		 * murcielago
		 * OUTPUT
		 * m%rc%%l%g%
		 * 
		 * */
		String palabraDeEntrada = sc.nextLine();
		StringBuilder cadena = new StringBuilder(palabraDeEntrada);
		int tamaño = palabraDeEntrada.length();
		char vocales[] = {'a','e','i','o','u'};
		
		for(int y = 0; y <vocales.length;y++) {
			for(int i=0; i<tamaño; i++) {
				char caracter = palabraDeEntrada.charAt(i);
				if(caracter == vocales[y] ) {
					cadena.replace(i, i+1, "%");
				}
			}
		}
		System.out.print(cadena.toString());
	}

}
