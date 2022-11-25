import java.util.*;
public class Teste {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, i, a=0, b=1, c;
		
		
		System.out.println("Entre com o número de termos: ");
		n = in.nextInt();
		for(i=1; i<=n; i++) {
			System.out.print(b+" ");
			c = a+b;
			a= b;
			b = c;
		}
	}
}