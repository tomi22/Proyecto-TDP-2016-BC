package Obstaculo;

import general.gameObject;

public abstract class Obstaculo extends gameObject{
	protected  boolean avanzable;
	protected  boolean destruible;

	
	public boolean afectar(gameObject g){
		
		return true;
	}
}
