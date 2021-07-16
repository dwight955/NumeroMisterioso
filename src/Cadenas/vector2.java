package Cadenas;

public class vector2 {

	public static void main(String[] args) {
		int[] array= {15,26,96,-3,78};
		int i=0;
		System.out.println("Los valores del array son: ");
		for(i=0;i<array.length;i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		//-----Segundo array de ejemplo, valores uno por uno
		int[] array2;
		array2 = new int [3];
		array2[0] = 15;array2[1]=132;array2[2]= -1;
		System.out.println("Los valores de array2 son: ");
		for(i = 0;i<array2.length;i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.println();
		
		//-----Tercer array de ejemplo, valores con "for"
		int j = 4;
		int[] array3 = new int[j];
		for(i=0;i< j; i++ ) {
			array3[i] = (i+1)*(i+2);			
		}
		System.out.println("Los valores de array3 son: ");
		for(i=0; i<j; i++) {
			System.out.print(array3[i]+ " ");
		}
		System.out.println();
		System.out.println();
		//Prueba para el programa que adivina la edad
		//COLUMNA A
				System.out.println("A");
				int inpar=1;
				for(i=1; i<=32; i++) {
					System.out.println(inpar);
					inpar += 2;
				}
				//COLUMNA B
				System.out.println();
				System.out.println("B");
				int patron1 = 0,patron2 = 2;
				System.out.println(patron2);
				for(i=1; i<=16; i++) {
					for(int y=1; y<=1;y++) {
						patron1 = patron2 += 1;
						System.out.println(patron1);
					}
					if(patron1 == 63) {break;}
					for(int y=1;y<=1;y++) {
						patron2 = patron1 +=3; 
						System.out.println(patron2);
					}
				}
				
				//COLUMNA C
				System.out.println();
				System.out.println("C");
					patron2 = 4;
					System.out.println(patron2);
					for(i=1; i<=8; i++) {
						for(int y=1; y<=3;y++) {
							patron1 = patron2 += 1;
							System.out.println(patron1);
						}
						if(patron1 == 63) {break;}
						for(int y=1;y<=1;y++) {
							patron2 = patron1 +=5; 
							System.out.println(patron2);
						}
					}
				//COLUMNA D
					System.out.println();
					System.out.println("D");
					patron2 = 8;
					System.out.println(patron2);
					for(i=1; i<=8; i++) {
						for(int y=1; y<=7;y++) {
							patron1 = patron2 += 1;
							System.out.println(patron1);
						}
						if(patron1 == 63) {break;}
						for(int y=1;y<=1;y++) {
							patron2 = patron1 +=9; 
							System.out.println(patron2);
						}
					}
					//COLUMNA E
					System.out.println();
					System.out.println("E");
						patron2 = 16;
						System.out.println(patron2);
						for(int y=1; y<=47;y++) {
							patron1 = patron2 += 1;
							System.out.println(patron1);
						}
					//COLUMNA F
						System.out.println();
						System.out.println("F");
							patron2 = 32;
							System.out.println(patron2);
							for(int y=1; y<=31;y++) {
								patron1 = patron2 += 1;
								System.out.println(patron1);
							}
	}
}