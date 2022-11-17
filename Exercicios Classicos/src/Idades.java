import java.util.*;
public class Idades {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, idade, velho=0, novo=0;
		double soma=0, media;
		for(i=1;i<=10;i++) {
			System.out.println("Digite a idade");
			idade = in.nextInt();
			soma += idade;
			if(idade>velho || i==1) {
				velho = idade;
			}
			if(idade<novo || i==1) {
				novo = idade;
			}
		}
		media = soma/10;
		System.out.println("Media: "+media);
		System.out.println("Mais velho: "+velho);
		System.out.println("Mais novo: "+novo);
	}
}
