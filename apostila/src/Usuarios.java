import java.util.Scanner;
public class Usuarios {
	public static void main(String[] args) {
		int i1, i2, i3, i4, i5;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite os nomes e idades");
		System.out.println("Usuario 1:");
		String n1 = in.nextLine();
		i1 = in.nextInt();
		in.nextLine();
		System.out.println("Usuario 2:");
		String n2 = in.nextLine();
		i2 = in.nextInt();
		in.nextLine();
		System.out.println("Usuario 3:");
		String n3 = in.nextLine();
		i3 = in.nextInt();
		in.nextLine();
		System.out.println("Usuario 4:");
		String n4 = in.nextLine();
		i4 = in.nextInt();
		in.nextLine();
		System.out.println("Usuario 5:");
		String n5 = in.nextLine();
		i5 = in.nextInt();
		if(i1>i2 && i1>i3 && i1>i4 && i1>i5) {
			System.out.println("O mais velho e "+n1+" com "+i1+" anos de idade");
		} else if(i2>i1 && i2>i3 && i2>i4 && i2>i5) {
			System.out.println("O mais velho e "+n2+" com "+i2+" anos de idade");
		} else if(i3>i2 && i3>i1 && i3>i4 && i3>i5) {
			System.out.println("O mais velho e "+n3+" com "+i3+" anos de idade");
		} else if(i4>i2 && 41>i3 && i4>i1 && i4>i5) {
			System.out.println("O mais velho e "+n4+" com "+i4+" anos de idade");
		} else {
			System.out.println("O mais velho e "+n5+" com "+i5+" anos de idade");
		}
		if(i1<i2 && i1<i3 && i1<i4 && i1<i5) {
			System.out.println("O mais novo e "+n1+" com "+i1+" anos de idade");
		} else if(i2<i1 && i2<i3 && i2<i4 && i2<i5) {
			System.out.println("O mais novo e "+n2+" com "+i2+" anos de idade");
		} else if(i3<i2 && i3<i1 && i3<i4 && i3<i5) {
			System.out.println("O mais novo e "+n3+" com "+i3+" anos de idade");
		} else if(i4<i2 && 41<i3 && i4<i1 && i4<i5) {
			System.out.println("O mais novo e "+n4+" com "+i4+" anos de idade");
		} else {
			System.out.println("O mais novo e "+n5+" com "+i5+" anos de idade");
		}
		in.close();
	}
}
