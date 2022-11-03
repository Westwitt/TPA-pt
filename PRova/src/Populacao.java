public class Populacao {
	public static void main(String[] args) {
		double pop=220, popM, popF;
		int i=0;
		popM = pop*0.47;
		popF = pop*0.53;
		while(popM<=popF) {
			popM+=0.88;
			popF+=0.82;
			i++;
		}
		System.out.println("Irá demorar "+i+" anos para o numero de homens ultrapassar");
	}
}
