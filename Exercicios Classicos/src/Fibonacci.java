import java.util.*;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, n, n1=1, n2=0, res=1;
		System.out.println("Digite o numero");
		n = in.nextInt();
		for(i=1;i<=n;i++) {
			System.out.println(res);
			res = n1+n2;
			n2 = n1;
			n1 = res;
		}
	}
}
