package PacoteJava;
import java.util.Scanner;
public class expressão {
	public static void main(String args[]) {
		int a,b,c, r, s, d;
		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com A: ");
		a = ler.nextInt();
		
		System.out.println("Entre com B: ");
		b =ler.nextInt();
		
		System.out.println("Entre com C: ");
		c = ler.nextInt();
		
		r= a+b*a+b;
		s= b+c*b+c;
		d= r+s/2;
		System.out.println(d);
	}
}
