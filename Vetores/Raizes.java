import java.util.*;
public class Raizes {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int i, a[], b[];
		
		
		a = new int[TAM];
		b = new int[TAM];
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o numero "+(i+1));
			a[i] = in.nextInt();
			b[i] = (int) Math.sqrt(a[i]);
		}

		for(i=0; i<TAM; i++) {
			System.out.println("Numero "+(i+1)+": "+b[i]);
		}
	}
}
