package practicaBasica;
import java.util.Scanner;
public class ElOperadorCondicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba el primer numero");
		int n1 = sc.nextInt();
		System.out.println("Escriba el segundo numero");
		int n2 = sc.nextInt();
		int menor;
		
		/** condicion ? resultado_si cierto : resultado_si_falso **/
		menor = n1 > n2 ? n2 : n1; 
		
		/*
		 if (n1 > n2){
		 	menor = n2;
		 }else{
		 	menor = n1;
		 }*/
		
		System.out.println("El menor numero es...");
		System.out.print(menor);
	}

}
