package Tanque;
import Proyectil.Proyectil;

public class Poder extends Enemigo
{
	//protected final static String  ruta="E_Poder";

	public Poder(int x,int y){
		 defaultX= x;
		 defaultY= y;
		 recompensa=300;
		 velocidadMov=2;
		 velocidadDisp=3;
		 aguante=1;
		 path= "src/Aplicacion/resources/Poder1.png";
	}
	
	public Proyectil disparar() {
		return null;
	}

}
