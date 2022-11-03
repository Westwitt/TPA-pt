package atividades;
import java.util.Scanner;

public class ProgramaVendedor {
	public static void main (String[] args) {
		double sFixo, venda, com, sFinal;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite seu nome");
		String nome = in.nextLine();
		System.out.println("Digite seu salario fixo");
		sFixo = in.nextDouble();
		System.out.println("Digite o valor de vendas");
		venda = in.nextDouble();
		com = venda/100*15;
		sFinal = sFixo + com;
		System.out.println("O seu nome e "+nome+", o seu salario fixo e "+sFixo+" e o seu salario final e "+sFinal);
		in.close();
		
	}

}
