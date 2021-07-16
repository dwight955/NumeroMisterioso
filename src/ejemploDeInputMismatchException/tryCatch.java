package ejemploDeInputMismatchException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class tryCatch {

	public static void main(String[] args) {
		String[] dias = {"LUNES","MARTES","MIERCOLES",
						"JUEVES","VIERNES","SABADO","DOMINGO"};
		
		Scanner sc = new Scanner(System.in);
		
		int day = 0;
		
		do {
			//Validar el dato ingresado
			System.out.println("Indique un día de la semana");
			try {
				day = sc.nextInt();
			}catch (java.util.InputMismatchException e) {
				System.out.println("ERROR: Dato no valido");
				day = 0;
				sc = new Scanner(System.in);
			}
			//Verificar el dato
			if(day <= dias.length && day > 0 ) {
				System.out.println(dias[day-1]);
			}else {
				System.out.println("Día incorrecto");
			}
		}while(day !=-1);
	}

}
