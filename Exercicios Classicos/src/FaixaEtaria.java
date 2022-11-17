import java.util.*;
public class FaixaEtaria {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, idade;
		double  i15=0, i30=0, i45=0, i60=0, idoso=0, porc15, porc30, porc45, porc60, porcidoso;
		for(i=1;i<=15;i++) {
			System.out.println("Digite a idade");
			idade = in.nextInt();
			if(idade<=15) {
				i15++;
			} else if(idade<=30) {
				i30++;
			} else if(idade<=45) {
				i45++;
			} else if(idade<=60) {
				i60++;
			} else {
				idoso++;
			}
		}
		porc15 = (i15/15)*100;
		porc30 = (i30/15)*100;
		porc45 = (i45/15)*100;
		porc60 = (i60/15)*100;
		porcidoso = (idoso/15)*100;
		System.out.println("1a Faixa Etaria: "+i15+", "+porc15+"% das pessoas");
		System.out.println("2a Faixa Etaria: "+i30+", "+porc30+"% das pessoas");
		System.out.println("3a Faixa Etaria: "+i45+", "+porc45+"% das pessoas");
		System.out.println("4a Faixa Etaria: "+i60+", "+porc60+"% das pessoas");
		System.out.println("5a Faixa Etaria: "+idoso+", "+porcidoso+"% das pessoas");
	}
}
