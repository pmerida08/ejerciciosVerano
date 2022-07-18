package ejerciciosVerano.ejerciciosLibro.SentenciasCondicionales;

import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce las horas trabajadas: ");
		
		int horas = 0;
		horas = sc.nextInt();
		
		
		if (horas >= 0 && horas <= 40) {
			double salario = horas * 12;
			System.out.printf("\nEl salario semanal del trabajador es de %5.2f euros", salario);
		} 
		
		if (horas >= 41){
			double salario = horas * 16;
			System.out.printf("\nEl salario semanal del trabajador es de %5.2f euros", salario);
		} 		
		

	}

}
