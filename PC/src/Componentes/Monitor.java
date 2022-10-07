package Componentes;

public class Monitor {
    private String marca;
    private float pulgadas;

    public Monitor() {
    }

    public Monitor(String marca, float pulgadas) {
        this.marca = marca;
        this.pulgadas = pulgadas;
    }

    public float getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Monitor{" + "marca=" + marca + ", pulgadas=" + pulgadas + '}';
    }
    
    public void emitirImagen( ){
        System.out.println(" Está emitiendo una imagen");
    }
    
    
    
}