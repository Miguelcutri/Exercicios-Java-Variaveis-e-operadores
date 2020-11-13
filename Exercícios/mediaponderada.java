//1.	Faça um sistema que leia as 3 notas de um aluno e calcule a
//média final deste aluno. Considerar que a média é ponderada e que
//o peso das notas é: 2,3 e 5, respectivamente.

package PacoteJava;
import java.util.Scanner;
public class mediaponderada {
	public static void main(String args[]) {
		
		float media, n1, n2, n3;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite N1: ");
		n1 = ler.nextInt();
		
		System.out.println("Digite N2: ");
		n2 = ler.nextInt();
		
		System.out.println("Digite N3: ");
		n3 = ler.nextInt();
		
		media=((n1*2)+(n2*3)+(n3*5))/10;
		
		System.out.println("A média é: "+ media);
	}
}
