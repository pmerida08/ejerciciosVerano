package ejerciciosVerano.ejerciciosLibro.SentenciasCondicionales;

public class ejOperadoresLogicos {
	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("a || b = " + (a || b));
		System.out.println("!a = " + !a);
		System.out.println("(6 > 10) = " + (6 > 10));
		System.out.println("((4 <= 4) || false) && (!a) = " + (((4 <= 4) || false) && (!a)));
	}
}
