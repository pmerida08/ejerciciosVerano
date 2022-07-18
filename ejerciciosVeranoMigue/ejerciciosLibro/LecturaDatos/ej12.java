package ejerciciosVerano.ejerciciosLibro.LecturaDatos;

import java.util.Scanner;

public class ej12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double nota1 = 0;
		
		System.out.println("Introduce la nota del primer trimestre: ");
		nota1 = sc.nextDouble();
		
		double nota2 = 0;
		
		double notaTotal = (nota1 * 0.4) + (nota2 * 0.6);
		
		
		System.out.println("Introduce la nota media que quieres sacar en la asignatura de Programación: ");
		notaTotal = sc.nextDouble();
		
		nota2 = notaTotal - (nota1 * 0.4);
		
		System.out.printf("Para sacar un %2.2f de nota media tendrás que sacar un %2.2f en el segundo trimestre.", notaTotal, nota2);
	}
}
