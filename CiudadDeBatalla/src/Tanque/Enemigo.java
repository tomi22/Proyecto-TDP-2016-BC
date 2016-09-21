package Tanque;

import Proyectil.Proyectil;

public abstract class Enemigo extends Tanque{
	
	
	protected int recompensa;

	public int getRecompensa(){
		return recompensa;
	}
	
	public abstract Proyectil disparar();


}
