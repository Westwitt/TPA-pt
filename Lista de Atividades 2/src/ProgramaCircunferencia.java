import java.util.Scanner;
public class ProgramaCircunferencia {
	public static void main(String[] args) {
		double r, area;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o numero do raio");
		r = in.nextDouble();
		area = r*r*3.14;
		System.out.println("A area da circunferencia e "+area);
		in.close();
	}

}
