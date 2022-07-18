package ejerciciosVerano.parking;
/**
 * @author Pablo
 *
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Clase Parking : Coches (arrayList), busca por Matricula y Bastidor, metodos:
 * 
 * (cocheNuevo (si el coche no esta), 
 * borrarCoche(pasar bastidor y matricula), 
 * buscarCoche(bastidor y devuelve posicion)), 
 * 
 * y clase Coche (bastidor y matricula)
 * 
 */
public class Parking{
	
	private Coche[] arrayCoches;
	
	public Parking() {
		this.arrayCoches = new Coche[0];
	}

	public boolean estaCoche(String id) {
		boolean result = false;
		int i = 0;
		
		while(i < arrayCoches.length && !result) {
			if (arrayCoches[i].getMatricula().equals(id) || arrayCoches[i].getBastidores().equals(id)) {
				result = true;
			}
			i++;
		} 
		
		return result;
	}
	
	public void annadirCoche(Coche A) {
		if (A != null && !estaCoche(A.getMatricula())) {
			int nuevoTam = this.arrayCoches.length + 1;
			Coche[] tmp = new Coche[nuevoTam];
			
			for(int i = 0; i < arrayCoches.length; i++) {
				tmp[i] = arrayCoches[i];
			}
			
			tmp[nuevoTam - 1] = A;
			
			arrayCoches = tmp;
		}
		
	}
	
	public void removeCoche (Coche B) {
		
	}
	
	public Integer buscarCoche (String matricula) {
		return 0;
	}
	
	@Override
	public String toString() {
		return "Parking: " + Arrays.toString(arrayCoches);
	}
	
	
}
