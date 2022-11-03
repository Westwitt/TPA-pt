import java.util.Scanner;
public class Usuarios10 {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		int i, ano, nasc, idade, novo, velho;
		
		System.out.println("Digite o ano atual");
		ano = in.nextInt();
		System.out.println("Digite o ano de nascimento do Usuario 1");
		nasc = in.nextInt();
		idade = ano-nasc;
		novo=idade;
		velho=idade;
		System.out.println(idade+" anos de idade");
		
		for(i=2;i<=10;i++) {
			System.out.println("Digite o ano de nascimento do Usuario "+i);
			nasc = in.nextInt();
			idade = ano-nasc;
			System.out.println(idade+" anos de idade");
			if(idade>velho) {
				velho = idade;
				idade = ano-nasc;
			} 
			if(idade<novo) {
				novo = idade;
			}
		}
		System.out.println("O mais novo tem "+novo+" anos de idade");
		System.out.println("O mais velho tem "+velho+" anos de idade");
		in.close();
	}
}
