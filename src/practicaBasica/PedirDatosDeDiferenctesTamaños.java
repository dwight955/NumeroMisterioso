package practicaBasica;
import java.util.Scanner;
public class PedirDatosDeDiferenctesTamaños {

	public static void main(String[] args) {
		Scanner teclado;
		float primerNumero, segundoNumero;
		
		teclado = new Scanner(System.in);
		imprimir("Introduzca el primer número real");
		primerNumero = teclado.nextFloat();
		imprimir("Introduzca el segundo número real");
		segundoNumero = teclado.nextFloat();
		
		imprimir("La suma es: ");
		imprimir(String.valueOf(primerNumero+segundoNumero));
	}
	static void imprimir(String s) {
		System.out.println(s);
	}
}
