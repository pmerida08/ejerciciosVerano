package ejerciciosVerano.ejerciciosLibro.LecturaDatos;

import java.util.Scanner;

public class ej2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int euros = 0;
		
		System.out.println("Dame los euro:");
		euros = sc.nextInt();
		
		double pesetas = euros * 166;
		
		System.out.println(pesetas);
	}
}
