import java.util.Scanner;
public class Expoente {
	public static void main(String[] args) {
		double b, ex, res;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite a base");
		b = in.nextDouble();
		res = b;
		System.out.println("Digite o expoente");
		ex = in.nextDouble();
		while(ex>1) {
			res = res*b;
			ex--;
		}
		System.out.println("O resultado e "+res);
		in.close();
	}
}
