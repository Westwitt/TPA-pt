import java.util.*;
public class PlacaRodizio {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("Digite o ultimo numero da sua placa para descobrir qual dia nao podera circular");
		n = in.nextInt();
		switch(n) {
			case 1:
			case 2:
				System.out.println("Segunda");
				break;
			case 3:
			case 4:
				System.out.println("Terca");
				break;
			case 5:
			case 6:
				System.out.println("Quarta");
				break;
			case 7:
			case 8:
				System.out.println("Quinta");
				break;
			case 9:
			case 0:
				System.out.println("Sexta");
				break;
			default: System.out.println("Valor invalido");
		}
		in.close();
	}
}
