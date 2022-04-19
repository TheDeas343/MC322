package pt.c02oo.s03relacionamento.s04restaum;

public class AppRestaUm {

   public static void main(String[] args) {
      AppRestaUm.executaJogo(null, null);
   }
   
   public static void executaJogo(String arquivoEntrada, String arquivoSaida) {
	   
      Toolkit tk = Toolkit.start(arquivoEntrada, arquivoSaida);
      String commands[] = tk.retrieveCommands();
      
      Tabuleiro Tabu = new Tabuleiro();
      Tabu.cria_tab();
      
      String print;
      
      tk.writeBoard("Tabuleiro inicial", Tabu.board);
      
      for (int l = 0; l < commands.length; l++) {
       
         Tabu.mover(commands[l]); 
         
         print = "source: " + commands[l].charAt(0) + commands[l].charAt(1) + "; " +
        		 "target: " + commands[l].charAt(3) + commands[l].charAt(4);
        		 
         tk.writeBoard(print, Tabu.board);
         
      }
      
       
      tk.stop();
   }

}
