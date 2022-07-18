package ejerciciosVerano.ejerciciosLibro.SentenciasCondicionales;

import java.util.Scanner;

public class ej1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nElije una opción: ");
		int opcion;
		opcion = sc.nextInt();
		
		switch (opcion) {
		case 1:
			System.out.println("Has seleccionado el Lunes.");
			System.out.println("--------------------------");
			System.out.println("El lunes a primera hora toca Programación.");
			break;
			
		case 2:
			System.out.println("Has seleccionado el Martes.");
			System.out.println("--------------------------");
			System.out.println("El martes a primera hora toca Entornos.");
			break;
			
		case 3:
			System.out.println("Has seleccionado el Miércoles.");
			System.out.println("--------------------------");
			System.out.println("El miércoles a primera hora toca Programación.");
			break;
			
		case 4:
			System.out.println("Has seleccionado el Jueves.");
			System.out.println("--------------------------");
			System.out.println("El jueves a primera hora toca Entornos.");
			break;

		case 5:
			System.out.println("Has seleccionado el Viernes.");
			System.out.println("--------------------------");
			System.out.println("El viernes a primera hora toca Base de Datos.");
			break;
			
			
			
		}
		
	}
}
