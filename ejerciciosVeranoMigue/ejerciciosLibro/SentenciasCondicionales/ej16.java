package ejerciciosVerano.ejerciciosLibro.SentenciasCondicionales;

import java.util.Scanner;

public class ej16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		boolean infiel = false;
		
		String respuesta;
		int puntuacion = 0;
		
		
		
		System.out.println("Empezamos con el test de infidelidad: ");
		System.out.println("-------------------------------------------");
		
		System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo\r\n"
				+ "aparente.");
		respuesta = sc.nextLine();
		
		System.out.println("2. Ha aumentado sus gastos de vestuario: ");
		respuesta = sc.nextLine();
		
		System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti: ");
		respuesta = sc.nextLine();
		
		System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se\r\n"
				+ "arregla el pelo y se asea con más frecuencia (si es mujer): ");
		respuesta = sc.nextLine();
		
		System.out.println("5. No te deja que mires la agenda de su teléfono móvil: ");
		respuesta = sc.nextLine();
		
		System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú\r\n"
				+ "delante: ");
		respuesta = sc.nextLine();
		
		System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a: ");
		respuesta = sc.nextLine();
		
		System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho\r\n"
				+ "más trabajo: ");
		respuesta = sc.nextLine();
		
		System.out.println("9. Has notado que últimamente se perfuma más: ");
		respuesta = sc.nextLine();
		
		System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo: ");
		respuesta = sc.nextLine();
		
		if (respuesta == "Si") {
			infiel = true;
		}
		
		if (infiel = true) {
			puntuacion += 3;
		} else;
		
		System.out.println("La puntuacion de ");
	}

}
