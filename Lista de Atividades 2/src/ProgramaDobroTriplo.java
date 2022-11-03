import java.util.Scanner;
public class ProgramaDobroTriplo {
	public static void main(String[] args) {
		double n, dobro, triplo;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o numero");
		n = in.nextDouble();
		dobro = n*2;
		triplo = n*3;
		System.out.println("O dobro do numero e "+dobro+" e o triplo do numero e "+triplo);
		in.close();
	}

}
