package by.htp.luchko.decomposition;

import java.util.Random;

public class Task03 {
	/*
	 * . Написать метод(методы) для нахождения наибольшего общего делителя четырех
	 * натуральных чисел.
	 */

	public static void main(String[] args) {

		int a = randomValue(100);
		int b = randomValue(100);
		int c = randomValue(100);
		int d = randomValue(100);

		int nod = findNod(a, b, c, d);
		printNOD(nod);

	}

	public static int findNod(int a, int b, int c, int d) {
		int i, m;
		if ((a < b) & (a < c) & (a < d)) {
			m = a;
		} else if ((b < a) & (b < c) & (b < d)) {
			m = b;
		} else if ((c < b) & (c < a) & (c < d)) {
			m = c;
		} else if ((d < b) & (d < a) & (d < d)) {
			m = d;
		} else {
			m = 1;
		}
		for (i = 1; i < m; i++)

		{
			if ((a % i == 0) & (b % i == 0) & (c % i == 0) & (d % i == 0)) {

			}
		}

		return i;
	}

	public static int randomValue(int limit) {

		Random rand = new Random();
		return rand.nextInt(limit);
	}

	public static void printNOD(int nod) {

		System.out.println("NOD (A, B) " + nod);

	}
}
