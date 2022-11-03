package atividades_decisao;
import java.util.Scanner;
public class ParImpar {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double n, v;
		System.out.println("Digite o numero");
		n = in.nextDouble();
		v = n%2;
		if (v == 0) {
			System.out.println("O numero e par");
		} else {
			System.out.println("O numero e impar");
		}
		in.close();
	}
}
