package pt.c02oo.s03relacionamento.s04restaum;

public class Tabuleiro {
	private Peca Tab[][];
    	char board[][] = {
            {' ', ' ', 'P', 'P', 'P', ' ', ' '},
            {' ', ' ', 'P', 'P', 'P', ' ', ' '},
            {'P', 'P', 'P', 'P', 'P', 'P', 'P'},
            {'P', 'P', 'P', '-', 'P', 'P', 'P'},
            {'P', 'P', 'P', 'P', 'P', 'P', 'P'},
            {' ', ' ', 'P', 'P', 'P', ' ', ' '},
            {' ', ' ', 'P', 'P', 'P', ' ', ' '}
         };
 
              
	public void cria_tab() {
		Tab = new Peca[7][7];
	
		for(int i = 0; i < 7; i++) 
			for(int j = 0; j < 7; j++)
				Tab[i][j] = new Peca();
		
		for(int i = 0; i < 7; i++) 
			for(int j = 0; j < 7; j++) {
				
				if(i != 3 || j != 3)
					Tab[i][j].Vivo = true;
				else 
					Tab[i][j].Vivo = false;
			
		}
	}
	
	public void Alterar(int i , int j) {
		
		if(board[i][j] == '-')
			board[i][j] = 'P';
		else 
			board[i][j] = '-';
		
		Tab[i][j].troca();
	}
	
	public void mover(String mov) {
		//Peca vai se mover da posicao [i,j] para [x,y]
		
		int i, j, x, y , a, b;
		
		j = mov.charAt(0)-'a' ;
		i = mov.charAt(1)-'0' - 1;
		y = mov.charAt(3)-'a' ;
		x = mov.charAt(4)-'0' - 1;
		a = i;
		b = j;
		
		if(i==x)
			b = (j+y)/2;
		else 
			a = (i+x)/2;
		
		if(Tab[i][j].mover(Tab[x][y], Tab[a][b])) {
		
			Alterar(i,j);
			Alterar(x,y);
			Alterar(a,b);
		
		}
			
	}
}
