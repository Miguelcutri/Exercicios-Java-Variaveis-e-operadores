//2.	O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem
//do distribuidor e dos impostos (aplicados ao custo de f�brica). Supondo que a percentagem do distribuidor
//seja de 28% e os impostos de 45%, escrever um sistema que
//leia o custo de f�brica de um carro e escreva o custo ao consumidor.

package PacoteJava;
import java.util.Scanner;
public class consumoCarro {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		
		
		float percentagem = (float) 0.28, impostos = (float) 0.45, custoFabrica;
		double carroNovo;
		
		System.out.println("Qual custo de fabrica do carro?");
		custoFabrica = ler.nextInt();
		
		carroNovo = (custoFabrica * percentagem) + (custoFabrica * impostos) + custoFabrica;
		
		System.out.println("O valor total do carro ser�: R$ "+ carroNovo);
	}

}
