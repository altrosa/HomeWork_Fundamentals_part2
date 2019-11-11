package by.htp.luchko.massive;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task11 {
	/*
	 * Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у которых остаток
	 * от деления на М равен L (0 < L < М-1)
	 */

	public static void main(String[] args) {
		int n = enter("Enter N: ");
		int m = enter("Enter M: ");
		int l = enter("Enter L(0 < L < М-1): ");
		int[] array = new int[n];
		lengthArray(array);
		result(array, l, m);

	}

	public static void lengthArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = new Random().nextInt(10);
		}
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	}

	public static void result(int[] array, int l, int m) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] % m == l) {
				System.out.print(array[i] + " ");
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