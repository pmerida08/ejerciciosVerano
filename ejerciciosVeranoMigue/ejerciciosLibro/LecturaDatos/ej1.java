package ejerciciosVerano.ejerciciosLibro.LecturaDatos;

import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("Escribe el primer numero: ");
		num1 = sc.nextInt();
		System.out.println("Escribe el segundo numero: ");
		num2 = sc.nextInt();
		
		int mult = num1 * num2;
		
		System.out.printf("La multiplicasion de lo que me has dao es de %2d", mult);
		

	}

}
