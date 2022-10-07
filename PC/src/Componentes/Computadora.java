package Componentes;

public class Computadora {
	private String marca;
    private int anio;
    private Monitor pantalla;
    private Teclado teclado;
    private Mouse raton;
    private TarjetaGrafica tarjetaGrafica;
    private Bocinas bocinas;
    
public Computadora() {
	
}

public Computadora(String marca, int anio, Monitor pantalla, Mouse raton, Teclado teclado, TarjetaGrafica tarjetaGrafica, Bocinas bocinas) {
    this.marca = marca;
    this.anio = anio;
    this.pantalla = pantalla;
    this.raton = raton;
    this.teclado = teclado;
    this.tarjetaGrafica = tarjetaGrafica;
    this.bocinas = bocinas;
    
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public int getModelo() {
	return anio;
}

public void setModelo(String modelo) {
	this.anio = anio;
}

public Monitor getPantalla() {
	return pantalla;
}

public void setPantalla(Monitor pantalla) {
	this.pantalla = pantalla;
}

public Teclado getTeclado() {
	return teclado;
}

public void setTeclado(Teclado teclado) {
	this.teclado = teclado;
}

public Mouse getRaton() {
	return raton;
}

public void setRaton(Mouse raton) {
	this.raton = raton;
}

public TarjetaGrafica getTarjetaGrafica() {
	return tarjetaGrafica;
}

public void setTarjetaGrafica(TarjetaGrafica tarjetaGrafica) {
	this.tarjetaGrafica = tarjetaGrafica;
}

public Bocinas getBocinas() {
	return bocinas;
}

public void setBocinas(Bocinas bocinas) {
	this.bocinas = bocinas;
}

@Override
public String toString() {
	return "Computadora [marca=" + marca + ", modelo=" + anio + ", pantalla=" + pantalla
			+ ", teclado=" + teclado + ", raton=" + raton + ", tarjetaGrafica=" + tarjetaGrafica + ", bocinas="
			+ bocinas + "]";
}




}
