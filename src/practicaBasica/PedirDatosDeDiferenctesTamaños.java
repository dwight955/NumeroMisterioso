package practicaBasica;
import java.util.Scanner;
public class PedirDatosDeDiferenctesTama�os {

	public static void main(String[] args) {
		Scanner teclado;
		float primerNumero, segundoNumero;
		
		teclado = new Scanner(System.in);
		imprimir("Introduzca el primer n�mero real");
		primerNumero = teclado.nextFloat();
		imprimir("Introduzca el segundo n�mero real");
		segundoNumero = teclado.nextFloat();
		
		imprimir("La suma es: ");
		imprimir(String.valueOf(primerNumero+segundoNumero));
	}
	static void imprimir(String s) {
		System.out.println(s);
	}
}
