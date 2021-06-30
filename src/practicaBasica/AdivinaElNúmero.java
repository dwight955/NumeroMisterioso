package practicaBasica;
import java.util.Scanner;
public class AdivinaElNúmero {

	public static void main(String[] args) {
		imprimir("  EL NUMERO MISTERIOSO  ");
		imprimir("  == ====== ==========  ");
		/*Codigo Spaguetti*/
		Scanner sc = new Scanner(System.in);
		//Declaracion
		int dificultad=0, cant=0,intentos=0,respuesta = 0;
		do {
			//Impresion de la dificultad
			imprimir("Escoja su dificultad");
			imprimir("1: Facil");
			imprimir("2: Medio");
			imprimir("3: Dificil");
			imprimir("4: Personalizar");
			dificultad = sc.nextInt();
			//While para validar el dato de entrada
			while(dificultad>=5) {
				imprimir("Inserte un numero valido");
				dificultad = sc.nextInt();
			}
			proceso(dificultad, intentos, cant);
			respuesta = sc.nextInt();
			while(respuesta >=2) {
				imprimir("¡Numero invalido!");
				imprimir("Intente de nuevo");
				respuesta = sc.nextInt();
			}
		}while(respuesta !=0);
		imprimir("Muchas gracias por jugar, vuelva pronto :D");
	}
	static void imprimir(String s) {
		System.out.println(s);
		
	}
	static void proceso(int dificultad, int intentos, int cant ) {
		Scanner sc = new Scanner(System.in);
		//Se evalua el dato para asignar la dificultad 
		switch (dificultad) {
		case 1: intentos = 10;
				cant = 20;
				imprimir("Intentos: 10     Cantidad: 20");
				imprimir("Hay un numero escondido");
				imprimir("Esta entre 1"+" y "+cant); break;
		case 2: intentos = 6;
				cant = 30;
				imprimir("Intentos: 6     Cantidad: 30");
				imprimir("Hay un numero escondido");
				imprimir("Esta entre 1"+" y "+cant); break;
		case 3: intentos = 5; 
				cant = 40;
				imprimir("Intentos: 5     Cantidad: 40");
				imprimir("Hay un numero escondido");
				imprimir("Esta entre 1"+" y "+cant);break;
		case 4: imprimir("Escoja la cantidad de numeros");
				cant = sc.nextInt();
				imprimir("Ahora la cantidad de intentos");
				intentos = sc.nextInt();
				imprimir("Intentos: "+intentos+"     Cantidad: "+cant);
				imprimir("Hay un numero escondido");
				imprimir("Esta entre 1"+" y "+cant);break;
		}
	//se define el numeroRandom
	int numRandom = (int) Math.floor(Math.random()*cant+1);
	//Empieza el juego
	imprimir("¿Que numero crees que sera? ");
	int number = sc.nextInt();
	//Validar el numero
	for(int i = intentos ; i <= intentos && i > 0; i--) {
		if(numRandom == number) {
			imprimir("¡Felicidades, lo encontraste!");
			imprimir("Game Over");
			restart();
			break;
		}else if(number > numRandom)   {
				imprimir("Te has pasado, te queda "+ String.valueOf(i-1)+" intentos");
				number = sc.nextInt();
		}else{
				imprimir("Te quedaste corto, te queda "+ String.valueOf(i-1)+" intentos");
				number = sc.nextInt();
			}
		if(i==2) {
		imprimir("Game Over");
		imprimir("El número escondido era "+numRandom);
		restart();
		break;
		}
	}
	}
	static void restart() {
		imprimir("¿Desea jugar de nuevo?");
		imprimir("1: Si");
		imprimir("0: No");
	}
}
