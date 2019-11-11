package by.htp.luchko.decomposition;

import java.util.Random;

public class Task09 {

	/*
	 * Написать метод(методы), проверяющий, являются ли данные три числа взаимно
	 * простыми.
	 */

	public static void main(String[] args) {
		
		int a = randomValue(100);
		print("Число А: ", a);

		int b = randomValue(100);
		print("Число В : ", b);

		int c = randomValue(100);
		print("Число C : ", c);
		
		int nodAB = findNod(a,b);
		int nodBC = findNod(b,c);
		int nodAC = findNod(a,c);
		findResult(nodAB,nodBC, nodAC);
		

	}

	public static int findNod(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;

		}
		return a;
	}
	
	public static void findResult(int nodAB, int nodBC, int nodAC) {
		if ((nodAB == 1) & (nodBC == 1) & (nodAC == 1)) {
			System.out.println("Числа а, b, c - взаимно простые");
		} else {
			System.out.println("Числа а, b, c - НЕ взаимно простые");
		}
		
	}

	public static int randomValue(int limit) {

		Random rand = new Random();
		return rand.nextInt(limit);
	}

	public static void print(String s, int a) {

		System.out.println(s + a);

	}
}
