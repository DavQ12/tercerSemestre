package aragon.unam.mx.servicios;
import java.beans.PropertyChangeEvent;
public class Socket {
 public static void eventoCambio(PropertyChangeEvent evt){
 String mensaje=evt.getPropertyName();
 if("cambio".equals(mensaje)){
 System.out.println("Dato anterior: "+(Double)evt.getOldValue());
 System.out.println("Dato nuevo: "+(Double)evt.getNewValue());
 System.out.println("Código para un Socket");
 }
 }
} 
