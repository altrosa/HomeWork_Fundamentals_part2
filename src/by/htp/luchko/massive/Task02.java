package by.htp.luchko.massive;

import java.util.Random;
import java.util.Scanner;

public class Task02 {

	/*
	 * В целочисленной последовательности есть нулевые элементы. Создать массив из
	 * номеров этих элементов.
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
			x[i] = new Random().nextInt(3);
			System.out.print(x[i] + " ");
		}
	}

	public static void rmt(int[] x, int tmp[]) {
		int l = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] == 0) {
				tmp[l++] = i;
				System.out.println("|" + tmp[l] + " ");
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
