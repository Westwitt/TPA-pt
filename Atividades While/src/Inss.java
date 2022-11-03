import java.util.*;
public class Inss {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i=1;
		double sal, inss;
		while(i<=4) {
			System.out.println("Qual e o salario do funcionario "+i);
			sal = in.nextDouble();
			if(sal>=2000) {
				inss = sal*0.11;
			} else {
				inss = sal*0.085;
			}
			System.out.println("O desconto do INSS e "+inss);
			i++;
		}
		in.close();
	}
}
