import java.util.Scanner;
public class GastoVeiculo {
	public static void main(String[] args) {
		double km, l, gasto;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite a distancia");
		km = in.nextDouble();
		System.out.println("Digite o gasto de combustivel");
		l = in.nextDouble();
		gasto = km/l;
		System.out.println("O gasto e "+gasto+"km/L");
		if(gasto<10) {
			System.out.println("Nao economico");
		} else {
			System.out.println("Economico");
		}
		in.close();
	}
}