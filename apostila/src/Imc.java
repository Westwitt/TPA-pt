import java.util.*;
public class Imc {
	public static void main(String[] args) {
		double kg, m, imc;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o seu peso");
		kg = in.nextDouble();
		System.out.println("Digite a sua altura (em metros)");
		m = in.nextDouble();
		imc = kg/(m*m);
		System.out.println("O seu imc e "+imc);
		if(imc<18.5) {
			System.out.println("Excesso de magreza");
		} else if(imc<25) {
			System.out.println("Peso Normal");
		} else if(imc<30) {
			System.out.println("Excesso de peso");
		} else if(imc<35) {
			System.out.println("Obesidade grau 1");
		} else if(imc<40) {
			System.out.println("Obesidade grau 2");
		} else {
			System.out.println("Obesidade grau 3");
		}
		in.close();
	}
}
