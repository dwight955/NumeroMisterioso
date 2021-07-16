package BooleanosCaracteresArrays;

public class caracteresChar {

	public static void main(String[] args) {
		char letra1, letra2;
		
		letra1 = 'a';
		letra2 = 'b';
		
		imprimir("La primera letra es: ");
		imprimir(String.valueOf(letra1));
		
		imprimir("La segunda letra es: ");
		imprimir(String.valueOf(letra2));
	}
	static void imprimir(String s) {
		System.out.println(s);
	}
}
