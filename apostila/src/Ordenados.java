import java.util.*;
public class Ordenados {
	public static void main(String[] args) {
		double a, b, c;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite os 3 numeros em mensagens separadas");
		a = in.nextDouble();
		b = in.nextDouble();
		c = in.nextDouble();
		if(a<b && a<c) {
			if(b<c) {
				System.out.println(a+", "+b+", "+c);
			} else {
				System.out.println(a+", "+c+", "+b);
			}
		} else if (b<c && b<a) {
			if(a<c) {
				System.out.println(b+", "+a+", "+c);
			} else {
				System.out.println(b+", "+c+", "+a);
			}
		} else {
			if(a<b) {
				System.out.println(c+", "+a+", "+b);
			} else {
				System.out.println(c+", "+b+", "+a);
			}
		}
		in.close();
	}
}
