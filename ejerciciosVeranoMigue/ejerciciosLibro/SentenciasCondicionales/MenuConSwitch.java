package ejerciciosVerano.ejerciciosLibro.SentenciasCondicionales;

import java.util.Scanner;

public class MenuConSwitch {

	public static void main(String[] args) {
		System.out.println(" CÁLCULO DE ÁREAS");
		System.out.println("-----------------");
		System.out.println(" 1. Cuadrado");
		System.out.println(" 2. Rectángulo");
		System.out.println(" 3. Triángulo");
		System.out.println("\n Elija una opción (1-3): ");
		
		int opcion;
		Scanner sc = new Scanner(System.in);
		opcion = sc.nextInt();
		
		double lado = 0;
		double base = 0;
		double altura = 0;
		
		switch (opcion) {
		case 1:
			System.out.println("\nIntroduzca el lado del cuadrado en cm: ");
			lado = sc.nextDouble();
			System.out.println("\nEl área del cuadrado es " + (lado * lado) + " cm2");
			break;
			
		case 2:
			System.out.println("\nIntroduzca la base del rectángulo en cm: ");
			base = sc.nextDouble();
			System.out.println("Introduzca la altura del triangulo en cm: ");
			altura = sc.nextDouble();
			System.out.println("El área del rectángulo es " + (base * altura) + " cm2");
			break;
			
		case 3:
			System.out.println("\nIntroduzca la base del triángulo en cm: ");
			base = sc.nextDouble();
			System.out.println("Introduzca la atura del triángulo en cm: ");
			altura = sc.nextDouble();
			System.out.println("El área del triágulo es " + ((base * altura) / 2) + " cm2");
			break;
			
		default:
			System.out.println("\nLo siento, la opción elegida no es correcta.");
		}

	}

}
