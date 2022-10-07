package fes.aragon.validacion;

public class Validacion {
	public boolean validacion(String cadena) {
		int num=0;
		try {
			num=Integer.parseInt(cadena);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
