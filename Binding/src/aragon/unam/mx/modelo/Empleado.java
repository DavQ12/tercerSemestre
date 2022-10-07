package aragon.unam.mx.modelo;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
public class Empleado {
 private String nombre;
 private double salario;
 private PropertyChangeSupport datos=new PropertyChangeSupport(this);//si alguien cambia algo notifica a los listeners
 public Empleado() {
 this.nombre="Sin nombre";
 this.salario=0.0;
 }
 public String getNombre() {
 return nombre;
 }
 public void setNombre(String nombre) {
 this.nombre = nombre;
 }
 public double getSalario() {
 return salario;
 }
 public void setSalario(double salario) {//salario= propiedad
 double viejoSalario=this.salario;//se guarda lo que se tenía, el antiguo salario
 this.salario = salario;// se guarda el nuevo "Salario"
 //notificar a todos los oyentes registrados el cambio
 //que se llama "cambio"
 datos.firePropertyChange("cambio", viejoSalario, this.salario);//(mensaje, viejoDato, nuevoDato)
 }
 public void agregarOyente(PropertyChangeListener oyente){//metodos para agregar a los oyentes
 datos.addPropertyChangeListener(oyente);
 }
 public void eliminarOyente(PropertyChangeListener oyente){
 datos.removePropertyChangeListener(oyente);
 }
 @Override
 public String toString() {
 return "Empleado{" + "salario=" + salario + '}';
 }
}