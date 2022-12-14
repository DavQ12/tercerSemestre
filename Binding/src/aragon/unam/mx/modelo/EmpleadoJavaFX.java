package aragon.unam.mx.modelo;
import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.beans.property.ReadOnlyDoubleWrapper;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
public class EmpleadoJavaFX {
 private final StringProperty nombre=new SimpleStringProperty(this,"nombre","Sin nombre");
 private final ReadOnlyDoubleWrapper salario=new ReadOnlyDoubleWrapper(this, "salario", 0.0);
 public EmpleadoJavaFX(String nombre,Double salario){
 this.nombre.set(nombre);
 this.salario.set(salario);
 }
 public final StringProperty nombreProperty(){
 return nombre;
 }
 public final ReadOnlyDoubleProperty salarioProperty(){
 return salario.getReadOnlyProperty();
 }
 //por compatibilidad
 public final String getNombre(){
 return this.nombre.get();
 }
 public final void setNombre(String nombre){
 this.nombre.set(nombre);
 }

 public final double getSalario(){
 return this.salario.get();
 }
 public final void setSalario(Double salario){
 this.salario.set(salario);
 }

}
