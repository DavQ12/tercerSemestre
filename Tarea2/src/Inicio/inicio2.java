package Inicio;

import java.util.Random;
import fes.aragon.excep.IndiceFueraDeRango;
import fes.aragon.utilerias.estaticas.Arreglos;

public class inicio2 {

	public static void main(String[] args) throws IndiceFueraDeRango {
		
		Arreglos<Integer> numeros=new Arreglos<>(10);
		Arreglos<Integer> contador=new Arreglos<>(10);
		int cont[]=new int[contador.longitud()];
		Random rd=new Random();
		
		for (int k=0; k<numeros.longitud(); k++) {
			numeros.asignar(k, rd.nextInt(100));
			contador.asignar(k, 0);
		}
		
		for (int l=0; l<numeros.longitud(); l++) {
			
			cont[l]= Integer.parseInt(contador.recupera(l).toString());
		}
		
		System.out.println(cont[0]);
		numeros.imprime();
		System.out.println("El promedio es: "+numeros.promedio());
		
		for (int i=0; i<numeros.longitud(); i++) {
			for (int j=0; j<numeros.longitud(); j++) {
				
				if(numeros.recupera(i)==numeros.recupera(j)) {
					cont[i]++;
					
				}
			}
			System.out.println(numeros.recupera(i)+" = "+ cont[i]);
		}
		
		/*
		for(int i=0; i<10; i++) {//iteracion. 0, 1, 2, 3
			for(int j=0; j<10; j++) {//iteracion. 0, 
				
				if(lista2.recupera(j).getNumero()!=null) {
					
					if(lista.obtenerNodo(i)==lista2.recupera(j).getNumero()) {
						
						lista2.recupera(j).setContador(lista2.recupera(j).getContador()+1);
						System.out.println(" AA " );
						break;
				}
				}else {

					lista2.recupera(j).setNumero(lista.obtenerNodo(i));
					lista2.recupera(j).setContador(lista2.recupera(j).getContador()+1);
					//System.out.println(" AA " );
					break;
				}
				
				//System.out.println(lista2.recupera(j).getNumero()+ " = " +lista2.recupera(j).getContador());
					
				}
			//System.out.println(lista2.recupera(i).getNumero()+ " = " +lista2.recupera(i).getContador());
			}
			*/
			
		
		
		/*
		 * anguloRad=0;//se limpia la variable
			
			if(vectores[i].getDireccion()!=0) {
				
				if(vectores[i].getEje().equals("x") || vectores[i].getEje().equals("X")){
					
					anguloRad=Math.toRadians(vectores[i].getDireccion());//convertir a radianes
					
					//sacamos el producto del coseno y la magnitdud para sacar los compentes en x
					x[i]=(Math.cos(anguloRad)*vectores[i].getMagnitud());
					//sacamos el producto del seno y la magnitdud para sacar los compentes en y
					y[i]=(Math.sin(anguloRad)*vectores[i].getMagnitud());
					
					System.out.println("X"+(i+1)+" = "+ x[i]);
					System.out.println("Y"+(i+1)+" = "+ y[i]);
					
					sumatoriaX+=x[i];
					sumatoriaX+=y[i];
				
					
				}else {
					if(vectores[i].getEje().equals("y") || vectores[i].getEje().equals("Y")) {
						
						anguloRad=Math.toRadians(vectores[i].getDireccion());//convertir a radianes
						
						
						//sacamos el producto del seno y la magnitdud para sacar los compentes en x
						x[i]=(Math.sin(anguloRad)*vectores[i].getMagnitud());
						//sacamos el producto del coseno y la magnitdud para sacar los compentes en y 
						y[i]=(Math.cos(anguloRad)*vectores[i].getMagnitud());
						
						System.out.println("X"+(i+1)+" = "+ x[i]);
						System.out.println("Y"+(i+1)+" = "+ y[i]);
						sumatoriaX+=x[i];
						sumatoriaX+=y[i];
						
					}
				}
			}else {
				
				if(vectores[i].getEje().equals("x") || vectores[i].getEje().equals("X")){
					
					//sacamos el producto del coseno y la magnitdud para sacar los compentes en x
					x[i]=vectores[i].getMagnitud();
					//sacamos el producto del seno y la magnitdud para sacar los compentes en y
					y[i]=0;
					
					System.out.println("X"+(i+1)+" = "+ x[i]);
					System.out.println("Y"+(i+1)+" = "+ y[i]);
					
					sumatoriaX+=x[i];
					sumatoriaX+=y[i];
				
					
				}else {
					if(vectores[i].getEje().equals("y") || vectores[i].getEje().equals("Y")) {
						
						//sacamos el producto del seno y la magnitdud para sacar los compentes en x
						x[i]=0;
						//sacamos el producto del coseno y la magnitdud para sacar los compentes en y 
						y[i]=vectores[i].getMagnitud();
						
						System.out.println("X"+(i+1)+" = "+ x[i]);
						System.out.println("Y"+(i+1)+" = "+ y[i]);
						
						sumatoriaX+=x[i];
						sumatoriaX+=y[i];
						
					}
				}
				
			}
		 */
		}
		
		
	

}
