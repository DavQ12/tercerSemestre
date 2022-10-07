package fes.aragon.utilerias.dinamicas.pila;

import java.util.EmptyStackException;

import fes.aragon.utilierias.dinamicas.listasimple.ListaSimple;

public class Pila<E> {
	
	private ListaSimple<E> pila = new ListaSimple<>();
	
	public void borrar() {
		pila = new ListaSimple<>();
	}
	
	public boolean estaVacia(){
		return pila.esVacia();
	}
	
	public void insertar(E dato) {
		pila.agregarEnCola(dato);
	}
	
	public E extraer() throws Exception {
		E tmp = null;
		if(!estaVacia()) {
			tmp=pila.obtenerCola();
			pila.eliminarEnCola();
		}else {
			throw new Exception("Pila vacía");
		}
		return tmp;
	}
	
	public E elementoSuperior() throws Exception {
		E t = null;
		if(!estaVacia()) {
			t=pila.obtenerCola();
			pila.agregarEnCola(t);
		}else {
			throw new Exception("Pila vacía");
		}
		return t;
	}

}
