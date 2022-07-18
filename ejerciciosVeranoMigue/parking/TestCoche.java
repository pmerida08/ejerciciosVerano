package ejerciciosVerano.parking;

import java.util.Scanner;

public class TestCoche {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Coche cocheA = new Coche("1234", "ASDF");
		Coche cocheB = new Coche("1234");
		Coche cocheC = new Coche();
		
		System.out.println(cocheA);
		System.out.println(cocheB);
		System.out.println(cocheC);
		
		Parking parkingA = new Parking();
		System.out.println(parkingA);
		parkingA.annadirCoche(cocheB);
		System.out.println(parkingA);
		
		Coche[] parking = new Coche[10];
		
		System.out.println("Ahora debe introducir la matricula y el número de bastidor del coche"
				+ " que quiere comprobar si está en el parking");
		
		String matriculaIntroducida = "ASDF1234";
		String bastidorIntroducido = "ASDF1234";
		
		String introducirMatricula;
		String introducirBastidores;
		
		
		for(int i = 0; i < 10; i++) {
			
			parking[i] = new Coche(matriculaIntroducida, bastidorIntroducido);
			
			System.out.println("Coche " + i);
			
			System.out.println("Matricula: ");
			introducirMatricula = scanner.nextLine();
			
			System.out.println("Numero de bastidores: ");
			introducirBastidores = scanner.nextLine();
			
		}
		
		

//		if (introducirMatricula != matriculaIntroducida) {
//			coches.add(introducirMatricula);
//		} 
//		
//		if (introducirBastidores != bastidorIntroducido) {
//			coches.add(introducirBastidores);
//		}
	}
}


