package Cadenas;

public class patronesNumericos {
	int i, patron1 = 0, patron2 = 2, milisegundos = 300;
	void columnaA() throws InterruptedException {
		int inpar=1;
		System.out.println("=== A ===");
		for(int i=1; i<=32; i++) {
			System.out.println(inpar);
			Thread.sleep(milisegundos);
			inpar += 2;
		}
	}
	void columnaB() throws InterruptedException{
		System.out.println("=== B ===");
		int patron1 = 0,patron2 = 2;
		System.out.println(patron2);
		for(int i=1; i<=16; i++) {
			for(int y=1; y<=1;y++) {
				patron1 = patron2 += 1;
				Thread.sleep(milisegundos);
				System.out.println(patron1);
			}
			if(patron1 == 63) {break;}
			for(int y=1;y<=1;y++) {
				patron2 = patron1 +=3; 
				Thread.sleep(milisegundos);
				System.out.println(patron2);
			}
		}
	}
	void columnaC() throws InterruptedException {
		//COLUMNA C
		System.out.println("=== C ===");
			patron2 = 4;
			System.out.println(patron2);
			for(i=1; i<=8; i++) {
				for(int y=1; y<=3;y++) {
					patron1 = patron2 += 1;
					Thread.sleep(milisegundos);
					System.out.println(patron1);
				}
				if(patron1 == 63) {break;}
				for(int y=1;y<=1;y++) {
					patron2 = patron1 +=5;
					Thread.sleep(milisegundos);
					System.out.println(patron2);
				}
			}
	}
	void columnaD() throws InterruptedException{
		System.out.println("=== D ===");
		patron2 = 8;
		System.out.println(patron2);
		for(i=1; i<=8; i++) {
			for(int y=1; y<=7;y++) {
				patron1 = patron2 += 1;
				Thread.sleep(milisegundos);
				System.out.println(patron1);
			}
			if(patron1 == 63) {break;}
			for(int y=1;y<=1;y++) {
				patron2 = patron1 +=9;
				Thread.sleep(milisegundos);
				System.out.println(patron2);
			}
		}
	}
	void columnaE () throws InterruptedException {
		System.out.println("=== E ===");
		patron2 = 16;
		System.out.println(patron2);
		for(int y=1; y<=47;y++) {
			patron1 = patron2 += 1;
			Thread.sleep(milisegundos);
			System.out.println(patron1);
		}
	}
	void columnaF() throws InterruptedException {
		System.out.println("=== F ===");
		patron2 = 32;
		System.out.println(patron2);
		for(int y=1; y<=31;y++) {
			patron1 = patron2 += 1;
			Thread.sleep(milisegundos);
			System.out.println(patron1);
		}
	}
}
