import java.util.*;
public class CantinaVenda {
	public static void main(String[] args) {
		int id;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o codigo do produto");
		id = in.nextInt();
		switch(id) {
			case 1: System.out.println("Cachorro Quente R$ 8,00");
			break;
			case 2: System.out.println("Cheeseburger R$ 12,00");
			break;
			case 3: System.out.println("X-Salada R$ 15,00");
			break;
			case 4: System.out.println("Misto Quente R$ 11,00");
			break;
			case 5: System.out.println("Pão na chapa R$ 6,00");
			break;
			default: System.out.println("Código invalido");
		}
		in.close();
	}
}
