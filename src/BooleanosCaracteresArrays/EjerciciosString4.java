package BooleanosCaracteresArrays;
import java.util.Scanner;
public class EjerciciosString4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int TAMAYO = 5;
		double sumatoria = 0,media =0;
		double[] datos = new double[TAMAYO];
		//[45,41,36,5,7]
		//  0  1  2 3 4 index
    	//  1  2  3 4 5 length
		for(int i=0;i<TAMAYO; i++) {
			System.out.println("Deme el dato de la posicion"
			+ " ["+ i+"]" +":");
			datos[i] = sc.nextDouble();
		}
		for(int i=TAMAYO-1;i>=0;i--) {
			sumatoria += datos[i];
			media = sumatoria / datos.length;
		}
		System.out.println("La media es: "+media);
		System.out.println("Los numeros mayores a la media son:");
		for(int i=0;i<TAMAYO; i++) {
			if(datos[i]> media) {
				System.out.println(datos[i]);
			}
		}

	}

}
