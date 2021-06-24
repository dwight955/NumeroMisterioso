package practicaBasica;
import java.text.DecimalFormat;
import java.util.Scanner;
public class EjerciciosBasicos {
	public static void main(String[] args) {
		
		Scanner tecla = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.000");
		
		float km = (float) 1.609;
		imprimir("Escriba una longitud en millas");
		float millas = tecla.nextShort();
		imprimir(millas + " millas equivale a "+ df.format(millas*km)+ " kilometros");
	}
	static void imprimir(String s) {
		System.out.println(s);
	}
}
