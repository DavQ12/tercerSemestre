package estructuras.datos.parcial1;

import fes.aragon.utilerias.dinamicas.pila.Pila;
import fes.aragon.utilierias.dinamicas.listasimple.ListaSimple;

public class Encriptado {

	public static void main(String[] args) throws Exception {
		
		String cadena="Olimpia(da) de I(nfor)matica", inv="";
		Pila<String> pila=new Pila<>();
		ListaSimple<String> lista = new ListaSimple<>();
		//String[] lista = cadena.split(" ");
		int k=0, l=0;
	
		for (int i = 0; i < cadena.length(); i++) {
			if(cadena.charAt(i)=='(') {
				lista.agregarEnCola("(");
				k=i+1;
				inv="";
				while(cadena.charAt(k)!=')') {
					pila.insertar(String.valueOf(cadena.charAt(k)));
					//System.out.println(l+": "+pila.extraer());
					k++;
					//l++;
				}
				while(!pila.estaVacia()) {
					inv+=pila.extraer();
				}
				lista.agregarEnCola(inv);
				l=k-i-1;
				i+=l;
			}else {
				lista.agregarEnCola(String.valueOf(cadena.charAt(i)));
			}
			
		}
		cadena="";
		while(!lista.esVacia()) {
			cadena+=lista.eliminar_ObtenerEnCabeza();
		}
		lista.imprimirElementos();
		System.out.println(cadena);
		//System.out.println(pila.elementoSuperior());
	}

}
