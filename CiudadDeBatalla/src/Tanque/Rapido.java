package Tanque;

import Proyectil.Proyectil;

public class Rapido extends Enemigo {
	
	//protected final static String  ruta="Enemigo";
	
	public Rapido(int x,int y){
		 defaultX= x;
		 defaultY= y;
		 recompensa=200;
		 velocidadMov=3;
		 velocidadDisp=2;
		 aguante=1;
		 path= "src/Aplicacion/resources/Jugador1.png";
	}
	
	public Proyectil disparar() {
		return null;
	}


}
