package atividades_decisao;
import java.util.Scanner;
public class Eleitor {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int ano, nasc, idade;
		System.out.println("Digite o ano atual");
		ano = in.nextInt();
		System.out.println("Digite o ano de seu nascimento");
		nasc = in.nextInt();
		idade = ano-nasc;
		System.out.println("Você tem "+idade+" anos de idade");
		if (idade>=16) {
			System.out.println("Você pode tirar título de eleitor");
		} else {
			System.out.println("Você não pode tirar título de eleitor");
		}
		in.close();
	}
}
