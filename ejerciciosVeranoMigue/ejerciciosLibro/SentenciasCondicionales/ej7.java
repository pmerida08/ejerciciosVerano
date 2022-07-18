package ejerciciosVerano.ejerciciosLibro.SentenciasCondicionales;


import java.util.Scanner;

public class ej7 {

	public static void main(String[] args) {
		
		//Array por gusto :D
		int[] notas = new int[3];
		
		int nota1 = notas[0];
		int nota2 = notas[1];
		int nota3 = notas[2];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe la primera nota:");
		nota1 = sc.nextInt();
		System.out.println("Escribe la segunda nota:");
		nota2 = sc.nextInt();
		System.out.println("Escribe la tercera nota:");
		nota3 = sc.nextInt();
		
		double mediaNotas = (nota1 + nota2 + nota3)/3;
		
		System.out.println("La media de las notas es de: " + mediaNotas);

	}

}
