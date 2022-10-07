package fes.aragon.inicio;

import fes.aragon.excep.IndiceFueraDeRango;
import fes.aragon.utilerias.estaticas.Arreglos;

public class Problemas {
	public static void main(String[] args) {
		Arreglos<Integer> numeros = new Arreglos<>(10);

		/*
		 * Integer temp = null; Integer auxilia = 0;
		 */
		
		try {
			numeros.asignarRandom(99);
			numeros.imprime();
			numeros.maximo();
			numeros.minimo();
			numeros.promedio();
			numeros.dameUnIntervalo(0, 3);
			//numeros.moda();
			/*
			 * while(true) { temp = numeros.siguienteConsecutivo();
			 * 
			 * if(temp > auxilia) { auxilia = temp; } }
			 */

		} catch (IndiceFueraDeRango e) {
			System.out.println(e.getMessage());
		}

	}

}
