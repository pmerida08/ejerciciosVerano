package ejerciciosVerano.ejerciciosLibro.SentenciasCondicionales;

import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = 1;
		double b = 1;
		double x;

		System.out.println("Por favor introduzca el valor de a: ");
		a = sc.nextDouble();
		System.out.println("Ahora introduzca el valor de b: ");
		b = sc.nextDouble();
		x = (-b)/a;
		
		if (a == 0) {
			System.out.println("Esa ecuación no tiene solución real.");
		} else {
			System.out.printf("x = %-8.2f", x);
		}
		
	}

}
