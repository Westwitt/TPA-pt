import java.util.*;
public class Inverso {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM=10;
		int i, e=9, a[], b[];
		
		a = new int[TAM];
		b = new int[TAM];
		for(i=0;i<TAM;i++) {
			System.out.println("Digite o numero "+(i+1));
			a[i] = in.nextInt();
			b[e] = a[i];
			e--;
		}
		for(i=0; i<TAM; i++) {
			if(i==0) {
				System.out.print("["+b[i]+", ");
			}
			else if(i<9) {
				System.out.print(b[i]+", ");
			} else {
				System.out.print(b[i]+"]");
			}
		}
	}
}
