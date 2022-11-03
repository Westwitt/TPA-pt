package atividades;
import java.util.Scanner;

public class ProgramaMetros {
	public static void main(String[] args) {
		double metros, km;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite a quantidade de metros");
		metros = in.nextDouble();
		km = metros/1000;
		System.out.println("A quantidade de quilometros e de "+km);
		in.close();
		
	}

}
