package ejerciciosVerano.ejerciciosLibro.SentenciasCondicionales;

import java.util.Scanner;

public class ejNota {

	public static void main(String[] args) {
		System.out.print("¿Qué nota has sacado en el último examen? ");
		Scanner sc = new Scanner(System.in);

		String line = null;
		line = sc.nextLine();
		
		double nota = Double.parseDouble(line);
		
		if (nota >= 5) {
		System.out.println("¡Enhorabuena!, ¡has aprobado!");
		} else {
		System.out.println("Lo siento, has suspendido.");
		}

	}

}
