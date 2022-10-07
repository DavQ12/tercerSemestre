package fes.aragon.utilerias.dinamicas.listadoble;

import fes.aragon.utilerias.dinamicas.listadoble.NodoDoble;


public class ListaDoble<E> {
	
	protected NodoDoble<E> cabeza, cola;
	protected int longitud =0;
	
	public ListaDoble() {
		cabeza=cola=null;
	}
	
	public void agregarEnCabeza(E dato) {
		NodoDoble<E> nuevo =new NodoDoble<>(dato);
		if(cabeza==null) {
			cabeza=nuevo;
			cola=cabeza;
			
		}else {
			cabeza.setAnterior(nuevo);
			nuevo.setSiguiente(cabeza);
			cabeza=nuevo;
		}
		longitud++;
	}
	
	public void agregarEnCola(E dato) {
		NodoDoble<E> nuevo =new NodoDoble<>(dato);
		if(cabeza==null) {
			cabeza=nuevo;
			cola=cabeza;
		}else {
			cola.setSiguiente(nuevo);
			nuevo.setAnterior(cola);
			cola=nuevo;
		}
		longitud++;
	}
	
	public void imprimirSigElemento() {
		for(NodoDoble<E> tmp = cabeza; tmp != null; tmp=tmp.getSiguiente()) {
			System.out.print(tmp.getDato()+" ");
		}
		System.out.println();
	}
	
	public void imprimirAntElemento() {
		for(NodoDoble<E> tmp = cola; tmp != null; tmp=tmp.getAnterior()) {
			System.out.print(tmp.getDato()+" ");
		}
		System.out.println();
	}
	
	public E obtenerCabeza() {
		return cabeza.getDato();
	}
	
	public E obtenerCola() {
		return cola.getDato();
	}
	
	public int estaEnLista(E dato1) {
		int indice;
		NodoDoble<E> tmp = null;
		tmp=cabeza;
		
		for(indice = 0; indice < longitud-1 && tmp != null && tmp.getDato().equals(dato1); indice++, tmp = tmp.getSiguiente());
			if (tmp != null) {
				
				return indice;
			}else {
				return -1;
			}
	}
	
	public E obtenerNodo(int indice) {
		NodoDoble<E> tmp =null;
		if(indice<= longitud) {
			tmp=cabeza;
			for(int contador=0; contador < indice && tmp !=null; contador++, tmp=tmp.getSiguiente());
		}
		
		if(tmp!=null) {
			return tmp.getDato();
		}else {
			return null;
		}
	}
	
	public void eliminar(E dato) {
		boolean borrado = false;
		
		if(cabeza != null) {
			if(cabeza==cola && dato.equals(cabeza.getDato())) {
				cabeza=cola=null;
				borrado=true;
				longitud--;
			}else if(dato==cabeza.getDato()) {
				cabeza=cabeza.getSiguiente();
				cabeza.setAnterior(null);
				borrado=true;
				longitud--;
			}else {
				NodoDoble<E> pred, tmp;
				for(pred=cabeza, tmp=cabeza.getSiguiente(); tmp != null && !tmp.getDato().equals(dato);
						pred=pred.getSiguiente(), tmp=tmp.getSiguiente());
				if(tmp!=null) {
					if(tmp==cola) {
						cola=pred;
						cola.setSiguiente(null);
					}else {
						tmp=tmp.getSiguiente();
						pred.setSiguiente(tmp);
						tmp.setAnterior(pred);
					}
					borrado=true;
					longitud--;
				}
			}
		}
	}
	
	public int getLongitud() {
		if(longitud<0) {
			longitud=0;
		}
		return longitud;
	}
	
	public boolean esVacia() {
		return cabeza==null;
	}
	
	public void eliminarEnCabeza() {
		if(cabeza!=null) {
			if(cabeza==cola) {
				cabeza=cola=null;
			}else {
				cabeza=cabeza.getSiguiente();
				cabeza.setAnterior(null);
				longitud--;
			}
		}
	}
	
	public void eliminarEnCola() {
		if(cabeza!=null) {
			if(cabeza==cola) {
				cabeza=cola=null;
			}else {
				cola=cola.getAnterior();
				cola.setSiguiente(null);
				longitud--;
			}
		}	
	}
	public void eliminarEnIndice(int indice) {
		boolean borrado =false;
		
		if(indice>=0 && indice <=longitud-1){
			if(cabeza==cola && indice ==0) {
				cabeza=cola=null;
				borrado=true;
				longitud--;
			}else if(indice==0) {
				cabeza=cabeza.getSiguiente();
				cabeza.setAnterior(null);
				borrado=true;
				longitud--;
			}else {
				NodoDoble<E> pred, tmp;
				int contador=1;
				for(pred=cabeza, tmp=cabeza.getSiguiente(); contador<indice;
						pred=pred.getSiguiente(),tmp=tmp.getSiguiente(), contador++);
				if(tmp!=null) {
					if(tmp==cola) {
						cola=pred;
						cola.setSiguiente(null);
					}else {
						tmp=tmp.getSiguiente();
						pred.setSiguiente(tmp);
						tmp.setAnterior(pred);
					}
					borrado=true;
					longitud--;
				}
			}
			
		}
	}
	
	public boolean insetarEnIndice(E dato, int indice) {
		boolean seInserto=false;
		
		if(indice>=0 && indice <= longitud-1) {
			if(indice==0) {
				this.agregarEnCabeza(dato);
				seInserto=true;
			}else {
				NodoDoble<E> prv, tmp=null;
				int contador=0;
				for(prv=null, tmp = cabeza; contador<indice; contador++, prv=tmp, tmp=tmp.getSiguiente());
				System.out.println("Cont "+contador);
				
				
					
//					NodoDoble<E> aInsertar = new NodoDoble<E>(dato);
//					prv.setSiguiente(aInsertar);
//					aInsertar.setAnterior(prv);
//					aInsertar.setSiguiente(tmp);
//					tmp.setAnterior(aInsertar);
				
				
			}
		}
		return seInserto;
	}
	
}
