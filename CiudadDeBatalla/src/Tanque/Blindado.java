package Tanque;
import Proyectil.Proyectil;

public class Blindado extends Enemigo{
	//private int contador;
	//protected final static String ruta="Blindado";
	
	public Blindado(int x,int y){
		
		defaultX= x;
		defaultY= y;
		 recompensa=400;
		 velocidadMov=1;
		 velocidadDisp=2;
		 aguante=4;
		 path= "src/Aplicacion/resources/Blindado1.png";
		// contador=0;
	}
	
	public Proyectil disparar() {
		return null;
	}

}
