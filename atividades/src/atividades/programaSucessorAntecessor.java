package atividades;
import java.util.Scanner;

public class ProgramaSucessorAntecessor {
	public static void main(String[] args) {
		int a, suc, ant;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o numero");
		a = in.nextInt();
		suc = a+1;
		ant = a-1;
		System.out.println("O sucessor de "+a+" e "+suc+" e o antecessor e "+ant);
		in.close();
		
	}

}
