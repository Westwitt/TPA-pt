
public class Contagem100 {
	public static void main(String[] args) {
		int i;
		for (i=1;i<=100;i++) {
			System.out.println(i);
			if( (i%10)==0 ) {
				System.out.println("Multiplo de 10");
			}
		}
	}
}
