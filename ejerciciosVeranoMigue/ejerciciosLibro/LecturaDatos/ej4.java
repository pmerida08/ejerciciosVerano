package ejerciciosVerano.ejerciciosLibro.LecturaDatos;

import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;
		
		System.out.println("Da un valor al primer numero: ");
		num1 = sc.nextInt();
		System.out.println("Da un valor al segundo numero: ");
		num2 = sc.nextInt();
		
		int suma = num1 + num2;
		int resta = num1 - num2;
		int multi = num1 * num2;
		float divi = num1 / num2;
		
		System.out.println("La suma de los dos numeros dados es de: " + suma);
		System.out.println("La resta de los dos numeros dados es de: " + resta);
		System.out.println("La multiplicación de los dos numeros dados es de: " + multi);
		System.out.println("La división de los dos numeros dados es de: " + divi);
		
	}

}
