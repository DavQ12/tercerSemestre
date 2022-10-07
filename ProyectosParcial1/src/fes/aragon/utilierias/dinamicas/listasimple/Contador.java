package fes.aragon.utilierias.dinamicas.listasimple;

public class Contador {
	private Integer numero=null;
	private int contador=1;
	
	public Contador() {
		
	}
	
	public Contador(Integer numero) {
		this.numero=numero;
		//this.contador=contador;
	}
	

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	@Override
	public String toString() {
		return numero+ " = " +contador;
	}

	
	public void inCont() {
		this.contador++;
	}
	
		
	
	
	
	

}
