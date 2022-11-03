public class JoaoPedro {
	public static void main(String[] args) {
		int i=1;
		double p=1.45, j=1.34;
		System.out.println("João tem 1,34cm de altura e Pedro tem 1,45cm. Pedro cresce 2cm por ano e João cresce 2,5cm por ano.");
		while(p>j) {
			p=p+0.02;
			j=j+0.025;
			i++;
		}
		System.out.println("Em "+i+" anos, João ganhou "+j+"cm de altura e ficou mais alto do que Pedro, com "+p+"cm de altura.");
	}
}
