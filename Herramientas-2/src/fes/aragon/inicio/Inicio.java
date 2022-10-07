package fes.aragon.inicio;

import fes.aragon.utilerias.dinamicas.pila.Pila;

public class Inicio {
	public static void main(String[] args) {
//		ListaSimple<Integer> lista = new ListaSimple<>();
//		int max = 100;
//		int min = 0;
//		for (int i = 1; i <= 20; i++) {
//			lista.agregarEnCabeza((int)Math.floor(Math.random()*(max-min+1)+1));
//		}
//		lista.imprimirElementos();
//		System.out.println("--------------------------------------");
//		System.out.println(lista.estaEnLista(3));
//		System.out.println("--------------------------------------");
//		System.out.println(lista.obtenerNodo(3));

//		Cola<Integer> cola = new Cola<>();
//		cola.insertar(34);
//		cola.insertar(19);
//		while (!cola.estaVacia()) {
//			try {
//				System.out.println(cola.extraer());
//			} catch (Exception e) {
//				System.out.println(e.getMessage());
//			}
//		}
//		String cadena = "23 + 34 / 34";
//		String[] c = cadena.split(" ");
//		for (int i=0;i<c.length;i++) {
//			System.out.println(c[i]);			
//		}

//		Pila<String> text = new Pila<>();
//		int i = 0;
//		
//		String str = "25 - 4 + 18 / 9";
//		String[] symbol = str.split(" ");
//		while(!text.estaVacia()) {
//			
//		}

		Pila<String> pila = new Pila<>();
		int i = 0;

		String cadena = "45 * 11 - 10 + 80";
		String[] simbolo = cadena.split(" ");

		String simboloArriba = "";
		String salida = "";

		while (i < simbolo.length) {

			if (!simbolo[i].equals("*") && !simbolo[i].equals("/") && !simbolo[i].equals("+")
					&& !simbolo[i].equals("-")) {
				salida += Integer.parseInt(simbolo[i]) + " ";

			} else {

				/*
				 * try { while (!pila.estaVacia() && pila.precedencia(pila.elementoSuperior(),
				 * simbolo[i])) { simboloArriba = pila.extraer(); salida += " " + simboloArriba;
				 * 
				 * } } catch (Exception e) { System.out.println(e.getMessage()); }
				 */
				pila.insertar(simbolo[i]);
			}
			i++;

		}

		while (!pila.estaVacia()) {
			try {
				simboloArriba = pila.extraer();
				salida += " " + simboloArriba;

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println(salida);

	}
}