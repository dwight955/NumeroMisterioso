package practicaBasica;

public class IncrementosAbreviados {

	public static void main(String[] args) {
		//Desbordamiento de una variable byte
		byte dato = 100;
		imprimir("El dato byte inicialmente tiene como valor: "+ dato);
		dato +=100;
		imprimir("Si sumamos 100, el dato es: "+ dato);
		//Limite de precision de un float
		float dato2 = 1.23456789f;
		imprimir("El dato float inicialmente tiene como valor: "+ dato2);
		dato2 +=1000;
		imprimir("Si sumamos 1000, el dato ahora es: "+ dato2);
	}
	static void imprimir(String s) {
		System.out.println(s);
	}
}
