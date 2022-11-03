package atividades;
import java.util.Scanner;

public class ProgramaTroca {
	public static void main(String[] args) {
		double a, b, c;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o primeiro numero");
		a = in.nextDouble();
		System.out.println("Digite o segundo numero");
		b = in.nextDouble();
		c = a;
		a = b;
		b = c;
		System.out.println("A e igual a "+a+" e B e igual a "+b);
		in.close();
		
	}

}
