package Tanque;

import Proyectil.Proyectil;
import general.Celda;

public class Basico extends Enemigo {
	//protected final static String ruta="Enemigo";

	public Basico(int x,int y){
		 defaultX= x;
		 defaultY= y;
		 recompensa=100;
		 velocidadMov=1;
		 velocidadDisp=1;
		 aguante=1;
		 path= "src/Aplicacion/resources/Basico1.png";
	}
	
	public Proyectil disparar() {
		return null;
	}
	
}
