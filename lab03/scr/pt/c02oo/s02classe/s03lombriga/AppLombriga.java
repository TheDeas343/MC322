package src.pt.c02oo.s02classe.s03lombriga;

public class AppLombriga {

   public static void main(String[] args) {
	   
      Toolkit tk = Toolkit.start();
      Animacao ac;
      
      String lombrigas[] = tk.recuperaLombrigas();
      
	  for (int l = 0; l < lombrigas.length; l++) { 
		  ac = new Animacao(lombrigas[l]); 
		  
		  tk.gravaPasso("=====");
		  tk.gravaPasso(ac.apresenta()); 
		  
		  for(int i = 6; i < ac.Acao.length(); i++) {
			  ac.passo();
			  tk.gravaPasso(ac.apresenta()); 
		  } 
	  }
		 
	  tk.stop();
   }
}