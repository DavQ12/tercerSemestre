package aragon.unam.mx.inicio;
import java.util.stream.Collectors;
import aragon.unam.mx.repositorio.impl.BaseDeDatosDAOImpl;
import aragon.unam.mx.repositorio.intf.BaseDeDatosDAO;
public class Inicio {
public static void main(String[] args) {
	BaseDeDatosDAO datos=new BaseDeDatosDAOImpl();
	String csv=datos.getEstudiantes("ico").stream()//getEstudiantes("ico"): dame los estudiantes de ico
			.map(alm->alm.getMatricula()+";"+//map: escojer lo que sea;  en este caso se obtiene la matricula
					(alm.getMaterias().stream()// aqui las materias
							.map(mat->(mat.getNombre()+";"+mat.getCreditos()))//mapeo el flujo de materias se obtiene el nombre y creditos de las materías
							.collect(Collectors.joining(";")))+";"+alm.getNombre())//collect: se hace un registro y por c/u se coloca un ; y al ultimo el nombre
			.collect(Collectors.joining("\n"));// despues otro registro y se hace un salto de linea
		System.out.println(csv);
	}
}
//stream para levantar un flujo de informacion