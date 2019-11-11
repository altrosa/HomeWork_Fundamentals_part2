package by.htp.luchko.massive;

import java.util.Random;
import java.util.Scanner;

public class Task03 {

	/*
	 * Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число
	 * встречается раньше - положительное или отрицательное
	 */

	public static void main(String[] args) {
		int n = enter("Enter K: ");
		mas(n);

	}

	public static void mas(int n) {
		int[] x = new int[n];
		for (int i = 0; i < x.length; i++) {
			x[i] = new Random().nextInt();
		}

		if (x[0] > 0) {
			System.out.println("Положительное");
		} else {
			System.out.println("Отрицательное");
		}
	}

	public static int enter(String message) {
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
