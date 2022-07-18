package ejerciciosVerano.ejerciciosLibro.SentenciasCondicionales;

import java.util.Scanner;

public class ej8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int notaProg;
		int notaEnt;
		
		System.out.println("Introduce la nota de Programacion: ");
		notaProg = sc.nextInt();
		
		System.out.println("Introduce la nota de Entornos: ");
		notaEnt = sc.nextInt();
		
//		Notas en Programacion
		if(notaProg <= 4) {
			System.out.println("Has sacado un INSUFICENTE en Programacion. ");
			
		} else if(notaProg == 5) {
			System.out.println("Has sacado un SUFICENTE en Programacion. ");
			
		} else if (notaProg == 6 ) {
			System.out.println("Has sacado un BIEN en Programacion. ");
			
		} else if (notaProg >= 7 || notaProg >= 8) {
			System.out.println("Has sacado un NOTABLE en Programacion. ");
			
		} else if (notaProg == 9 || notaProg == 10) {
			System.out.println("Has sacado un SOBRESALIENTE en Programacion. ");
			
		} else
			System.out.println("La nota introducida no es válida. ");
		
//		Notas en Entornos
		if(notaEnt <= 4) {
			System.out.println("Has sacado un INSUFICENTE en Entornos. ");
			
		} else if(notaEnt == 5) {
			System.out.println("Has sacado un SUFICENTE en Entornos. ");
			
		} else if (notaEnt == 6 ) {
			System.out.println("Has sacado un BIEN en Entornos. ");
			
		} else if (notaEnt == 7 || notaProg == 8) {
			System.out.println("Has sacado un NOTABLE en Entornos. ");
			
		} else if (notaEnt == 9 || notaProg == 10) {
			System.out.println("Has sacado un SOBRESALIENTE en Entornos. ");
			
		} else
			System.out.println("La nota introducida no es válida. ");
				
	}

}
