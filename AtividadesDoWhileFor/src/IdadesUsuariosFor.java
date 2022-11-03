import java.util.Scanner;
public class IdadesUsuariosFor {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		int i, idade, iNovo, iVelho;
		String n, nNovo, nVelho;
		
		System.out.println("Digite o nome do Usuario 1");
		n = in.next();
		System.out.println("Digite a idade");
		idade = in.nextInt();
		iNovo=idade;
		iVelho=idade;
		nVelho=n;
		nNovo=n;
		
		for(i=2;i<=10;i++) {
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
		}
		System.out.println("O mais velho e "+nVelho+" com "+iVelho+" anos de idade");
		System.out.println("O mais novo e "+nNovo+" com "+iNovo+" anos de idade");
		in.close();
	}
}
