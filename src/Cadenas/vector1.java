package Cadenas;

public class vector1 {

	public static void main(String[] args) {
		double[] vector = {10,15,9.6,31.5};
		double total=0;
		
		for(int i=0; i<vector.length;i++) {
			total += vector[i];
		}
		System.out.println("La suma de los valores del arreglo es:"+ total);
		System.out.print("La media es:"+ total/ vector.length);
	}
}
