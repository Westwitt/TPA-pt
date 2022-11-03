import java.util.Scanner;
public class Idade {
	public static void main(String[] args) {
		int ano, nasc, idade;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite seu ano de nascimento");
		nasc = in.nextInt();
		System.out.println("Digite o ano atual");
		ano = in.nextInt();
		idade = ano-nasc;
		System.out.println("Voce tem "+idade+" anos de idade.");
		if(idade<10) {
			System.out.println("Voce e uma crianca");
		} else if(idade<18) {
			System.out.println("Voce e um adolescente");
		} else if(idade<60) {
			System.out.println("Voce e um adulto");
		} else {
			System.out.println("Voce e um idoso");
		}
		in.close();
	}
}
