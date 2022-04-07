package src.pt.c02oo.so2classe.s03lombriga;

//Classe que cria uma Lomnbriga no Aquario e executa as acoes requeridas
public class Animacao{
	   String Acao;
	   AquarioLombriga Lombriga;
	   int passo = 6;			
	 
	   Animacao(String Acao){
	       this.Acao = Acao;
	     
	       int AA = (Acao.charAt(0)-'0')*10 + (Acao.charAt(1)-'0');
	       int LL = (Acao.charAt(2)-'0')*10 + (Acao.charAt(3)-'0');
	       int PP = (Acao.charAt(4)-'0')*10 + (Acao.charAt(5)-'0');
	     
	       Lombriga = new AquarioLombriga( AA,  LL, PP);
	   }
	   
	   public void apresenta(){
		Lombriga.apresenta();
	   }
	   public void passo(){
	           if(Acao.charAt(passo) == 'C')
	               Lombriga.crescer();
	           else if(Acao.charAt(passo) == 'M')
	               Lombriga.mover();
	           else   
	               Lombriga.virar();
	           
	           passo++;
	       }
	   }
	
	

