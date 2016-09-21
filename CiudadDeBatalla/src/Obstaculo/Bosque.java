package Obstaculo;



public class Bosque extends Obstaculo {
	//private static final String ruta="Bosque";
	
	public Bosque(int x,int y){
		defaultX= x;
		defaultY= y;
		avanzable=true;
		destructible=false;
		path= "src/Aplicacion/resources/Bosque.png";
	}
	
	//public String getPath(){
	//	return ruta;
	//}
}
