package atividades;
import java.util.Scanner;

public class ProgramaData {
	public static void main(String[] args) {
		int anos, meses, dias;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite a quantia de dias");
		dias = in.nextInt();
		meses = dias/30;
		anos = dias/365;
		System.out.println("Essa quantidade de dias e equivalente a "+meses+" meses e "+anos+" anos");
		in.close();
		
	}

}
