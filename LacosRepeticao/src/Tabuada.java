import java.util.Scanner;
public class Tabuada {
	public static void main(String[] args) {
		int res, n, i=1;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um numero");
		n = in.nextInt();
		while(i<=10) {
			res=n*i;
			System.out.println(n+"x"+i+"="+res);
			i++;
		}
		in.close();
	}
}
