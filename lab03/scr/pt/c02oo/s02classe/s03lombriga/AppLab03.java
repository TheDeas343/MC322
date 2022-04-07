package src.pt.c02oo.so2classe.s03lombriga;
import java.util.Scanner;

public class AppLab03 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		String str = ler.nextLine();
		
		Animacao ac = new Animacao(str);
			
		System.out.println("=====");
		
		ac.apresenta();
		
		for(int i = 6; i < ac.Acao.length(); i++) {
			ac.passo();
			ac.apresenta();
		}
	}
}

