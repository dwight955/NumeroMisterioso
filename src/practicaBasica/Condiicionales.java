package practicaBasica;

import java.util.Scanner;
public class Condiicionales {

	public static void main(String[] args) {
		
		Scanner tecla = new Scanner(System.in);
		
		/*imprimir("Hola bienvenido al programa");
		imprimir("Por favor, inserte su edad");
		int edad = tecla.nextInt();
		
		if (edad <= 5) {
			imprimir("Etapa Primera infancia");
		}else if (edad <= 11){
			imprimir("Etapa Infancia");
		}else if (edad > 12 || edad <= 18) {
			imprimir("Etapa adolescencia");
		}else if (edad > 27 || edad <= 59){
			imprimir("Adultez");
		}else {
			imprimir("Etapa Adulto Mayor");
		}*/
		
		/**Propuesto 5.3.2**/
		/*imprimir("Escriba un numero entero");
		int num = tecla.nextInt();
		
		if(num > 0) {
			imprimir("El numero positivo");
		}else if (num < 0) {
			imprimir("El numero es negativo");
		}else {
			imprimir("El numero es 0");
		}*/
		/**Propuesto 5.3.4**/
		/*int num = tecla.nextInt();
		if(num%3 == 0) {
			imprimir("Es multiplo de 3");
		}else {
			imprimir("No es multiplo de 3");
		}*/
		/**Propuesto 5.4.4**/
		int num1,num2,num3;
		imprimir("Escribe un numero entero");
		num1 = tecla.nextInt();
		imprimir("Escribe un numero entero");
		num2 = tecla.nextInt();
		imprimir("Escribe un numero entero");
		num3 = tecla.nextInt();
		
		if(num1 > num2) {
			imprimir("El numero mayor es: "+num1);
		}else if(num2 > num1) {
			imprimir("El numero mayor es: "+num2);
		}else {
			imprimir("El numero mayor es: "+num3);
		}
	}
	static void imprimir(String s) {
		System.out.println(s);
	}
}
