package ejerciciosVerano.ejerciciosLibro.SentenciasCondicionales;

//Preguntar Migue

// Realiza ecuacion de segundo grado
import java.util.Scanner;

public class ej9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = 0;
		double b = 0;
		double c = 0;
		
		System.out.println("Introduce el valor de a: ");
		a = sc.nextDouble();
		
		System.out.println("Introduce el valor de b: ");
		b = sc.nextDouble();

		System.out.println("Introduce el valor de c: ");
		c = sc.nextDouble();
		
		double x = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
		double y = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
		

		System.out.println("El resultado de la ecuacion es: " + x + " y " + y);
	}

}
