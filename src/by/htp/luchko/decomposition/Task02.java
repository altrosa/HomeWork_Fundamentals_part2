package by.htp.luchko.decomposition;

import java.util.Scanner;

public class Task02 {
	/*
	 * Написать метод(методы) для нахождения наибольшего общего делителя и
	 * наименьшего общего кратного двух натуральных чисел:
	 */

	public static void main(String[] args) {

		int a = enterFromConsole("Enter A > 0: ");
		int b = enterFromConsole("Enter B > 0: ");

		int nod = findNod(a, b);
		printNOD(nod);

		int nok = findNok(a, b, nod);
		printNOK(nok);

	}

	public static int findNod(int a, int b) {
		int m, i, nod;
		if (a < b) {
			m = a;

		} else {
			m = b;
		}
		for (i = 1; i < m; i++) {
			if ((a % i == 0) & (b % i == 0)) {
				nod = i;
			}
		}

		return i;
	}

	public static int findNok(int a, int b, int nod) {

		int nok = (a * b) / nod;

		return nok;

	}

	public static void printNOD(int nod) {

		System.out.println("NOD (A, B) " + nod);

	}

	public static void printNOK(int nok) {

		System.out.println("NOK (A, B) " + nok);

	}

	public static int enterFromConsole(String message) {

		int value;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print(message);
		}
		value = sc.nextInt();
		return value;
	}
}
