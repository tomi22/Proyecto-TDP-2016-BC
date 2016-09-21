package Obstaculo;



public class Cemento extends Obstaculo {
	//private static final String ruta="Cemento";
	
	public Cemento(int x,int y){
		defaultX= x;
		defaultY= y;
		avanzable=false;
		destructible=false;
		path= "src/Aplicacion/resources/Cemento.png";
	}
	
	//public String getPath(){
	//	return ruta;
	//}
}
