import java.util.*;
public class Pares {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM=10;
		int i, a[], b[], par=0, e=0;
		
		a = new int[TAM];
		for(i=0;i<TAM;i++) {
			System.out.println("Digite o numero "+(i+1));
			a[i] = in.nextInt();
			if(a[i]%2==0) {
				par++;
			}
		}
		
		b = new int[par]; 
		for(i=0;i<TAM;i++) {
			if(a[i]%2==0) {
				b[e]=a[i];
				e++;
			}
		}
		System.out.println(par+" numeros pares. Numeros: ");
		for(i=0;i<par;i++) {
			if(i==0) {
				System.out.print("["+b[i]+", ");
			} else if(i<(par-1)) {
				System.out.print(b[i]+", ");
			} else {
				System.out.print(b[i]+"]");
			}
		}
	}
}
