package by.htp.luchko.decomposition;

import java.util.Random;

public class Task04 {

	/*
	 * Написать метод(методы) для нахождения наименьшего общего кратного трех
	 * натуральных чисел.
	 * 
	 */

	public static void main(String[] args) {

		int a = randomValue(100);
		print("Число А: ", a);

		int b = randomValue(100);
		print("Число В : ", b);

		int c = randomValue(100);
		print("Число C : ", c);

		int nod = findNod(a, b);
		print("NOD (A, B) : ", nod);

		int nok = findNokResult(a, b, c);
		print("NOK (A, B, C) : ", nok);

	}

	public static int findNod(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;

		}
		return a;
	}

	public static int findNok(int a, int b) {

		return a * b / findNod(a, b);
	}

	public static int findNokResult(int a, int b, int c) {
		return findNok(c, findNok(a, b));
	}

	public static int randomValue(int limit) {

		Random rand = new Random();
		return rand.nextInt(limit);
	}

	public static void print(String s, int a) {

		System.out.println(s + a);

	}
}
