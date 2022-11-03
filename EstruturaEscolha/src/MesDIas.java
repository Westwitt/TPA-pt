import java.util.*;
public class MesDIas {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m;
		System.out.println("Digite o dia do mes");
		m = in.nextInt();
		switch(m) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("31 dias");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("30 dias");
				break;
			case 2: System.out.println("28 dias");
				break;
			default: System.out.println("Mes Invalido");
		}
		in.close();
	}
}
