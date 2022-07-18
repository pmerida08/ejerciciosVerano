package ejerciciosVerano.ejerciciosLibro.SalidaDatosPorPantalla;
public class ej4 {
	public static void main(String[] args) {
		System.out.println("          	   Lunes      Martes      Miercoles Jueves      Viernes");
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.printf("%-13s %10s %10s %10s %10s %10s\n", "Primera Hora", "PROG", "ENDES", "PROG", "ENDES", "BADA");
		System.out.printf("%-13s %10s %10s %10s %10s %10s\n", "Segunda Hora", "PROG", "SIIN", "PROG", "ENDES", "BADA");
		System.out.printf("%-13s %10s %10s %10s %10s %10s\n", "Tercera Hora", "LM", "SIIN", "BBDD", "SIIN", "LM");
		System.out.printf("%-13s %10s %10s %10s %10s %10s\n", "Cuarta Hora", "LM", "SIIN", "BBDD", "SIIN", "LM");
		System.out.printf("%-13s %10s %10s %10s %10s %10s\n", "Quinta Hora", "BBDD", "PROG", "FOL", "SIIN", "PROG");
		System.out.printf("%-13s %10s %10s %10s %10s %10s\n", "Sexta Hora", "BBDD", "PROG", "FOL", "FOL", "PROG");
	}
}
