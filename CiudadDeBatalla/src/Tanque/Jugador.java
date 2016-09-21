package Tanque;
import Proyectil.Proyectil;

public class Jugador extends Tanque {
	//private final static String ruta_Jugador="Jugador";
	private int nivel;
	private int vidas;
	private int simultaneo;
	
	public Jugador(int x, int y){
		defaultX=x;
		defaultY=y;
		nivel=1;
		velocidadMov=2;
		velocidadDisp=1;
		aguante=1;
		simultaneo=1;
		path= "src/Aplicacion/resources/Jugador1.png";
	}
	
	//comandos
	
	public int getVidas(){
		return vidas;
	}

    public void sacarVida(){
    	vidas--;
    }
    public void sumarVida(){
    	vidas++;
    }
	public int getNivel(){
		return nivel;
	}

	public Proyectil disparar() {
		return null;
	}

}
