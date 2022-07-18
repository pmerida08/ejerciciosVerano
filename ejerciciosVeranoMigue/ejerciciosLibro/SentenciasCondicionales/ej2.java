package ejerciciosVerano.ejerciciosLibro.SentenciasCondicionales;

import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una hora: ");
		
		int horas = 0;
		horas = sc.nextInt();
		
		if (horas >= 6 && horas <= 12) {
			System.out.println("Buenos días.");
		} else if (horas >= 13 && horas <= 20){
			System.out.println("Buenas tardes.");
		} else if (horas >= 21 && horas <= 5){
			System.out.println("Buenas noches.");
		}
		
		}
		

		}

	

