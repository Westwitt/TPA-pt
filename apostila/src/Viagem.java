import java.util.*;
public class Viagem {
	public static void main(String[] args) {
		int dias, des;
		double p;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite 1 se quiser viajar para Ilhabela, 2 para Fernando de Noronha");
		des = in.nextInt();
		System.out.println("Por quantos dias voce ficara? (Minimo: 2)");
		dias = in.nextInt();
		if(des==1) {
			if(dias<=5) {
				p = 240*dias;
			} else if(dias<=10) {
				p = (220*dias)+130;
			} else {
				p = (210*dias)+150;
			}
		} else {
			if(dias<=5) {
				p = (400*dias)+100;
			} else if(dias<=10) {
				p = (410*dias)+150;
			} else {
				p = (420*dias)+200;
			}
		}
		System.out.println("Sua viagem vai custar R$ "+p);
		in.close();
	}
}