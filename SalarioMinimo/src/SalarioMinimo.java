import java.util.Scanner;
public class SalarioMinimo {
	public static void main(String[] args) {
		double sal;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite seu sal�rio");
		sal = in.nextDouble();
		if (sal>954) {
			System.out.println("Acima do sal�rio m�nimo");
		} else { 
			System.out.println("Abaixo do sal�rio m�nimo");
		}
		in.close();
	}
}
