package atividades;
import java.util.Scanner;

public class ProgramaIdade {
	public static void main(String[] args) {
		int userNasc, ano, userIdade;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o ano de seu nascimento");
		userNasc = in.nextInt();
		System.out.println("Digite o ano atual");
		ano = in.nextInt();
		userIdade = ano-userNasc;
		System.out.println("Voce tem "+userIdade+" anos de idade.");
		in.close();
		
	}

}
