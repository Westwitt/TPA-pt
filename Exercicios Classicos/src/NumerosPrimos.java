import java.util.*;
public class NumerosPrimos {
	public static void main(String[] args) {
		double i, n, primo=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o numero");
		n = in.nextDouble();
		for(i=n;i>=1;i--) {
			if(n%i==0) {
				primo++;
			}
		}
		if(primo==2) {
			System.out.println("Numero primo");
		} else {
			System.out.println("Numero nao e primo");
		}
	}
}
