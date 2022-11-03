import java.util.Scanner;
public class SalarioMinimo {
	public static void main(String[] args) {
		double sal;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite seu salário");
		sal = in.nextDouble();
		if (sal>954) {
			System.out.println("Acima do salário mínimo");
		} else { 
			System.out.println("Abaixo do salário mínimo");
		}
		in.close();
	}
}
