package fes.aragon.utilerias.dinamicas.listadoble;

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
	
	public int estaEnLista(E dato1) {//este metodo no funciona correcto, puedes checarlo porfa!
		//No me regresa el indice y creo q no evalua bien la igualdad
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
	
	public boolean eliminar(E dato) {
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
		return borrado;
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
				longitud--;
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
				longitud--;
			}else {
				cola=cola.getAnterior();
				cola.setSiguiente(null);
				longitud--;
			}
		}	
	}
	public boolean eliminarEnIndice(int indice) {
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
		return borrado;
	}
	
	public boolean insetarEnIndice(E dato, int indice) {//este tambien checalo, lo que no pude hacerle, es que se agregue al final. Todo lo demás esta bn
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
	
	
	public boolean asignar(E dato, int indice) {
		//Este metodo se parece al anterior
		NodoDoble<E> tmp = null;
		if (indice <= longitud - 1) {
			tmp = cabeza;
			for (int contador = 0; contador < indice && tmp != null; contador++, tmp = tmp.getSiguiente())
				;
		}
		if (tmp != null) {
			tmp.setDato(dato);
			return true;
		} else {
			return false;
		}
	}
	
	public void asignar(E dato, E nuevoDato, boolean todos) {
		NodoDoble<E> tmp = null;
		if (!todos) {
			for (tmp = cabeza; tmp != null; tmp = tmp.getSiguiente()) {
				if (tmp.getDato().equals(dato)) {
					tmp.setDato(nuevoDato);
					return;
				}
			}
		} else {
			for (tmp = cabeza; tmp != null; tmp = tmp.getSiguiente()) {
				if (tmp.getDato().equals(dato)) {
					tmp.setDato(nuevoDato);
				}
			}
		}
	}
}
