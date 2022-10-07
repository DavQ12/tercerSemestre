package Inicio;

import Componentes.Bocinas;
import Componentes.Computadora;
import Componentes.Monitor;
import Componentes.Mouse;
import Componentes.TarjetaGrafica;
import Componentes.Teclado;

public class inicio {

	public static void main(String[] args) {
		Computadora compus[]=new Computadora[5];
		compus[0]=new Computadora("Hp", 2018, new Monitor("Samsung", 12.8f), new Mouse("Samsung", "Alambrico"), new Teclado("Lenovo", 104), 
				  new TarjetaGrafica("NVIDIA", 10, "PCI Express 4.0"), new Bocinas("Negras", "Bose", 5));
		
		compus[1]=new Computadora("Dell", 2017, new Monitor("Lenovo", 12.8f), new Mouse("Logitech", "inalambrico"), new Teclado("Logitech", 105), 
				  new TarjetaGrafica("NVIDIA", 10, "PCI Express 4.0"), new Bocinas("Negras", "Bose", 5));
		
		compus[2]=new Computadora("Hp", 2018, new Monitor("Dell", 12.8f), new Mouse("Samsung", "Alambrico"), new Teclado("Lenovo", 104), 
				  new TarjetaGrafica("NVIDIA", 10, "PCI Express 4.0"), new Bocinas("Negras", "Bose", 5));
		
		compus[3]=new Computadora("Hp", 2018, new Monitor("Samsung", 12.8f), new Mouse("Samsung", "Alambrico"), new Teclado("Lenovo", 104), 
				  new TarjetaGrafica("NVIDIA", 10, "PCI Express 4.0"), new Bocinas("Negras", "Bose", 5));
		
		compus[4]=new Computadora("Hp", 2018, new Monitor("Samsung", 12.8f), new Mouse("Samsung", "Alambrico"), new Teclado("Lenovo", 104), 
				  new TarjetaGrafica("NVIDIA", 10, "PCI Express 4.0"), new Bocinas("Negras", "Bose", 5));
		
		for(int i =0; i<compus.length;i++) {
			System.out.println(compus[i]+"\n");
		}
	}

}
