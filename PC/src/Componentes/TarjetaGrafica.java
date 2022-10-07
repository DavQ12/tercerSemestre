package Componentes;

public class TarjetaGrafica {
	
	private String marca;
	private int capacidad;
	private String interfazDeSalida;
	
	public TarjetaGrafica() {
	}
	
	public TarjetaGrafica(String marca,int capacidad, String interfazDeSalida) {
        this.marca = marca;
        this.capacidad = capacidad;
        this.interfazDeSalida = interfazDeSalida;
    }

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getInterfazDeSalida() {
		return interfazDeSalida;
	}

	public void setInterfazDeSalida(String interfazDeSalida) {
		this.interfazDeSalida = interfazDeSalida;
	}

	@Override
	public String toString() {
		return "TarjetaGrafica [marca=" + marca + ", capacidad=" + capacidad + ", interfazDeSalida=" + interfazDeSalida
				+ "]";
	}

	public void procesarInformación( ){
        System.out.println(" Procesando información");
    }

}
