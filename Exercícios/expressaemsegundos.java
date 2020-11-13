package PacoteJava;
import java.util.Scanner;
public class expressaemsegundos {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		
		int segundos, minutos, horas;
		System.out.println("Digite quantos segundos terá o evento: ");
		segundos = ler.nextInt();
		
		horas = segundos / 60;
		minutos = horas /60;
		
		System.out.println("O evento terá "+ minutos+ " horas ou "+ horas+ " minutos ou "+ segundos+ " segundos");
	}

}
