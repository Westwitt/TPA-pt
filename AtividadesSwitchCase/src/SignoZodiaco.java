import java.util.*;
public class SignoZodiaco {
	public static void main(String[] args) {
		int mes, dia;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o mes que voce nasceu em um numero de 1 a 12");
		mes = in.nextInt();
		System.out.println("Digite o dia que voce nasceu");
		dia = in.nextInt();
		switch(mes) {
			case 1: 
				if(dia>=20){
					System.out.println("Aquario");
				} else {
					System.out.println("Capricornio");
				}
				break;
			case 2: 
				if(dia>=19){
					System.out.println("Peixes");
				} else {
					System.out.println("Aquario");
				}
				break;
			case 3: 
				if(dia>=20){
					System.out.println("Aries");
				} else {
					System.out.println("Peixes");
				}
				break;
			case 4:
				if(dia>=20){
					System.out.println("Touros");
				} else {
					System.out.println("Aries");
				}
				break;
			case 5: 
				if(dia>=21){
					System.out.println("Gemeos");
				} else {
					System.out.println("Touros");
				}
				break;
			case 6: 
				if(dia>=21){
					System.out.println("Cancer");
				} else {
					System.out.println("Gemeos");
				}
				break;
			case 7: 
				if(dia>=23){
					System.out.println("Leao");
				} else {
					System.out.println("Cancer");
				}
				break;
			case 8: 
				if(dia>=23){
					System.out.println("Virgem");
				} else {
					System.out.println("Leao");
				}
				break;
			case 9: 
				if(dia>=23){
					System.out.println("Libra");
				} else {
					System.out.println("Virgem");
				}
				break;
			case 10: 
				if(dia>=23){
					System.out.println("Escorpiao");
				} else {
					System.out.println("Libra");
				}
				break;
			case 11: 
				if(dia>=22){
					System.out.println("Sagitario");
				} else {
					System.out.println("Escorpiao");
				}
				break;
			case 12: 
				if(dia>=22){
					System.out.println("Capricornio");
				} else {
					System.out.println("Sagitario");
				}
				break;
			default: System.out.println("Valores invalidos");
		}
		in.close();
	}
}
