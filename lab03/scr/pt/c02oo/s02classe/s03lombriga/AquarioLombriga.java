package src.pt.c02oo.so2classe.s03lombriga;

public class AquarioLombriga {
	int AA;  //Tamanhao do aquario
	   int LL;  //Tamanho da lombriga
	   int PP; //Posição da cabeça
	   int lado = 0; //Lado que a lombriga esta virada: 0=esquerda, 1=direita
	   
	   //Construtor
	   AquarioLombriga(int AA, int LL, int PP){
	       this.AA = AA;
	       if(LL >= AA){
	           this.LL = AA;
	           this.PP = 1;
	       }
	       else{
	           this.LL = LL;
	           this.PP = PP;
	       }
	     
	   }
	   
	   //Metodo de crescimento
	   public void crescer(){
	       if(lado == 0){
	           if(AA - PP > LL - 1)
	               LL++;
	       }
	       else{
	           if(PP > LL)
	               LL++;
	 
	       }
	   }
	   
	   //Metodo de movimento
	   public void mover(){
	       if(lado == 0){
	           if(PP >= 2)
	               PP--;
	           else
	               virar();
	       }
	       else{
	           if(PP <= AA-1)
	               PP++;
	           else
	               virar();
	       }         
	   }
	   
	   //Metodo para virar
	   public void virar() {
	       if(lado == 0){
	           lado = 1;
	           PP = PP + LL -1;
	       }
	       else {
	           lado = 0;
	           PP = PP - LL +1;
	       }
	   }
	   
	   //Metodo de apresentação do aquario com lombriga
	   public void apresenta() {
	       String S= "";
	       for(int i = 0; i < AA;i++)
	           S = S + "#";
	   
	       if(lado == 0)
	           for(int j = 0 ; j < LL - 1; j++)
	               S = S.substring(0,PP+j)+"@"+ S.substring(PP+j+1);
	       else
	           for(int k = 1; k < LL ; k++)
	               S = S.substring(0,PP-k-1)+"@"+ S.substring(PP-k);
	     
	       S = S.substring(0,PP-1)+"O"+ S.substring(PP);
	     
	       System.out.println(S);
	   }
}
