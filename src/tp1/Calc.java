package tp1;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entier 1 : ");
		int i1 = scanner.nextInt();
		System.out.println("Entier 2 : ");
		int i2 = scanner.nextInt();
		
		int somme = i1 + i2;
		
		System.out.println("La somme est : " + somme);
		
		int q = i1 / i2;
		
		System.out.println("Quotien ? " + q);
		
		float quotien = (float)i1 / (float)i2;
		
		System.out.println("Le quotien est : " + quotien);
		
		int reste = i1 % i2;
		
		System.out.println("Le reste est : " + reste);		
		
	}

}
