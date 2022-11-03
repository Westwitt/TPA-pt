package atividades;
import java.util.Scanner;

public class ProgramaAreaTriangulo {
	public static void main(String [] args) {
		double base, altura, area;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite a base do triangulo");
		base = in.nextDouble();
		System.out.println("Digite a altura do triangulo");
		altura = in.nextDouble();
		area = base*altura/2;
		System.out.println("A area do triangulo e "+area);
		in.close();
	}
}
