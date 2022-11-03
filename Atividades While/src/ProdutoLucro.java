import java.util.*;
public class ProdutoLucro {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double preco, lucro, total;
		int i=1;
		String exec;
		while(i<2) {
			System.out.println("Digite o preco do produto");
			preco = in.nextDouble();
			System.out.println("Digite a margem de lucro (sem o simbolo de porcentagem)");
			lucro = in.nextDouble();
			lucro = preco*lucro/100;
			total = preco+lucro;
			System.out.println("O preco da venda sera "+total);
			System.out.println("Deseja continuar a execucao? (S/N)");
			exec = in.next();
			
			if(exec.equalsIgnoreCase("n")) {
				i++;
			}
		}	
		in.close();
	}
}
