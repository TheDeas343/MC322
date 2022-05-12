package pt.c40task.l05wumpus;

public class Caverna {

	private Salas Cave[][];
	
	public char board[][] = {
			{'-','-','-','-'},
			{'-','-','-','-'},
			{'-','-','-','-'},
			{'-','-','-','-'}
		};
		
	public void criarCave() {
		Cave =  new Salas[4][4];
		
		for(int i = 0; i < 4; i++)
			for(int j = 0; j < 4; j++)
					Cave[i][j] = new Salas();
	}
}
