package fes.aragon.inicio;

import java.util.Random;

import fes.aragon.excep.IndiceFueraDeRango;
import fes.aragon.utilerias.dinamicas.listadoble.ListaDoble;
import fes.aragon.utilerias.dinamicas.listasimple.Contador;
import fes.aragon.utilerias.dinamicas.listasimple.ListaSimple;
import fes.aragon.utilerias.dinamicas.listasimple.Nodo;
import fes.aragon.utilerias.estaticas.Arreglos;

public class inicio {
	public static void main(String[] args) throws IndiceFueraDeRango {
		
		
		ListaSimple<Integer> lista = new ListaSimple<>();
		ListaSimple<Contador> aux=new ListaSimple<>();
 		Random rd=new Random();
 		ListaDoble<Integer> listaDoble= new ListaDoble<>();
 		//int k;
		/*
		for(int i=0; i<100; i++) {
			lista.agregarEnCabeza(new Integer(rd.nextInt(5)));
			
		}
		
		for(int i=0; i<100; i++) {
			Integer valor=lista.obtenerNodo(i);
			
			if(aux.esVacia()) {
				//System.out.println("Si entra uwu");
				Contador au=new Contador(valor);
				aux.agregarEnCabeza(au);
			}else {
				boolean encontrada=false;
				for(int j=0; j<aux.getLongitud(); j++) {
					//System.out.println("No entra 000");
					if(valor.equals(aux.obtenerNodo(j).getNumero())) {
						//System.out.println("Si entra 000");
						aux.obtenerNodo(j).inCont();
						encontrada=true;
						break;
					}
				}
				if(!encontrada) {
					//System.out.println("Si entra unu");
					Contador au=new Contador(valor);
					aux.agregarEnCabeza(au);
				}
			}
			
		}
		
		aux.imprimirElementos();*/
 		
 		for(int i=0; i<4; i++) {
 			listaDoble.agregarEnCabeza(i);
 		}
 		listaDoble.imprimirSigElemento();
 		System.out.println(listaDoble.insetarEnIndice(5, 4));
 		listaDoble.imprimirSigElemento();
// 		System.out.println(listaDoble.obtenerCabeza());
// 		listaDoble.eliminar(10);
// 		listaDoble.imprimirSigElemento();
// 		System.out.println(listaDoble.getLongitud());
// 		System.out.println("Cabeza= "+listaDoble.obtenerCabeza());
// 		System.out.println("Cola= "+listaDoble.obtenerCola());
// 		listaDoble.eliminarEnCabeza();
// 		listaDoble.eliminarEnCola();
// 		listaDoble.imprimirSigElemento();
// 		//System.out.println(listaDoble.obtenerNodo(2));
// 		//listaDoble.imprimirAntElemento();
// 		listaDoble.eliminarEnIndice(2);
// 		listaDoble.imprimirSigElemento();
 		
 		
		
		
		
	
		
		
		
		
		
		/*
		lista.imprimirElementos();
		System.out.println("Cabeza = "+lista.obtenerCabeza());
		System.out.println("Cola = "+lista.obtenerCola());
		//System.out.println("Cabeza2 = "+lista.estaEnLista(new Integer(rd.nextInt(99))));
		System.out.println("Cola = "+lista.obtenerNodo(0));
		lista.eliminarNodo(10);
		//System.out.println("Si esta en= "+lista.estaEnLista(24));
		lista.imprimirElementos();
		*/
		
		
	}
}
