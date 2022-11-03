import java.util.*;
public class Bhaskara {
	public static void main(String[] args) {
		double a, b, c, d, x, x2;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o A, o B e o C em ordem");
		a = in.nextDouble();
		b = in.nextDouble();
		c = in.nextDouble();
		d = (b*b)-(4*a*c);
		if(d<0) {
			System.out.println("Nao tem solucao");
		} else if(d==0) {
			x = ( -b / (2*a) );
			System.out.println("x = "+x);
		} else {
			x = ((-b+Math.sqrt(d)) / (2*a) );
			x2 = ((-b-Math.sqrt(d)) / (2*a) );
			System.out.println("x = "+x+" ou "+x2);
		}
		in.close();
	}
}
