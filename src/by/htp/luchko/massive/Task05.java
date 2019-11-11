package by.htp.luchko.massive;

import java.util.Random;
import java.util.Scanner;

public class Task05 {
	/*
	 * Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из
	 * четных чисел этой последовательности. Если таких чисел нет, то вывести
	 * сообщение об этом факте
	 */

	public static void main(String[] args) {
		int n = enter("Enter N ");
		int[] x = new int[n];
		int[] tmp = new int[x.length];
		mas(n, x);
		rmt(x, tmp);
	}

	public static void mas(int n, int[] x) {
		for (int i = 0; i < x.length; i++) {
			x[i] = new Random().nextInt(10);
		}
	}

	public static void rmt(int[] x, int tmp[]) {
		for (int i = 0; i < x.length; i++) {
			if ((x[i] % 2) == 0 & x[i] != 0) {
				System.out.print("|" + x[i] + " ");
			}

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
