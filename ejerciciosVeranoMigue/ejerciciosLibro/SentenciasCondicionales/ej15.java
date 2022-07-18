package ejerciciosVerano.ejerciciosLibro.SentenciasCondicionales;

import java.util.Scanner;

public class ej15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String ch;
		
		System.out.println("Inserta un carácter: ");
		ch = sc.nextLine();
		
		if (ch.length() > 1) {
			System.out.println("No es posible continuar. Inserta UN sólo carácter.");
			return;
		}
		
		System.out.printf("%9s", ch);
		System.out.println("");
		System.out.printf("%8s %1s", ch, ch);
		System.out.println("");
		System.out.printf("%7s %1s %1s", ch, ch, ch);
		System.out.println("");
		System.out.printf("%6s %1s %1s %1s", ch, ch, ch, ch);
		System.out.println("");
		System.out.printf("%5s %1s %1s %1s %1s", ch, ch, ch, ch, ch);
		System.out.println("");
		System.out.printf("%4s %1s %1s %1s %1s %1s", ch, ch, ch, ch, ch, ch);
		System.out.println("");
		System.out.printf("%3s %1s %1s %1s %1s %1s %1s", ch, ch, ch, ch, ch, ch, ch);
		System.out.println("");
		System.out.printf("%2s %1s %1s %1s %1s %1s %1s %1s", ch, ch, ch, ch, ch, ch, ch, ch);
		System.out.println("");
		System.out.printf("%1s %1s %1s %1s %1s %1s %1s %1s %1s", ch, ch, ch, ch, ch, ch, ch, ch, ch);
		
	}

}
