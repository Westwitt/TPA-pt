import java.util.*;
public class Nota {
	public static void main(String[] args) {
		double n1, n2, n3, m, m2;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite suas notas");
		n1 = in.nextDouble();
		n2 = in.nextDouble();
		m = (n1+n2)/2;
		System.out.println("Sua media e de "+m);
		if(m<3) {
			System.out.println("Reprovado");
		} else if(m>=6) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Em exame. Digite a nota do exame");
			n3 = in.nextDouble();
			m2 = (m+n3)/2;
			if(m2<6) {
				System.out.println("Reprovado");
			} else {
				System.out.println("Aprovado");
			}
		}
		in.close();
	}
}
