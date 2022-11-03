import java.util.*;
public class MencaoPorcentagem {
	public static void main(String[] args) {
		double pmb, pb, pr, pi, a, mb, b, r, i;
		Scanner in = new Scanner(System.in);
		System.out.println("Quantos alunos sua sala tem?");
		a = in.nextInt();
		System.out.println("Quantos alunos tiraram MB?");
		mb = in.nextInt();
		System.out.println("Quantos alunos tiraram B?");
		b = in.nextInt();
		System.out.println("Quantos alunos tiraram R?");
		r = in.nextInt();
		System.out.println("Quantos alunos tiraram I?");
		i = in.nextInt();
		pmb = (mb/a)*100;
		pb = (b/a)*100;
		pr = (r/a)*100;
		pi = (i/a)*100;
		System.out.println("A porcentagem de alunos que tiraram MB e de "+pmb+"%");
		System.out.println("A porcentagem de alunos que tiraram B e de "+pb+"%");
		System.out.println("A porcentagem de alunos que tiraram R e de "+pr+"%");
		System.out.println("A porcentagem de alunos que tiraram I e de "+pi+"%");
	}
}
