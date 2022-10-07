package aragon.unam.mx.repositorio.impl;
import java.util.List;
import aragon.unam.mx.modelo.Estudiante;
import aragon.unam.mx.repositorio.intf.BaseDeDatosDAO;
import aragon.unam.mx.repositorio.BaseDeDatos;
public class BaseDeDatosDAOImpl implements BaseDeDatosDAO {
@Override
public List<Estudiante> getEstudiantes(String carrera) {//Regresa un lista, el flujo que se realizo
return BaseDeDatos.carreras.get(carrera);//hashMap y de ese mismo dame la carrera
}
@Override
public Estudiante getEstudiante(String carrera, String matricula) {//para obtener solo un estudiante, entral la carrera y matricula
return BaseDeDatos.carreras.get(carrera)//hashMap de la carrera osea "ICO" o "IME"
.stream().filter(est->est.getMatricula().equals(matricula))
.findFirst()
.get();
}
}
/*
 * Stream: se indica el flujo de información
 * metodo Filter: se analiza la matricula de cada estudiante hasta lograr una igualdad con la matricula dada
 * findFirst: te devuelve el primer estudiante
 * get para regresar el objeto estudiante
 */
