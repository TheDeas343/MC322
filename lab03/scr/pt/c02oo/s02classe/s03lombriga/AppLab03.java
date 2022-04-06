package src.pt.c02oo.so2classe.s03lombriga;
import java.util.Scanner;

public class AppLab03 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		String str = ler.nextLine();
		
		Acoes ac = new Acoes(str);
			
		System.out.println("=====");
		ac.executar();
		}
}

