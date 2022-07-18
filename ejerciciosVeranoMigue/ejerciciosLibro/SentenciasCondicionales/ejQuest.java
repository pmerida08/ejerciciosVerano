package ejerciciosVerano.ejerciciosLibro.SentenciasCondicionales;

import java.util.Scanner;

public class ejQuest {

	public static void main(String[] args) {
		System.out.println("¿Cuál es la capital de Marruecos?");
		Scanner sc = new Scanner(System.in);
		
		String respuesta = sc.nextLine();
		
		if (respuesta.equals("Rabat")) {
			System.out.println("La respuesta es correcta.");
		} else {
			System.out.println("La respuesta no es correcta :o");
		}
	}

}
