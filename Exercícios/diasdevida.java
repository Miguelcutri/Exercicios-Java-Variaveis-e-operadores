package PacoteJava;
import java.util.Scanner;
public class diasdevida {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int anos, meses, dias, anosConversao, mesesConversao, conversao;;
		System.out.println("Quantos anos você tem?");
		anos = ler.nextInt();
		
		System.out.println("Quantos meses você tem depois do seu aniversário? ");
		meses = ler.nextInt();
		
		System.out.println("E quantos dias?");
		dias = ler.nextInt();
		
		anosConversao = anos*365;
		mesesConversao = meses*30;
		conversao = mesesConversao + anosConversao + dias;
		
		System.out.println("Você tem " + conversao + " dias vividos");
	}

}
