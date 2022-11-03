import java.util.Scanner;
public class ProgramaSalario {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double sal, des;
		System.out.println("Digite o seu salario base");
		sal = in.nextDouble();
		des = sal*0.06;
		System.out.println("O seu desconto e "+des);
		in.close();
	}

}
