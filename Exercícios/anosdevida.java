package PacoteJava;
import java.util.Scanner;
public class anosdevida {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int anos, meses, dias, anosConversao, mesesConversao, conversao;
		System.out.println("Quantos dias voc� tem vividos?");
		dias = ler.nextInt();
		
		mesesConversao = dias/30;
		anosConversao = mesesConversao / 12;
		
		System.out.println("Voc� tem "+ mesesConversao+ " meses vividos ou "+ anosConversao+ " anos");
		
	}

}
