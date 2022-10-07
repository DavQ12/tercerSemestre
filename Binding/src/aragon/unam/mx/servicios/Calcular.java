package aragon.unam.mx.servicios;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
public class Calcular implements PropertyChangeListener{//para obtener un listener solo implementar la PropertyChangeListener
 @Override
 public void propertyChange(PropertyChangeEvent evt) {//metodo para implementar
 String mensaje=evt.getPropertyName();//cuando alguien hace un setSalario notifica; el propertyName es el mensaje de cambio
 if("cambio".equals(mensaje)){// mensaje es lo mismo ejecuta el codigo
 System.out.println("Dato anterior: "+(Double)evt.getOldValue());
 System.out.println("Dato nuevo: "+(Double)evt.getNewValue());
 System.out.println("Código para calculos");
 }
 }
}