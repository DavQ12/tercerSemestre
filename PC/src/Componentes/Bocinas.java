package Componentes;

public class Bocinas {
	
	private String color;
	private String marca;
	private float volumen;
	
	public Bocinas() {
		
	}
	
	public Bocinas(String color, String marca, float volumen) {
        this.marca = marca;
        this.volumen = volumen;
        this.color = color;
    }

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getVolumen() {
		return volumen;
	}

	public void setVolumen(float volumen) {
		this.volumen = volumen;
	}

	@Override
	public String toString() {
		return "Bocinas [color=" + color + ", marca=" + marca + ", volumen=" + volumen + "]";
	}
	
	
	public void emitirSonido( ){
        System.out.println(" Está emitiendo sonido");
    }
}
