package fes.aragon.utilerias.estaticas;

import java.util.Iterator;
import java.util.Random;

import fes.aragon.excep.IndiceFueraDeRango;

public class Arreglos<E> {

	private int siguiente = -1;
	private int indice = 0;
	private final Object[] l;
	

	public Arreglos(int numeroElementos) {
		this.l = new Object[numeroElementos];
	}

	/*public void moda() {
		
		int i = 0;
		while (i< l.length) {
			int conta = 1;
			for(int j = 0; j< l.length;j++) {
			if (l[i].equals(l[i+1])){
				conta++;
				System.out.println((int) l[i] + ":" + conta);
			
			}
			else {
			
				System.out.println((int) l[i] + ":" + conta);
			}
			}
			i++;
		}

	}*/

	/**
	 * Metodo que regresa el promedio de un arreglo de tipo Integer
	 * 
	 * @return p que es el promedio del arreglo
	 */
	public int promedio() {
		int p;
		int S = 0;
		for (int i = 0; i < l.length; i++) {
			S += (int) l[i];
		}
		p = S / l.length;
		System.out.println("Promedio en Entero: " +p);
		return p;
	}

	/**
	 * Metodo que regresa los valores de un Intervalo, recibe el inicio y el fin del
	 * Intervalo
	 * 
	 * @param a es el primer valor que se recibe, funge como desde que
	 * @param b es el segundo valor que se recibe, funge como hasta que
	 * @throws IndiceFueraDeRango exepción que pasa cuando nos salimos fuera del
	 *                            índice
	 */
	public void dameUnIntervalo(int a, int b) throws IndiceFueraDeRango {

		if (a < 0 || b >= l.length || a > b || a == b) {
			throw new IndiceFueraDeRango("Checa tus indices");
		}
		System.out.print("Intervalo del "+a+" al " +b+": ");
		for (int i = a; i <= b; i++) {
			System.out.print(l[i] + " ");

		}
		System.out.println();
	}

	/**
	 * Metodo que te retorna el valor minimo, el arreglo debe de ser de tipo Integr
	 * 
	 * @return el valor minimo de un arreglo de tipo Integer
	 * @throws IndiceFueraDeRango exepción que pasa cuando nos salimos fuera del
	 *                            índice
	 */
	public int minimo()  {

		int temp = 0;
		int aux = 99;
		int i = 0;
		while (i < l.length) {
			temp = (int) l[i];

			if (temp < aux) {
				aux = temp;
			}
			i++;
		}
		System.out.println("Menor: "+aux);
		return aux;
	}

	/**
	 * Metodo que te retorna el valor maximo, el arreglo debe de ser de tipo Integr
	 * 
	 * @return el valor maximo de un arreglo de tipo Integer
	 * @throws IndiceFueraDeRango exepción que pasa cuando nos salimos fuera del
	 *                            índice
	 */
	public int maximo() {

		
		int temp = 0;
		int aux = 0;
		int i = 0;
		while (i < l.length) {
			temp = (int) l[i];

			if (temp > aux) {
				aux = temp;
			}
			i++;
		}
		System.out.println("Mayor: "+aux);
		return aux;
	}

	/*
	 * Metodo de dar el siguiente de tipo Integer consecutivo
	 *
	 * @throws IndiceFueraDeRango exepción que pasa cuando nos salimos fuera del
	 * índice
	 */
	public E siguienteConsecutivo() throws IndiceFueraDeRango {
		this.siguiente++;
		if (this.siguiente >= l.length || this.siguiente <= -1) {
			throw new IndiceFueraDeRango("No hay elementos existentes");
		}
		@SuppressWarnings("unchecked")
		final E e = (E) l[this.siguiente];
		return e;
	}

	/**
	 * Método que regresa el primer elemento del arreglo, si no existe regresa un
	 * null
	 * 
	 * @return retorna E o null del primer elemento del arreglo
	 */
	public E ultimo() {
		@SuppressWarnings("unchecked")
		final E e = (E) l[l.length - 1];
		System.out.println(e);
		return e;
	}

	/**
	 * Metodo que asigna a un arreglo numeros enteros RANDOM
	 * 
	 * @param p se le tiene que pasar hasta que numero puede crear la clase Random
	 */
	public void asignarRandom(int p) {
		Random quesera = new Random();
		for (int i = 0; i < l.length; i++) {
			l[i] = quesera.nextInt(p);

		}

	}

	/*
	 * Metodo de Inserccion de tipo Integer consecutivo
	 * 
	 * @param x es el parámetro que se recibe para agregar a la lista
	 * 
	 * @throws IndiceFueraDeRango exepción que pasa cuando nos salimos fuera del
	 * índice
	 */
	public void insertar(E x) throws IndiceFueraDeRango {

		if (indice < l.length) {
			l[indice] = x;
			indice++;
		} else {
			throw new IndiceFueraDeRango("Indice Fuera de Rango");

		}

	}
	/*
	 * Metodo que localiza un valor en la lista
	 * 
	 * @param x valor Integer que se busca en la lista
	 * 
	 * @return se retorna -1 si no esta el valor de la lista, en caso contrario se
	 * retorna el indice
	 */

	public Integer localiza(E x) {
		for (int i = 0; i < l.length; i++) {
			if (l[i].equals(x)) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Método que recupera un elemento en el indice indicado
	 *
	 * @param p entero que indica el indice del elemento a devolver
	 * @return E que se retorna, tomando la posición siguiente que se da como
	 *         parametro
	 * @throws IndiceFueraDeRango excepción que se arroja cuando el indice p esta
	 *                            fuera de los rangos del arreglo
	 */

	public E recupera(int p) throws IndiceFueraDeRango {
		if (p > l.length || p < 0) {
			throw new IndiceFueraDeRango("Indice Fuera de Rango");

		}

		else {
			@SuppressWarnings("unchecked")
			final E e = (E) l[p];

			return e;
		}

	}

	/**
	 * Método que elimina un elemento en el indice indicado
	 *
	 * @param p entero que indica el indice del elemento a eliminar
	 * @throws IndiceFueraDeRango excepción que se arroja cuando el indice p esta
	 *                            fuera de los rangos del arreglo
	 */

	public void elimina(int p) throws IndiceFueraDeRango {
		if (p > l.length || p < 0) {
			throw new IndiceFueraDeRango("Indice Fuera de Rango");
		} else {
			l[p] = null;
		}
	}

	/**
	 * Método que da el elemento siguiente de la posición que nos indica
	 *
	 * @param p entero que indica el indice del elemento a devolver
	 * @return E que se retorna, tomando la posición siguiente que se da como
	 *         parametro
	 * @throws IndiceFueraDeRango excepción que se arroja cuando el indice p esta
	 *                            fuera de los rangos del arreglo
	 */

	public E siguiente(int p) throws IndiceFueraDeRango {
		if (p == l.length || p < -1) {
			throw new IndiceFueraDeRango("Indice Fuera de Rango");
		} else {
			@SuppressWarnings("unchecked")
			final E e = (E) l[p + 1];
			return e;
		}
	}
	/*
	 * Método que da el elemento anterior de la posición que nos indica
	 *
	 * 
	 * @param p entero que indica el indice del elemento a devolver
	 * 
	 * @return Integer que se retorna Integer tomando la posición anterior que se da
	 * como parametro
	 * 
	 * @throws IndiceFueraDeRango excepción que se arroja cuando el indice p esta
	 * fuera de los rangos del arreglo
	 */

	public E anterior(int p) throws IndiceFueraDeRango {
		if (p == l.length || p < -1) {
			throw new IndiceFueraDeRango("Indice Fuera de Rango");
		}
		@SuppressWarnings("unchecked")
		final E e = (E) l[p - 1];
		return e;

	}

	/**
	 * Método que limpia el arreglo de Enteros
	 *
	 */
	public void limpiar() {
		for (int i = 0; i < l.length; i++) {
			l[i] = null;
		}
	}

	/**
	 * Método que regresa el primer elemento del arreglo, si no existe regresa un
	 * null
	 * 
	 * @return retorna E o null del primer elemento del arreglo
	 */
	public E primero() {
		@SuppressWarnings("unchecked")
		final E e = (E) l[0];
		System.out.println(e);
		return e;
	}

	/**
	 * Método que devuelve la longitud del arreglo
	 * 
	 * @return un entero que es la longitud del arreglo
	 */
	public Integer longitud() {
		return l.length;
	}

	/**
	 * Método que imprime todos los valores del arreglo
	 */
	public void imprime() {
		for (int i = 0; i < l.length; i++) {
			System.out.print(l[i] + " ");
		}
		System.out.println();
	}

	/*
	 * Método que asignara un valor en la posición indicada
	 * 
	 * @param p entero que indica la posición donde se inserta el valor en el
	 * arreglo
	 * 
	 * @param x valor que se insertara en la posicion que se indica en p
	 * 
	 * @throws IndiceFueraDeRango exepción que sucede cuando no estamos en el rango
	 * del arreglo
	 */
	public void asignara(int x, int p) throws IndiceFueraDeRango {
		if (p == l.length || p < -1) {
			throw new IndiceFueraDeRango("Indice Fuera de Rango");
		} else {

			l[p] = x;
		}
	}

}
