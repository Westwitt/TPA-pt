import java.util.*;
public class Produtos {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 5;
		int i, a[];
		double media, caro=0, soma=0;
		a = new int[TAM];
		for(i=0;i<TAM;i++) {
			System.out.println("Digite o preco do produto "+(i+1));
			a[i] = in.nextInt();
			if(i==0 || a[i]>caro) {
				caro = a[i];
			}
			soma += a[i];
		}
		media = soma/5;
		System.out.println("A soma total dos precos e: "+soma+"R$");
		System.out.println("A media dos precos e: "+media+"R$");
		System.out.println("O produto mais caro custa: "+caro+"R$");
		if(soma<=150) {
			System.out.println("Dinheiro suficiente");
		} else {
			System.out.println("Dinheiro nao e suficiente");
		}
	}
}
