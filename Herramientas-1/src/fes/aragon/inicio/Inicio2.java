package fes.aragon.inicio;

import fes.aragon.utilerias.dinamicas.cola.Cola;
import fes.aragon.utilerias.dinamicas.listasimple.ListaSimple;
import fes.aragon.utilerias.dinamicas.pila.Pila;

public class Inicio2 {

	public static void main(String[] args) throws Exception {
		
		Pila<Integer> pila = new Pila<>();
		Cola<Integer> cola = new Cola<>();
		//ListaSimple<String>lista1 = new ListaSimple<>();
		String cadena="10, 1, 2, +, 2, *, +";
		int simbolo, i=0;
		boolean flag;
		pila.borrar();
		double valor, operador1, operador2;
		String[] lista= cadena.split(", ");
		for(int j =0; j<lista.length;j++) {
			System.out.println(lista[j]);
		}
		
		
			while(i<lista.length) {
				
				//System.out.println("hoy");
				try {
					Integer.parseInt(lista[i]);
					flag=true;
				} catch (Exception e) {
					flag=false;
				}
				if(flag) {
					simbolo=Integer.parseInt(lista[i]);
					pila.insertar(simbolo);
				}else {
					operador1= pila.extraer();
					//System.out.println("operador1: "+operador1);
					operador2= pila.extraer();
					switch(lista[i]) {
					case "+":
						valor=operador2+operador1;
						pila.insertar((int) valor);
						break;
					case "-":
						valor=operador2-operador1;
						pila.insertar((int) valor);
						break;
					case "*":
						valor=operador2*operador1;
						pila.insertar((int) valor);
						break;
					case "/":
						valor=operador2/operador1;
						pila.insertar((int) valor);
						break;
					case "^":
						valor=Math.pow(operador2, operador1);
						pila.insertar((int) valor);
						break;	
						
					}
						
				}
				i++;
			}
		
		
		System.out.println("El resultado es: "+pila.extraer());
		
		
		
		
		
		
		
		
		
		/*
		pila.insertar(40);
		pila.insertar(20);
		cola.insertar(40);
		cola.insertar(20);
		while(!pila.estaVacia()) {
			try {
				System.out.println(pila.extraer());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("-------------------");
		
		while(!cola.estaVacia()){
			try {
				System.out.println(cola.extraer());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}*/
		
	}

}
