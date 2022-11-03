import java.util.Scanner; 
public class TabuadaFor {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int i, n, res;
		System.out.println("Digite o numero para descobrir sua tabuada");
		n = in.nextInt();
		for(i=1;i<=10;i++){
			res = n*i;
			System.out.println(n+"x"+i+"="+res);
		} 
		in.close();
	}
}
