package estructuras.datos.parcial1;



import fes.aragon.utilerias.dinamicas.pila.Pila;

public class EvaluacionPos {
	public static void main(String[] args) throws Exception {

		Pila<Integer> pila = new Pila<>();
		
		//ListaSimple<String>lista1 = new ListaSimple<>();
		String cadena="6 2 3 + - 3 8 2 / + * 2 ^ 3 +";
		String simbolo;
		int i=0;
		float operando1=0, operando2=0, valor=0;
		boolean flag;
		pila.borrar();
		
		
		String[] lista= cadena.split(" ");
		/*
		for(int j =0; j<lista.length;j++) {
			System.out.println(lista[j]);
		}
		*/
		
			while(i<lista.length) {
				simbolo=lista[i];
				System.out.println(simbolo);
				
				if( !simbolo.equals('+') || !simbolo.equals('*') || !simbolo.equals('-') || !simbolo.equals('/') || !simbolo.equals('^') ) {
					
					pila.insertar(Integer.parseInt(simbolo));
				}else {
					operando2=pila.extraer();
					operando1=pila.extraer();
					valor=operaciones(simbolo, operando1, operando2);
					pila.insertar((int) valor);
				}
				
				
				i++;
			}
		
		
		System.out.println("El resultado es: "+pila.extraer());
		
	}
	
	public static float operaciones(String simbolo, float oper1, float oper2) {
		float res=0;
		switch (simbolo) {
		case "+": res= (oper1+oper2); break;
		case "-": res=(oper1-oper2); break;
		case "*": res=(oper1*oper2); break;
		case "/": res= (oper1/oper2); break;
		case "^": res= (float) (Math.pow(oper1,oper2)); break;
		default: System.out.println("Operacion incorrecta");
		break;
		}
		return res;
		
	}

	
	
}
