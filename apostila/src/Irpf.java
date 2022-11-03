import java.util.*;
public class Irpf {
	public static void main(String[] args) {
		double sal, irpf;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o seu salario");
		sal = in.nextDouble();
		if(sal>3582) {
			irpf = sal*27.5/100-662.94;
		} else if(sal>2866.70) {
			irpf = sal*22.5/100-483.84;
		} else if(sal>2150) {
			irpf = sal*15/100-268.84;
		} else if(sal>1434.59) {
			irpf = sal*7.5/100-107.59;
		} else {
			irpf = 0;
		}
		System.out.println("Seu desconto IRPF e de "+irpf);
		in.close();
	}
}
