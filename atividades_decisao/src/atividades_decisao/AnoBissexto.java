package atividades_decisao;
import java.util.Scanner;
public class AnoBissexto {
	public static void main(String[] args) {
		int ano, bi;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o ano de seu nascimento");
		ano = in.nextInt();
		bi = ano%4;
		if(bi == 0) {
			System.out.println("Voce nasceu em um ano bissexto");
		} else {
			System.out.println("Voce nao nasceu em um ano bissexto");
		}
		in.close();
	}

}
