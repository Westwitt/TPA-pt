package atividades;
import java.util.Scanner;

public class ProgramaSoma {
	public static void main(String[] args) {
		double a, b, c, aSqr, bSqr, cSqr, soma;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o valor do primeiro numero");
		a = in.nextDouble();
		System.out.println("Digite o valor do segundo numero");
		b = in.nextDouble();
		System.out.println("Digite o valor do terceiro numero");
		c = in.nextDouble();
		aSqr = a*a;
		bSqr = b*b;
		cSqr = c*c;
		soma = aSqr+bSqr+cSqr;
		System.out.println("A soma do quadrado desses tres numeros e "+soma);
		in.close();
		
	}

}
