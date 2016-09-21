package Obstaculo;



public class Ladrillo extends Obstaculo {
	//private static final String ruta="Ladrillo";
	
	public Ladrillo(int x,int y){
		defaultX= x;
		defaultY= y;
		destructible=true;
		avanzable=false;
		path= "src/Aplicacion/resources/Ladrillo.png";

	}
	
	
}
