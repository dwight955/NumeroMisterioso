package Cadenas;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class adivinarTuEdad {

	public static void main(String[] args) throws InterruptedException, IOException{
		patronesNumericos pn = new patronesNumericos();
		int edad=0, respuesta=0, colA=1,colB=2,colC=4,colD=8,colE=16,colF=32;
		mensjInicio();
		pn.columnaA();
		edad += validar(pregunta(), respuesta, colA);
		pn.columnaB();
		edad += validar(pregunta(), respuesta, colB);
		pn.columnaC();
		edad += validar(pregunta(), respuesta, colC);
		pn.columnaD();
		edad += validar(pregunta(), respuesta, colD);
		pn.columnaE();
		edad += validar(pregunta(), respuesta, colE);
		pn.columnaF();
		edad += validar(pregunta(), respuesta, colF);
		mensFinal(edad);
	}
	static void mensjInicio() throws InterruptedException, IOException {
		Thread.sleep(300);
		System.out.println("Hola :D, Intentare adivinar tu edad [ENTER]"); 
		System.in.read();
		System.out.println("A continuacion, se mostrará una serie de números");
		Thread.sleep(2000);
	}
	static int pregunta(){
		int num =0;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("¿Ha visto su edad en esta columna?");
		System.out.println("1: Si");
		System.out.println("0: No");
			try {
				num = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("No caracteres");
				num = 2;
				sc = new Scanner(System.in);
			}
			if(num >= 2) {
				System.out.println("Recuerde: Escriba 1 para Si y 0 para NO, de nuevo..");
			}else if(num<0) {
				System.out.println("No numeros negativos, Otra vez...");
			}
		}while(num >= 2 || num < 0);
		
		return num;
	}
	static int validar(int x, int respuesta, int y) {
			switch (x) {
			case 1: respuesta += y;  break;
			default:break; 
			}
		return respuesta;
	}
	static void mensFinal(int edad) {
		Scanner sc = new Scanner(System.in);
		int respuesta = 0;
		do {
			System.out.println("¿Tu edad es "+edad+"?");
			System.out.println("1:Si");
			System.out.println("0:No");
			try {
				respuesta = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("No caracteres, nuevamente...");
				respuesta = 2;
				sc = new Scanner(System.in);
			}
			
			if(respuesta >= 2) {
				System.out.println("Escriba 1 para Si y 0 para NO, de nuevo..");
			}else if(respuesta<0) {
				System.out.println("No numeros negativos, Otra vez...");
			}
		}while(respuesta >=2 || respuesta < 0  );
		switch (respuesta) {
		case 1: System.out.println("¡Genial!"); break;
		case 0: System.out.println("Ohh lastima, seguire aprendiendo para mejorar :(" );break;
		}
	}
}
