import java.util.*;
public class AnoNascimento {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int ano, nasc, idade, i=1;
		do {
			System.out.println("Digite o ano atual");
			ano = in.nextInt();
			System.out.println("Digite o ano de seu nascimento");
			nasc = in.nextInt();
			idade = ano-nasc;
			System.out.println(idade+" anos de idade");
			if(idade>=18) {
				System.out.println("Maior de idade");
			} else {
				System.out.println("Menor de idade");
			}
			System.out.println("Deseja continuar a execucao?");
			String decisao = in.next();
			if(decisao.equalsIgnoreCase("n")) {
				i = 0;
			}
		} while(i==1);
		in.close();
	}
}
