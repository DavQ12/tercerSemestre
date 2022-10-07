package SumaDeVectores;

public class Atributos {
		
	private double magnitud;
	private double direccion;
	private String eje;
	private String sentido;
	
	public Atributos(double magnitud, double direccion, String eje, String sentido) {
		this.magnitud=magnitud;
		this.direccion=direccion;
		this.eje=eje;
	}

	public double getMagnitud() {
		return magnitud;
	}

	public void setMagnitud(double magnitud) {
		this.magnitud = magnitud;
	}

	public double getDireccion() {
		return direccion;
	}

	public void setDireccion(double direccion) {
		this.direccion = direccion;
	}

	public String getEje() {
		return eje;
	}

	public void setEje(String eje) {
		this.eje = eje;
	}

	public String getSentido() {
		return sentido;
	}

	public void setSentido(String sentido) {
		this.sentido = sentido;
	}

	
	@Override
	public String toString() {
		return "Atributos [magnitud=" + magnitud + ", direccion=" + direccion + ", eje=" + eje + ", sentido=" + sentido
				+ "]";
	}
	
	
	
}
