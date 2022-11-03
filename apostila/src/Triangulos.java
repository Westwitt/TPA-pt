import java.util.*;
public class Triangulos {
	public static void main(String[] args) {
		double a, b, c;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite os tres angulos em mensagens separadas");
		a = in.nextDouble();
		b = in.nextDouble();
		c = in.nextDouble();
		if(a<b+c && b<a+c && c<a+b) {
			if(a==b && b==c) {
				System.out.println("Triangulo Equilatero");
			} else if(a==c || a==b || b==c) {
				System.out.println("Triangulo Isosceles");
			} else {
				System.out.println("Triangulo Escaleno");
			}
		} else {
			System.out.println("Nao e um triangulo");
		}
		in.close();
	}
}
