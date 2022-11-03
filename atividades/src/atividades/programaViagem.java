package atividades;
import java.util.Scanner;
public class ProgramaViagem {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double km, litros, gasto;
		System.out.println("Digite a quantidade de quilometros");
	    km = in.nextDouble();
	    System.out.println("Digite a quantidade de litros");
	    litros = in.nextDouble();
	    gasto = km/litros;
	    System.out.println("O consumo de litros gasto e " +gasto);
	    in.close();
				
	}

}
