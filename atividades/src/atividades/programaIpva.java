package atividades;
import java.util.Scanner;

public class ProgramaIpva {
	public static void main(String[] args) {
		double preco, ipva;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o preco do seu veiculo");
		preco = in.nextDouble();
		ipva = preco/25;
		System.out.println("O IPVA do seu veiculo e de "+ipva);
		in.close();
		
	}

}
