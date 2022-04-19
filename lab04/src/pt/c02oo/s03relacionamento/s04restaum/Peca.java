package pt.c02oo.s03relacionamento.s04restaum;

import java.security.PublicKey;

public class Peca {
	boolean Vivo ;
	int i,j;
	
	public boolean estado() {
		return Vivo;
	}
	
	public void troca() {
		if(Vivo)
			Vivo = false;
		else 
			Vivo = true;
	}
		
	public boolean mover(Peca destino, Peca meio) {
		
		if(estado() && !destino.estado()) 
			if(meio.estado())
				return true	;
		
		return false;
	
	}
	
}
