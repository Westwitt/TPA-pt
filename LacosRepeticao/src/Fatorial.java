import java.util.Scanner;
public class Fatorial {
	public static void main(String[] args) {
		int i, n;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o numero");
		i = in.nextInt();
		n = i;
		while(i>1) {
			n = n*(i-1);
			i--;
		}
		System.out.println("O resultado do fatorial e "+n);
		in.close();
	}
}
