package fes.aragon.inicio;
import java.util.Random;
import fes.aragon.excep.IndiceFueraDeRango;
import fes.aragon.utilerias.estaticas.Arreglos;

public class Problemas {
	public static void main(String[] args) throws IndiceFueraDeRango {
		Arreglos<Integer> numeros=new Arreglos<>(10);
		Random rd=new Random();
		//int aux=0;
		//int mayor=0;
		
		for (int k=0; k<numeros.longitud(); k++) {
			numeros.asignar(k, rd.nextInt(100));
			
		}
		numeros.imprime();
		
		
//		//Metodo para sacar el mayor con utilizando el kit de herramientas
//		
//		Integer temp = null;
//		Integer aux= 0;
//		
//		try {
//			while(true) {
//				
//				temp = numeros.siguiente();
//				
//				if(temp > aux) {
//					aux = temp;
//				}
//			}
//		} catch (IndiceFueraDeRango e) {
//			numeros.imprime();
//			System.out.println(aux);
//			System.out.println(e.getMessage());
//		}
		
		
		/*Metodo para sacar el mayor con un solo for.
		aux=numeros.recupera(0);
		System.out.println(aux);
		for(int i=0; i<numeros.longitud(); i++) {
			if(aux<numeros.recupera(i)) {
				aux=numeros.recupera(i);
			}
		}
		*/
		
		//Sacar el mayor con dos ciclos for
		/*
		numeros.imprime();
		for(int i=0;i<numeros.longitud();i++) {
			for(int j=i+1;j<numeros.longitud();j++) {
				if(numeros.recupera(j)>numeros.recupera(i)) {//0 90
					aux= numeros.recupera(i);
					mayor=numeros.recupera(j);
					numeros.asignar(i, mayor);
					numeros.asignar(j, aux);
					
		
				}
			}
		}*/
		
		//numeros.imprime();
		numeros.intervalo();
		//System.out.println(numeros.localiza(aux));
	}
}