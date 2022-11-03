import java.util.*;
public class Futebol {
	public static void main(String[] args) {
		int i;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite sua idade");
		i = in.nextInt();
		switch(i) {
		case 6: System.out.println("Dente de leite");
		break;
		case 7: System.out.println("Junior");
		break;
		case 8: System.out.println("Junior max");
		break;
		case 9: System.out.println("Junior master");
		break;
		case 10: System.out.println("Master");
		break;
		default: System.out.println("Idade invalida");
		}
		in.close();
	}
}
