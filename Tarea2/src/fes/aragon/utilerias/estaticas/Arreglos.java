package fes.aragon.utilerias.estaticas;
import fes.aragon.excep.IndiceFueraDeRango;

/**
* Clase que tiene funciones para ocupar arreglos de tipo Integer
*
* @author mash
*
*/
public class Arreglos<E> {
	private int contador = 0;
	private int indice = 0;
	private int indiceSiguiente = -1;
	private final Integer[] numeros;
	public Arreglos(int numeroElementos) {
		this.numeros=new Integer[numeroElementos];
}

public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public Integer[] getNumeros() {
		return numeros;
	}


/**
* Método que inserta un valor de tipo Integer consecutivo
*
* @param x es el parámetro que se recibe para agregar a la lista
* @throws IndiceFueraDeRango exepción que pasa cuando nos salimos fuera del
* índice
*/
public void insertar(E x) throws IndiceFueraDeRango {
	if (indice < numeros.length) {
		numeros[indice] = (Integer) x;
		indice++;
	} else {
		throw new IndiceFueraDeRango("Indice fuera de rango");
	}
}
/**
* Método que localiza un valor en la lista, retornan el indice
*
* @param x valor Integer que se busca en la lista
* @return se retorna -1 si no esta el valor de la lista, en caso contrario se
* retorna el indice
*/
public Integer localiza(E x) {

	for (int i = 0; i < numeros.length; i++) {
		if (numeros[i].equals(x)) {
			return i;
		}
	}
	return -1;
}
/**
* Método que recupera un elemento en el indice indicado
*
* @param p entero que indica el indice del elemento a devolver
* @return E que se retorna, tomando la posición siguiente que se
* da como parametro
* @throws IndiceFueraDeRango excepción que se arroja cuando el indice p esta
* fuera de los rangos del arreglo
*/
public E recupera(int p) throws IndiceFueraDeRango {
	if (p >= numeros.length || p < 0) {
		throw new IndiceFueraDeRango("Indice fuera de rango");
	} else {
		@SuppressWarnings("unchecked")
		final E e=(E)numeros[p];
		return e;
	}
}
/**
* Método que alimina un elemento en el indice indicado
*
* @param p entero que indica el indice del elemento a eliminar
* @throws IndiceFueraDeRango excepción que se arroja cuando el indice p esta
* fuera de los rangos del arreglo
*/
public void suprime(int p) throws IndiceFueraDeRango {
	if (p >= numeros.length || p < 0) {
		throw new IndiceFueraDeRango("Indice fuera de rango");
	} else {
		numeros[p] = null;
	}
}
/**
* Método que da el elemento siguiente de la posición que nos indica
*
* @param p entero que indica el indice del elemento a devolver
* @return E que se retorna, tomando la posición siguiente que se
* da como parametro
* @throws IndiceFueraDeRango excepción que se arroja cuando el indice p esta
* fuera de los rangos del arreglo
*/
public E siguiente(int p) throws IndiceFueraDeRango {
	if (p >= numeros.length || p < 0) {
		throw new IndiceFueraDeRango("Indice fuera de rango");
	}
	@SuppressWarnings("unchecked")
	final E e=(E)numeros[p + 1];
	return e;
}

public E siguiente() throws IndiceFueraDeRango {
	this.indiceSiguiente += 1;
	if (this.indiceSiguiente == numeros.length) {
		throw new IndiceFueraDeRango("Ya no hay elementos");
	}
	@SuppressWarnings("unchecked")
	final E e=(E)numeros[this.indiceSiguiente];
	return e;
}

/**
* Método que da el elemento anterior de la posición que nos indica

*
* @param p entero que indica el indice del elemento a devolver
* @return Integer que se retorna Integer tomando la posición anterior que se da
* como parametro
* @throws IndiceFueraDeRango excepción que se arroja cuando el indice p esta
* fuera de los rangos del arreglo
*/
public E anterior(int p) throws IndiceFueraDeRango {
	if (p >= numeros.length - 1 || p < 0) {
		throw new IndiceFueraDeRango("Indice fuera de rango");
	}
	@SuppressWarnings("unchecked")
	final E e=(E)numeros[p - 1];
	return e;
}
/**
* Méotodo que limpia el arreglo de Enteros
*
*/
public void limpiar() {
	for (int i = 0; i < numeros.length; i++) {
		numeros[i] = null;
	}
}
/**
* Método que regresa el primer elemento del arreglo, si no existe regresa un
* null
* @return retorna E o null del primer elemento del arreglo
*/
public E primero() {
	@SuppressWarnings("unchecked")
	final E e=(E)numeros[0];
	return e;
}
/**
* Método que devuelve la longitud del arreglo
* @return un entero que es la longitud del arreglo
*/
public Integer longitud() {
	return numeros.length;
}
/**
* Método que imprime todos los valores del arreglo
*/
public void imprime() {
	for (int i = 0; i < numeros.length; i++) {
		System.out.print(numeros[i]+" ");
}
	System.out.println();
}
/**
* Método que asignara un valor en la posición indicada
* @param p entero que indica la posición donde se inserta el valor en el arreglo
* @param x valor que se insertara en la posicion que se indica en p
* @throws IndiceFueraDeRango exepción que sucede cuando no estamos en el rango del arreglo
*/
public void asignar(int p,E x) throws IndiceFueraDeRango {
	if (p >= numeros.length || p < 0) {

		throw new IndiceFueraDeRango("Indice fuera de rango");
	} else {
		numeros[p]=(Integer) x;
		}
	}




/**
 * Metodo para sacar el promedio de una arreglo 
 * @return res es el resultado del promedio
 * @throws IndiceFueraDeRango excepción que sucede cuando no estamos en el rango del arreglo
 */

public float promedio() throws IndiceFueraDeRango{
	float prom[] = new float[numeros.length]; //se declara el nuevo arreglo
	float sum = 0, res= 0; 
	
	for(int i=0; i<numeros.length; i++) {
		prom[i]= Integer.parseInt(numeros[i].toString());// cada elemento del arreglo se convierte en un entero y lo guardo en el nuevo arreglo
	}
	
	for(int j=0; j<numeros.length; j++) {
		sum+=prom[j];//operando
	}
	
	res=sum/numeros.length;//formula para sacar el promedio
	
	return res;
}

/**
 * Metodo para encontrar el numero mayor de un numero
 * @return maxValue es el numero mayor
 * @throws IndiceFueraDeRango excepción que sucede cuando no estamos en el rango del arreglo
 */

public int maximo() throws IndiceFueraDeRango{
	
	int list[]= new int[numeros.length];
	int maxValue=0;
	
	for(int i=0; i<numeros.length; i++) {
		list[i]= Integer.parseInt(numeros[i].toString());
	}
	
	for(int i=0; i<numeros.length; i++) {
		if (list[i]>maxValue) {
			maxValue=list[i];
		}
	}
	return maxValue;
}

//minimo
public int minimo() throws IndiceFueraDeRango{
	
	int list[]= new int[numeros.length];
	int minValue=(int) numeros[0];
	
	for(int i=0; i<numeros.length; i++) {
		list[i]= Integer.parseInt(numeros[i].toString());
	}
	
	for(int i=0; i<numeros.length; i++) {
		if (list[i]<minValue) {
			minValue=list[i];
		}
	}
	return minValue;
}

//valor medio


public void intervalo() throws IndiceFueraDeRango{
	
	int interInf=3, interSup=6;
	int list1[]= new int[numeros.length];
	
	for (int i= 0; i<numeros.length; i++) {
		list1[i]= Integer.parseInt(numeros[i].toString());
	}
	
	for (int i= 0; i<numeros.length; i++) {
		if (i>=interInf && i<=interSup ) {
			System.out.println(list1[i]+" ");
		}
	}
	System.out.println();
}

}