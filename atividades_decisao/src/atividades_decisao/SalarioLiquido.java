package atividades_decisao;
import java.util.Scanner;
public class SalarioLiquido {
	public static void main(String[] args) {
		double s, sl, inss;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o seu salario");
		s = in.nextDouble();
		if(s>2500) {
			inss = s*0.11;
		} else {
			inss = s*0.09;
		}
		sl = s-inss;
		System.out.println("Seu valor INSS e "+inss+" e o seu salario liquido e "+sl);
		in.close();
	}

}
