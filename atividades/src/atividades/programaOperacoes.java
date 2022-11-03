package atividades;
import java.util.Scanner;
public class ProgramaOperacoes {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double a, b, sub, div, soma, mult;
		System.out.println("Digite o primeiro numero");
		a = in.nextDouble();
		System.out.println("Digite o segundo numero");
		b = in.nextDouble();
		soma = a+b;
		sub = a-b;
		mult = a*b;
		div = a/b;
		System.out.println("A soma do numero e "+soma+", a subtra��o e "+sub+", a multiplicacao e "+mult+", e a divisao e "+div);
		in.close();
	}

}
