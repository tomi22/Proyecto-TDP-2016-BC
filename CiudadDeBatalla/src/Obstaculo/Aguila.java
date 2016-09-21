package Obstaculo;



public class Aguila extends Obstaculo{
	//private static final String ruta="Aguilucho";
	//protected boolean avanzable;
	//protected boolean destructible;
	
	public Aguila(int x,int y){
		defaultX= x;
		defaultY= y;
		avanzable=false;
		destructible=true;
		path= "src/Aplicacion/resources/Aguila.png";
	}
	
	//public String getPath(){
	//	return ruta;
	//}
}
