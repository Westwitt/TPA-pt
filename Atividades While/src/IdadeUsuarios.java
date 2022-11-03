import java.util.*;
public class IdadeUsuarios {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		int i=2, idade, iNovo, iVelho;
		String n, nNovo, nVelho;
		
		//inicialização dos valores
		System.out.println("Digite o nome do Usuario 1");
		n = in.next();
		System.out.println("Digite a idade");
		idade = in.nextInt();
		iNovo=idade;
		iVelho=idade;
		nVelho=n;
		nNovo=n;
		
		while(i<=10) {
			System.out.println("Digite o nome do Usuario "+i);
			n = in.next();
			System.out.println("Digite a idade");
			idade = in.nextInt();
			if(idade>iVelho) {
				iVelho = idade;
				nVelho = n;
			} 
			if(idade<iNovo) {
				iNovo = idade;
				nNovo = n;
			}
			i++;
		}
		System.out.println("O mais velho e "+nVelho+" com "+iVelho+" anos de idade");
		System.out.println("O mais novo e "+nNovo+" com "+iNovo+" anos de idade");
		in.close();
	}
}
