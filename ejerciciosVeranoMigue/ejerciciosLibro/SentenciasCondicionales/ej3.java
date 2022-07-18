package ejerciciosVerano.ejerciciosLibro.SentenciasCondicionales;

import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Qué número del día de la semana es hoy?");
		int numero = 0;
		numero = sc.nextInt();
		
		switch (numero) {
		case 1:
			System.out.println("Hoy es lunes.");
			break;
		case 2:
			System.out.println("Hoy es martes.");
			break;
		case 3:
			System.out.println("Hoy es miércoles.");
			break;
		case 4:
			System.out.println("Hoy es jueves.");
			break;
		case 5:
			System.out.println("Hoy es viernes.");
			break;
		case 6:
			System.out.println("Hoy es sábado.");
			break;
		case 7:
			System.out.println("Hoy es domingo.");
			break;
		}

	}

}
