package aragon.unam.mx.repositorio;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
public class BaseDeDatos implements PropertyChangeListener{//implementa
 @Override
 public void propertyChange(PropertyChangeEvent evt) {//se guarda en la variable "evt"
 String mensaje=evt.getPropertyName();
 if("cambio".equals(mensaje)){
 System.out.println("Dato anterior: "+(Double)evt.getOldValue());
 System.out.println("Dato nuevo: "+(Double)evt.getNewValue());
 System.out.println("Código para almacenar en B.D");
 }
 }
} 
