package SumaDeVectores;

import java.util.Scanner;

public class Suma {
	
	public static void main(String[] args) {
		
		Atributos[] vectores = new Atributos[3];//contiene las properties del vector
		double[] x = new double[3];//para guardar los componentes en x
		double[] y = new double[3];//para guardas los componentes en y
		double sumatoriaX=0, sumatoriaY=0, sumatoriaT=0;//sumatorias de cada una
		double anguloRad=0;//para almacenar en radianes
		
		Scanner entrada= new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			vectores[i]=new Atributos (0, 0, " "," ");// se inicializa el arreglo
		}
		
		for(int i=0;i<3;i++) {// recoleccion de datos
			
			System.out.println("Ingrese el vector "+(i+1)+": ");
			vectores[i].setMagnitud(entrada.nextDouble());
			System.out.println("Indique el sentido del vector");
			vectores[i].setSentido(entrada.next());
			
			if(!vectores[i].getSentido().equals("norte") && !vectores[i].getSentido().equals("sur") 
					&& !vectores[i].getSentido().equals("este") && !vectores[i].getSentido().equals("oeste")) {
				
				System.out.println("Ingrese la direccion n° " +(i+1)+": ");
				vectores[i].setDireccion(entrada.nextDouble());
				System.out.println("¿Respecto a que eje esta el angulo? (x o y): ");
				vectores[i].setEje(entrada.next());
				
			}
			
			
			
		}
		
		for(int i=0;i<3;i++) {//operaciones
			
			switch(vectores[i].getSentido()) {
				case "noreste":
					anguloRad=0;//se limpia la variable
					
						if(vectores[i].getEje().equals("x") || vectores[i].getEje().equals("X")){
							anguloRad=Math.toRadians(vectores[i].getDireccion());//convertir a radianes
							//sacamos el producto del coseno y la magnitdud para sacar los compentes en x
							x[i]=(Math.cos(anguloRad)*vectores[i].getMagnitud());
							//sacamos el producto del seno y la magnitdud para sacar los compentes en y
							y[i]=(Math.sin(anguloRad)*vectores[i].getMagnitud());
							System.out.println("x"+(i+1)+" = "+ x[i]);
							System.out.println("y"+(i+1)+" = "+ y[i]);
							sumatoriaX+=x[i];
							sumatoriaY+=y[i];
							
						}else {
							if(vectores[i].getEje().equals("y") || vectores[i].getEje().equals("Y")) {
								anguloRad=Math.toRadians(vectores[i].getDireccion());//convertir a radianes
								//sacamos el producto del seno y la magnitdud para sacar los compentes en x
								x[i]=(Math.sin(anguloRad)*vectores[i].getMagnitud());
								//sacamos el producto del coseno y la magnitdud para sacar los compentes en y 
								y[i]=(Math.cos(anguloRad)*vectores[i].getMagnitud());
								System.out.println("x"+(i+1)+" = "+ x[i]);
								System.out.println("y"+(i+1)+" = "+ y[i]);
								sumatoriaX+=x[i];
								sumatoriaY+=y[i];
							}
						}
					
					break;
				case "noroeste":	
					anguloRad=0;//se limpia la variable
					
						if(vectores[i].getEje().equals("x") || vectores[i].getEje().equals("X")){
							anguloRad=Math.toRadians(vectores[i].getDireccion());//convertir a radianes
							//sacamos el producto del coseno y la magnitdud para sacar los compentes en x
							x[i]=((Math.cos(anguloRad)*vectores[i].getMagnitud()))*-1;
							//sacamos el producto del seno y la magnitdud para sacar los compentes en y
							y[i]=(Math.sin(anguloRad)*vectores[i].getMagnitud());
							System.out.println("x"+(i+1)+" = "+ x[i]);
							System.out.println("y"+(i+1)+" = "+ y[i]);
							sumatoriaX+=x[i];
							sumatoriaY+=y[i];
						}else {
							if(vectores[i].getEje().equals("y") || vectores[i].getEje().equals("Y")) {
								anguloRad=Math.toRadians(vectores[i].getDireccion());//convertir a radianes
								//sacamos el producto del seno y la magnitdud para sacar los compentes en x
								x[i]=((Math.sin(anguloRad)*vectores[i].getMagnitud()))*-1;
								//sacamos el producto del coseno y la magnitdud para sacar los compentes en y 
								y[i]=(Math.cos(anguloRad)*vectores[i].getMagnitud());
								System.out.println("x"+(i+1)+" = "+ x[i]);
								System.out.println("y"+(i+1)+" = "+ y[i]);
								sumatoriaX+=x[i];
								sumatoriaY+=y[i];
							}
						}
						
					
					break;
				case "suroeste":
					anguloRad=0;//se limpia la variable
						if(vectores[i].getEje().equals("x") || vectores[i].getEje().equals("X")){
							anguloRad=Math.toRadians(vectores[i].getDireccion());//convertir a radianes
							//sacamos el producto del coseno y la magnitdud para sacar los compentes en x
							x[i]=(Math.cos(anguloRad)*vectores[i].getMagnitud())*-1;
							//sacamos el producto del seno y la magnitdud para sacar los compentes en y
							y[i]=(Math.sin(anguloRad)*vectores[i].getMagnitud())*-1;
							System.out.println("x"+(i+1)+" = "+ x[i]);
							System.out.println("y"+(i+1)+" = "+ y[i]);
							sumatoriaX+=x[i];
							sumatoriaY+=y[i];
						}else {
							if(vectores[i].getEje().equals("y") || vectores[i].getEje().equals("Y")) {
								anguloRad=Math.toRadians(vectores[i].getDireccion());//convertir a radianes
								//sacamos el producto del seno y la magnitdud para sacar los compentes en x
								x[i]=(Math.sin(anguloRad)*vectores[i].getMagnitud())*-1;
								//sacamos el producto del coseno y la magnitdud para sacar los compentes en y 
								y[i]=(Math.cos(anguloRad)*vectores[i].getMagnitud())*-1;
								System.out.println("x"+(i+1)+" = "+ x[i]);
								System.out.println("y"+(i+1)+" = "+ y[i]);
								sumatoriaX+=x[i];
								sumatoriaY+=y[i];
							}
						}
					
					break;
				case "sureste":
					anguloRad=0;//se limpia la variable

						if(vectores[i].getEje().equals("x") || vectores[i].getEje().equals("X")){
							anguloRad=Math.toRadians(vectores[i].getDireccion());//convertir a radianes
							//sacamos el producto del coseno y la magnitdud para sacar los compentes en x
							x[i]=(Math.cos(anguloRad)*vectores[i].getMagnitud());
							//sacamos el producto del seno y la magnitdud para sacar los compentes en y
							y[i]=(Math.sin(anguloRad)*vectores[i].getMagnitud())*-1;
							System.out.println("x"+(i+1)+" = "+ x[i]);
							System.out.println("y"+(i+1)+" = "+ y[i]);
							sumatoriaX+=x[i];
							sumatoriaY+=y[i];
						}else {
							if(vectores[i].getEje().equals("y") || vectores[i].getEje().equals("Y")) {
								anguloRad=Math.toRadians(vectores[i].getDireccion());//convertir a radianes
								//sacamos el producto del seno y la magnitdud para sacar los compentes en x
								x[i]=(Math.sin(anguloRad)*vectores[i].getMagnitud());
								//sacamos el producto del coseno y la magnitdud para sacar los compentes en y 
								y[i]=(Math.cos(anguloRad)*vectores[i].getMagnitud())*-1;
								System.out.println("x"+(i+1)+" = "+ x[i]);
								System.out.println("y"+(i+1)+" = "+ y[i]);
								sumatoriaX+=x[i];
								sumatoriaY+=y[i];
							}
						}
					
					break;
				case "norte":
					
					x[i]=0;
					//sacamos el producto del coseno y la magnitdud para sacar los compentes en y 
					y[i]=vectores[i].getMagnitud();
					System.out.println("x"+(i+1)+" = "+ x[i]);
					System.out.println("y"+(i+1)+" = "+ y[i]);
					sumatoriaX+=x[i];
					sumatoriaY+=y[i];	

					break;
				case "sur":
					x[i]=0;
					//sacamos el producto del coseno y la magnitdud para sacar los compentes en y 
					y[i]=(vectores[i].getMagnitud())*-1;
					System.out.println("x"+(i+1)+" = "+ x[i]);
					System.out.println("y"+(i+1)+" = "+ y[i]);
					sumatoriaX+=x[i];
					sumatoriaY+=y[i];	
					
					break;
					
				case "este":
					x[i]=(vectores[i].getMagnitud());
					//sacamos el producto del coseno y la magnitdud para sacar los compentes en y 
					y[i]=0;
					System.out.println("x"+(i+1)+" = "+ x[i]);
					System.out.println("y"+(i+1)+" = "+ y[i]);
					sumatoriaX+=x[i];
					sumatoriaY+=y[i];
					break;
				
				case "oeste":
					x[i]=(vectores[i].getMagnitud())*-1;
					//sacamos el producto del coseno y la magnitdud para sacar los compentes en y 
					y[i]=0;
					System.out.println("x"+(i+1)+" = "+ x[i]);
					System.out.println("y"+(i+1)+" = "+ y[i]);
					sumatoriaX+=x[i];
					sumatoriaY+=y[i];
					break;
					
			}	
		
			
		}
		System.out.println("Sumatoria en X es: "+sumatoriaX);
		System.out.println("Sumatoria en Y es: "+sumatoriaY);
		double sum=((sumatoriaX*sumatoriaX)+(sumatoriaY*sumatoriaY));
		sumatoriaT= (Math.sqrt(sum));
		System.out.println("La sumatoria total es: "+ sumatoriaT);
	}
	
}
