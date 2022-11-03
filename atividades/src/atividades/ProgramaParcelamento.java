package atividades;
import java.util.Scanner;

public class ProgramaParcelamento {
	public static void main(String[] args) {
	    double val, pres, des, valorP;
	    Scanner in = new Scanner(System.in);
	    System.out.println("Digite o valor da compra");
	    val = in.nextDouble();
	    System.out.println("Digite o numero de prestacoes");
	    pres = in.nextDouble();
	    des = val*0.9;
	    valorP = des/pres;
	    System.out.println("O valor de cada prestacao e "+valorP);
	    in.close();
	    		
	}

}
