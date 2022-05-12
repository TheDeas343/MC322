package pt.c40task.l05wumpus.componentes;

import pt.c40task.l05wumpus.*;
import java.util.Random;

public class Heroi extends Componente{
	private boolean flecha = true;
	private boolean engatilhada = false; 
	private boolean ouro = false;
	
	public Heroi() {
		this.ID = 'P';
		
	}
	

	public int atacar() {
		int num;
		Ramdom rand = new Random();
		if(engatilhada == true) {
			num = rand.nextInt(1);
			return num;
		}		
	}
	
	
	
	public boolean isEngatilhada() {
		return engatilhada;
	}

	public void setEngatilhada(boolean engatilhada) {
		this.engatilhada = engatilhada;
	}

	public boolean isFlecha() {
		return flecha;
	}

	public void setFlecha(boolean flecha) {
		this.flecha = flecha;
	}

	public boolean isOuro() {
		return ouro;
	}

	public void setOuro(boolean ouro) {
		this.ouro = ouro;
	}
	
	
	}
	
}
