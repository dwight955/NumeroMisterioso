package practicaBasica;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*int mes = sc.nextInt();
		switch (mes) {
			case 1: imprimir("Enero"); break;
			case 2: imprimir("Febrero");break;
			case 3: imprimir("Marzo");break;
			case 4: imprimir("Abril");break;
			case 5: imprimir("Mayo");break;
			case 6: imprimir("Junio");break;
			case 7: imprimir("Julio");break;
			case 8: imprimir("Agosto");break;
			case 9: imprimir("Septiembre");break;
			case 10: imprimir("Octubre");break;
			case 11: imprimir("Noviembre");break;
			case 12: imprimir("Diciembre");break;
			default: imprimir("No tenemos registro de ese dato");
		}*/
		
		/*int x  = (int) Math.floor(Math.random()*6+2);
		switch (x) {
			case 1:
			case 2:
			case 3: imprimir("El valor de x estaba entre 1 y 3");break;
			case 4:
			case 5:
			case 6: imprimir("El valor de x era 6");
			int valorTemporal = 10;
			imprimir("Operaciones auxiliares completadas");
			break;
			default: imprimir("El valor de x no estaba entre 1 y 6");
			break;
		}*/
		
		String nombre = "Dwight";
		
		switch (nombre) {
			case "David": imprimir("False");break;
			case "Dwight": imprimir("True");break;
			case "Dwigth": imprimir("False :D");break;
			default:
				imprimir("Nombre desconocido");
		}
	}
	
	static void imprimir(String s) {
		System.out.println(s);
	}
}
