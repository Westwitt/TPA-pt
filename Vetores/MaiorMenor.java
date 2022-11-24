import java.util.*;
public class MaiorMenor {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int i, a[], maior=0, menor=0;
		
		
		a = new int[TAM];
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o numero "+(i+1));
			a[i] = in.nextInt();
			if(i==0 || a[i]>maior) {
				maior = a[i];
			}
			if(i==0 || a[i]<menor) {
				menor = a[i];
			}
		}
		System.out.println("Menor: "+menor);
		System.out.println("Maior: "+maior);
		
	}
}
